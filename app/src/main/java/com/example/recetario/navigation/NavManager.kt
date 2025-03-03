package com.example.recetario.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.composable
import androidx.navigation.compose.NavHost
import com.example.recetario.ui.theme.views.Receta1
import com.example.recetario.ui.theme.views.Receta2
import com.example.recetario.ui.theme.views.Receta3
import com.example.recetario.ui.theme.views.Receta4
import com.example.recetario.ui.theme.views.Recetario


@Composable
fun NavManager() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "recetario") {
        composable("recetario") { Recetario(navController) } // Pasar navController
        composable("receta1") { Receta1(navController) }
        composable("receta2") { Receta2(navController) }
        composable("receta3") { Receta3(navController) }
        composable("receta4") { Receta4(navController) }
    }
}