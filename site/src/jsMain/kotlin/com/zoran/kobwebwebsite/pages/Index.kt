package com.zoran.kobwebwebsite.pages

import Resources
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import com.varabyte.kobweb.compose.css.functions.LinearGradient
import com.varabyte.kobweb.compose.css.functions.linearGradient
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.backgroundImage
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import com.zoran.kobwebwebsite.components.Profile.ProfileCard
import com.zoran.kobwebwebsite.components.ThemeSwitch.ThemeSwitchButton
import kotlinx.browser.localStorage

@Page
@Composable
fun HomePage() {


    var colorMode by ColorMode.currentState

//    Similar as useEffect tha check only on first component render
    LaunchedEffect(colorMode) {
        val savedTheme = localStorage.getItem(Resources.UserInfo.SAVED_THEME) ?: ColorMode.LIGHT
    }

    ThemeSwitchButton(
        colorMode = colorMode,
        onClick = {
            colorMode = colorMode.opposite
            localStorage.setItem(Resources.UserInfo.SAVED_THEME, colorMode.name)
        })


    Box(
        Modifier
            .fillMaxSize()
            .backgroundImage(
                linearGradient(
                    dir = LinearGradient.Direction.ToRight,
                    from = if (colorMode.isLight) Resources.Theme.GRADIENT_ONE.color
                    else Resources.Theme.GRADIENT_ONE_DARK.color,
                    to = if (colorMode.isLight) Resources.Theme.GRADIENT_TWO.color
                    else Resources.Theme.GRADIENT_TWO_DARK.color
                )
            ),
        contentAlignment = Alignment.Center
    ) {
        ProfileCard(colorMode = colorMode)
    }

}
