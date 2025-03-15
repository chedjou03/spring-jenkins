pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                script {
                    checkout scm
                }
            }
        }

        stage('Build') {
            steps {
                script {
                    sh 'mvn test package'
                }
            }
        }

         stage('Test') {
               steps {
                    script {
                        sh 'mvn test'
                    }
               }
         }
    }
}