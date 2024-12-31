package carroPackage;

public class Main {
    public static void main(String[] args) {
        Carro.setVelocidadeLimite(180);
        Carro c1 = new Carro("BMW", 0, 250);
        Carro c2 = new Carro("Mercedes", 0, 300);
        Carro c3 = new Carro("Audi", 0, 200);

        c1.imprimi();
        c2.imprimi();
        c3.imprimi();


    }
}