package operations

class GroovyListOperations {
    static void main(String[] args) {

        def branches = ['Motor', 'Public Liability', 'Life', 'Property', 'Group', 'Health']

        println "Last branch in the list: ${branches.last()}"

        println "List of branches:"
        branches.eachWithIndex { branch, i -> println "${i + 1}\t$branch" }

        println "Sorted branches:"
        def sortedBranches = branches.sort()
        sortedBranches.each { println it }

        println "The branches are: "
        println branches.join(', ')
    }
}
