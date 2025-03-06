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
fun Receta4(navController: NavController) {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { Text(text = "Receta Brownie", color = Color.White) },
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
            painter = painterResource(id = R.drawable.brownie),
            contentDescription = "Imagen de la receta",
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = """
                
                Ingredientes:
                - 1 taza de harina
                - 200 g de mantequilla
                - 1 ½ tazas de azúcar
                - 5 huevos
                - ½ taza de cacao semi amargo
                - 200 g de chocolate
                - ½ cucharada de polvo para hornear
                - Azúcar pulverizada
                - Helado de vainilla 
                       
            Paso a paso
                
                Precalienta el horno  
                Pon el horno a **180 °C** para que esté listo cuando  
                termines la mezcla.  
                
                Derrite el chocolate  
                Funde el chocolate con la mantequilla en el microondas  
                o al baño maría hasta que quede suave.  
                
                Prepara la mezcla seca  
                En un bowl, mezcla la harina, los huevos, el azúcar,  
                el cacao y el polvo para hornear. Bate bien.  
                
                Incorpora el chocolate  
                Agrega la mezcla de chocolate y mantequilla derretidos,  
                sin dejar de batir, hasta obtener una mezcla homogénea.  
                
                Engrasa y hornea  
                Engrasa un molde con mantequilla y espolvorea harina  
                para evitar que se pegue.  
                Vierte la mezcla y hornea por **30 minutos**.  
                
                Sirve y decora  
                Sirve caliente, espolvorea con azúcar pulverizada y  
                acompaña con una bola de helado de vainilla."""
            .trimIndent(),
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