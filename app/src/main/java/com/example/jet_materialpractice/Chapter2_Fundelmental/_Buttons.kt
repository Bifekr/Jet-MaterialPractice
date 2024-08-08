package com.example.jet_materialpractice.Chapter2_Fundelmental

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import com.example.jet_materialpractice.R

@Composable
fun MyButton(){

    Button(
        onClick = {},
        colors = ButtonDefaults.buttonColors(contentColor = colorResource(R.color.teal_200)),
        border = BorderStroke(1.dp, color = Color.Green)

    ) {
        Text("click Me")
    }
}

@Composable
fun MyRedioButton(){

    val radioButtons= listOf(1,2,3)
    val selectedButton= remember { mutableIntStateOf(radioButtons.first()) }

    Column (
        Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        radioButtons.forEach { it->
            val isSelected = it==selectedButton.intValue

            RadioButton(selected = isSelected, onClick = {selectedButton.intValue=it})
        }


    }

}

@Composable
fun MyFloatinButton(){}