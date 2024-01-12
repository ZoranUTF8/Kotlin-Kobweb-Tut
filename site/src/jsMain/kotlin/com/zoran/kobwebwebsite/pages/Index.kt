package com.zoran.kobwebwebsite.pages

import Resources
import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.functions.LinearGradient
import com.varabyte.kobweb.compose.css.functions.linearGradient
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.backgroundImage
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.core.Page
import com.zoran.kobwebwebsite.components.Profile.ProfileCard

@Page
@Composable
fun HomePage() {
    Box(
        Modifier
            .fillMaxSize()
            .backgroundImage(
                linearGradient(
                    dir = LinearGradient.Direction.ToRight,
                    from = Resources.Theme.GRADIENT_ONE.color,
                    to = Resources.Theme.GRADIENT_TWO.color
                )
            ),
        contentAlignment = Alignment.Center
    ) {
        ProfileCard()
    }

}
