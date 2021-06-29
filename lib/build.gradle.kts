plugins {
    `java-library`
    `eclipse`
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.7.1")
    testImplementation("org.junit.jupiter:junit-jupiter-params:5.7.0")

    api("org.apache.commons:commons-math3:3.6.1")

    implementation("com.google.guava:guava:30.1-jre")
}

tasks.test {
    useJUnitPlatform()
}
