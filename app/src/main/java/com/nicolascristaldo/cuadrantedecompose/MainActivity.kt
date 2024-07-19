package com.nicolascristaldo.cuadrantedecompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.nicolascristaldo.cuadrantedecompose.ui.theme.CuadranteDeComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CuadranteDeComposeTheme {
                ComposableQuadrant()
            }
        }
    }
}

@Composable
fun ComposableQuadrant(modifier: Modifier = Modifier) {
    Column(modifier.fillMaxWidth()) {
        Row(modifier.weight(1f)) {
            ComposableTextCard(title = stringResource(R.string.title_text_composable),
                description = stringResource(R.string.description_text_composable),
                color = colorResource(R.color.background_1),
                modifier.weight(1f)
            )
            ComposableTextCard(title = stringResource(R.string.title_image_composable),
                description = stringResource(R.string.description_image_composable),
                color = colorResource(R.color.background_2),
                modifier.weight(1f)
            )
        }
        Row(modifier.weight(1f)) {
            ComposableTextCard(title = stringResource(R.string.title_row_composable),
                description = stringResource(R.string.description_row_composable),
                color = colorResource(R.color.background_3),
                modifier.weight(1f)
            )
            ComposableTextCard(title = stringResource(R.string.title_column_composable),
                description = stringResource(R.string.description_column_composable),
                color = colorResource(R.color.background_4),
                modifier.weight(1f)
            )
        }
    }
}

@Composable
fun ComposableTextCard(title: String, description: String, color: Color, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(color)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center
        ) {
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(bottom = 16.dp)
                .align(Alignment.CenterHorizontally)
        )
        Text(
            text = description,
            textAlign = TextAlign.Center
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CuadranteDeComposeTheme {
        ComposableQuadrant()
    }
}