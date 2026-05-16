import java.util.PriorityQueue;
import java.util.Queue;

public class FilaAtendimento {
    // Usamos Queue com a implementação PriorityQueue para ordenar por prioridade
    // automaticamente [cite: 23]
    private Queue<Paciente> listaPacientes;

    // Construtor
    public FilaAtendimento() {
        this.listaPacientes = new PriorityQueue<>();
    }

    // Adiciona o paciente na fila (a PriorityQueue já o posiciona no lugar certo)
    public void adicionarPaciente(Paciente paciente) {
        this.listaPacientes.add(paciente);
        System.out.println(
                "Paciente " + paciente.getNome() + " inserido na fila. (Prioridade: " + paciente.getPrioridade() + ")");
    }

    // Espia quem é o próximo paciente de maior prioridade e o remove da fila para o
    // atendimento [cite: 31]
    public Paciente chamarProximo() {
        if (listaPacientes.isEmpty()) {
            return null;
        }
        // .poll() recupera e remove o primeiro elemento da fila (o de maior prioridade)
        // [cite: 31]
        Paciente proximo = listaPacientes.poll();
        System.out.println("Chamando próximo paciente: " + proximo.getNome() + " para a consulta.");
        return proximo;
    }

    // Remove um paciente específico da fila, caso ele desista ou mude de status
    // [cite: 31]
    public void removerPaciente(Paciente paciente) {
        if (this.listaPacientes.contains(paciente)) {
            this.listaPacientes.remove(paciente);
            System.out.println("Paciente " + paciente.getNome() + " removido da fila.");
        }
    }

    // Caso precise forçar a reorganização se a prioridade de alguém mudar enquanto
    // espera [cite: 31]
    public void reorganizarPaciente() {
        // Truque em Java: para reordenar uma PriorityQueue se os dados internos
        // mudarem,
        // nós recriamos a fila com os mesmos elementos.
        Queue<Paciente> filaTemporaria = new PriorityQueue<>(this.listaPacientes);
        this.listaPacientes = filaTemporaria;
        System.out.println("Fila de atendimento reorganizada com sucesso.");
    }

    // Método auxiliar para verificar o tamanho atual da fila
    public int quantidadePacientesNaFila() {
        return this.listaPacientes.size();
    }
}