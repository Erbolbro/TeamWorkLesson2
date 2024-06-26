plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsKotlinAndroid)

    // Kapt
    kotlin("kapt")

    // Hilt
    id("com.google.dagger.hilt.android")
}

android {
    namespace = "com.example.teamworklesson2"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.teamworklesson2"
        minSdk = 24
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
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures.viewBinding = true
    }


dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.navigation.fragment)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    // Hilt
    //noinspection UseTomlInstead
    implementation("com.google.dagger:hilt-android:2.48")
    //noinspection UseTomlInstead
    kapt("com.google.dagger:hilt-android-compiler:2.48")
    //noinspection UseTomlInstead
    implementation("org.jetbrains:annotations:RELEASE_VERSION")

    // Retrofit_2
    //noinspection UseTomlInstead
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    //noinspection UseTomlInstead
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")

    // OkHttp
    //noinspection UseTomlInstead
    implementation(platform("com.squareup.okhttp3:okhttp-bom:4.12.0"))
    //noinspection UseTomlInstead
    implementation("com.squareup.okhttp3:okhttp")
    //noinspection UseTomlInstead
    implementation("com.squareup.okhttp3:logging-interceptor")

    // Binding property delegate
    //noinspection UseTomlInstead
    implementation("com.github.kirich1409:viewbindingpropertydelegate-noreflection:1.5.9")

    // Glide
    implementation("com.github.bumptech.glide:glide:4.16.0")

}