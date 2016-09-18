/**
 * An improved version of the shorthand 'checkout scm' for git, with 'clean before checkout' extension added.
 * Usage: gitCheckoutScm()
 */
def call() {
    checkout([$class: 'GitSCM',
        userRemoteConfigs: scm.userRemoteConfigs,
        branches: scm.branches,
        extensions: scm.extensions + [[$class: 'CleanBeforeCheckout']],
        doGenerateSubmoduleConfigurations: false,
        submoduleCfg: []
    ])
}
