pipeline {
    agent{
        docker {image 'node:22.17.0-alpine3.22'}
    }

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
