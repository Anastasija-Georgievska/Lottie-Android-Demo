Lottie-Android-Demo
===================

This project demonstrates the use of the **Lottie-Android** library for integrating lightweight and scalable animations into Android applications. It covers the basics of setting up a Lottie animation from a URL, configuring themes, and displaying the animation using `LottieAnimationView`.

* * * * *

🎯 **Purpose of the Project**
-----------------------------

The primary goal of this project is to showcase:

1.  How to use **Lottie-Android** for rendering animations in an Android app.
2.  The advantages of using JSON-based animations for better performance and scalability.
3.  A step-by-step demonstration of integrating Lottie in an Android project.

* * * * *

📌 **Why Lottie?**
------------------

-   **Advantages:**

    -   Supports scalable vector animations in JSON format.
    -   Provides cross-platform support (Android, iOS, Web, React Native).
    -   Reduces app size compared to GIFs or videos.
    -   Easy to use with pre-built animations from [LottieFiles](https://lottiefiles.com/).
-   **Disadvantages:**

    -   Limited support for complex animations (only certain After Effects features are supported).
    -   Requires additional effort to debug custom animations if improperly created.
-   **License:**\
    Lottie-Android is licensed under the **Apache 2.0 License**, making it suitable for commercial and open-source projects.

-   **Popularity & Maintenance:**

    -   35,000+ stars on GitHub.
    -   Actively maintained with frequent updates.
    -   Over 250 contributors and strong community support.

* * * * *

🚀 **Project Setup**
--------------------

### Prerequisites

1.  **Android Studio** (Latest Version).
2.  **Internet Connection** (to fetch Lottie animations from URLs).

* * * * *

### Step 1: **Clone the Repository**


`git clone https://github.com/your-username/Lottie-Android-Demo.git`

* * * * *

### Step 2: **Set Up Gradle**

Add the following dependencies in your `build.gradle` (Module: app) file:

`dependencies {
    implementation 'com.airbnb.android:lottie:5.2.0'
    implementation 'androidx.constraintlayout:constraintlayout:2.1.4'
}`

Enable View Binding in the same file:

`android {
    ...
    buildFeatures {
        viewBinding = true
    }
}`

* * * * *

### Step 3: **Define the Theme**

In `res/values/styles.xml`, use a theme compatible with Lottie:

`<resources>
    <style name="Theme.Lottie" parent="Theme.AppCompat.Light.NoActionBar" /> </resources> `

* * * * *

### Step 4: **Update the Manifest**

Add the `MainActivity` and Internet permission in `AndroidManifest.xml`:

```xml
<uses-permission android:name="android.permission.INTERNET" />

<application
    android:allowBackup="true"
    android:icon="@mipmap/ic_launcher"
    android:label="@string/app_name"
    android:roundIcon="@mipmap/ic_launcher_round"
    android:theme="@style/Theme.Lottie">
    <activity
        android:name=".MainActivity"
        android:exported="true">
        <intent-filter>
            <action android:name="android.intent.action.MAIN" />
            <category android:name="android.intent.category.LAUNCHER" />
        </intent-filter>
    </activity>
</application>
```

* * * * *

### Step 5: **Create the Layout**

In `res/layout/activity_main.xml`, define the layout with a `LottieAnimationView`:

```xml
<androidx.constraintlayout.widget.ConstraintLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@color/white">

    <com.airbnb.lottie.LottieAnimationView
        android:id="@+id/lvAnimation"
        android:layout_width="0dp"
        android:layout_height="0dp"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintBottom_toBottomOf="parent"
        app:lottie_loop="true" />
</androidx.constraintlayout.widget.ConstraintLayout>
```

* * * * *

### Step 6: **Create the Main Activity**

In `MainActivity.kt`, configure the `LottieAnimationView` to load an animation from a URL:

![image](https://github.com/user-attachments/assets/cb1f55e4-db98-4925-bf5f-fa0a5cc1f400)


```kotlin
package com.example.lottie

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.lottie.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Load animation from URL
        binding.lvAnimation.setAnimationFromUrl("https://lottie.host/36c39f2f-843a-4de8-8ac4-7edaa493d7b2/jaUHgECdIb.lottie")
        binding.lvAnimation.playAnimation()
    }
}
```

* * * * *

📷 **Screenshots**
------------------

1.  **App Launch**\
    The app launches with a centered Lottie animation:
    
    ![image](https://github.com/user-attachments/assets/be1f5275-516c-461d-98ac-be973325d9bb)

* * * * *

📖 **Key Features Demonstrated**
--------------------------------

1.  Loading animations from a URL.
2.  Using `LottieAnimationView` to display animations.
3.  Looping animations using `app:lottie_loop="true"`.
4.  Theme integration with `AppCompat`.

* * * * *

🛠 **Potential Use Cases**
--------------------------

-   Splash screens with animations.
-   Interactive animations for buttons or icons.
-   Loading indicators with modern designs.

* * * * *

⚙️ **Customization Options**
----------------------------

-   Replace the animation URL with any [LottieFiles](https://lottiefiles.com/) JSON animation.
-   Modify the loop behavior by setting `app:lottie_loop="false"`.
