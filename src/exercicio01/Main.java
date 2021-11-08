package exercicio01;

public class Main {
    public static void main(String[] args) {
        Veiculo v1 = new Veiculo();
        v1.setVelocidade(15);
        v1.acelerar();
        System.out.println("Velocidade atual:" + v1.getVelocidade());

        try {
            v1.abastecer(20);
            System.out.println("Total abastecido: " + v1.getLitrosCombustivel());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return;
        }

        v1.frear();
        v1.pintar("Azul");
        System.out.println("Pintar o carro na cor: " + v1.getCor());
        v1.desligar();
        System.out.println("O carro foi desligado!");
    }
}
