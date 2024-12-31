package Hheranca.dominio;

public class Funcionario extends Pessoa{
    private double salario;

    public double getSalario() {
        return salario;
    }

    public Funcionario(String nome){
        super(nome);
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public void imprime(){
        super.imprime();
        System.out.println("Salário: " + this.salario);
    }

    public void relatorioPagamento(){
        System.out.println("Eu " + this.nome + " estou recebendo um salário de R$" + this.salario);
        // Na questão do nome, caso o atributo estivesse privado, poderíamos colocar this.getNome()
    }

}
