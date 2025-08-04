package com.example.socialconnect.navigation

sealed class Screen(val route: String) {
    object Login : Screen("login")
    object SignUp : Screen("signup")
    object ForgotPassword : Screen("forgot_password")
    object Home : Screen("home")
    object Profile : Screen("profile")
    object Settings : Screen("settings")
    object CreatePost : Screen("create_post")
    object PostDetails : Screen("post_details/{postId}") {
        fun createRoute(postId: String) = "post_details/$postId"
    }
}