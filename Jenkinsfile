pipeline {
    agent any

    stages {
        stage('Maven Version') {
            steps {
                bat 'mvn -v '
            }
        }
        stage('Compile and Package') {
            steps {
                bat 'mvn clean install'
            }
        }
        /*stage('Code Analysis') {
            steps {
                withSonarQubeEnv(credentialsId: 'Sonar_Local') {
                    bat 'mvn sonar:sonar -Dsonar.projectKey=trranjith-calc-key -Dsonar.projectName=trranjith-calc-demo'
                }
            }
        }*/
        stage('Deploy') {
            steps {
                deploy adapters: [tomcat8(credentialsId: '671c1554-1627-42ee-a5d9-a6ee8d22574c', path: '', url: 'http://localhost:8080')], contextPath: '/calculator', war: '**/*.war'
            }
        }
    }
}
