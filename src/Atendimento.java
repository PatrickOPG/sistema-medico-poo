import java.util.Date;

public class Atendimento {
    private Paciente paciente; // Classe relacionada
    private Medico medico; // Classe relacionada
    private Date horarioInicio; //
    private Date horarioFim; //
    private long duracao; // Duração em minutos
    private String observacoes; //

    // Construtor: O atendimento sempre nasce unindo um Paciente e um Médico
    public Atendimento(Paciente paciente, Medico medico) {
        this.paciente = paciente;
        this.medico = medico;
        this.observacoes = "";
    }

    // Registra o momento exato em que o médico chama o paciente
    public void iniciarAtendimento(){
        this.horarioInicio = new Date();

        // simula o tempo de atendimento
        if (paciente.getPrioridade() >= 3){    
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println("Erro no atendimento");
            }
        } else {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Erro no atendimento");
            }  
        }
        System.out.println("Atendimento iniciado para " + paciente.getNome() + " com Dr(a). " + medico.getNome());
    }

    // Registra o fim do atendimento e calcula quanto tempo durou
    public void finalizarAtendimento() {
        this.horarioFim = new Date();
        this.duracao = calcularDuracao();
        System.out.println("Atendimento de " + paciente.getNome() + " finalizado.");
    }

    // Método interno para calcular a diferença de tempo em minutos
    private long calcularDuracao() {
        if (horarioInicio == null || horarioFim == null) {
            return 0;
        }
        // Diferença em milissegundos
        long diferencaMilissegundos = horarioFim.getTime() - horarioInicio.getTime();

        // Converte milissigundos em segundos
        return diferencaMilissegundos/1000;
    }

    // Imprime na tela um relatório limpo do atendimento realizado
    public void gerarResumo() {
        System.out.println("--------------------------------------------------");
        System.out.println("RESUMO DO ATENDIMENTO");
        System.out.println("Paciente: " + paciente.getNome()); //
        System.out.println("Médico Responsável: Dr(a). " + medico.getNome()); //
        System.out.println("Início: " + horarioInicio); //
        System.out.println("Fim: " + horarioFim); //
        System.out.println("Duração Total: " + duracao + " segundo(s)"); //
        System.out.println("Sintomas na Triagem: " + paciente.getInformacaoTriagem()); //
        System.out.println("Conduta/Observações Médicas: " + observacoes); //
        System.out.println("--------------------------------------------------");
    }

    // Getters e Setters
    public Paciente getPaciente() {
        return paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public Date getHorarioInicio() {
        return horarioInicio;
    }

    public Date getHorarioFim() {
        return horarioFim;
    }

    public long getDuracao() {
        return duracao;
    }

    public String getObservacoes() {
        return observacoes;
    }

    // O médico preenche as observações durante ou ao fim da consulta
    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    } //
}