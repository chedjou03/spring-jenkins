pipeline {

    environment {
            imageName = "chedjou03/client"
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
                      sh 'docker build -t ${imageName}:latest .'
                   }
             }
         }

         stage('Push Docker Image To Docker HUB') {
              steps {
                   script {
                           withCredentials([usernamePassword(credentialsId: 'DOCKER_Credentials', usernameVariable: 'DOCKER_USERNAME', passwordVariable: 'DOCKER_PASSWORD')]) {

                                sh 'echo "$DOCKER_PASSWORD" | docker login -u "$DOCKER_USERNAME" --password-stdin'
                                sh "docker push ${imageName}:latest"
                           }
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