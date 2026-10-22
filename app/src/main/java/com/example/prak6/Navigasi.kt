package com.example.prak6

import androidx.compose.runtime.Composable
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
                    navController.navigate(Navigasi.Detail.name)
                }
            ) { }
            }
        }
    }
}