Lottie-Android-Demo
===================

Ta projekt prikazuje uporabo knjižnice **Lottie-Android** za integracijo lahkih in prilagodljivih animacij v Android aplikacije. Pojasnjuje osnove nastavitve Lottie animacij iz URL-ja, konfiguracije tem ter prikaza animacije z uporabo `LottieAnimationView`.

* * * * *

🎯 **Namen Projekta**
---------------------

Glavni cilji tega projekta so:

1. Prikaz, kako uporabljati **Lottie-Android** za upodabljanje animacij v Android aplikaciji.
2. Poudariti prednosti uporabe animacij v **JSON** formatu za boljšo zmogljivost in skalabilnost.
3. Korak za korakom predstaviti, kako integrirati Lottie v Android projekt.

* * * * *

📌 **Zakaj Lottie?**
--------------------

- **Prednosti:**
   - Podpora za skalabilne vektorske animacije v **JSON** formatu.
   - Nudi podporo za več platform: **Android, iOS, Web, React Native**.
   - Zmanjša velikost aplikacije v primerjavi z GIF ali video datotekami.
   - Enostavna uporaba s pripravljenimi animacijami iz [LottieFiles](https://lottiefiles.com/).

- **Slabosti:**
   - Omejena podpora za kompleksne animacije (podpira le določene funkcije Adobe After Effects).
   - Potreben dodaten trud za odpravljanje napak pri nepravilno ustvarjenih animacijah.

- **Licenca:**  
   Lottie-Android je licenciran pod **Apache 2.0 licenco**, kar omogoča široko uporabo, spreminjanje in distribucijo programske opreme z minimalnimi omejitvami.

- **Priljubljenost in vzdrževanje:**
   - Več kot **35.000 zvezdic** na GitHubu.
   - Aktivno vzdrževan s pogostimi posodobitvami.
   - Več kot **250 prispevkov** in močna skupnost razvijalcev.

* * * * *


🚀 **Nastavitev Projekta**
--------------------------

### Predpogoji
1. **Android Studio** (zadnja različica).  
2. **Internetna povezava** (za nalaganje animacij iz URL-jev).


* * * * *

### Korak 1: **Kloniranje Repozitorija**


`git clone https://github.com/your-username/Lottie-Android-Demo.git`

* * * * *

### Korak 2: **Nastavitev Gradle**

V datoteki build.gradle (Module: app) je treba dodati odvisnosti za uporabo Lottie:

`dependencies {
    implementation 'com.airbnb.android:lottie:5.2.0'
}`

* * * * *

### Korak 3: **Posodobitev Manifesta**

V datoteki AndroidManifest.xml moramo dodati dovoljenje za dostop do interneta, saj bomo animacije nalagali s spleta:

`<uses-permission android:name="android.permission.INTERNET"/>`

* * * * *

### Korak 4: **Ustvarjanje Layout datoteke**

V layout datoteki dodamo komponento LottieAnimationView, ki bo prikazovala animacijo:
(app:lottie_loop="true": Animacija se predvaja neprekinjeno v zanki)

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

### Korak 5: **Ustvarjanje MainActivity**

S spletne strani Lottie kopiramo URL za animacijo:

![image](https://github.com/user-attachments/assets/cb1f55e4-db98-4925-bf5f-fa0a5cc1f400)

V datoteki MainActivity.kt napišemo kodo za nalaganje in predvajanje animacije:
setAnimationFromUrl(): Nalaganje animacije iz URL-ja.
playAnimation(): Začne predvajanje animacije.

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

📷 **Posnetki zaslona**
------------------

1.  **Zagon aplikacije:**\
    Aplikacija se zažene s centralizirano Lottie animacijo:
    
    ![image](https://github.com/user-attachments/assets/be1f5275-516c-461d-98ac-be973325d9bb)

* * * * *

1.  **Integracija v zadnje naloge pri PORA:**

   ![11](https://github.com/user-attachments/assets/627eb0a2-5782-4ed2-b2e3-d04b96caeb1f)

   ![12](https://github.com/user-attachments/assets/02eb7cdb-0726-4590-a098-5570c687bfc4)

   ![13](https://github.com/user-attachments/assets/bf25bafa-fe84-4ca6-9f5e-b1caafb5d926)

   

https://github.com/user-attachments/assets/b69abc51-e6ca-457b-a568-d9a944f8636c




📖 **Ključne Funkcije Projekta**
--------------------------------

1.  Nalaganje animacij iz URL-ja.
2.  Uporaba LottieAnimationView za prikaz animacij.
3.  Zanka animacij z uporabo app:lottie_loop="true".
4.  Integracija tem s AppCompat.

* * * * *

🛠 **Možne Uporabe**
--------------------------

-   Animirane Splash Screen uvodne strani.
-   Interaktivne animacije za gumbe in ikone.
-   Moderni indikatorji nalaganja.

* * * * *

⚙️ **Možnosti Prilagajanja**
----------------------------

-   Zamenjajte URL animacije z LottieFiles povezavo za drugačno animacijo.
-   Spremenite obnašanje zanke z app:lottie_loop="false".
