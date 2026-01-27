package registro;

import java.util.Scanner;

public class pessoas {
    static void main() {
        //SCANNER
        Scanner scanner = new Scanner(System.in);
        //ARRAY
        final int TAMANHO_MAX = 5;
        String[] pessoas = new String[TAMANHO_MAX];
        //CONTADOR
        int registrados = 0;
        int opcao = 0;
        while (opcao != 3) {
            //MENU
            System.out.println("=======Menu=======");
            System.out.println("1. Cadastro");
            System.out.println("2. Listar Cadastrados");
            System.out.println("3. Sair");
            System.out.println("Escolha uma das opções: ");
            opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1: {
                    if (registrados < TAMANHO_MAX) {
                        System.out.println("Quem deseja cadastrar ?");
                        String nomePessoa = scanner.nextLine();
                        pessoas[registrados] = nomePessoa;
                        registrados++;
                        System.out.println("Cadastro concluido !!!");
                    }else {
                        System.out.println("O sistema já está cheio, não é possivel mais registros!");
                    }
                }
                break;
                case 2: {
                    for (int i = 0; i < TAMANHO_MAX; i++) {
                        System.out.println(pessoas[i]);
                    }
                }
                break;
                case 3:{
                    System.out.println("Estamos finalizando o Sistema... Aguarde");
                }
                break;
                default:{
                    System.out.println("Você escolheu uma opção inválida, tente novamente");
                }
            }
        }
    }
}
