package com.example.changelanguagedemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatDelegate
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.os.LocaleListCompat
import com.example.changelanguagedemo.ui.theme.ChangeLanguageDemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ChangeLanguageDemoTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    LanguageSwitch("ar"){
                        val appLocale: LocaleListCompat = LocaleListCompat.forLanguageTags(it)
                        AppCompatDelegate.setApplicationLocales(appLocale)
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ChangeLanguageDemoTheme {
        Greeting("Android")
    }
}