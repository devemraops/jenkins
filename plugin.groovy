node {
    stage ('BUild-VPC'){
        }
    }
    stage ('Build-RDS'){
    }
    stage ('BUild-SECGRP'){
    }
    stage ('Build-EC2') {
    }
     stage ('notification'){
         slackSend channel: 'evolvecyber', message: 'hello everyone'
    }

}
