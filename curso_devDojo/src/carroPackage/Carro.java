package carroPackage;

public class Carro {
    private String nome;
    private int velocidadeAtual;
    private int velocidadeMaxima;
    private static int velocidadeLimite = 150;

    {
        System.out.println("Adquirindo novo carro...");
    }



    public Carro(String nome, int velocidadeAtual, int velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeAtual = velocidadeAtual;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public static void setVelocidadeLimite(int velL){
        Carro.velocidadeLimite = velL;
    }

    public void imprimi(){
        System.out.println("Nome: "+ nome);
        System.out.println("Velocidade Máxima: "+ velocidadeMaxima);
        System.out.println("Limite de velocidade: "+ Carro.velocidadeLimite);
    }
}
