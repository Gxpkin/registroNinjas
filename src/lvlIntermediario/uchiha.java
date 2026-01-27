package lvlIntermediario;

public class uchiha extends ninja{

    String habilidadeEspecial ;

    public void mostrarHabilidade(){
        System.out.println("Minha habilidade " + habilidadeEspecial);

    }

    public void mostrarInformacoes(){
        System.out.println("Meu nome é "+ nome );
        System.out.println("Sou da aldeia "+ aldeia );
        System.out.println("Minha idade é " + idade + " Anos."  );
        System.out.println("Minha missão está " + statusMissao);
        System.out.println("Habilidade especial Uchiha");
    }
}
