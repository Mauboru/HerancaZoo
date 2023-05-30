package ifpr.pgua.eic.tads.zoo;

import java.util.ArrayList;

import ifpr.pgua.eic.tads.zoo.Animais.Cavalo;
import ifpr.pgua.eic.tads.zoo.Animais.Leao;
import ifpr.pgua.eic.tads.zoo.Animais.Preguica;

public class Zoologico {
    private ArrayList<Animal> animais = new ArrayList<>();

    public void cadastrar(Animal animal) {
        animais.add(animal);
    }

    public String listarAnimais() {
        String lista = "";
        for (Animal a : animais) {
            lista += a.gerarDetalhes();
        }
        return lista;
    }

    public void invocarEmitirSom() {
        for (Animal a : animais) {
            a.emitirSom();
        }
    }

    public void invocarCorrer() {
        for (Animal a : animais) {
            if (a instanceof Cavalo) {
                Cavalo var = (Cavalo) a;
                var.correr();
            }
            if (a instanceof Leao) {
                Leao var = (Leao) a;
                var.correr();
            }
        }
    }

    public String contarAnimais() {
        String informa = "";
        int qtdCavalo = 0, qtdLeao = 0, qtdPreguica = 0;
        for (Animal a : animais) {
            if (a instanceof Cavalo) {
                qtdCavalo++;
            }
            if (a instanceof Leao) {
                qtdLeao++;
            }
            if (a instanceof Preguica) {
                qtdPreguica++;
            }
        }
        return informa += "\nCavalo: " + qtdCavalo + "\nLeão: " + qtdLeao + "\nPreguiça: " + qtdPreguica;
    }
}