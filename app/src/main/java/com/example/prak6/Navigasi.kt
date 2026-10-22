package com.example.prak6

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.prak6.view.FormIsian
import com.example.prak6.view.TampilData

enum class Navigasi {
    FormulirSaya,
    Detail
}

@Composable
fun DataApp(
    navController: NavHostController = rememberNavController()
) {
    var nama by remember { mutableStateOf("") }
    var jenisKelamin by remember { mutableStateOf("") }
    var alamat by remember { mutableStateOf("") }

    Scaffold { isiRuang ->
        NavHost(
            navController = navController,
            startDestination = Navigasi.FormulirSaya.name,
            modifier = Modifier.padding(paddingValues = isiRuang)
        ) {
            composable(route = Navigasi.FormulirSaya.name) {
                FormIsian(
                    onSubmitBtnClick = { submitNama, submitJk, submitAlamat ->
                        nama = submitNama
                        jenisKelamin = submitJk
                        alamat = submitAlamat
                        navController.navigate(route = Navigasi.Detail.name)
                    }
                )
            }
            composable(route = Navigasi.Detail.name) {
                TampilData(
                    nama = nama,
                    jenisKelamin = jenisKelamin,
                    alamat = alamat,
                    onBackBtnClick = { cancelAndBackToFormulirSaya(navController) }
                )
            }
        }
    }
}

private fun cancelAndBackToFormulirSaya(
    navController: NavHostController
) {
    navController.popBackStack(route = Navigasi.FormulirSaya.name, inclusive = false)
}