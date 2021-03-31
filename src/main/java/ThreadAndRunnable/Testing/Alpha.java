package ThreadAndRunnable.Testing;

public class Alpha {
    public static void main(String[] args) throws InterruptedException {
        Count contador = new Count(100);

        Sum in = new Sum("Incrementador", contador);
        Sub de = new Sub("Decrementador", contador);
        de.start(); in .start();

        //espero 10 segundo a que termine todo lo anterior para ver el resultado de contador
        Thread.currentThread().sleep(10000);

        System.out.println(contador);
    }
}
