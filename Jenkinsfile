pipeline {
  agent any

  stages {
    stage("Starting CI"){
      steps {
        echo "Starting Job: ${env.JOB_NAME} with buildnumber ${env.BUILD_NUMBER} in ${env.BRANCH_NAME}"
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
      slackSend color: "good", message: "Job: ${env.JOB_NAME} with buildnumber ${env.BUILD_NUMBER} was successful(${currentBuild.durationString} and build vars ${currentBuild.buildVariables})"
    }
    failure {
      echo "Finished CI with Errors"
      slackSend color: "danger", message: "Job: ${env.JOB_NAME} with buildnumber ${env.BUILD_NUMBER} was failed"
    }
    always {
      echo "Finished CI ${currentBuild}"
      cleanWs()
    }
  }
}
