package ThreadAndRunnable.Ejercicio2;

public class Principal {
    private static CuentaBancaria account = new CuentaBancaria("Alpha", 1000);
    private static Persona p0 = new Persona("0", account);
    private static Persona p1 = new Persona("1", account);

    public static void main(String[] args) {
        p0.start();
        p1.start();

        try {
            Thread.sleep(20500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(account.getMoney());
    }
}
