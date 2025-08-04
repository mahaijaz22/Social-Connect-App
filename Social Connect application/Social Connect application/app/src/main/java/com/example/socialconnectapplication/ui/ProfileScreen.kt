package com.example.socialconnect.ui

import android.net.Uri
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter

@Composable
fun ProfileScreen() {
    var name by remember { mutableStateOf("") }
    var bio by remember { mutableStateOf("") }
    var imageUri by remember { mutableStateOf<Uri?>(null) }

    val launcher = rememberLauncherForActivityResult(ActivityResultContracts.GetContent()) {
        imageUri = it
    }

    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        OutlinedTextField(value = name, onValueChange = { name = it }, label = { Text("Name") })
        OutlinedTextField(value = bio, onValueChange = { bio = it }, label = { Text("Bio") })
        imageUri?.let {
            Image(painter = rememberAsyncImagePainter(it), contentDescription = null, modifier = Modifier.size(100.dp))
        }
        Button(onClick = { launcher.launch("image/*") }) { Text("Upload Profile Picture") }
        Button(onClick = { /* Upload logic */ }) { Text("Save Profile") }
    }
}