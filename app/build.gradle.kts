plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("com.google.gms.google-services")
    id("com.google.firebase.crashlytics")
}

android {
    namespace = "com.kononenko.kp32"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.kononenko.kp32"
        minSdk = 25
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    buildFeatures{
        viewBinding = true
        //noinspection DataBindingWithoutKapt
        dataBinding = true
    }
    kotlinOptions{
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation("com.google.firebase:firebase-crashlytics:18.6.0")
    implementation("com.google.firebase:firebase-analytics:21.5.0")
    val room_version = "2.6.0"
    val koin_version ="3.5.0"

    implementation ("io.insert-koin:koin-core:$koin_version")
    implementation ("io.insert-koin:koin-android:$koin_version")
    implementation ("org.jetbrains.kotlin:kotlin-reflect")

    implementation ("androidx.annotation:annotation:1.7.1")
    implementation ("androidx.lifecycle:lifecycle-livedata-ktx:2.6.2")
    implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.2")


    //noinspection GradleDependency
    implementation ("androidx.room:room-runtime:$room_version")
    //noinspection GradleDependency
    annotationProcessor ("androidx.room:room-compiler:$room_version")


    implementation ("androidx.appcompat:appcompat:1.6.1")
    implementation ("com.google.android.material:material:1.11.0")
    implementation ("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation ("junit:junit:4.13.2")

    testImplementation ("org.mockito:mockito-core:5.7.0")
    androidTestImplementation ("org.mockito:mockito-android:5.7.0")
    implementation ("net.bytebuddy:byte-buddy:1.14.9")
    androidTestImplementation ("androidx.arch.core:core-testing:2.2.0")


    androidTestImplementation ("androidx.test.ext:junit:1.1.5")
    androidTestImplementation ("androidx.test.espresso:espresso-core:3.5.1")
    testImplementation ("org.mockito:mockito-core:5.7.0")
    androidTestImplementation ("org.mockito:mockito-android:5.7.0");
    implementation ("net.bytebuddy:byte-buddy:1.14.9");
    androidTestImplementation ("androidx.arch.core:core-testing:2.2.0");

}