public class Main{
    public static void main(String[] args) {

        Paciente Novo=  new Paciente("Pedrin",12,123456789,12,);


        String alerta = HistoricoClinico.gerarAlerta();
        System.out.println("Relatorio do Paciente");
        System.out.println(alerta);
    }
}""