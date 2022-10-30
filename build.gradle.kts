plugins {
    java
    `java-library`

    id("net.minecrell.plugin-yml.bukkit") version "0.5.2"
}

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(17))
}

version = "1.0.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://hub.spigotmc.org/nexus/content/repositories/snapshots/")
}

dependencies {
    compileOnly("org.spigotmc:spigot-api:1.19.2-R0.1-SNAPSHOT")
}

bukkit {
    name = "PortalCreateEvent-PoC"
    main = "dev.notmyfault.portalcreateeventpoc.PortalCreateEventPoC"
    authors = listOf("NotMyFault")
    apiVersion = "1.13"
    version = rootProject.version.toString()
}

tasks.processResources {
    doLast {
        copy {
            from(File("$rootDir/LICENSE"))
            into("$buildDir/resources/main/")
        }
    }
}
