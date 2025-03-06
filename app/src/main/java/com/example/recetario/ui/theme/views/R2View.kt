package com.example.recetario.ui.theme.views

import android.annotation.SuppressLint
import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.recetario.R
import com.example.recetario.components.MainButton
import com.example.recetario.components.Spacers
import com.example.recetario.components.TitleView

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Receta1(navController: NavController) {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { Text(text = "Receta - Cajún", color = Color.White) },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(containerColor = Color.Black)
            )
        }
    ) {
        ContentView(navController)
    }
}
@Composable
private fun ContentView(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Image(
            painter = painterResource(id = R.drawable.cajun),
            contentDescription = "Imagen de la receta",
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = """
            Ingredientes:
            - 3 Papas cortadas en gajos pequeños y remojadas en agua con sal y azúcar por 20 minutos
            - 1 1/2 Cucharada de aceite de oliva
            - 4 Cucharadas de sazonador estilo cajún
            - 1 Cucharada de Jugo MAGGI®
            - 3/4 De taza de cátsup
            - 1/2 Limón (su jugo)
            - 1 Cucharada de sazonador estilo cajún
            - Tocino picado y frito
            - Chorizo picado y frito
            - Cebollín fresco picado finamente
            
            ¡A cocinar!
                
            Sazona las papas
            Escurre las papas y colócalas sobre papel absorbente  
            para retirar el exceso de agua.  

            Mézclalas con el aceite de oliva y 4 cucharadas  
            del sazonador estilo cajún hasta integrar.  

            Cocina en la freidora de aire
            Añade algunos gajos de papas en la freidora de aire  
            evitando que se encimen.  

            Cocina a 200 °C por 10 minutos, con ayuda de unas  
            pinzas voltéalos y cocina por 10 minutos más  
            o hasta que estén crujientes.  

            Repite con el resto de los gajos.  

            Prepara el dip y sirve
            Para el dip, mezcla el Jugo MAGGI®, la cátsup,  
            el jugo de limón y 1 cucharada del sazonador  
            estilo cajún.  

            Sirve las papas, baña con el dip, y decora con  
            el tocino, chorizo y cebollín.
            """.trimIndent(),
            fontSize = 16.sp,
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(horizontal = 16.dp)
        )

        Spacer(modifier = Modifier.height(16.dp))

        MainButton("Regresar", Color(0xFF06C167), Color.White) {
            navController.popBackStack()
        }
    }
}