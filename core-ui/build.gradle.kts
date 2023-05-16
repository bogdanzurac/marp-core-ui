import dev.bogdanzurac.marp.core.ui.projects
import dev.bogdanzurac.marp.core.ui.useArtifacts

plugins {
    alias(libs.plugins.marp.core)
    alias(libs.plugins.marp.compose)
    alias(libs.plugins.marp.koin)
    alias(libs.plugins.marp.publishing)
}

project.ext {
    group = "dev.bogdanzurac.marp"
    version = "0.0.1"
}

android {
    namespace = "dev.bogdanzurac.marp.core.ui"
}

dependencies {
    implementation(libs.androidx.activity)
    implementation(libs.bundles.lifecycle)


    implementation(libs.marp.core)
    api(
        if (useArtifacts) libs.marp.core.prompts
        else project(projects.corePrompts)
    )
}