def call(String url, String branch){
  echo "Cloning the code..."
                git url: url, branch: branch
                echo "Code cloning successful"
}
