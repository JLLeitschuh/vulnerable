plugins {
    `java-library`
}

dependencies {
    compileOnly("javax.servlet:javax.servlet-api:4.0.1")
    compileOnly("jakarta.servlet:jakarta.servlet-api:6.0.0")
    implementation("commons-fileupload:commons-fileupload:1.5")
    implementation("org.apache.commons:commons-fileupload2-jakarta-servlet5:latest.release")
    implementation("org.apache.commons:commons-fileupload2-jakarta-servlet6:latest.release")
    implementation("org.apache.commons:commons-fileupload2-javax:latest.release")
}
