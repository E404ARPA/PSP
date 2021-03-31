package ThreadAndRunnable.Ejercicio1;

public class Principal {
    public static void main(String[] args) {
        NumeroPalabrasFichero t0 = new NumeroPalabrasFichero("Assets/fichero1.txt");
        NumeroPalabrasFichero t1 = new NumeroPalabrasFichero("Assets/fichero2.txt");
        NumeroPalabrasFichero t2 = new NumeroPalabrasFichero("Assets/fichero3.txt");

        t0.start();
        t1.start();
        t2.start();


    }
}
