package com.example.prak6.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.R
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.DividerDefaults.Thickness
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FormIsian(
    jenisK:List<string> = listOf("Laki-laki", "Perempuan"),
    OnSubmitBtnClick: () -> Unit,
) {
    Scaffold (modifier= Modifier,
        topBar = {
            TopAppBar(
                title = {Text(stringResource(id= R.string.home), Color.White)},
                colors = TopAppBarDefaults.mediumTopAppBarColors(
                    containerColor = colorResource(id = R.color.teal_700)
                )
            ) }
    ){ isiRuang ->
        Column(modifier = Modifier.padding( paddingValue = isiRuang),
            verticalArrangement = Arangement.Top,
            horizontalAligment = Aligment.CenterHorizontally) {
            OutlineTextField(
                value = "",
                singleLine = true,
                modifier = Modifier
                    .padding(top = 20.dp)
                    .width(250.dp),
                label = {Text(text = "Nama Lengkap")},
                onValueChange = {},
            )
            HorizontalDivier(modifier = Modifier
                .padding( all = 20.dp)
                .width(250.dp), thickness = Thickness,color = Color.Red)
            Row{
                jenisK.forEach {
                    item->
                    Row(verticalAligment = Aligment.CenterVertically){
                        RadioButton(
                            select = false,
                            onClick = {item}
                        )
                        Text(text = item)
                    }
                }
            }
            HorizontalDivier(modifier = Modifier
                .padding( all = 20.dp)
                .width(250.dp),
                thickness = 1.dp,
                color = Color.Red
            )
            OutlinedTextField(
                value = "",
                singleLine = true,
                modifier = Modifier
                    .padding(top = 20.dp)
                    .width(250.dp),
                label = {Text(text = "Alamat")},
                onValueChange = {},
            )
            Spacer(modifier = Modifier.padding(30.dp))
            Button(
                modifier = Modifier.fillMaxWidth( fraction = 1f )
                    .padding(all = 25.dp),
                onClick = OnSubmitBtnClick
            ){
                Text(stringResource(id = R.string.submit))
            }


        }

    }
}