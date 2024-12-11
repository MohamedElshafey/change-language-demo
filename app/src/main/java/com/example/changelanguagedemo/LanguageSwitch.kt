package com.example.changelanguagedemo

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun LanguageSwitch(
    currentLanguage: String,
    onLanguageChange: (String) -> Unit
) {
    var isArabic by remember { mutableStateOf(currentLanguage == "ar") }

    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.padding(16.dp)
    ) {
        Text(
            text = if (isArabic) "اللغة: العربية" else "Language: English",
            modifier = Modifier.weight(1f)
        )
        Switch(
            checked = isArabic,
            onCheckedChange = {
                isArabic = it
                val newLanguage = if (isArabic) "ar" else "en"
                onLanguageChange(newLanguage)
            }
        )
    }
}
