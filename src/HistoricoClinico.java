import java.util.Scanner;

public class HistoricoClinico extends Paciente{
    private String listaSintomas;
    private String listaAtendimento;
    private String medicamentosLista;
    private String listaDoencas;

    //metodos
    private Atendimento adicionarAtendimento(){

        return null;
    };

    private int  verificarRecorrencia(){
        //ideia: se n passar uma semana do ultimo atendimento add 1 em semana, se passar muda para mes e zera semana e coloca um contador em ano
        return 0;
    };

    public static String gerarAlerta() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o alerta: ");
        String alerta = scanner.nextLine();
        return alerta;
    }



}
