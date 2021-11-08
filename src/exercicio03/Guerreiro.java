package exercicio03;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Guerreiro extends Personagem{
    private List<String> habilidades = new ArrayList<>();


    @Override
    public void lvlUp() {
        super.lvlUp();
        setVida(getVida()+10);
        setForca(getForca() + 10);
    }

    public int attack() {
        int at = getForca() * getLevel();
        int valor = new Random().nextInt(300) + 1;
        return at + valor;
    }

    public void aprenderHabilidade(String habilidade){
           habilidades.add(habilidade);
        }
}
