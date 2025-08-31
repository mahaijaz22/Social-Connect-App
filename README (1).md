# 📱 Social Connect

A Kotlin-based social media application built with **Jetpack Compose**
and **Firebase**, designed to provide a lightweight but functional
social networking experience.

------------------------------------------------------------------------

## 🚀 Features

### Week 1--4 (Core Features)

-   🔑 **User Authentication** (Firebase Authentication --
    Email/Password,  Sign-in)\
-   👤 **Profile Management**
-   📝 **Post Creation** (Text-based posts with optional media upload)\
-   ❤️ **Likes
-   🔔 **Real-time Notifications**\
-   📰 **Post Feed** -- Home timeline with real-time updates

### Week 5--6 (Enhanced Features)

1.  **User Follow System**
    -   Follow/Unfollow other users\
    -  
2.  **Basic Messaging**
    -   Simple one-to-one chat\
    -   Real-time text messages stored in Firestore
3
4.  **Navigation Improvements**
    -   Bottom Navigation Bar → Home \| Profile \| Settings
5.
6.  **Search Functionality**
    -   Search posts or users by name\
    -   Display results in a list format
7.  **User Profile Setup**
    -   Update profile picture, name, and bio\
    -   Changes stored in Firestore
8.  **Performance Improvements**
    -   Optimized lists using **LazyColumn / FlatList equivalent**\
    -   Optimized image loading (Coil/Glide)

------------------------------------------------------------------------

## 🛠️ Tech Stack

-   **Kotlin** (Jetpack Compose, Coroutines, Flow)\
-   **Firebase**
    -   Authentication\
    -   Firestore Database\
    -   Firebase Storage (media uploads)\
-   **Coil** → Image loading\
-   **Navigation Component** for Compose

------------------------------------------------------------------------

## 📂 Project Structure

    SocialConnect/
    │── app/  
    │   ├── src/main/java/com/example/socialconnect/  
    │   │   ├── navigation/        # Navigation graph, bottom nav setup  
    │   │   ├── screens/           # UI screens (Login, Signup, Home, Profile, Chat, etc.)  
    │   │   ├── viewmodel/         # ViewModels for state management  
    │   │   ├── model/             # Data classes (User, Post, Message, etc.)  
    │   │   └── repository/        # Firebase integration  
    │   └── res/                   # XML resources (icons, drawables, etc.)  
    │── build.gradle.kts  
    │── settings.gradle.kts  
    │── README.md  

------------------------------------------------------------------------

## ⚙️ Setup Instructions

1.  **Clone the Repository**

    ``` bash
    git clone https://github.com/your-username/SocialConnect.git
    cd SocialConnect
    ```

2.  **Open in Android Studio**

    -   Use **Android Studio Iguana+**\
    -   Open the project folder

3.  **Firebase Setup**

    -   Create Firebase project → [Firebase
        Console](https://console.firebase.google.com/)\

    -   Enable **Authentication** (Email/Password, Google Sign-in)\

    -   Enable **Firestore Database**\

    -   Enable **Firebase Storage** (for profile images & posts)\

    -   Download `google-services.json` and place it in:

            app/src/main/

4.  **Build & Run**

    -   Connect Android device or emulator\
    -   Click **Run ▶** in Android Studio

------------------------------------------------------------------------


