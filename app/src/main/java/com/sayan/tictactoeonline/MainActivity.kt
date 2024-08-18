package com.sayan.tictactoeonline

import android.content.Context
import android.content.Intent
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import com.google.firebase.Firebase
import com.google.firebase.firestore.firestore
import com.sayan.tictactoeonline.GameData.gameModel
import com.sayan.tictactoeonline.databinding.ActivityMainBinding
import kotlin.random.Random
import kotlin.random.nextInt

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private lateinit var connectivityManager: ConnectivityManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        enableEdgeToEdge()




        binding.btnStartGame.setOnClickListener{
            createOfflineGame()
        }

        binding.btnCreateGameOnline.setOnClickListener{

            createOnlineGame()
        }
        binding.btnJoinGameOnline.setOnClickListener{

            joinOnlineGame()
        }

    }


    private fun createOnlineGame() {
        GameData.myId="X"
        GameData.saveGameModel(
            GameModel(
                gameStatus = GameStatus.CREATED,
                gameId = Random.nextInt(1000..9999).toString()
            )
        )
        startGame()
    }

    private fun joinOnlineGame() {
        val id = binding.gameIdInput.text.toString()
        if (id.isEmpty()){
            binding.gameIdInput.error = "Please provide Game Id"
            return
        }
        GameData.myId = "O"
        Firebase.firestore.collection("game")
            .document(id)
            .get()
            .addOnSuccessListener {
                val model = it?.toObject(GameModel::class.java)
                if (model==null){
                    binding.gameIdInput.error = "Please Enter valid Game Id"
                }else{
                    model.gameStatus=GameStatus.JOINED
                    GameData.saveGameModel(model)
                    startGame()
                }
            }
    }


    private fun createOfflineGame() {
        GameData.saveGameModel(
            GameModel(
                gameStatus = GameStatus.JOINED
            )
        )
        startGame()
    }

    fun startGame(){
        startActivity(Intent(applicationContext, GameActivity::class.java))
    }

}