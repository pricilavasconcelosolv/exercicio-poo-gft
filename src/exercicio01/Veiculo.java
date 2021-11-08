package exercicio01;

public class Veiculo {
    private String marca;
    private String modelo;
    private String placa;
    private String cor;
    private Double km;
    private boolean isLigado;
    private int litrosCombustivel;
    private int velocidade;
    private Double preco;
    private final int limite = 60;

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

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Double getKm() {
        return km;
    }

    public void setKm(Double km) {
        this.km = km;
    }

    public Boolean isLigado() {
        return isLigado;
    }

    public void setIsLigado(Boolean ligado) {
        isLigado = ligado;
    }

    public Integer getLitrosCombustivel() {
        return litrosCombustivel;
    }

    public void setLitrosCombustivel(Integer litrosCombustivel) {
        this.litrosCombustivel = litrosCombustivel;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

   public void acelerar(){
        setVelocidade(getVelocidade() + 20);
    }

    public void abastecer(int combustivel){
        int temp = getLitrosCombustivel() + combustivel;
        if ( temp > limite){
            throw new RuntimeException("Limite do tanque excedido. Capacidade máxima de 60 litros");
        }
        setLitrosCombustivel(temp);
    }

    private boolean isParado() {
        return getVelocidade() == 0;
    }

    public void frear() {
        if (!isParado()) {
            setVelocidade(getVelocidade() - 20);
        }
    }

    public void pintar(String cor){
        setCor(cor);
    }

    public void ligar(){
        if (!isLigado()){
            setIsLigado(true);
        }
    }

    public void desligar(){
        if (isLigado() && isParado()){
            desligar();
        }
    }
}
