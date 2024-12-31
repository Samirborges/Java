package Hheranca.teste;

import Hheranca.dominio.Endereco;
import Hheranca.dominio.Funcionario;
import Hheranca.dominio.Pessoa;

public class HerancaTeste01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("012345-209");

        Pessoa pessoa = new Pessoa("Toyoshi Shimazu");
        pessoa.setCpf("11111");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Zoro");
        funcionario.setCpf("??????");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);
        System.out.println("----------------------");

        funcionario.imprime();
    }
}
