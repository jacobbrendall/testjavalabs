pipeline {
    agent any

    stages {
        stage ('Initialize') {
            steps {
                sh '''
                    mvn -version
                    echo "M2_HOME = ${M2_HOME}"
                '''
            }
        }

        stage ('Build') {
            steps {
                echo 'This is a minimal pipeline.'
            }
        }
    }
}