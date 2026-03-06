# CLAUDE.md - UI-Components-KMP

## Overview

`digital.vasic.uicomponents` is a Kotlin Multiplatform Compose library providing theme, animation, and accessibility utilities.

**Module**: UI-Components-KMP
**Package**: `digital.vasic.uicomponents`

## Build & Test

```bash
./gradlew build
./gradlew desktopTest
```

## Architecture

| File | Purpose |
|------|---------|
| `Theme.kt` | YoleColors, YoleTypography, ThemeMode, ThemeUtils with WCAG validation |
| `Animations.kt` | AnimationTiming, AnimationEasing, MicroInteractions, ScreenTransitions, ListAnimations |
| `Accessibility.kt` | AccessibilityConstants, KeyboardShortcuts, AccessibilitySettings, ScreenReader, TouchTargets |

## Dependencies

- Compose Multiplatform (runtime, foundation, material3, ui)
