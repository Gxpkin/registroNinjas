package lvlIntermediario;

import java.sql.SQLOutput;
import java.util.Scanner;

public class principal {
    static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Cadastre seu Ninja ===");

        //ARRAY 5
        final int TAMANHO_MAX = 5;
        String[] ninjas = new String[TAMANHO_MAX];

        int registrados = 0;

        int escolha = 0;


        //LOOP MENU
        while (escolha != 4){
            //MENU
            System.out.println("1: Registrar Ninja");
            System.out.println("2: Exibir lista");
            System.out.println("3: Atualizar habilidade");
            System.out.println("4: Sair");

            escolha = sc.nextInt();
            switch (escolha){
                case 1:
                    if (registrados <= TAMANHO_MAX){
                        System.out.println("Vamos cadastrar!");
                        String nomeNinja = sc.next();
                        ninjas[registrados]= nomeNinja;
                    }else {
                        System.out.println("O sistema está cheio");
                    }

                break;
                case 2:

                    break;

                case 3:

                    break;

                case 4:

                    break;
                default:
            }
        }


        uchiha shisui = new uchiha();
        shisui.nome = "Shisui Uchiha";
        shisui.idade = 16;
        shisui.aldeia = "Folha";
        shisui.statusMissao = "Concluida";
        shisui.mostrarInformacoes();





    }
}
