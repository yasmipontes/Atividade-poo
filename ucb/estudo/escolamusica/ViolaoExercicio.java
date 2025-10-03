package ucb.estudo.escolamusica;

public class ViolaoExercicio extends InstrumentoMusical {
    
    private int numeroCordas;

    public ViolaoExercicio(String nome, String material, int numeroCordas) {
        super(nome, material); // Chama o construtor da superclasse
        this.numeroCordas = numeroCordas;
    }
    
    
    @Override
    public void tocar() {
        System.out.println("Tocando notas suaves no " + super.getNome() + " com " + numeroCordas + " cordas...");
        System.out.println("Dedilhado de uma melodia romântica.");
    }
    
    
    @Override
    public void afinar() {
        super.afinar(); 
        System.out.println("Apertando a tensão das " + numeroCordas + " cordas.");
    }

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes(); 
        System.out.println("Número de Cordas: " + numeroCordas);
    }

    public int getNumeroCordas() {
        return numeroCordas;
    }
}
