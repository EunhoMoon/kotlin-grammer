import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
  id("org.springframework.boot") version "3.0.0"
  id("io.spring.dependency-management") version "1.0.11.RELEASE"
  id("java")
  id("org.jetbrains.kotlin.jvm") version "1.6.21"
//  id("org.jetbrains.kotlin.plugin.allopen") version "1.6.21"
  kotlin("plugin.spring") version "1.6.21"  // spring에서 CGLIB 사용하는 부분에 대해 모무 open 처리해준다.
//  kotlin("plugin.noarg") version "1.6.21" // NoArgConstructor 생성
  kotlin("plugin.jpa") version "1.6.21"
}

//allOpen {
//  annotations(
//    "org.springframework.boot.autoconfigure.SpringBootApplication",
//    "import org.springframework.transaction.annotation.Transactional"
//  )
//}

//noArg {
//  annotation("jakarta.persistence.Entity")
//}

group = "me.janek"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_17

repositories {
  mavenCentral()
}

dependencies {
  implementation("org.springframework.boot:spring-boot-starter-data-jpa")
  runtimeOnly("com.h2database:h2")
  testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<KotlinCompile> {
  kotlinOptions {
    freeCompilerArgs = listOf("-Xjsr305=strict")
    jvmTarget = "17"
  }
}