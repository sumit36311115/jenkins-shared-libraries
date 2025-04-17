def pushToDockerHub(String imageName, String credentialsId) {
    echo "Pushing the image to Docker Hub..."

    withCredentials([usernamePassword(credentialsId: credentialsId, usernameVariable: 'DOCKER_USERNAME', passwordVariable: 'DOCKER_PASSWORD')]) {
        sh "echo \$DOCKER_PASSWORD | docker login -u \$DOCKER_USERNAME --password-stdin"
        sh "docker tag ${imageName}:latest \$DOCKER_USERNAME/${imageName}:latest"
        sh "docker push \$DOCKER_USERNAME/${imageName}:latest"
    }
}
