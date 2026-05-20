public class Medico {
    private String nome; //
    private String especialidade; //
    private boolean disponivel; // Indica se o médico está livre para atender

    // Construtor
    public Medico(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.disponivel = true; // O médico começa o plantão disponível
    }

    // Método chamado quando o médico inicia a consulta com um paciente
    public void atenderPaciente(Paciente paciente) {
        System.out.println("Dr(a). " + this.nome + " (" + this.especialidade + ") está atendendo o(a) paciente " + paciente.getNome() + ".");
    }

    // Método para encerrar a consulta e liberar o médico
    public void finalizarConsulta() {
        this.disponivel = true;
        System.out.println("Dr(a). " + this.nome + " finalizou a consulta e está disponível para o próximo paciente.");
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}