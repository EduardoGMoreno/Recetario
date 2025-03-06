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
fun Receta3(navController: NavController) {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { Text(text = "Receta Pay Tortuga", color = Color.White) },
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
            painter = painterResource(id = R.drawable.pay),
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
                - 1 ½ tazas de galletas molidas
                - 50 g de mantequilla derretida
                - 670 g de queso crema (a temperatura ambiente)
                - 200 g de azúcar
                - 3 huevos
                - 1 cucharadita de extracto de vainilla
                - 1 taza de crema para batir
                - ¾ de taza de nueces tostadas
                - 24 caramelos de leche suaves
                - 1 cucharada de crema para batir (para el caramelo)
                - ¾ de taza de chispas de chocolate semiamargo
                    
            Paso a paso
                
                Prepara la base  
                Mezcla la mantequilla derretida con las galletas molidas  
                hasta obtener una consistencia arenosa.  
                Forra un molde con papel encerado y presiona la mezcla  
                en el fondo para formar la costra. Refrigera.  
                
                Prepara la mezcla de queso  
                En un tazón, bate el queso crema con el azúcar  
                hasta que quede cremoso.  
                Agrega los huevos uno por uno, asegurando que cada  
                uno se integre antes de añadir el siguiente.  
                 
                Agrega la vainilla y la crema  
                Añade el extracto de vainilla y la crema para batir.  
                Bate por 2-3 minutos a velocidad media y reserva.  
                
                Hornea a baño María  
                Vierte la mezcla en el molde y hornea a **160 °C**  
                (horno precalentado) durante **60-70 minutos**.  
                
                Enfriado gradual  
                Al terminar el tiempo de cocción, deja reposar el pay  
                dentro del horno **30-45 minutos** para evitar que se rompa.  
                Luego, sácalo del horno y déjalo **15-20 minutos más**  
                a temperatura ambiente. Finalmente, refrigéralo **4 horas**.  
                
                Prepara el caramelo  
                En una olla a fuego bajo, derrite los caramelos con  
                1 cucharada de crema para batir hasta formar un caramelo.  
                
                Derrite el chocolate  
                En otra olla pequeña a fuego bajo, derrite las chispas  
                de chocolate hasta obtener una mezcla suave.  
                
                Decora el cheesecake  
                Coloca el caramelo y el chocolate en mangas pasteleras.  
                Decora con líneas o círculos y agrega nueces pecanas.  
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