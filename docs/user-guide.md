# UI-Components-KMP User Guide

## Theme System

```kotlin
// Check dark/light mode
val isDark = ThemeUtils.shouldUseDarkTheme(ThemeMode.SYSTEM, isSystemInDarkTheme())

// Get semantic color
val textColor = ThemeUtils.getSemanticColor(isDark, YoleColors.TextPrimary, YoleColors.Dark.TextPrimary)

// WCAG contrast validation
val ratio = ThemeUtils.calculateContrastRatio(textColor, bgColor)
val isAccessible = ThemeUtils.meetsWcagAA(textColor, bgColor)
```

## Animations

```kotlin
// Screen transitions
AnimatedVisibility(enter = ScreenTransitions.slideIn(), exit = ScreenTransitions.slideOut())

// List item animations
AnimatedVisibility(enter = ListAnimations.itemEnter(index), exit = ListAnimations.itemExit())
```

## Accessibility

```kotlin
// Touch target validation
TouchTargets.isAccessibleSize(buttonSize)

// Keyboard shortcuts
KeyboardShortcuts.Shortcut.SAVE // Ctrl+S
```
