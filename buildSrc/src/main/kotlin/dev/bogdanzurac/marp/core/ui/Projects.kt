package dev.bogdanzurac.marp.core.ui

object projects {
    const val corePrompts = ":core-prompts"
}

val useArtifacts: Boolean
    get() = System.getProperty("useArtifacts").toBoolean()