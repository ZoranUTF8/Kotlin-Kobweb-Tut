package com.zoran.kobwebwebsite.CustomStyles

import com.varabyte.kobweb.compose.css.CSSTransition
import com.varabyte.kobweb.compose.css.TransitionProperty
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.modifiers.transition
import com.varabyte.kobweb.silk.components.style.ComponentStyle
import com.varabyte.kobweb.silk.components.style.hover
import org.jetbrains.compose.web.css.ms
import org.jetbrains.compose.web.css.px

// Button style to define how the button looks in different states, hover,onClick etc...
val ButtonStyles by ComponentStyle {
    base {
        Modifier
            .padding(leftRight = 12.px)
            .transition(CSSTransition(property = TransitionProperty.All, duration = 300.ms))

    }
    hover{Modifier.padding(leftRight = 20.px)}
}
