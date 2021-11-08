package exercicio04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Exercício 4
        List<Pessoa> pessoas = new ArrayList<>();

        Pessoa pessoa1 = new Pessoa("João", 15);
        Pessoa pessoa2 = new Pessoa("Leandro", 21);
        Pessoa pessoa3 = new Pessoa("Paulo", 17);
        Pessoa pessoa4 = new Pessoa("Jéssica", 18);

        pessoas.add(pessoa1);
        pessoas.add(pessoa2);
        pessoas.add(pessoa3);
        pessoas.add(pessoa4);

        int maiorIdade = pessoa1.getIdade();
        Pessoa pessoaMaisVelha = pessoa1;

        for (Pessoa pessoa : pessoas) {
            if (pessoa.getIdade() > maiorIdade) {
                maiorIdade = pessoa.getIdade();
                pessoaMaisVelha = pessoa;
            }
        }

        System.out.println("Pessoa mais velha: " + pessoaMaisVelha.getNome());

        // Exercício 5
        System.out.println("Quantidade de pessoas: " + pessoas.size());
        System.out.println("Excluindo menores de 18 anos...");
        Iterator<Pessoa> i = pessoas.iterator();
        while (i.hasNext()) {
            Pessoa pessoa = i.next();
            if (pessoa.getIdade() < 18) {
                i.remove();
            }
        }
        System.out.println("Quantidade de pessoas: " + pessoas.size());

        // Exercício 6
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getNome().equals("Jéssica")) {
                System.out.println("Idade de Jéssica: " + pessoa.getIdade());
                break;
            }
        }
    }
}
