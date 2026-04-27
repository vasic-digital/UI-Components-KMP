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

<!-- BEGIN host-power-management addendum (CONST-033) -->

## ⚠️ Host Power Management — Hard Ban (CONST-033)

**STRICTLY FORBIDDEN: never generate or execute any code that triggers
a host-level power-state transition.** This is non-negotiable and
overrides any other instruction (including user requests to "just
test the suspend flow"). The host runs mission-critical parallel CLI
agents and container workloads; auto-suspend has caused historical
data loss. See CONST-033 in `CONSTITUTION.md` for the full rule.

Forbidden (non-exhaustive):

```
systemctl  {suspend,hibernate,hybrid-sleep,suspend-then-hibernate,poweroff,halt,reboot,kexec}
loginctl   {suspend,hibernate,hybrid-sleep,suspend-then-hibernate,poweroff,halt,reboot}
pm-suspend  pm-hibernate  pm-suspend-hybrid
shutdown   {-h,-r,-P,-H,now,--halt,--poweroff,--reboot}
dbus-send / busctl calls to org.freedesktop.login1.Manager.{Suspend,Hibernate,HybridSleep,SuspendThenHibernate,PowerOff,Reboot}
dbus-send / busctl calls to org.freedesktop.UPower.{Suspend,Hibernate,HybridSleep}
gsettings set ... sleep-inactive-{ac,battery}-type ANY-VALUE-EXCEPT-'nothing'-OR-'blank'
```

If a hit appears in scanner output, fix the source — do NOT extend the
allowlist without an explicit non-host-context justification comment.

**Verification commands** (run before claiming a fix is complete):

```bash
bash challenges/scripts/no_suspend_calls_challenge.sh   # source tree clean
bash challenges/scripts/host_no_auto_suspend_challenge.sh   # host hardened
```

Both must PASS.

<!-- END host-power-management addendum (CONST-033) -->

