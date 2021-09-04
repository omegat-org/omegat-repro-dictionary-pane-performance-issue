plugins {
    java
    distribution
    id("org.omegat.gradle") version "1.4.2"
}

version = "0.0.1"

omegat {
    version = "5.5.0"
    pluginClass = "org.omegat.repro.DictionaryPaneRepro"
}

distributions {
    main {
        contents {
            from(tasks["jar"], "README.md", "COPYING")
        }
    }
}
