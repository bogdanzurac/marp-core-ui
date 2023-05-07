plugins {
    alias(libs.plugins.marp.core)
    alias(libs.plugins.marp.compose)
    alias(libs.plugins.marp.publishing)
}

project.ext {
    group = "dev.bogdanzurac.marp"
    version = "0.0.1"
}

android {
    namespace = "dev.bogdanzurac.marp.core.navigation"
}

dependencies {
    implementation(libs.androidx.navigation)

    implementation(libs.marp.core)
}