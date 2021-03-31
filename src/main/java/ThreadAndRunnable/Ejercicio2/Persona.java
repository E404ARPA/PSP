package ThreadAndRunnable.Ejercicio2;

public class Persona extends Thread{
    private String ID;
    private CuentaBancaria account;

    public Persona(String ID, CuentaBancaria account) {
        this.ID = ID;
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 1000; i > 0; i--) {
            try {
                shitHappens(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /*
    this controls that each person does a different action so we
    know that both actions have been done an equal amount of times
    */
    private void shitHappens(int i) throws InterruptedException {
        if (this.ID == "0") {
            Thread.currentThread().sleep(10);
            account.increment(10);
        } else {
            Thread.currentThread().sleep(10);
            account.decrement(10);
        }

        System.out.println("Iter [" + (1000 - i) + "]" + account.getMoney() + " | " + Thread.currentThread().getName());
    }
}
