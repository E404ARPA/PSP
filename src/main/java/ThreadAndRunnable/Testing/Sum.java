package ThreadAndRunnable.Testing;

public class Sum extends Thread {
    private String name;
    private Count contador;
    public Sum(String name, Count contador) {
        this.name = name;
        this.contador = contador;
    }
    @Override
    public void run() {
        for (int i = 0; i < 300; i++) {
            this.contador.incrementa(); //incrementa
            // meto un poco de lag para que no sea instantáneo
            // Thread.currentThread().sleep(0);
        }
        System.out.println("[" + this.name + "] contador= " + this.contador);
    }
}
