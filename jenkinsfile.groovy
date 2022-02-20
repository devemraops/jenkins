properties([ 
    buildDiscarder(logRotator(artifactDaysToKeepStr: '', artifactNumToKeepStr: '', daysToKeepStr: '', numToKeepStr: '4'))])

node {
    stage ('Preparation'){
        timestamps {
            echo "hello world!"
        }
    }
    stage ('Build'){
    }
    echo "l think l am okay with jenkins"
    stage ('Result'){
    }
}
