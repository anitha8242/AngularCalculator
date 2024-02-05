pipeline {
  agent any
    
  tools {nodejs "node"}
    
  stages {
        
    stage('Git') {
      steps {
        git 'https://github.com/anitha8242/AngularCalculator.git'
      }
    }
     
    stage('Build') {
      steps {
        sh 'npm install'
         sh 'npm install -g @angular/cli'
      }
    }  
    
            
    stage('Test') {
      steps {
        sh 'ng build'
      }
    }
  }
}
