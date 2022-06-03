job("First_Gradle_Job_DSL"){
    description("Sample dsl job for gradle springboot project created on ${new Date()}")
    scm{
        git("https://github.com/openshift-ops/gradle.git","main")
    }
    triggers{
        scm("* * * * *")
    }
    steps{
        gradle{
            tasks("clean")
            tasks("build")
            buildFile("springboot-java/build.gradle")
            useWrapper(true)
            makeExecutable(true)
        }
    }
    publishers{
        archiveArtifacts("springboot-java/build/libs/*.jar")
    }
}