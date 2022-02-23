node {
    stage ('BUild-VPC'){
        timestamps {
            echo "hello world!"
        }
    }
    stage ('Build-RDS'){
    }
    echo "l think l am okay with jenkins"
    stage ('Result'){
    }
    stage ('notification-slack'){
    }

}
