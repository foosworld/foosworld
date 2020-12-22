import io.gitlab.arturbosch.detekt.Detekt

plugins {
  id("io.gitlab.arturbosch.detekt").version("1.15.0")
}

repositories {
  jcenter()
}

tasks {
  val detektAll by registering(Detekt::class) {
    parallel = true
    setSource(files(projectDir))
    include("**/*.kt")
    include("**/*.kts")

    exclude("**/build.gradle.kts", "**/resources/**", "**/build/**")
    config.setFrom(files("$rootDir/detekt.yml"))
    buildUponDefaultConfig = false
  }
}
