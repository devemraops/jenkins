properties([parameters([string(defaultValue: 'Dev', description: 'Please provide the environment to build', name: 'ENVIR')])])
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
