package exercicio_associacao.packageObjects;

import org.w3c.dom.ls.LSOutput;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(String nome, Seminario[] seminarios) {
        this.nome = nome;
        this.seminarios = seminarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void getSeminarios() {
        for(Seminario seminario : seminarios){
            System.out.println(seminario.getTitulo());
        }
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public void imprimir(){
        System.out.println("Nome do professor: " + nome);
        System.out.println("Especialidade: " + especialidade);
        System.out.println("Seminários: ");
        getSeminarios();
    }
}
