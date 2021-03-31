package ThreadAndRunnable.Testing;

public class Count {
    private int c = 0;

    public Count(int c) {
        this.c = c;
    }
    public void incrementa() {
        c = c + 1;
    }
    public void decrementa() {
        c = c - 1;
    }
    public int valor() {
        return c;
    }

    @Override
    public String toString() {
        return String.valueOf(this.c);
    }
}
