pipeline {
  agent any

  stages {
    stage("Starting CI"){
      steps {
        echo "Starting ${env.dump()}"
      }
    }
    stage('Test unit application') {
      steps {
        sh "./gradlew clean build"
      }
    }
  }
}
