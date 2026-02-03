package lvlIntermediario;

public class ninja {

    String nome ;
    String aldeia ;
    int idade ;
    String statusMissao;


    public void mostrarInformacoes(){
        System.out.println("Meu nome é "+ nome );
        System.out.println("Sou da aldeia "+ aldeia );
        System.out.println("Minha idade é " + idade + " Anos."  );
        System.out.println("Minha missão está " + statusMissao);
    }

    public ninja() {
    }

    public ninja(String aldeia, String nome, int idade, String statusMissao) {
        this.aldeia = aldeia;
        this.nome = nome;
        this.idade = idade;
        this.statusMissao = statusMissao;
    }
}
