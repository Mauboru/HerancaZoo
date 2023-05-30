package ifpr.pgua.eic.tads.zoo;

public abstract class Animal {
    protected String nome;
    protected int idade;
    protected double peso;

    // Construtor
    public Animal(String nome, int idade, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public abstract void emitirSom();

    public abstract String gerarDetalhes();
}
