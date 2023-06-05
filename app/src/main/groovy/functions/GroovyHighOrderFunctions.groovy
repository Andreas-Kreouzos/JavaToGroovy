package functions

import policy.Policy

class GroovyHighOrderFunctions {

    static void main(String[] args) {
        List<Policy> policies = []
        policies.add(new Policy(2,3, "22222222"))
        policies.add(new Policy(2,5, "11111111"))
        policies.add(new Policy(2,3, "22222229"))
        policies.add(new Policy(2,5, "11111115"))
        policies.add(new Policy(1,1, "77777777"))

        printPolicyNumbers(policies)
        printPolicyNumbers([])
    }

    static void printPolicyNumbers(List<Policy> policies) {
        if (policies != null) {
            if (policies.size() > 0) {
                println "There are ${policies.size()} policies."
                println "The policy numbers are: ${policies.collect { it.policyNumber }.join(', ')}"
                return
            }
        }
        println "There are no policies"
    }
}
