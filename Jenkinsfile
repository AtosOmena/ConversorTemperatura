pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh 'docker compose run --rm build'
            }
        }

        stage('Test') {
            steps {
                sh 'docker compose run --rm test'
            }
        }
    }

    post {
        always {
            sh 'docker compose down || true'
        }
    }
}
