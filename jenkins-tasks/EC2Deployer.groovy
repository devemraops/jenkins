node {
    stage ("build") {
        sh "echo hello"
    }
    stage ("test") {
        timestamps {
    sh "sudo yum install telnet -y"
}
    }
    stage ("mail") {}
}