package com.example.recetario.ui.theme.views

import android.annotation.SuppressLint
import android.util.Log
import androidx.annotation.ContentView
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.recetario.R
import com.example.recetario.components.MainButton
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.composable
import androidx.navigation.compose.NavHost


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Recetario(navController: NavController) {
    val imagenes = listOf(
        R.drawable.cajun to "receta1",
        R.drawable.salchichas to "receta2",
        R.drawable.papas to "receta3",
        R.drawable.alitas to "receta4"
    )

    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { Text(text = "Recetas", color = Color.White) },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = Color.Red
                )
            )
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .padding(top = 60.dp)
                .padding(paddingValues)
                .fillMaxWidth()
                .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            imagenes.forEach { (imagen, destino) ->
                Image(
                    painter = painterResource(id = imagen),
                    contentDescription = destino,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(175.dp),
                    contentScale = ContentScale.FillWidth
                )

                MainButton(
                    name = "Ver Receta",
                    backcolor = Color.Red,
                    color = Color.White,
                    onClick = {
                        navController.navigate(destino) // Ahora sí navega correctamente
                    }
                )
            }
        }
    }
}

@Composable
private fun ContentView(){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        MainButton("Ir", Color.Blue, Color.White) {
            Log.d("Ir", "")
        }
    }
}

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "RView") {
        composable("RView") { Recetario(navController) }
        composable("R2View") { Receta1(navController) }
        composable("R3View") { Receta2(navController) }
        composable("R4View") { Receta3(navController) }
        composable("R5View") { Receta4(navController) }
    }
}