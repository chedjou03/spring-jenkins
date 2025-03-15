pipeline {

    environment {
            imagename = "chedjou03/client"
            dockerImage = ''
            containerName = 'my-container'
            dockerHubCredentials = 'admin'
    }

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
                      dockerImage = docker.build "${imagename}:latest"
                      sh 'echo dockerImage: $dockerImage'
                      //sh 'docker build -t ${imagename}:latest .'
                   }
             }
         }

         stage('Push Docker Image To Docker HUB') {
              steps {
                   script {
                        sh 'echo ******* PUSHING  DOCKER IMAGE to DOCKER HUB'
                   }
              }
         }

         stage('Cleaning up') {
             steps{
                  sh 'echo *******  REMOVE DOCKER IMAGE '
                 //sh "docker rmi $registry:$BUILD_NUMBER"
             }
         }
    }
}