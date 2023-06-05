package threads;

public class TimeIt {

    public void heavyCalculationMethod() throws InterruptedException {
        Thread.sleep(3000);
    }

    public void anotherHeavyCalculationMethod() throws InterruptedException {
        Thread.sleep(4000);
    }

    public static void main(String[] args) throws InterruptedException {
        TimeIt ti = new TimeIt();
        long start = System.currentTimeMillis();
        ti.heavyCalculationMethod();
        long now = System.currentTimeMillis();
        System.out.println("execution took " + (now - start) + " ms");
    }
}
