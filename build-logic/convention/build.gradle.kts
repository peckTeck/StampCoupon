plugins {
    `kotlin-dsl`
}

group = "com.alphablue.convention.buildlogic"

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

dependencies {
    compileOnly(libs.android.tools.build.gradle.plugin)
    compileOnly(libs.kotlin.gradle.plugin)
}

gradlePlugin {
    plugins {
        register("couponAndroidApplication") {
            id = "coupon.android.application"
            implementationClass = "AndroidApplicationConventionPlugin"
        }
    }
}