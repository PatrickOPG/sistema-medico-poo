public class Paciente {
    private String nome;
    private int idade;
    protected int cpf;
    private int tempoChegada;
    protected int prioridade;
    private boolean urgenteUti;
    private String informacaoTriaem;
    private String historicoClinico;

    //metodo
    private String calculaPrioridade(){
        return "";
    }
    //sugestão--patrick
    private int atualizarPrioridade(int prioridade){
        return  prioridade + 1;
    }

    private Paciente exibirDados(){
        return null;
    };
}
