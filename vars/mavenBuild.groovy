def call(Map stageParams) {

    checkout 
        scmGit(
            branches: [[name: stageParams.branch]], 
            extensions: [], 
            userRemoteConfigs: [[credentialsId: 'c2003d50-5f59-4be9-a918-c6c6be215279', url: stageParams.url ]])
}