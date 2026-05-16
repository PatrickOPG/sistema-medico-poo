import java.util.ArrayList;
import java.util.List;

public class HistoricoClinico {
    private List<String> listaSintomas; // Registros de sintomas relatados
    private List<String> listaAtendimentos; // Linha do tempo dos atendimentos
    private List<String> medicamentosLista; // Remédios receitados ou em uso
    private List<String> listaDoencas; // Histórico de patologias/doenças

    // Construtor: Inicializa as listas vazias para evitar erros de
    // NullPointerException
    public HistoricoClinico() {
        this.listaSintomas = new ArrayList<>();
        this.listaAtendimentos = new ArrayList<>();
        this.medicamentosLista = new ArrayList<>();
        this.listaDoencas = new ArrayList<>();
    }

    // Adiciona um registro textual de uma consulta realizada
    public void adicionarAtendimento(String resumoAtendimento) {
        this.listaAtendimentos.add(resumoAtendimento);
        System.out.println("Atendimento adicionado ao histórico clínico.");

        // Toda vez que um atendimento é registrado, verifica se o caso é recorrente
        verificarRecorrencia();
    }

    // Regra de negócio para monitorar a frequência do paciente no hospital
    public void verificarRecorrencia() {
        // Exemplo: se o paciente passou por mais de 3 atendimentos, o sistema emite um
        // alerta
        if (this.listaAtendimentos.size() > 3) {
            gerarAlerta();
        }
    }

    // Emite um aviso interno caso o paciente precise de atenção especial por idas
    // frequentes
    private void gerarAlerta() {
        System.out.println("\n[ALERTA DO SISTEMA]: Este paciente possui alta recorrência de atendimentos recente!");
    }

    // Métodos utilitários para adicionar informações isoladas nas outras listas
    public void adicionarSintoma(String sintoma) {
        this.listaSintomas.add(sintoma);
    }

    public void adicionarMedicamento(String medicamento) {
        this.medicamentosLista.add(medicamento);
    }

    public void adicionarDoenca(String doenca) {
        this.listaDoencas.add(doenca);
    }

    // Getters para permitir que o médico consulte os dados na tela
    public List<String> getListaSintomas() {
        return listaSintomas;
    }

    public List<String> getListaAtendimentos() {
        return listaAtendimentos;
    }

    public List<String> getMedicamentosLista() {
        return medicamentosLista;
    }

    public List<String> getListaDoencas() {
        return listaDoencas;
    }
}