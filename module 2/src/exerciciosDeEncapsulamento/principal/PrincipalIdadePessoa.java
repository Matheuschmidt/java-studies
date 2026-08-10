package exerciciosDeEncapsulamento.principal;

import exerciciosDeEncapsulamento.classesEncapsuladas.IdadePessoa;

public class PrincipalIdadePessoa {
    public static void main(String[] args) {
        IdadePessoa pessoa = new IdadePessoa();
        pessoa.setNome("Matheus");
        pessoa.setIdade(21);

        System.out.println("Nome: "+pessoa.getNome());
        System.out.println("Idade: "+pessoa.getIdade());

        pessoa.verificarIdade();

    }
}
