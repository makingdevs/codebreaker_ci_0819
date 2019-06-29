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
      }
    }
    stage('Run the app') {
      steps {
        sh "./gradlew clean bootRun >> ./log.txt &"
      }
    }
    stage('Test functional application') {
      steps {
        sh "./gradlew clean cucumber"
      }
    }
  }
  post {
    always {
      echo "Finished CI"
    }
  }
}
