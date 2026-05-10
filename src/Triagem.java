public class Triagem extends HistoricoClinico{

    private String Sintomas;
    private int ClassificacaoRiscos;
    private int HorarioTriagem;
    private String Observacoes;

    //metodos

    private String RegistrarSintomas(){
        return "";
    };
    //sujestão---Patrick
    private int ClassificarRiscos(){
        return Prioridade + ClassificacaoRiscos;
    };

}
