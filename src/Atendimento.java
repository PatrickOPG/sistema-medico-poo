//atendimento filho de medico por medico ja ter paciente assim herdando tudo que é necessario dos dois
public class Atendimento extends Medico{
private int HorarioInicio;
private int HorarioFim;
private int Duracao = HorarioInicio - HorarioFim;
private String Observacoes;

//metodos
    private String IniciarAtendimento(){
        return "iniciou atendimento"
    };
     private String FinalizarAtendimento(){
         return "finalizou o atendimento chuta o paciente pra fora S2";
     };

     private String GerarResumo(){

         return "paciente faleceu de desgosto (falta de Deus :D )";
     };


}

