package ifpr.pgua.eic.tads.zoo;

import java.util.ArrayList;

import ifpr.pgua.eic.tads.zoo.Animais.Cavalo;
import ifpr.pgua.eic.tads.zoo.Animais.Leao;
import ifpr.pgua.eic.tads.zoo.Animais.Preguica;

public class AppTest {
    public static void main(String[] args) {
        ArrayList<Animal> animais = new ArrayList<>();
        Zoologico zoo = new Zoologico();

        // 1 - Crie uma classe Zoológico, que permite cadastrar animais de diferentes
        // tipos;
        Animal a1 = new Cavalo("Epona", 5, 15);
        Animal a2 = new Leao("Aslam", 10, 50);
        Animal a3 = new Preguica("Sid", 10, 50);

        zoo.cadastrar(a1);
        zoo.cadastrar(a2);
        zoo.cadastrar(a3);

        // 2 - A classe Zoológico deve permitir listar todos os animais cadastrados
        for (Animal a : animais) {
            System.out.println(a.gerarDetalhes());
        }

        // 3 - A classe Zoológico deve permitir informar a quantidade de animais de cada
        // tipo;
        System.out.println(zoo.contarAnimais());

        // 4 - A classe Zoológico deve permitir invocar o método emitirSom de cada
        // animal cadastrado
        a1.emitirSom();
        a2.emitirSom();
        a3.emitirSom();

        // 5 - A classe Zoológico deve permitir invocar o método correr de cada animal
        // que possui este método
        for (Animal a : animais) {
            if (a instanceof Cavalo) {
                Cavalo var = (Cavalo) a;
                var.correr();
            }
            if (a instanceof Leao) {
                Leao var = (Leao) a;
                var.correr();
            }
            if (a instanceof Preguica) {
                Preguica var = (Preguica) a;
                var.escalarArvore();
            }
        }
    }
}