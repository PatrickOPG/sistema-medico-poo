public class Paciente {
    private String Nome;
    private int Idade;
    protected int CPF;
    private int Tempo_chegada;
    protected int Prioridade;
    private boolean Urgente_UTI;
    private String informacao_triaem;
    private String Historico_clinico;

    //metodo
    private String CalculaPrioridade(){
        return "";
    }
    //sugestão--patrick
    private int AtualizarPrioridade(Prioridade){
        return  Prioridade + 1;
    }

    private Paciente ExibirDados(){
        return null;
    };
}
