package com.example.actividad2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.actividad2.ui.theme.Actividad2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {contador()
        }
    }
}
@Composable
fun contador(){
    var countEphemeral by remember { mutableStateOf(0) }
    var countPersistente by rememberSaveable { mutableStateOf(0) }

    Column (
        modifier = Modifier
            .padding(20.dp),
    ){
        Text(
            "Ephimeral(remember): $countEphemeral"
        )
        Button(
            onClick = { countEphemeral++ }
        ) {
            Text("+1")
        }

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            "Persistente (remberSaveable): $countPersistente"
        )
        Button(
            onClick = { countPersistente++ }
        ) {
            Text("+1")
        }

        Spacer(modifier = Modifier.height(16.dp))
        Text("🔄 Rota la pantalla y observa qué contador se reinicia.")



    }

}




@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    contador()

}