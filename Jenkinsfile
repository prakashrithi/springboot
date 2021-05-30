pipeline {
    agent any

    stages {
              
        stage('Hello') {
            steps {
                echo 'Hello World'
            }
        }
        stage('Build image') {         
       
            app = docker.build("prakashrithi/springboot-aws-example")
            echo 'image generated successfully'
       }
    }
}
  
