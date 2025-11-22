
    pipeline {
        agent any

        tools {
            maven 'Maven_3.9.9'
        }

        stages {
            stage('Checkout Code') {
                steps {
                    checkout scm
                }
            }

            stage('Build Project') {
                steps {
                    bat "mvn clean install"
                }
            }

            stage('Run Tests') {
                steps {
                    bat "mvn test"
                }
            }

            stage('Archive Reports') {
                steps {
                    archiveArtifacts artifacts: '**/target/surefire-reports/*.xml', allowEmptyArchive: true
                    junit '**/target/surefire-reports/*.xml'
                }
            }
        }
    }


