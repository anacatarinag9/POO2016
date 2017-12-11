/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetonovo;

/**
 *
 * @author Catarina Gonçalves
 */
import java.io.Serializable;
import java.util.*;
public class Disciplina implements Serializable{
    
    private String nome;
    private Docente docenteResponsavel;
    private ArrayList <Docente> docentes = new ArrayList <Docente>();
    private ArrayList <Aluno> alunos = new ArrayList <Aluno>();
    private ArrayList <Exame> exames = new ArrayList <Exame>();
    
    public Disciplina(String nome,Docente doc)
    {
        this.nome=nome;
        this.docenteResponsavel=doc;
    }
    /**
     * metodo para listar todos os exames da disciplina
     */
    public void listarExamesDaDisciplina(){
        System.out.println("Docentes da disciplina");
        for(int i=0;i<exames.size();i++){
            System.out.println(exames.get(i).getDisciplina().getNome());
        }
    }
    /**
     * metodo para listar todos os docentes da disciplina
     */
    public void listarDocDaDisciplina(){
        for(int i=0;i<docentes.size();i++){
            System.out.println(docentes.get(i).toString());
        }
    }
    /**
     * metodo para listar todos os alunos da disciplina
     */
    public void listarAlunosNaDisciplina(){
        for(int i = 0;i<alunos.size();i++){
            System.out.println(alunos.get(i).getNome());
        }
    }
    
    
    public String toString(){
        return nome+" tem docente responsavel: "+docenteResponsavel;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Docente getDocenteResponsavel() {
        return docenteResponsavel;
    }

    public void setDocenteResponsavel(Docente docenteResponsavel) {
        this.docenteResponsavel = docenteResponsavel;
    }

    public ArrayList<Docente> getDocentes() {
        return docentes;
    }

    public void setDocentes(Docente docente) {
        this.docentes.add(docente);
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public ArrayList<Exame> getExames() {
        return exames;
    }

    public void setExames(ArrayList<Exame> exames) {
        this.exames = exames;
    }

    
    

   

   
}

