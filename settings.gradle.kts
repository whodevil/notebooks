plugins {
    id("info.offthecob.Settings") version "1.0.14"
}

rootProject.name = "notebooks"


dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }

    versionCatalogs {
        create("libs") {
            from("info.offthecob.platform:catalog:1.0.14")
            library("offthecob-platform", "info.offthecob.platform:bom:1.0.14")
        }
    }
}

