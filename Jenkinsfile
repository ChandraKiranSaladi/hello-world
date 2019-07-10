pipeline {
  agent any
  stages {
    stage('Build') {
      parallel {
        stage('Build') {
          agent any
          steps {
            echo 'First Test using Git'
          }
        }
        stage('Build 2 Parallel Pipeline') {
          steps {
            readFile(file: 'README.md', encoding: 'UTF-8')
            timestamps() {
              echo 'TimeStamp 1'
              sleep 1
              echo 'TimeStamp 2'
            }

          }
        }
      }
    }
    stage('Deploy') {
      steps {
        retry(count: 2) {
          cleanWs(cleanWhenSuccess: true, skipWhenFailed: true)
          echo 'Done'
        }

      }
    }
  }
  environment {
    mvnhome = 'M3'
  }
}