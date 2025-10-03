package ucb.estudo.escolamusica;

public class EscolaMusica {
    
    public static void main(String[] args) {
        
        ViolaoExercicio violao = new ViolaoExercicio("Violão Clássico", "Madeira de Mogno", 6);
        SaxofoneExercicio saxofone = new SaxofoneExercicio("Saxofone Profissional", "Latão", "Tenor");

        System.out.println("=============== DEMONSTRAÇÃO INDIVIDUAL ===============");
        
        violao.mostrarInformacoes();
        violao.afinar();
        violao.tocar();
        System.out.println("-------------------------------------------------------");
        
        saxofone.mostrarInformacoes();
        saxofone.afinar();
        saxofone.tocar();
        System.out.println("-------------------------------------------------------");
        
        InstrumentoMusical[] orquestra = new InstrumentoMusical[2];
        orquestra[0] = violao;
        orquestra[1] = saxofone;
        
        System.out.println("\n=============== TESTE COM POLIMORFISMO ===============");
        System.out.println("Chamando o método tocar() de forma genérica no array:");
        
        for (InstrumentoMusical instrumento : orquestra) {
            System.out.println("\n-----------------");
            instrumento.tocar();
            instrumento.mostrarInformacoes();
        }
        System.out.println("=====================================================");
    }
}
