public class Main {
    public static void main(String[] args) {

        // PASSO 1: INICIALIZAR O SISTEMA DO HOSPITAL

        System.out.println("=== INICIALIZANDO SISTEMA HOSPITALAR ===");
        SistemaAtendimento hospital = new SistemaAtendimento();

        // Cadastrar os médicos
        Medico medico1 = new Medico("Carlos Eduardo", "Clínico Geral");
        Medico medico2 = new Medico("Ana Beatriz", "Pediatria");

        hospital.cadastrarMedico(medico1);
        hospital.cadastrarMedico(medico2);

        // PASSO 2: CADASTRAR PACIENTES

        System.out.println("\n=== CHEGADA DE PACIENTES ===");

        // Paciente 1: Chega primeiro, mas com sintomas leves
        Paciente p1 = new Paciente("João Silva", "123.456.789-00", 30);
        // Triagem: sintomas e classificação de risco (escala 1 a 5)
        hospital.iniciarTriagemEPorNaFila(p1, "Dor de cabeça leve e coriza", 2);

        // Paciente 2: Chega logo em seguida, mas com um caso MUITO GRAVE
        Paciente p2 = new Paciente("Maria Souza", "987.654.321-11", 65);
        // Triagem: Sintoma grave de dor no peito (Risco 5)
        hospital.iniciarTriagemEPorNaFila(p2, "Forte dor no peito irradiando para o braço", 5);

        // Paciente 3: Chega por último, caso moderado
        Paciente p3 = new Paciente("Pedro Santos", "456.789.123-22", 12);
        hospital.iniciarTriagemEPorNaFila(p3, "Febre de 38.5°C e dor de garganta", 3);

        // =================================================================
        // PASSO 3: O OPERAÇÃO DOS ATENDIMENTOS (A FILA EM AÇÃO)
        // =================================================================
        System.out.println("\n=== INICIANDO CHAMADAS DE ATENDIMENTO ===");

        /*
         * * PRIMEIRA CHAMADA:
         * O médico está disponível. Quem o sistema vai chamar?
         * Embora o João (p1) tenha chegado primeiro, a Maria (p2) tem prioridade 5
         * (máxima).
         * A nossa FilaAtendimento (PriorityQueue) vai entregar a Maria primeiro!
         */
        hospital.distribuirPacienteParaAtendimento();

        /*
         * SEGUNDA CHAMADA:
         * Maria já foi atendida e saiu da fila. Sobraram João (prioridade 2) e Pedro
         * (prioridade 3).
         * Pedro passa na frente de João porque o caso dele é mais urgente.
         */
        hospital.distribuirPacienteParaAtendimento();

        /*
         * TERCEIRA CHAMADA:
         * Sobrou apenas o João na fila. Ele é chamado.
         */
        hospital.distribuirPacienteParaAtendimento();

        // =================================================================
        // PASSO 4: FECHAMENTO DO TURNO E RELATÓRIOS
        // =================================================================
        // Mostra o histórico de tudo o que aconteceu no sistema
        hospital.gerarRelatorios();
    }
}