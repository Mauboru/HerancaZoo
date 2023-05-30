package ifpr.pgua.eic.tads.zoo.Animais;

import ifpr.pgua.eic.tads.zoo.Animal;

public class Leao extends Animal {
    public Leao(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }

    public void correr() {
        System.out.println(getNome().toUpperCase() + " CORRE MUITO O MENINO");
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome().toUpperCase() + " ESTA RUGINDO ROAAAR");
    }

    @Override
    public String gerarDetalhes() {
        String texto = "";

        texto = "Tipo: Leão " + "Nome: " + nome +
                " Idade: " + idade +
                " Peso: " + peso;
        return texto += "\n";
    }
}