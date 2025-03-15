pipeline {

    environment {
            DockerImageName = "chedjou03/client"
            DockerImageVersion = "0.0.1"

            IMAGE = readMavenPom().getArtifactId()
            VERSION = readMavenPom().getVersion()

    }

    agent any

    stages {
        stage('Checkout Code from GitHub') {
            steps {
                script {
                    echo "************** ${VERSION}"
                    echo "************** ${IMAGE}"
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
                      sh 'docker build -t ${DockerImageName}:${DockerImageVersion}'
                   }
             }
         }

         stage('Push Docker Image To Docker HUB') {
              steps {
                   script {
                           withCredentials([usernamePassword(credentialsId: 'DOCKER_Credentials', usernameVariable: 'DOCKER_USERNAME', passwordVariable: 'DOCKER_PASSWORD')]) {

                                sh 'echo "$DOCKER_PASSWORD" | docker login -u "$DOCKER_USERNAME" --password-stdin'
                                sh "docker push ${DockerImageName}:${DockerImageVersion}"
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