public class Paciente {
    private String nome;
    private int idade;
    protected int cpf;
    private int tempoChegada;
    protected int prioridade;
    private boolean urgenteUti;
    private String informacaoTriagem;
    private String historicoClinico;

    public Paciente(String nome,int idade,int cpf,int tempoChegada, boolean urgenteUti,  int prioridade,String informacaoTriagem,String historicoClinico) {
        this.nome = nome;
        this.idade=idade;
        this.cpf = cpf;
        this.tempoChegada=tempoChegada;
        this.urgenteUti=urgenteUti;
        this.informacaoTriagem=informacaoTriagem;
        this.historicoClinico=historicoClinico;

    }

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
