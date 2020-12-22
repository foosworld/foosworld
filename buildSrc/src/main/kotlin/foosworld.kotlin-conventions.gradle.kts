import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
  kotlin("jvm")
}

repositories {
  jcenter()
}

dependencies {
  implementation(kotlin("stdlib-jdk8" ))
  implementation(kotlin("reflect"))

  testImplementation(kotlin("test-junit5"))
}

tasks.test {
  useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
  kotlinOptions {
    allWarningsAsErrors = true
    jvmTarget = "11"
    freeCompilerArgs = listOf("-Xjsr305=strict")
  }
}


