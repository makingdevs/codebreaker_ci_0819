pipeline {
  agent any

  stages {
    stage("Starting CI"){
      steps {
        echo "Starting at ${new Date()} the CI"
      }
    }
    stage('Test unit application') {
      steps {
        sh "./gradlew clean build"
          junit '**/build/test-results/test/*.xml'
      }
    }
  }
  post {
    success {
      echo "Finished CI with Success"
    }
    failure {
      echo "Finished CI with Errors"
    }
    always {
      echo "Finished CI"
      cleanWs()
    }
  }
}
