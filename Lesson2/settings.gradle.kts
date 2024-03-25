pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Lesson2"
include(":app")
include(":app:activitylifecycle")
include(":activitylifecycle")
include(":Multiactivity")
include(":notificationapp")
include(":toastapp")
include(":dialof")
include(":intentfilter")
