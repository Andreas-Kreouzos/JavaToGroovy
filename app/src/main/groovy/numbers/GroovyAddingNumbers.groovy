package numbers

class GroovyAddingNumbers {
    static def add(int... numbers) {
        numbers.sum()
    }

    static def addEven(int... numbers) {
        numbers.findAll { it % 2 == 0 }.sum()
    }

    static def addOdd(int... numbers) {
        numbers.findAll { it % 2 != 0 }.sum()
    }

    static def addNumbersGreaterThan(List<Integer> numbers, int lowerBound) {
        numbers.findAll { it > lowerBound }.sum()
    }

    static void main(String[] args) {
        println add(1,2,3,4,5,6,7,8)
        println addEven(1,2,3,4,5,6,7,8)
        println addOdd(1,2,3,4,5,6,7,8)
        println addNumbersGreaterThan([1,2,3,4,5,6,7,8], 4)
    }
}
