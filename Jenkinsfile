pipeline {

    environment {
            imageName = "chedjou03/client"
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
                      //dockerImage = docker.build "${imagename}:latest"
                      //sh 'echo dockerImage: $dockerImage'
                      sh 'docker build -t ${imageName}:latest .'
                   }
             }
         }

         stage('Push Docker Image To Docker HUB') {
              steps {
                   script {
//                        withCredentials([usernamePassword(credentialsId: DOCKER_Credentials, usernameVariable: 'DOCKER_USERNAME', passwordVariable: 'DOCKER_PASSWORD')]) {
//                               sh "docker login -u $DOCKER_USERNAME -p $DOCKER_PASSWORD"
//                               // Push the image
//                               sh "docker push ${imageName}:latest"
//                        }
                           withCredentials([usernamePassword(credentialsId: 'DOCKER_Credentials', usernameVariable: 'DOCKER_USERNAME', passwordVariable: 'DOCKER_PASSWORD')]) {
                                   sh "docker login -u $DOCKER_USERNAME -p $DOCKER_PASSWORD"
                                   // Push the image
                                   sh "docker push ${imageName}:latest"


                                   //sh 'echo "$DOCKER_PASSWORD" | docker login -u "$DOCKER_USERNAME" --password-stdin'
                                   //sh 'docker push $DOCKER_IMAGE'
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