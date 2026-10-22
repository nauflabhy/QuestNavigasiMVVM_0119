package com.example.prak6.view

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FormIsian(
    jenisK:List<string> = listOf("Laki-laki", "Perempuan"),
    OnSubmitBtnClick: () -> Unit,
) {
    Scaffold (modifier=Modifier,
        topBar = {
            TopAppBar(
                title = {Text(stringResource(id=R.string.home), Color.White)},
                colors = TopAppBarDefaults.mediumTopAppBarColors(
                    containerColor = colorResource(id = R.color.teal_700)
                )
            )
        })
}