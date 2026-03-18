# AssistantTrigger

![Android Min API](https://img.shields.io/badge/API-24%2B-brightgreen.svg)
![License](https://img.shields.io/badge/License-MIT-blue.svg)
![App Size](https://img.shields.io/badge/App%20Size-%3C%2050%20KB-orange.svg)

AssistantTrigger is a lightweight Android application designed to provide a quick shortcut to the system's default voice assistant.

## Background & Motivation

This app was developed based on personal necessity: to map the physical Bixby button on a Galaxy S10 to the voice intent of the preferred assistant app, rather than the default behavior of launching the full-screen version. For example, it allows triggering Gemini with the system's assistant intent instead of the full-screen interface.

While the app was designed with the Galaxy S10 in mind, the code is universal for any Android device that allows mapping a physical button to open an app.

## Features

- **Instant Trigger**: Automatically launches the system voice command interface upon opening.
- **Ultra-Lightweight**: Built with zero external dependencies (no AppCompat, no Material Components), resulting in an extremely small APK size.
- **Minimalist Design**: Uses a `NoDisplay` theme, meaning there's no UI to get in your way.
- **Clean Recents**: Automatically excludes itself from the recent apps list and doesn't keep history, keeping your multitasking view clean.
- **Privacy-Focused**: Requires **no permissions** and collects **no data**.

## How it Works

The app consists of a single activity that dispatches an `Intent.ACTION_VOICE_COMMAND` to the system. Once the intent is sent, the app immediately finishes itself.

## Requirements

- **Minimum SDK**: Android 7.0 (API level 24)
- **Target SDK**: Android 15/16 (API level 36)

## Getting Started

1.  **Clone the repository**:
    ```bash
    git clone https://github.com/yourusername/AssistantTrigger.git
    ```
2.  **Open in Android Studio**: Open the project folder in Android Studio.
3.  **Build and Run**: Deploy the `app` module to your Android device.

## Usage

### For Samsung Devices (One UI)

1.  Install the app on your Samsung device.
2.  Go to **Settings > Advanced Features > Bixby key**.
3.  Select **Double press to open Bixby** (so you can use single press for this app).
4.  Enable **Use single press** and select **Open app**.
5.  Choose **AssistantTrigger** from the list.

### For Other Devices

1.  Open your device's **Settings**.
2.  Search for **Gestures**, **Shortcut Key**, or **Programmable Key**.
3.  Find the setting to map the physical button to "Open an App".
4.  Select **AssistantTrigger**.

## License

This project is open-source under the **MIT License**. Feel free to use and modify it as you see fit.
