properties([parameters([string(defaultValue: 'Apply', description: 'Apply/Destroy', name: 'ACTION'), choice(choices: ['DEV', 'QA', 'STAGE', 'PROD'], name: 'ENVIREMONT')])])
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
