pipeline {
    agent any

    stages {
        stage('Github Pull') {
            steps {
                git branch: 'main', credentialsId: 'Github_usernam_and_password', url: 'https://github.com/Deepesh368/Calculator.git'
            }
        }
        stage('Maven build') {
            steps {
                script{
                    sh 'mvn clean install'
                }
            }
        }
        stage('Docker build') {
            steps{
                script {
                    imageName=docker.build("deepesh007/calculator_mini_project:latest")
                }
            }
        }
        stage('Docker push image') {
            steps {
                script{
                    docker.withRegistry('','DockerHub_Credentials'){
                    imageName.push()
                    }
                }
            }
        }
        stage("Delete docker image"){
            steps{
                sh "docker rmi deepesh007/calculator_mini_project"
            }
        }
        stage('Ansible pull img') {
            steps {
                ansiblePlaybook becomeUser: null, colorized: true, disableHostKeyChecking: true, installation: 'Ansible', inventory: 'inventory', playbook: 'playbook.yml', sudoUser: null
            }
        }
    }
}
