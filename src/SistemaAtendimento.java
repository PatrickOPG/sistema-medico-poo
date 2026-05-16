import java.util.ArrayList;
import java.util.List;

public class SistemaAtendimento {
    private FilaAtendimento filaAtendimento;
    private List<Medico> listaMedicos;
    private List<Atendimento> listaAtendimentosHistorico;

    // Construtor
    public SistemaAtendimento() {
        this.filaAtendimento = new FilaAtendimento();
        this.listaMedicos = new ArrayList<>();
        this.listaAtendimentosHistorico = new ArrayList<>();
    }

    // Método para cadastrar um médico no sistema
    public void cadastrarMedico(Medico medico) {
        this.listaMedicos.add(medico);
        System.out.println("Médico(a) Dr(a). " + medico.getNome() + " cadastrado(a) com sucesso.");
    }

    // PASSO 1 e 2: Recebe o paciente, passa pela triagem e o coloca na fila
    public void iniciarTriagemEPorNaFila(Paciente paciente, String sintomas, int classificacaoRisco) {
        System.out.println("\n--- Iniciando Triagem para: " + paciente.getNome() + " ---");

        // Instancia a Triagem (pode ser uma classe ou um método controlador)
        Triagem triagem = new Triagem(sintomas, classificacaoRisco);

        // A triagem calcula a prioridade e atualiza o paciente
        int prioridadeCalculada = triagem.classificarRiscos();
        paciente.setPrioridade(prioridadeCalculada);

        // Guarda a informação da triagem no paciente para consulta médica posterior
        paciente.setInformacaoTriagem(sintomas);

        // Adiciona o paciente na fila de espera
        filaAtendimento.adicionarPaciente(paciente);
    }

    // PASSO 3, 4 e 5: Distribui o paciente para um médico disponível e inicia a
    // consulta
    public void distribuirPacienteParaAtendimento() {
        // 1. Busca um médico que esteja disponível
        Medico medicoDisponivel = null;
        for (Medico m : listaMedicos) {
            if (m.isDisponivel()) {
                medicoDisponivel = m;
                break;
            }
        }

        if (medicoDisponivel == null) {
            System.out.println("Nenhum médico disponível no momento. Aguarde.");
            return;
        }

        // 2. Chama o próximo paciente da fila (respeitando a prioridade)
        Paciente proximoPaciente = filaAtendimento.chamarProximo();

        if (proximoPaciente == null) {
            System.out.println("Fila de atendimento vazia.");
            return;
        }

        // 3. Cria e inicia o objeto Atendimento
        System.out.println("\n--- Iniciando Consulta ---");
        Atendimento novoAtendimento = new Atendimento(proximoPaciente, medicoDisponivel);
        novoAtendimento.iniciarAtendimento();

        // O médico fica ocupado durante o atendimento
        medicoDisponivel.setDisponivel(false);

        // [Simulação] O médico atende o paciente e altera seu histórico
        medicoDisponivel.atenderPaciente(proximoPaciente);
        proximoPaciente.getHistoricoClinico()
                .adicionarAtendimento("Consulta realizada com Dr(a). " + medicoDisponivel.getNome());

        // 4. Finaliza o atendimento e remove o paciente definitivamente
        novoAtendimento.setObservacoes("Paciente apresentou melhoras após medicação.");
        novoAtendimento.finalizarAtendimento();

        // Libera o médico e salva o atendimento no relatório do sistema
        medicoDisponivel.setDisponivel(true);
        listaAtendimentosHistorico.add(novoAtendimento);

        filaAtendimento.removerPaciente(proximoPaciente);
        System.out.println("Atendimento concluído. Paciente liberado.");
    }

    // Método para gerar relatórios do sistema
    public void gerarRelatorios() {
        System.out.println("\n=== RELATÓRIO GERAL DE ATENDIMENTOS ===");
        for (Atendimento a : listaAtendimentosHistorico) {
            a.gerarResumo();
        }
    }
}