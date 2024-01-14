package com.zoran.kobwebwebsite.components.Profile

import Resources
import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.forms.Button
import com.varabyte.kobweb.silk.components.forms.ButtonSize
import com.varabyte.kobweb.silk.components.forms.ButtonStyle
import com.varabyte.kobweb.silk.components.icons.fa.FaSun
import com.varabyte.kobweb.silk.components.layout.Surface
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import com.zoran.kobwebwebsite.CustomStyles.SocialIconStyle
import com.zoran.kobwebwebsite.components.AppIcons.IconButton
import com.zoran.kobwebwebsite.utils.CustomClasses.SocialIcon
import kotlinx.browser.window
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px

@Composable
fun ProfileLeft(
    colorMode: ColorMode,
    breakPoint: Breakpoint
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(all = 50.px),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = if (breakPoint <= Breakpoint.SM)
            Alignment.CenterHorizontally else Alignment.Start
    ) {
        SpanText(
            text = Resources.UserInfo.NAME,
            modifier = Modifier
                .margin(bottom = 12.px)
                .fontFamily(Resources.UserInfo.ROBOTO_BOLD)
                .color(if (colorMode.isLight) Colors.Black else Colors.White)
                .fontSize(50.px)
                .fontWeight(FontWeight.Bold)
                .textAlign(
                    if (breakPoint <= Breakpoint.SM) TextAlign.Center
                    else TextAlign.Start
                )
        )
        SpanText(
            text = Resources.UserInfo.PROFESSION,
            modifier = Modifier
                .margin(bottom = 24.px)
                .fontFamily(Resources.UserInfo.ROBOTO_BOLD)
                .color(if (colorMode.isLight) Colors.Black else Colors.White)
                .fontSize(18.px)
        )
        Surface(
            modifier = Modifier
                .height(4.px)
                .width(40.px)
                .margin(bottom = 24.px)
                .background(
                    Resources.Theme.BLUE.color
                )
                .align(
                    if (breakPoint <= Breakpoint.SM) Alignment.CenterHorizontally
                    else Alignment.Start
                )
        ) {}
        SpanText(
            modifier = Modifier
                .fontFamily(Resources.UserInfo.ROBOTO_REGULAR)
                .fontSize(14.px)
                .color(if (colorMode.isLight) Colors.Black else Colors.White)
                .opacity(50.percent)
                .lineHeight(2)
                .margin(bottom = 36.px)
                .textAlign(
                    if (breakPoint <= Breakpoint.SM) TextAlign.Center
                    else TextAlign.Start
                ),
            text = Resources.UserInfo.ABOUT_ME
        )
        Button(
            modifier = ButtonStyle.toModifier()
                .margin(bottom = 50.px),
            size = ButtonSize.LG,
            onClick = { window.location.href = Resources.UserInfo.MY_EMAIL }
        ) {
            FaSun(
                Modifier
                    .margin(right = 12.px)
                    .color(if (colorMode.isLight) Colors.Black else Colors.White)
            )
            SpanText(
                modifier = Modifier
                    .fontSize(14.px)
                    .color(
                        if (colorMode.isLight) Colors.White else Resources.Theme.GRADIENT_ONE.color
                    )
                    .fontWeight(FontWeight.Bold)
                    .fontFamily(Resources.UserInfo.ROBOTO_REGULAR),
                text = Resources.UserInfo.BUTTON_TEXT
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .gap(12.px),
            horizontalArrangement = if (breakPoint <= Breakpoint.SM)
                Arrangement.Center else Arrangement.Start
        ) {
            SocialIcon.entries.filter {
                if (colorMode.isLight) !it.name.contains("Light")
                else it.name.contains("Light")
            }.forEach {
                IconButton(
                    modifier = SocialIconStyle.toModifier(),
                    colorMode = colorMode,
                    icon = it.icon,
                    link = it.link
                )
            }
        }
    }
}