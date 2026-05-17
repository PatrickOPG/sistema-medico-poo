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