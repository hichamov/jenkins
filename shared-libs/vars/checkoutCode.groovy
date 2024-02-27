def call(String repoUrl, String branch){
   def workingDir = "${env.WORKSPACE}"
   sh '''  
   if [ -d 'test-shared-libs' ]; then
     echo "dir exists"
     pwd && ls
     rm -rf test-shared-libs && git clone "${repoUrl}" "${workingDir}"
   else
      echo "dir does not exist"
      git clone ${repoUrl} ${workingDir}
   fi
   '''
   sh "git checkout ${branch}"
   return workingDir
}