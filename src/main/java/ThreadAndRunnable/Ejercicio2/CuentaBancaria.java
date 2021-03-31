package ThreadAndRunnable.Ejercicio2;

public class CuentaBancaria {
    private String ID;
    private float money;

    public CuentaBancaria(String ID, float money) {
        this.ID = ID;
        this.money = money;
    }

    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }

    public synchronized void increment(float money) {
        setMoney(getMoney()+money);
    }

    public synchronized void decrement(float money) {
        setMoney(getMoney()-money);
    }
}
