properties([parameters([string(defaultValue: 'apply', 'destroy', description: 'Should I build or destroy?', name: 'TF_ACTION'), choice(choices: ['dev'], description: 'what environment you want to apply this?', name: 'env')])])

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