package ifpr.pgua.eic.tads.zoo.Animais;

import ifpr.pgua.eic.tads.zoo.Animal;

public class Cavalo extends Animal {
    public Cavalo(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }

    public void correr() {
        System.out.println(getNome().toUpperCase() + " LITERALMENTE CORRE A 1 CAVALO");
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome().toUpperCase() + " ESTA RELINCHANDO HIHIHIHII");
    }

    @Override
    public String gerarDetalhes() {
        return "Tipo: Cavalo " + "Nome: " + nome +
                " Idade: " + idade +
                " Peso: " + peso + "\n";
    }
}