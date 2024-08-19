# Tic Tac Toe Online

Welcome to the **Tic Tac Toe Online** app! This is a modern take on the classic Tic Tac Toe game, allowing you to enjoy it with friends both online and offline. Whether you're in the same room or miles apart, challenge your friends to a game and see who comes out on top!

## Features

- **Play Online:** Connect with friends over the network and play Tic Tac Toe in real-time.
- **Offline Mode:** Share your device and play against your friend on the same screen.
- **Advanced Architecture:** Built with Android’s latest architecture components like LiveData and ViewModel to ensure a smooth and responsive experience.
- **Firebase Firestore Integration:** The app leverages Firebase Firestore for real-time data synchronization, ensuring your moves are instantly reflected in your opponent's game.

## Technology Stack

- **Kotlin:** The primary programming language for Android development.
- **LiveData & ViewModel:** Ensures the app’s UI remains updated and responsive to data changes.
- **Firebase Firestore:** Provides a robust and scalable backend to manage and sync game states in real-time.
- **MVVM Architecture:** Clean and maintainable code structure following the Model-View-ViewModel pattern.

## Getting Started

### Prerequisites

- Android Studio
- Firebase account

### Installation

1. **Clone the repository:**

    ```bash
    git clone https://github.com/yourusername/tic-tac-toe-online.git
    ```

2. **Open the project in Android Studio:**

    - Import the project and let Android Studio download the necessary dependencies.

3. **Setup Firebase:**

    - Create a new project in Firebase.
    - Enable Firestore Database.
    - Download the `google-services.json` file and place it in the `app` directory.

4. **Run the app:**

    - Build and run the app on your preferred Android device or emulator.

## Usage

- **Online Mode:**
  - Invite a friend to play online.
  - Start a game, and your moves will be synchronized via Firebase Firestore.
  
- **Offline Mode:**
  - Choose the "Play on Same Device" option and enjoy a classic Tic Tac Toe match on one device.

## Contributing

Contributions are welcome! If you’d like to contribute, please fork the repository and use a feature branch. Pull requests are warmly welcome.

## Contact

If you have any questions or feedback, feel free to reach out at `your.email@example.com`.
