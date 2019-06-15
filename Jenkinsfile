pipeline {
  agent any

  stages {
    stage('Test unit application') {
      steps {
        sh "./gradlew clean build"
      }
    }
  }
}
