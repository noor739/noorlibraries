def newGit(repo)
{
git "${repo}"
}
def newMaven()
{
  sh 'mvn package'
} 
def newDeploy(ip,appname)
{
  deploy adapters: [tomcat9(credentialsId: 'a8e8f778-2e00-4674-a50c-ce3fa09b94e4', path: '', url: "${ip}")], contextPath: "${appname}", war: '**/*.war'
}
