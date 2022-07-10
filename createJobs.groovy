pipelineJob('pipelineJob') {
    definition {
        cps {
            script(readFileFromWorkspace('pipelineJob.groovy'))
            sandbox()
        }
    }
}

pipelineJob('theme-park-job') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/TuanHungit/spring-api-example.git'
                    }
                    branch 'master'
                }
            }
        }
    }
}

pipelineJob('theme-park-job-docker') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/TuanHungit/spring-api-example.git'
                    }
                    branch 'master'
                    scriptPath('Jenkinsfile-docker')
                }
            }
        }
    }
}

pipelineJob('theme-park-job-aws') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/TuanHungit/spring-api-example.git'
                    }
                    branch 'master'
                    scriptPath('Jenkinsfile-aws')
                }
            }
        }
    }
}


pipelineJob('ecommerce-auth-service') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/TuanHungit/ecommerce-java-microservices.git'
                    }
                    branch 'master'
                    scriptPath('auth-service/Jenkinsfile')
                }
            }
        }
    }
}
