package exercicio_associacao;

import exercicio_associacao.packageObjects.Local;
import exercicio_associacao.packageObjects.Professor;
import exercicio_associacao.packageObjects.Aluno;
import exercicio_associacao.packageObjects.Seminario;

public class Main {
    public static void main(String[] args) {
        // Iniciando professor e seminario
        Local local = new Local("Rua das Laranjeiras");
        Professor professor = new Professor("Aldeido", "Quimica");
        Seminario seminario = new Seminario("Quimica", professor, local);

        // Iniciando os alunos
        Aluno aluno1 = new Aluno("José", 18);
        Aluno aluno2 = new Aluno("Mária", 19);
        Aluno aluno3 = new Aluno("Mário", 17);
        Aluno aluno4 = new Aluno("Pedro", 18);

        // Adicionando o seminário aos alunos
        Aluno[] alunos = {aluno1, aluno2};
        seminario.setAlunos(alunos);
        aluno1.setSeminario(seminario);
        aluno2.setSeminario(seminario);

        Aluno[] alunos1 = {aluno3, aluno4};
        Seminario seminario1 = new Seminario("Matemática", professor, alunos1, local);
        aluno3.setSeminario(seminario1);
        aluno4.setSeminario(seminario1);

        // Adicionando seminario em professor
        Seminario[] seminarios = {seminario, seminario1};
        professor.setSeminarios(seminarios);

        // Informações do seminário
        System.out.println("---- 1° Seminário ----");
        seminario.imprimir();

        System.out.println("---- 2° Seminário ----");
        seminario1.imprimir();

        System.out.println("---- Professor ----");

        // Informações do professor
        professor.imprimir();

        System.out.println("---- Alunos ----");

        // Informações dos alunos
        aluno1.imprimir();
        aluno2.imprimir();
        aluno3.imprimir();
        aluno4.imprimir();

    }
}
