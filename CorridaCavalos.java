import java.util.*;
class Cavalo implements Runnable {
    public Cavalo (String nome_) { nome = nome_; }
    static Random r = new Random();
    public void run () {
        long t = System.currentTimeMillis();
        try { Thread.sleep (r.nextInt (10000)); } catch (InterruptedException ex) {}
        t = System.currentTimeMillis() - t;
        System.out.println (nome + " chegou em " + t + " ms");
    }
    private String nome;
}
class CorridaCavalos {
    public static void main(String[] args) throws InterruptedException {
        Thread[] cavalos = new Thread [5];
        cavalos[0] = new Thread (new Cavalo ("Joia da Coroa"));
        cavalos[1] = new Thread (new Cavalo ("Princesa da Albania"));
        cavalos[2] = new Thread (new Cavalo ("Duque de Windsor"));
        cavalos[3] = new Thread (new Cavalo ("Chabuzinho"));
        cavalos[4] = new Thread (new Cavalo ("Azarao"));
        System.out.println ("Corrida iniciada!");
        // Pondo os cavalos para correrem...
        for (int i = 0; i < cavalos.length; ++i) {
            cavalos [i].start();
        }
	// Esperando os cavalos chegarem...
        for (int i = 0; i < cavalos.length; ++i) {
            cavalos [i].join();
        }
        System.out.println ("Corrida terminada.");
    }
}