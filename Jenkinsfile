pipeline {
  agent any

  stages {
    stage("Starting CI"){
      steps {
        echo "Starting ${env.properties}"
      }
    }
    stage('Test unit application') {
      steps {
        sh "./gradlew clean build"
      }
    }
  }
}
