package exercicio07;

public class Funcionario {
        private String nome;
        private int idade;
        private double salario;

        public Funcionario(String nome, int idade, double salario) {
            setNome(nome);
            setIdade(idade);
            setSalario(salario);
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

        public double getSalario() {
            return salario;
        }

        public void setSalario(double salario) {
            this.salario = salario;
        }

        public double bonificacao() {
            return getSalario();
        }
}
