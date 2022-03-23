node {
    stage ("build") {
        sh "echo hello"
    }
    stage ("test") {}
    stage ("mail") {}
}