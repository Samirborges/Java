package exercicio_associacao.packageObjects;

public class Aluno {
    private String nome;
    private int idade;
    private Seminario seminario;

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Aluno(String nome, Seminario seminario, int idade) {
        this.nome = nome;
        this.seminario = seminario;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSeminario() {
        return seminario.getTitulo();
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }

    public void imprimir(){
        System.out.println("Nome do aluno: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Seminário: " + getSeminario());
    }
}
