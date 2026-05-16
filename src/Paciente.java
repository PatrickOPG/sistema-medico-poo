public class Paciente implements Comparable<Paciente> {
    private String nome;
    private String cpf;
    private int idade;
    private int prioridade; // Ex: 1 (baixa) a 5 (alta/urgente) [cite: 7, 8]
    private String informacaoTriagem;
    private HistoricoClinico historicoClinico;

    public Paciente(String nome, String cpf, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.prioridade = 1; // Padrão inicial
        this.historicoClinico = new HistoricoClinico();
    }

    // Código Java para comparar a prioridade de dois pacientes
    @Override
    public int compareTo(Paciente outroPaciente) {
        // Multiplicamos por -1 para que o número MAIOR (maior urgência) venha PRIMEIRO
        // na fila
        return Integer.compare(this.prioridade, outroPaciente.getPrioridade()) * -1;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    public String getInformacaoTriagem() {
        return informacaoTriagem;
    }

    public void setInformacaoTriagem(String informacaoTriagem) {
        this.informacaoTriagem = informacaoTriagem;
    }

    public HistoricoClinico getHistoricoClinico() {
        return historicoClinico;
    }
}