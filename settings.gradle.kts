pluginManagement {
    repositories {
        google()

        maven { url = uri("https://jitpack.io") }
        mavenCentral()
        gradlePluginPortal()



    }
}
dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
        maven { url = uri("https://jitpack.io") }

    }
}

rootProject.name = "BudgetingApp"
include(":app")
