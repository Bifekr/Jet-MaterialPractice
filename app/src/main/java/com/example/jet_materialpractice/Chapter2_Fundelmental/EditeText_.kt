package com.example.jet_materialpractice.Chapter2_Fundelmental

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun MyEditeText() {

    Column(
        modifier = Modifier.fillMaxSize(),

        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        MyTextField()
    }

}

@Composable
fun MyTextField() {

    val text = remember { mutableStateOf("") }

    TextField(
        value = text.value,
        onValueChange = { text.value = it }
    )
}


@Composable
fun MyOutTextField() {

    val text = remember { mutableStateOf("") }

    OutlinedTextField(
        value = text.value,
        onValueChange = { text.value = it },

        label = { Text("this is lable") },
        colors = TextFieldDefaults.colors(
            focusedTextColor = Color.Green,
            focusedLabelColor = Color.Blue
        )

    )

}