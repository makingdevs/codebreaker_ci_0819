pipeline {
  agent any

  stages {
    stage("Starting CI"){
      steps {
        echo "Starting at ${new Date()} the CI($BRANCH_NAME)"
      }
    }
    stage('Test unit application') {
      steps {
        sh "./gradlew clean build"
      }
    }
  }
  post {
    always {
      echo "Finished CI"
    }
  }
}
