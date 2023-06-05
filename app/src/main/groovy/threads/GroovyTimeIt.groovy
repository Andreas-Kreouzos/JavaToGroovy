package threads

class GroovyTimeIt {

    static void heavyCalculationMethod() throws InterruptedException {
        Thread.sleep(3000)
    }

    static void anotherHeavyCalculationMethod() throws InterruptedException {
        Thread.sleep(4000)
    }

    static void main(String[] args) throws InterruptedException {
        TimeIt ti = new TimeIt()
        long start = System.currentTimeMillis()
        ti.heavyCalculationMethod()
        long now = System.currentTimeMillis()
        println "execution took ${now - start} ms"
    }
}
