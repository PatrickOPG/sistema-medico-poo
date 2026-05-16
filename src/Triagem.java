import java.util.Date;

public class Triagem {
    private String sintomas;
    private int classificacaoRiscos; // Ex: Uma escala de 1 a 5 (onde 5 é o mais grave)
    private Date horarioTriagem;
    private String observacoes;

    // Construtor
    public Triagem(String sintomas, int classificacaoRiscos) {
        this.sintomas = sintomas;
        this.classificacaoRiscos = classificacaoRiscos;
        this.horarioTriagem = new Date(); // Registra automaticamente o momento da triagem
        this.observacoes = "";
    }

    // Método para registrar ou atualizar os sintomas
    public void registrarSintomas(String novosSintomas) {
        this.sintomas = novosSintomas;
        System.out.println("Sintomas atualizados no sistema: " + this.sintomas);
    }

    // Método que avalia o risco e retorna o nível final de prioridade
    public int classificarRiscos() {
        // Aqui entra a regra de negócio do hospital.
        // No modelo mais simples, a prioridade pode ser o próprio nível do risco (1 a
        // 5).
        int prioridadeFinal = this.classificacaoRiscos;

        // Exemplo de uma regra extra: Se o paciente tiver sintomas críticos no texto,
        // o sistema pode forçar uma prioridade máxima de forma inteligente.
        String sintomasIniciais = this.sintomas.toLowerCase();
        if (sintomasIniciais.contains("dor no peito") || sintomasIniciais.contains("parada")
                || sintomasIniciais.contains("desmaiado")) {
            prioridadeFinal = 5; // Risco de vida imediato (Vermelho / Emergência)
            this.observacoes = "Alerta: Sintomas de alta gravidade detectados automaticamente.";
        }

        System.out.println("Triagem realizada às " + horarioTriagem + ".");
        System.out.println("Risco classificado como nível: " + prioridadeFinal);

        return prioridadeFinal;
    }

    // Getters e Setters
    public String getSintomas() {
        return sintomas;
    }

    public int getClassificacaoRiscos() {
        return classificacaoRiscos;
    }

    public Date getHorarioTriagem() {
        return horarioTriagem;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
}