plugins {
  `kotlin-dsl`
}

repositories {
  gradlePluginPortal()
}

val kotlinVersion = "1.4.21"

dependencies {
  implementation( "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")
  implementation( "org.jetbrains.kotlin:kotlin-allopen:$kotlinVersion")
}
