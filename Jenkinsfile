pipeline {

    environment {
        DockerRepo = "chedjou03/"
        DockerImageName = readMavenPom().getArtifactId()
        DockerImageVersion = readMavenPom().getVersion()
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
                    sh 'mvn package'
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
                      sh 'docker build -t ${DockerRepo}${DockerImageName}:${DockerImageVersion} .'
                   }
             }
         }

         stage('Push Docker Image To Docker HUB') {
              steps {
                   script {
                           withCredentials([usernamePassword(credentialsId: 'DOCKER_Credentials', usernameVariable: 'DOCKER_USERNAME', passwordVariable: 'DOCKER_PASSWORD')]) {

                                sh 'echo "$DOCKER_PASSWORD" | docker login -u "$DOCKER_USERNAME" --password-stdin'
                                sh "docker push ${DockerRepo}${DockerImageName}:${DockerImageVersion}"
                           }
                   }
              }
         }

         stage('Cleaning up') {
             steps{
                  sh 'echo *******  REMOVE DOCKER IMAGE '
             }
         }
    }
}