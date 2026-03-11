package com.hospital;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a hospital with a team of specialists.
 */
public class Hospital {
    private String nome;
    private List<Especialista> equipe;

    public Hospital(String nome) {
        this.nome = nome;
        this.equipe = new ArrayList<>();
    }

    public void adicionarMedico(Especialista especialista) {
        equipe.add(especialista);
    }

    public String getNome() {
        return nome;
    }

    public List<Especialista> getEquipe() {
        return equipe;
    }

    //ATIVIDADE 2

    /**
     * Prints the name of top n highest paid specialists.
     * @param n the number of specialists to print
     */
    public void imprimirTopEspecialistasMaisPagos(int n) {
        equipe.stream()
            .sorted(Comparator.comparing(Especialita :: getSalario).reversed())
            .limit(n)
            .forEach(System.out :: println);
    }

    /**
     * Returns the number of specialists in a given department.
     * @param departamento the department name
     * @return the count of specialists in the department
     */
    public int numeroEspecialistasPorDepartamento(String departamento) {

    }

    /**
     * Returns an array of specialist names in a given department, sorted alphabetically.
     * @param departamento the department name
     * @return an array of specialist names
     */
    public String[] especialistasDepartamentoPorOrdemAlfabetica(String departamento) {

    }

}
