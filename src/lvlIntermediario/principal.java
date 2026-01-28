package lvlIntermediario;

import java.util.Scanner;

public class principal {

    static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Cadastre seu Ninja ===");

        //ARRAY 5
        final int TAMANHO_MAX = 5;
        String[] ninjasArray = new String[TAMANHO_MAX];

        int registrados = 0;
        int escolha = 0;


        //LOOP MENU
        while (escolha != 4) {
            //MENU
            System.out.println("1: Registrar Ninja");
            System.out.println("2: Exibir lista");
            System.out.println("3: Atualizar habilidade");
            System.out.println("4: Sair");

            escolha = sc.nextInt();
            //sc.nextLine();

            switch (escolha) {
                case 1:
                    //PARA VOLTAR FUNCIONAR APENAS RETONAR O CODIGO ORIGINAL COMENTADO
                    if (registrados <= TAMANHO_MAX) {
                        System.out.println("Vamos cadastrar!");


                        // PRECISO DAR UM JEITO DE CRIAR UM OBJETO COM INFORMAÇOES DO USUARIO USANDO SCANNER
                       /* ninja naruto = new ninja();
                        System.out.println("Digite o nome do seu ninja");
                        naruto.nome = sc.nextLine();
                        System.out.println("Qual sua idade");
                        naruto.idade = sc.nextInt();
                        System.out.println("De qual aldeia você é");
                        sc.nextLine();
                        naruto.aldeia = sc.nextLine();
                        System.out.println("Qual status da sua missao ?");
                        naruto.statusMissao = sc.nextLine();
                        naruto.mostrarInformacoes();
                        */

                        // CÓDIGO ORIGINAL, ADICIONANDO APENAS STRING NOME
                        String nomeNinja = sc.next();
                        ninjasArray[registrados] = nomeNinja;
                        registrados++;

                    } else {
                        System.out.println("O sistema está cheio");
                    }

                    break;
                case 2:
                    for (String ninja : ninjasArray) {
                        System.out.println(ninja);
                    }
                    break;
                case 3: {

                    }break;
                case 4: {
                    System.out.println("Estamos finalizando o sistema em 3...2...1.");

                    }break;
                default:{
                    System.out.println("Opção Inválida, Tente Novamente");
                }
            }
        }


    uchiha shisui = new uchiha();
    shisui.nome ="Shisui Uchiha";
    shisui.idade =16;
    shisui.aldeia ="Folha";
    shisui.statusMissao ="Concluida";

        shisui.mostrarInformacoes();


        }
    }
