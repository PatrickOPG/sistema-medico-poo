//atendimento filho de medico por medico ja ter paciente assim herdando tudo que é necessario dos dois
public class Atendimento extends Medico{
    private int horarioInicio;
    private int horarioFim;
    private int duracao; // horarioFim - horarioInicio
    private String observacoes;


//metodos
    private String iniciarAtendimento(){
        return "iniciou atendimento";
    };
     private String finalizarAtendimento(){
         return "finalizou o atendimento chuta o paciente pra fora S2";
     };

     private String gerarResumo(){

         return "paciente faleceu de desgosto (falta de Deus :D )";
     };


}

