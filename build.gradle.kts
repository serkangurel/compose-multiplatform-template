import com.github.benmanes.gradle.versions.updates.DependencyUpdatesTask

plugins {
    // this is necessary to avoid the plugins to be loaded multiple times
    // in each subproject's classloader
    val kotlinVersion = Libs.Versions.Plugins.kotlin
    val agpVersion = Libs.Versions.Plugins.agpVersion
    val composeVersion = Libs.Versions.Plugins.compose
    val dependencyUpdatesVersion = Libs.Versions.Plugins.dependencyUpdates

    kotlin("jvm").version(kotlinVersion).apply(false)
    kotlin("multiplatform").version(kotlinVersion).apply(false)
    kotlin("android").version(kotlinVersion).apply(false)

    id("com.android.application").version(agpVersion).apply(false)
    id("com.android.library").version(agpVersion).apply(false)
    id("org.jetbrains.compose").version(composeVersion).apply(false)
    id("com.github.ben-manes.versions").version(dependencyUpdatesVersion)
}

tasks.withType<DependencyUpdatesTask> {
    rejectVersionIf {
        isNonStable(candidate.version)
    }
}

fun isNonStable(version: String): Boolean {
    val stableKeyword = listOf("RELEASE", "FINAL", "GA").any { version.toUpperCase().contains(it) }
    val regex = "^[0-9,.v-]+(-r)?$".toRegex()
    val isStable = stableKeyword || regex.matches(version)
    return isStable.not()
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
