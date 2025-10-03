package ucb.estudo.escolamusica;

public class SaxofoneExercicio extends InstrumentoMusical {
    
    private String tipo; // Ex: Alto, Tenor, Soprano

    public SaxofoneExercicio(String nome, String material, String tipo) {
        super(nome, material); // Chama o construtor da superclasse
        this.tipo = tipo;
    }
    
    @Override
    public void tocar() {
        System.out.println("Tocando jazz suave no " + super.getNome() + " " + tipo + "...");
        System.out.println("Melodia envolvente de saxofone.");
    }
    
    @Override
    public void afinar() {
        super.afinar(); // Chama a implementação da superclasse
        System.out.println("Ajustando a embocadura e as chaves do saxofone.");
    }

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes(); // Chama a implementação da superclasse
        System.out.println("Tipo: " + tipo);
    }
}
