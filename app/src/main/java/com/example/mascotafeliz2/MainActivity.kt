package com.example.mascotafeliz2

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mascotafeliz2.ui.theme.MascotaFeliz2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MascotaFeliz2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Elementos()
                }
            }
        }
    }
}

@Composable
fun Elementos() {
    val mContext = LocalContext.current
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Box (
            modifier = Modifier
                .clip(MaterialTheme.shapes.small)
                .background(MaterialTheme.colors.secondary)
                .border(4.dp, MaterialTheme.colors.primary)
        ) {
            Image(
                painter = painterResource(id = R.drawable.perro),
                contentDescription = "Macosta feliz",
                modifier = Modifier
                    .padding((20.dp))
            )
        }
        Text(
            "Mascota Feliz",
            color = MaterialTheme.colors.primary,
            style = MaterialTheme.typography.h1,
        )
        Text("Bienvenido, usuario",
            color = MaterialTheme.colors.primary,
            style = MaterialTheme.typography.body2,
        )
        Row {
            OutlinedButton(onClick = { /*TODO*/ }) {
                Text(text = "Tu Mascota")
            }
            Spacer(modifier = Modifier.width(10.dp))
            OutlinedButton(onClick = {
                mContext.startActivity(
                    Intent(mContext, ListActivity::class.java)
                )
            }) {
                Text(text = "Contenido")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ElementosPreview() {
    MascotaFeliz2Theme {
        Elementos()
    }
}