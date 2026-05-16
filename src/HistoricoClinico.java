public class HistoricoClinico extends Paciente{
    public HistoricoClinico(String nome, int idade, String cpf) {
        super(nome, idade, cpf);
        //TODO Auto-generated constructor stub
    }

    private String[] listaSintomas;
    private String[] listaAtendimento;
    private String[] medicamentosLista;
    private String[] listaDoencas;

    //metodos
    private Atendimento adicionarAtendimento(){

        return null;
    };

    private int  verificarRecorrencia(){
        //ideia: se n passar uma semana do ultimo atendimento add 1 em semana, se passar muda para mes e zera semana e coloca um contador em ano
        return 0;
    };

    private String gerarAlerta(){
        return "paciente lele da cuca";
    };



}
