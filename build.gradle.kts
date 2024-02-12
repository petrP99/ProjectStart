plugins {
    id("java")
}

group = "com.pers"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.10.1")
    testRuntimeOnly ("org.junit.jupiter:junit-jupiter-engine:5.10.2")
    implementation("org.hibernate:hibernate-core:6.4.2.Final")
    implementation("org.slf4j:slf4j-log4j12:2.0.12")
    implementation("org.slf4j:slf4j-api:1.7.32")
    runtimeOnly("org.postgresql:postgresql:42.7.1")
    compileOnly("org.projectlombok:lombok:1.18.30")
    annotationProcessor("org.projectlombok:lombok:1.18.30")
    testCompileOnly("org.projectlombok:lombok:1.18.30")
    testAnnotationProcessor("org.projectlombok:lombok:1.18.30")
}

java {
    sourceCompatibility = JavaVersion.VERSION_20
    targetCompatibility = JavaVersion.VERSION_20
}

tasks.test {
    useJUnitPlatform()
}