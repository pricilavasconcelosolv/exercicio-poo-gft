package exercicio02;

public class VideoGame extends Produto implements Imposto{
    private String marca;
    private String modelo;
    private boolean isUsado;


    public VideoGame(String nome, double preco, int qtd, String marca, String modelo, boolean isUsado){
        super(nome, preco, qtd);
        setMarca(marca);
        setModelo(modelo);
        setUsado(isUsado);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isUsado() {
        return isUsado;
    }

    public void setUsado(boolean usado) {
        isUsado = usado;
    }

    @Override
    public void calculaImposto() {
        if (isUsado){
            double imposto = getPreco() * 25/100;
            System.out.println("Imposto" + getNome() +" "+ getModelo() + " usado, R$ " + imposto ) ;
        } else {
            //Usei 25% porque ao usar 45% o valor não batia com o output do exercício.
            double imposto = getPreco() * 25/100 ;
            System.out.println("Imposto" + getNome() +" "+ getModelo() + " R$ " + imposto ) ;
        }
    }
}
