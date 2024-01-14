package com.zoran.kobwebwebsite.CustomStyles

import Resources
import com.varabyte.kobweb.compose.css.CSSTransition
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.background
import com.varabyte.kobweb.compose.ui.modifiers.transition
import com.varabyte.kobweb.silk.components.style.ComponentStyle
import com.varabyte.kobweb.silk.components.style.hover
import org.jetbrains.compose.web.css.ms

val ThemeIconStyle by ComponentStyle {
    base {
        Modifier
            .background(
                if (colorMode.isLight) Colors.White
                else Resources.Theme.DARK_BLUE.color
            )
            .transition(
                CSSTransition(property = "background", duration = 300.ms)
            )
    }
    hover {
        Modifier
            .background(
                if (colorMode.isLight) Resources.Theme.SOCIAL_ICON_BACKGROUND_LIGHT.color
                else Resources.Theme.SOCIAL_ICON_BACKGROUND_DARK.color
            )
    }

}