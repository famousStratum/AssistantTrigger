# AssistantTrigger

c
AssistantTrigger is a lightweight Android application designed to provide a quick shortcut to the system's default voice assistant.

## Background & Motivation

I built this app out of personal necessity: to map the physical Bixby button on a Galaxy S10 to trigger the preferred assistant app with a voice intent. For example, it allows launching Gemini with a voice intent (pop-up from the bottom with mic activated and ready to listen to commands) instead of the full-screen interface.

While the app was designed with the Galaxy S10 in mind, it should work on any Android device that supports remapping a physical button.

AssistantTrigger itself requires no permissions and collects no data — though the same can't be said for whichever assistant you point it at.

## Features

- **Instant Trigger**: Automatically launches the system voice command interface upon opening.
- **Clean Recents**: Automatically excludes itself from the recent apps list and clears its own history to keep your multitasking view tidy.
- **Ultra-Lightweight**: Launches, triggers the intent, and immediately exits — no UI, no permissions, no background processes, no lingering memory usage. Built with zero external dependencies, resulting in a tiny APK footprint.

## How it Works

The app consists of a single activity that dispatches an `Intent.ACTION_VOICE_COMMAND` to the system. Once the intent is sent, the app immediately finishes itself.

## Requirements

- **Minimum SDK**: Android 7.0 (API level 24)

## Getting Started

- Download from Google Play Store. (Soon)
- Download from F-droid (Soon).
- Download from the [Releases](https://github.com/famousStratum/AssistantTrigger/releases) page and install it on your device.
> You may need to enable Install from unknown sources in your device settings.

### For Samsung Devices with Bixby Key

1. Go to **Settings > Advanced Features > Bixby key**.
2. Select **Double press to open Bixby** (so you can use single press for this app).
3. Enable **Use single press** and select **Open app**.
4. Choose **AssistantTrigger** from the list.

### For Other Devices

1.  Open your device's **Settings**.
2.  Search for **Gestures**, **Shortcut Key**, or **Programmable Key**.
3.  Find the setting to map the physical button to "Open an App".
4.  Select **AssistantTrigger**.

## License

This project is open-source under the [GNU GPL v3 License](LICENSE).
