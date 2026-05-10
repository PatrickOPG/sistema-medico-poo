public class Medico extends Paciente {
    protected String nome;
    protected   String Especialidade;
    private int Tempo_consulta;
    private boolean Disponivel;

    //metodos
    private Atendimento AtenderPaciente(){
        return null;
    };

    private Atendimento FinalizarConsulta(){
        return null;
    };

    private int CalcularTempoConsulta(){
        //patrick: seria legal pegar tempo de inicio menos final de atendimento;
        return 0;
    };
}
