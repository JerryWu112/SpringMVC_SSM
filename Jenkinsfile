pipeline {
    agent any

    stages {
        stage('pull code') {
            steps {
                checkout([$class: 'GitSCM', branches: [[name: '*/${branch}']], extensions: [], userRemoteConfigs: [[credentialsId: 'ce0af2ad-a40b-4715-8e34-604637b8c998', url: 'git@github.com:JerryWu112/SpringMVC_SSM.git']]])
            }
        }
        stage('build') {
            steps {
                bat 'mvn clean package'
            }
        }
        stage('deploy') {
            steps {
                deploy adapters: [tomcat8(credentialsId: '3069952d-1f32-4deb-ae7c-4dc1a12c6607', path: '', url: 'http://192.168.32.128:8080/')], contextPath: null, war: 'target/*.war'
            }
        }
    }
    post {
        always {
            emailext (
                body: '${DEFAULT_CONTENT}',
                subject: '${DEFAULT_SUBJECT}',
                to: '${DEFAULT_RECIPIENTS}',
                from: '${env.DEFAULT_FROM_EMAIL}'
            )
        }
    }
}
