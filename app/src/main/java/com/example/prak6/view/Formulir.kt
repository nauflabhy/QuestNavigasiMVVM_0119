package com.example.prak6.view

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FormIsian(
    jenisK:List<string> = listOf("Laki-laki", "Perempuan"),
    OnSubmitBtnClick: () -> Unit,
) {
    Scaffold (modifier= Modifier,
        topBar = {
            TopAppBar(
                title = {Text(stringResource(id=R.string.home), Color.White)},
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
            )
        }

    }
}