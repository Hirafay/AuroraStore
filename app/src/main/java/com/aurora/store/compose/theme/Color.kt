/*
 * SPDX-License-Identifier: GPL-3.0-or-later
 * iOS-style palette for the App Store reskin (Rafay)
 */

package com.aurora.store.compose.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.luminance

@Composable
@ReadOnlyComposable
private fun isAppInDarkTheme(): Boolean = MaterialTheme.colorScheme.surface.luminance() < 0.5f

val warningColor: Color
    @Composable @ReadOnlyComposable
    get() = if (isAppInDarkTheme()) Color(0xFFFFD60A) else Color(0xFFFF9500)

val successColor: Color
    @Composable @ReadOnlyComposable
    get() = if (isAppInDarkTheme()) Color(0xFF30D158) else Color(0xFF34C759)

val colorGreen: Color
    @Composable @ReadOnlyComposable
    get() = if (isAppInDarkTheme()) Color(0xFF30D158) else Color(0xFF34C759)

val colorRed: Color
    @Composable @ReadOnlyComposable
    get() = if (isAppInDarkTheme()) Color(0xFFFF453A) else Color(0xFFFF3B30)

/** iOS light palette — system blue accent, grouped-list grays. */
val BrandLightColorScheme = lightColorScheme(
    primary = Color(0xFF007AFF),
    onPrimary = Color(0xFFFFFFFF),
    primaryContainer = Color(0xFFD9E8FF),
    onPrimaryContainer = Color(0xFF001E3C),
    secondary = Color(0xFF5856D6),
    onSecondary = Color(0xFFFFFFFF),
    secondaryContainer = Color(0xFFE2E1FB),
    onSecondaryContainer = Color(0xFF14133B),
    tertiary = Color(0xFFAF52DE),
    onTertiary = Color(0xFFFFFFFF),
    background = Color(0xFFF2F2F7),
    onBackground = Color(0xFF000000),
    surface = Color(0xFFFFFFFF),
    onSurface = Color(0xFF000000),
    surfaceVariant = Color(0xFFF2F2F7),
    onSurfaceVariant = Color(0xFF3C3C43),
    outline = Color(0xFFC6C6C8),
    outlineVariant = Color(0xFFD1D1D6),
    error = Color(0xFFFF3B30),
    onError = Color(0xFFFFFFFF),
    errorContainer = Color(0xFFFFDAD6),
    onErrorContainer = Color(0xFF410002)
)

/** iOS dark palette — true black, brighter system blue. */
val BrandDarkColorScheme = darkColorScheme(
    primary = Color(0xFF0A84FF),
    onPrimary = Color(0xFFFFFFFF),
    primaryContainer = Color(0xFF003063),
    onPrimaryContainer = Color(0xFFD9E8FF),
    secondary = Color(0xFF5E5CE6),
    onSecondary = Color(0xFFFFFFFF),
    secondaryContainer = Color(0xFF2D2C4A),
    onSecondaryContainer = Color(0xFFE2E1FB),
    tertiary = Color(0xFFBF5AF2),
    onTertiary = Color(0xFFFFFFFF),
    background = Color(0xFF000000),
    onBackground = Color(0xFFFFFFFF),
    surface = Color(0xFF1C1C1E),
    onSurface = Color(0xFFFFFFFF),
    surfaceVariant = Color(0xFF2C2C2E),
    onSurfaceVariant = Color(0xFFEBEBF5),
    outline = Color(0xFF38383A),
    outlineVariant = Color(0xFF48484A),
    error = Color(0xFFFF453A),
    onError = Color(0xFFFFFFFF),
    errorContainer = Color(0xFF93000A),
    onErrorContainer = Color(0xFFFFDAD6)
)