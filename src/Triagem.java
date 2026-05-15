public class Triagem extends HistoricoClinico{

    private String sintomas;
    private int classificacaoRiscos;
    private int horarioTriagem;
    private String observacoes;

    //metodos

    private String registrarSintomas(){
        return "";
    };
    //sujestão---Patrick
    private int classificarRiscos(){
        return prioridade + classificacaoRiscos;
    };

}
