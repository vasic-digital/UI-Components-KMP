# UI-Components-KMP API Reference

## Theme

- `YoleColors` - Semantic color tokens (light + dark variants)
- `YoleTypography` - Material Design 3 text styles (16 styles + Code)
- `ThemeMode` - LIGHT, DARK, SYSTEM enum
- `ThemeUtils` - shouldUseDarkTheme, getSemanticColor, calculateContrastRatio, meetsWcagAA/AAA

## Animations

- `AnimationTiming` - VERY_QUICK (100ms) to VERY_SLOW (900ms)
- `AnimationEasing` - Standard, Emphasized, Decelerate, Accelerate, Sharp
- `MicroInteractions` - pressAnimationSpec, hoverAnimationSpec, rippleAnimationSpec
- `ScreenTransitions` - slideIn/Out, fade, scaleIn/Out, expandVertically, shrinkVertically
- `ListAnimations` - itemEnter (staggered), itemExit
- `LoadingAnimations` - rememberRotation, rememberShimmer, rememberPulse

## Accessibility

- `AccessibilityConstants` - MIN_TOUCH_TARGET_SIZE, FOCUS_INDICATOR_WIDTH, Shortcuts, SemanticRole
- `KeyboardShortcuts` - Shortcut enum (SAVE, NEW, OPEN, etc.)
- `AccessibilitySettings` - data class with reduceMotion, highContrast, etc.
- `TouchTargets` - isAccessibleSize, ensureMinTouchTarget
- `ScreenReader` - announceStatus, announceAlert
