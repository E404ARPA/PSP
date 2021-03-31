package ThreadAndRunnable.Testing;

public class Sub extends Thread {
    private String name;
    private Count contador;
    public Sub(String name, Count contador) {
        this.name = name;
        this.contador = contador;
    }
    @Override
    public void run() {
        for (int i = 0; i < 300; i++) {
            this.contador.decrementa(); //decrementa
            // meto un poco de lag para que no sea instantáneo
            // Thread.currentThread().sleep(0);
        }
        System.out.println("[" + this.name + "] contador= " + this.contador);
    }
}
