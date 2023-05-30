package ifpr.pgua.eic.tads.zoo;

import ifpr.pgua.eic.tads.zoo.Animais.*;
import java.util.Scanner;

public class App {
    static Scanner teclado = new Scanner(System.in);
    static Zoologico zoo = new Zoologico();

    static String menu() {
        String str = "";

        str += "////////////////////---Zoológico---////////////////////\n\n";
        str += "1 - Cadastrar Animal\n";
        str += "2 - Listar Animais\n";
        str += "3 - Emitir Som\n";
        str += "4 - Contar Animais\n";
        str += "5 - Correr\n";
        str += "0 - Sair\n\n";
        str += "Digite uma opção: ";

        return str;
    }

    static void criarAnimal() {
        String nome = "";
        int idade;
        double peso;
        int tipo = 0;

        System.out.println("1 - Cavalo\n2 - Leão\n3 - Preguiça");
        System.out.printf("Escolha o tipo de animal: ");
        tipo = teclado.nextInt();

        while (tipo < 1 || tipo > 3) {
            System.out.printf("Opção Inválida! Digite novamente: ");
            tipo = teclado.nextInt();
        }
        teclado.nextLine();

        System.out.printf("Digite o nome: ");
        nome = teclado.nextLine();
        System.out.printf("Digite a idade: ");
        idade = teclado.nextInt();
        System.out.printf("Digite o peso: ");
        peso = teclado.nextDouble();
        Animal animal = null;

        if (tipo == 1) {
            animal = new Cavalo(nome, idade, peso);
        } else if (tipo == 2) {
            animal = new Leao(nome, idade, peso);
        } else {
            animal = new Preguica(nome, idade, peso);
        }
        if (animal != null) {
            zoo.cadastrar(animal);
            System.out.println("Animal Cadastrado!");
        }
    }

    static void listarAnimais() {
        System.out.println(zoo.listarAnimais());
    }

    static void invocarEmitirSom() {
        zoo.invocarEmitirSom();
    }

    static void contarAnimais() {
        System.out.println(zoo.contarAnimais());
    }

    static void invocarCorrer() {
        zoo.invocarCorrer();
    }

    public static void main(String[] args) {
        int funcao = -1;

        do {
            System.out.printf(menu());
            funcao = teclado.nextInt();
            switch (funcao) {
                case 1: {
                    criarAnimal();
                    break;
                }
                case 2: {
                    listarAnimais();
                    break;
                }
                case 3: {
                    invocarEmitirSom();
                    break;
                }
                case 4: {
                    contarAnimais();
                    break;
                }
                case 5: {
                    invocarCorrer();
                    break;
                }
                default: {
                    if (funcao != 0)
                        System.out.println("Opção Inválida!!");
                }
            }
        } while (funcao != 0);
    }
}