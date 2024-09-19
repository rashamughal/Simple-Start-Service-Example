Intent Starting a Service

This Android project demonstrates how to start a background service using an Intent from an activity. The service processes the provided intent data and continues running in the background until explicitly stopped.

Features

Service Implementation: A simple service (MyService_) that logs and displays data passed from the activity.
Intent-Based Communication: Data (extraData) is sent from the MainActivity to the service using Intent.
Started Service: The service runs in the background and continues until stopped, using START_STICKY to ensure it restarts after being killed by the system.

Components

1. MainActivity

Contains a button that starts the service.
Sends data to the service via an intent.

2. MyService_

A service that processes the intent data, logs it, and displays a Toast message with the passed information.
Runs in the background until stopped and uses the START_STICKY flag to resume if terminated.

How to Run

Clone or download the project.

Open the project in Android Studio.

Run the project on an Android device or emulator.

Click the "Start Service" button to start the service and send data.
License

This project is open-source and free to use.
