package ifpr.pgua.eic.tads.zoo.Animais;

import ifpr.pgua.eic.tads.zoo.Animal;

public class Preguica extends Animal {
    public Preguica(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }

    public void escalarArvore() {
        System.out.println(getNome().toUpperCase() + " ESTA ESCALANDO!");
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome().toUpperCase() + " ESTA NANANDO ZZZZZZZ");
    }

    @Override
    public String gerarDetalhes() {
        String texto = "";

        texto = "Tipo: Preguiça " + "Nome: " + nome +
                " Idade: " + idade +
                " Peso: " + peso;
        return texto += "\n";
    }
}