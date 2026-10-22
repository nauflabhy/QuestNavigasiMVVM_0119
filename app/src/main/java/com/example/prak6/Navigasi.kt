package com.example.prak6

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.prak6.view.FormIsian

enum class Navigasi {
    FormulirSaya,
    Detail
}

@Composable
fun DataApp(
    navController: NavHostCOntroller = rememberNavController()
) {
    Scaffold { isiRuang ->
        NavHost(
            navController = NavController,
            startDestination = Navigasi.FormulirSaya.name,

            modifier = Modifier.padding(paddingValues = isiRuang)) {
            composable(route = Navigasi.FormulirSaya.name) {
            FormIsian(
                //pilihanJK = JenisK.map { id -> context.resources.getString(id) },
                onSubmitBtnClick = {
                    navController.navigate( route = Navigasi.Detail.name)
                    }
                )
            }
            composable(route = Navigasi.Detail.name) {
                TampilData(
                    onBackBtnClick = {cancelAndBackToFormulirSaya(navController)}
                )
            }
        }
    }
}

private fun cancelAndBackToFormulirSaya(
    navController: NavHostController
) {
    navController.popBackStack( route = Navigasi.FormulirSaya.name, inclusive = false)
}