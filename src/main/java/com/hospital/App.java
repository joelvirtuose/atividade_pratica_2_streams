package com.hospital;

/**
 * Hello world!
 */
public final class App {
    private static final double SALARIO_JOAO = 8000.0;
    private static final double SALARIO_MARIA = 7500.0;
    private static final double SALARIO_PEDRO = 9000.0;
    private static final double SALARIO_ANA = 7000.0;
    private static final double SALARIO_CARLOS = 8500.0;
    private static final double SALARIO_SOFIA = 7800.0;
    private static final double SALARIO_RICARDO = 9200.0;
    private static final double SALARIO_LAURA = 6800.0;
    private static final double SALARIO_MIGUEL = 8800.0;
    private static final double SALARIO_BEATRIZ = 7200.0;
    private static final int TOP_ESPECIALISTAS = 3;

    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        Hospital hospital = new Hospital("Hospital Central");

        // Adicionando 10 médicos
        hospital.adicionarMedico(new Especialista("João Silva", SALARIO_JOAO, "Cardiologia"));
        hospital.adicionarMedico(new Especialista("Maria Santos", SALARIO_MARIA, "Neurologia"));
        hospital.adicionarMedico(new Especialista("Pedro Oliveira", SALARIO_PEDRO, "Psiquiatria"));
        hospital.adicionarMedico(new Especialista("Ana Costa", SALARIO_ANA, "Pediatria"));
        hospital.adicionarMedico(new Especialista("Carlos Pereira", SALARIO_CARLOS, "Dermatologia"));
        hospital.adicionarMedico(new Especialista("Sofia Almeida", SALARIO_SOFIA, "Ginecologia"));
        hospital.adicionarMedico(new Especialista("Ricardo Ferreira", SALARIO_RICARDO, "Oftalmologia"));
        hospital.adicionarMedico(new Especialista("Laura Rodrigues", SALARIO_LAURA, "Psiquiatria"));
        hospital.adicionarMedico(new Especialista("Miguel Gomes", SALARIO_MIGUEL, "Psiquiatria"));
        hospital.adicionarMedico(new Especialista("Beatriz Lima", SALARIO_BEATRIZ, "Endocrinologia"));

        System.out.println("Hospital: " + hospital.getNome());
        System.out.println("Número de profissionais: " + hospital.getEquipe().size());

        // Chamadas dos métodos
        System.out.println("\nChamando imprimirTopEspecialistasMaisPagos(3):");
        hospital.imprimirTopEspecialistasMaisPagos(TOP_ESPECIALISTAS);

        System.out.println("\nChamando numeroEspecialistasPorDepartamento(\"Psiquiatria\"):");
        int numPsiquiatria = hospital.numeroEspecialistasPorDepartamento("Psiquiatria");
        System.out.println("Resultado: " + numPsiquiatria);

        System.out.println("\nChamando especialistasDepartamentoPorOrdemAlfabetica(\"Psiquiatria\"):");
        String[] especialistasPsiquiatria = hospital.especialistasDepartamentoPorOrdemAlfabetica("Psiquiatria");
        System.out.println("Resultado: " + java.util.Arrays.toString(especialistasPsiquiatria));
    }
}
