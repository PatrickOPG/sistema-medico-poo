public class Triagem extends HistoricoClinico{

    public Triagem(String nome, int idade, String cpf) {
        super(nome, idade, cpf);
        //TODO Auto-generated constructor stub
    }
    private String sintomas;
    private int classificacaoRiscos;
    private int horarioTriagem;
    private String observacoes;

    //metodos

    public String registrarSintomas(){
        return "";
    };
    //sujestão---Patrick
    public int classificarRiscos(){
        return prioridade + classificacaoRiscos;
    };

}
