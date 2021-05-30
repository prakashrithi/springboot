pipeline {
    agent any

    stages {
        
        stage('Clone repository') {               
             
            checkout scm    
        }
        
        stage('Hello') {
            steps {
                echo 'Hello World'
            }
        }
    }
}
  
