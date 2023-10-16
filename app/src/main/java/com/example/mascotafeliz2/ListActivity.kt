package com.example.mascotafeliz2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mascotafeliz2.ui.theme.MascotaFeliz2Theme

class ListActivity : ComponentActivity() {
    val datos : List<String> = listOf(
        "Razas",
        "Entrenamiento",
        "Alimentación",
        "Belleza",
        "Reproducción",
        "Salud",
        "Noticias"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MascotaFeliz2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Pantalla(datos)
                }
            }
        }
    }
}

@Composable
fun Pantalla(datos: List<String>) {
    LazyColumn(
        contentPadding = PaddingValues(all = 20.dp),
        verticalArrangement = Arrangement.spacedBy(5.dp)
    ) {
        items(datos) {
                item -> ListItemRow(item)
        }
    }
}

@Composable
fun ListItemRow(item: String) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .clip(shape = MaterialTheme.shapes.small)
            .background(MaterialTheme.colors.secondary)
            .padding(horizontal = 16.dp, vertical = 10.dp)
    ) {
        Row {
            Text(item,
                modifier = Modifier.weight(1f),
                style = MaterialTheme.typography.body2,
                color = MaterialTheme.colors.primary)
            OutlinedButton(onClick = { /*TODO*/ }) {
                Text(text = "Más...")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PantallaPreview() {
    val datos : List<String> = listOf(
        "Razas",
        "Entrenamiento",
        "Alimentación",
        "Belleza",
        "Reproducción",
        "Salud",
        "Noticias"
    )
    MascotaFeliz2Theme {
        Pantalla(datos)
    }
}