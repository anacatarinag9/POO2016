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
public class Aluno extends Pessoa implements Serializable{
 
    private int nrAluno;
    private String curso;
    private int anoMatricula;
    private String regime;
    private ArrayList <Exame> examesInscritos = new ArrayList <Exame>();
    private ArrayList <Disciplina> disciplinas = new ArrayList <Disciplina>();
    private ArrayList<Double> notas=new ArrayList<Double>();

    public Aluno (String n,String e,int nr,String c,int ano,String r){
        super(n,e);
        this.nrAluno = nr;
        this.curso = c;
        this.anoMatricula=ano;
        this.regime = r;
        
    }
    /**
     * metodo para listar notas das disciplinas em que tem exame inscrito
     */
    public void listarAlunoNotas(){
        for (int i =0; i<notas.size();i++){
            System.out.println(examesInscritos.get(i).getDisciplina().getNome()+" nota: "+notas.get(i));
        }
    }
    /**
     * metodo para listar todos os exames em que o aluno esta inscrito
     */
    public void listarExames(){
        for(int i=0;i<examesInscritos.size();i++){
            System.out.println(examesInscritos.get(i).getDisciplina().getNome());
        }
    }
    /**
     * metodo para listar disciplinas em que o aluno esta inscrito
     */
    public void listarDisciplinas(){
        for(int i=0;i<disciplinas.size();i++){
            System.out.println(disciplinas.get(i).getNome());
        }
    }
    
    @Override
    public String toString(){
        return super.toString()+" é aluno com nr "+nrAluno+".Entrou em "+curso+" no ano "+anoMatricula+". Tem regime "+regime;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
    public int getNrAluno() {
        return nrAluno;
    }

    public void setNrAluno(int nrAluno) {
        this.nrAluno = nrAluno;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getAnoMatricula() {
        return anoMatricula;
    }

    public void setAnoMatricula(int anoMatricula) {
        this.anoMatricula = anoMatricula;
    }

    public String getRegime() {
        return regime;
    }

    public void setRegime(String regime) {
        this.regime = regime;
    }

    public ArrayList<Exame> getExamesInscritos() {
        return examesInscritos;
    }

    public void setExamesInscritos(ArrayList<Exame> exames) {
        this.examesInscritos = exames;
    }
    
    public ArrayList<Double> getNotas(){
        return notas;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }
    
    
    
    
}