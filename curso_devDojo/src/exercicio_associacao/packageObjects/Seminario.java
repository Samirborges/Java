package exercicio_associacao.packageObjects;

public class Seminario {
    private String titulo;
    private Professor professor;
    private Aluno[] alunos;
    private Local local;

    public Seminario(String titulo, Professor professor, Local local) {
        this.titulo = titulo;
        this.professor = professor;
        this.local = local;
    }

    public Seminario(String titulo, Professor professor, Aluno[] alunos, Local local) {
        this.titulo = titulo;
        this.professor = professor;
        this.alunos = alunos;
        this.local = local;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getProfessor() {
        return professor.getNome();
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void alunosSeminario() {
        System.out.println("Alunos que estão no seminário");
        for(Aluno aluno : alunos){
            System.out.println(aluno.getNome());
        }
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public String getLocal() {
        return local.getLocal();
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public void imprimir(){
        System.out.println("Título do seminário: " + titulo);
        System.out.println("Professor: " + professor.getNome());
        System.out.println("Local do seminário: "+ local.getLocal());
        alunosSeminario();

    }
}
