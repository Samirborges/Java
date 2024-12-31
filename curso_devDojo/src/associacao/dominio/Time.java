package associacao.dominio;

public class Time {
    private String nome;
    private Jogador[] joradores;

    public Time(String nome) {
        this.nome = nome;
    }

    public Time(String nome, Jogador[] joradores) {
        this.nome = nome;
        this.joradores = joradores;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Jogador[] getJoradores() {
        return joradores;
    }

    public void setJoradores(Jogador[] joradores) {
        this.joradores = joradores;
    }

    public void imprimir(){
        System.out.println("Nome do time: " + this.nome);
        if(joradores != null){
            System.out.print("Nome dos jogadores: ");
            for(Jogador jogador : joradores) {
                System.out.print(jogador.getNome() + " ");
            }

        }
    }
}
