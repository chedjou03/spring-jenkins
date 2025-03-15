pipeline {
    agent any

    stages {
        stage('Checkout Code from GitHub') {
            steps {
                script {
                    checkout scm
                }
            }
        }

        stage('Maven Build') {
            steps {
                script {
                    sh 'mvn test package'
                }
            }
        }

         stage('Run Unit Test') {
               steps {
                    script {
                        sh 'mvn test'
                    }
               }
         }

         stage('Build Docker Image') {
              steps {
                   script {
                      sh 'echo ***************  '
                      sh 'whoami'
                      sh 'docker build -t chedjou03/client:latest .'
                   }
             }
         }

         stage('Push Docker Image To Docker HUB') {
              steps {
                   script {
                        sh '******* echo PUSHING  DOCKER IMAGE to DOCKER HUB'
                   }
              }
         }
    }
}