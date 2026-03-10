package com.hospital;

/**
 * Represents a medical specialist in the hospital.
 */
public class Especialista {
    private String nome;
    private double salario;
    private String departamento;

    /**
     * Constructs a new Especialista with the given name, salary, and department.
     *
     * @param nome the name of the specialist
     * @param salario the salary of the specialist
     * @param departamento the department of the specialist
     */
    public Especialista(String nome, double salario, String departamento) {
        this.nome = nome;
        this.salario = salario;
        this.departamento = departamento;
    }

    /**
     * Returns the name of the specialist.
     *
     * @return the name
     */
    public String getNome() {
        return nome;
    }

    /**
     * Returns the salary of the specialist.
     *
     * @return the salary
     */
    public double getSalario() {
        return salario;
    }

    /**
     * Returns the department of the specialist.
     *
     * @return the department
     */
    public String getDepartamento() {
        return departamento;
    }

    @Override
    public String toString() {
        return "Especialista{"
                + "nome='" + nome + '\''
                + ", salario=" + salario
                + ", departamento='" + departamento + '\''
                + '}';
    }
}
