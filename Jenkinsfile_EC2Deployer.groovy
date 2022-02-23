properties([parameters([string(defaultValue: 'which environment you would like to work?', description: '''dev
qa
prod
stage''', name: 'ENVIR')])])

node {
    stage ('pull a repo') {
        checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/devemraops/jenkins.git']]])
    }
    stage ('Build EC2'){
        ws("${workspace}/AWS/EC2") {
            sh ""
    }
    }
}