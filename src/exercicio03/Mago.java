package exercicio03;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Mago extends Personagem {
    private List<String> magias = new ArrayList<>();

    public Mago() {
        super();
    }

    @Override
    public void lvlUp() {
        super.lvlUp();
        setMana(getMana() + 10);
        setInteligencia(getInteligencia() + 10);
    }

    public int attack( ) {
       int at = getInteligencia() * getLevel();
       int valor = new Random().nextInt(300) + 1;
       return at + valor;
    }

    public void aprenderMagia(String magia) {
        magias.add(magia);
    }
}
