package exercicio07;

public class Main {
           public static void main(String[] args) {
            Gerente gerente = new Gerente("Maria", 23, 5000.0);
            Supervisor supervisor = new Supervisor("Paulo", 27, 3000.0);
            Vendedor vendedor = new Vendedor("Ana", 21, 2000.0);

            System.out.println("Nome: " + gerente.getNome() +
                    ", Idade: " + gerente.getIdade() +
                    ", Salário: " + gerente.getSalario() +
                    ", Bonificação: " + gerente.bonificacao());

            System.out.println("Nome: " + supervisor.getNome() +
                    ", Idade: " + supervisor.getIdade() +
                    ", Salário: " + supervisor.getSalario() +
                    ", Bonificação: " + supervisor.bonificacao());

            System.out.println("Nome: " + vendedor.getNome() +
                    ", Idade: " + vendedor.getIdade() +
                    ", Salário: " + vendedor.getSalario() +
                    ", Bonificação: " + vendedor.bonificacao());
        }
    }