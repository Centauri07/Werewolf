plugins {
    kotlin("jvm") version "1.7.10"
    java
}

group = "me.centauri07.werewolf"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()

    maven(url = uri("https://jitpack.io"))
}

dependencies {
    implementation(kotlin("stdlib"))

    implementation("net.dv8tion:JDA:5.0.0-alpha.17")
    implementation("com.github.Centauri07:JarbAPI:c971c1df42")
    implementation("com.github.Centauri07:DiscordCommand:38be19b9b7")

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.9.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}