public class Medico {
    private String nome; //
    private String especialidade; //
    private int tempoConsulta; // Tempo médio estimado para suas consultas
    private boolean disponivel; // Indica se o médico está livre para atender

    // Construtor
    public Medico(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.tempoConsulta = 20; // Padrão de 20 minutos por consulta, por exemplo
        this.disponivel = true; // O médico começa o plantão disponível
    }

    // Método chamado quando o médico inicia a consulta com um paciente
    public void atenderPaciente(Paciente paciente) {
        System.out.println("Dr(a). " + this.nome + " (" + this.especialidade + ") está atendendo o(a) paciente "
                + paciente.getNome() + ".");
    }

    // Método para encerrar a consulta e liberar o médico
    public void finalizarConsulta() {
        this.disponivel = true;
        System.out.println("Dr(a). " + this.nome + " finalizou a consulta e está disponível para o próximo paciente.");
    }

    // Altera ou calcula o tempo estimado que a consulta deve durar com base na
    // gravidade
    public int calcularTempoConsulta(Paciente paciente) {
        // Regra de negócio simples: quanto maior a prioridade (urgência), mais tempo o
        // médico precisa deduzir para o caso
        if (paciente.getPrioridade() >= 4) {
            this.tempoConsulta = 45; // Casos graves demoram mais
        } else {
            this.tempoConsulta = 20; // Casos leves seguem o padrão
        }
        return this.tempoConsulta;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public int getTempoConsulta() {
        return tempoConsulta;
    }

    public void setTempoConsulta(int tempoConsulta) {
        this.tempoConsulta = tempoConsulta;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}