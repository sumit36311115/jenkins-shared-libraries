def buildDockerImage(String imageTag, String dockerHubUser, String projectName) {
    sh "docker build -t ${dockerHubUser}/${projectName}:${imageTag} ."
}
