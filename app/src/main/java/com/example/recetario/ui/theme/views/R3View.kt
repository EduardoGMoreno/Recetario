package com.example.recetario.ui.theme.views

import android.annotation.SuppressLint
import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
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
fun Receta2(navController: NavController) {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { Text(text = "Aguachile De Camaron", color = Color.White) },
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
            painter = painterResource(id = R.drawable.ceviche),
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
                - 1 kg camarón sin cabeza
                - 3 pzas pepinos medianos
                - 1 manojo cilantro
                - 1 pza cebolla morada grande
                - 3 pzas chiles verdes o serranos
                - 1/2 kg limones (frescos para evitar amargor)
                - Sal al gusto
                - Pimienta al gusto
                
            Paso a paso
                
            Lava los camarones
            Quítales la cáscara y ábrelos a la mitad en forma  
            de mariposa. Retira la suciedad y colócalos  
            en un recipiente.  
                
            Agrega el jugo de limón
            Exprime los limones (reserva 1/4 de taza aparte).  
            Vierte el jugo sobre los camarones hasta  
            cubrirlos ligeramente.  
            Pica medio chile serrano y agrégalo al recipiente.  
            Deja reposar.  
                
            Prepara los vegetales
            Pela los pepinos, retira las semillas y córtalos  
            en medias lunas.  
            Corta la cebolla morada en tiras finas.  
                
            Marina la cebolla
            En un recipiente, coloca la cebolla y agrega  
            el jugo de limón reservado.  
            Salpimenta al gusto y deja reposar.  
                
            Licúa la salsa
            En la licuadora agrega:  
            - Manojo de cilantro  
            - Chiles verdes  
            - Jugo donde se cocinaron los camarones  
            - Sal al gusto  
            Licúa hasta obtener una mezcla homogénea.  
                
            Mezcla y refrigera
            Añade el pepino y la cebolla a los camarones.  
            Vierte la mezcla licuada y ajusta la sal.  
            Refrigera por 15 minutos.  
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