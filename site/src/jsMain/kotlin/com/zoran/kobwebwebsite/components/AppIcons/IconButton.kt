package com.zoran.kobwebwebsite.components.AppIcons

import Resources
import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.Cursor
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.navigation.Link
import org.jetbrains.compose.web.css.CSSSizeValue
import org.jetbrains.compose.web.css.CSSUnit
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.px


@Composable
fun IconButton(
    modifier: Modifier = Modifier,
    link: String = "",
    icon: String,
    iconSize: CSSSizeValue<CSSUnit.px> = Resources.Dimens.ICON_SIZE.px,
    onClick: (() -> Unit)? = null
) {
    Link(path = link) {
        Box(
            modifier = modifier
                .padding(all = 8.px)
                .borderRadius(r = Resources.Dimens.BORDER_RADIUS.px)
                .cursor(Cursor.Pointer)
                .border(
                    width = 1.px,
                    style = LineStyle.Solid,
                    color = Resources.Theme.SOCIAL_ICON_BACKGROUND_LIGHT.color
                )
                .onClick { onClick?.invoke() }
        ) {
            Image(
                modifier = Modifier.size(iconSize),
                src = icon
            )
        }
    }
}

