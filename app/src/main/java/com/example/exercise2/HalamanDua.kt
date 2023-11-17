@file:OptIn(ExperimentalMaterial3Api::class, ExperimentalMaterial3Api::class,
    ExperimentalMaterial3Api::class
)

package com.example.exercise2

import android.graphics.fonts.FontStyle
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HalamanDua(
    onSubmitButtonClicked:(MutableList<String>) -> Unit
){
    var namaTxt by remember { mutableStateOf("")}
    var nimTxt by remember { mutableStateOf("")}
    var konsentrasiTxt by remember { mutableStateOf("")}
    var judulTxt by remember { mutableStateOf("")}

    var listData: MutableList<String> = mutableListOf(namaTxt,nimTxt,konsentrasiTxt,judulTxt)

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ){
        Text(
            text ="Formulir Pengajuan Skripsi",
            fontSize = 25.sp,
        )
        OutlinedTextField(value = namaTxt, onValueChange = {namaTxt = it}, label = {
            Text(text = stringResource(id = R.string.nama))
        })

        OutlinedTextField(value = nimTxt, onValueChange = {nimTxt = it}, label = {
            Text(text = stringResource(id = R.string.NIM))
        })

        OutlinedTextField(value = konsentrasiTxt, onValueChange = {konsentrasiTxt = it}, label = {
            Text(text = stringResource(id = R.string.konsentrasi))
        })

        OutlinedTextField(value = judulTxt, onValueChange = {judulTxt = it}, label = {
            Text(text = stringResource(id = R.string.judul))
        })



        Spacer(modifier = Modifier.height(15.dp))
        Row (modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ){
            Button(onClick = {onSubmitButtonClicked(listData)}) {
                Text(text = stringResource(id = R.string.btn_Submit))
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun showForm(){
    HalamanDua() {}
}