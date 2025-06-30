pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git url: 'https://github.com/SEU_USUARIO/SEU_REPOSITORIO.git'
            }
        }

        stage('Build') {
            steps {
                sh 'docker-compose run --rm build'
            }
        }

        stage('Test') {
            steps {
                sh 'docker-compose run --rm test'
            }
        }
    }

    post {
        always {
            sh 'docker-compose down || true'
        }
    }
}
