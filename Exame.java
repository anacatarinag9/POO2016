/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetonovo;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Catarina Gonçalves
 */
public class Exame implements Serializable{
    
    private String tipoDeExame;//criar classe para cada um? normal,recurso especial?
    private Disciplina disciplina;
    private int duracao;
    private Date data;
    private Docente docenteResponsavel;
    private Sala sala;
    private ArrayList <Docente> vigilantes = new ArrayList <Docente>();
    private ArrayList <NaoDocente> naoDocentes = new ArrayList <NaoDocente>();//para vigiar
    private ArrayList <Sala> salas = new ArrayList <Sala>();
    private ArrayList <Aluno> alunos = new ArrayList <Aluno>();
    private ArrayList <Double> notas = new ArrayList <Double>();
    
    public Exame(String tipo,Disciplina disciplina, Date data,Docente docenteResponsavel,Sala sala,int duracao){
        this.tipoDeExame = tipo;
        this.disciplina = disciplina;
        this.data = data;
        this.docenteResponsavel = docenteResponsavel;
        this.sala = sala;
        this.duracao=duracao;
    }
    
    /**
     * metodo para listar todos os alunos inscritos no exame
     */
    
    public void listarAlunosInscritos(){
        System.out.println("Alunos inscritos no exame");
        for(int i=0;i<this.alunos.size();i++){
            System.out.println(alunos.get(i).toString());
        }
    }
    
        
        
    /**
     * metodo para listar todos os alunos e correspondente classificaçao no exame
     * 
     */
    
    public void listarAlunosEClassi(){
        for(int i=0;i<alunos.size();i++)
        {
            System.out.println("Aluno/Numero: "+alunos.get(i).getNome()+"/"+alunos.get(i).getNrAluno()+"   Classificaçao: "+notas.get(i));
        }
    }
    
    /**
     * metodo para listar todas as classifcaçoes do exame
     */
    public void listarClassi()
    {
        for(int i=0;i<notas.size();i++)
        {
            System.out.println(notas.get(i));
        }
    }
    /**
     * metodo para listar todos os vigilantes docentes do exame
     */
    public void listarVigilantes()
    {
        
        for(int i=0;i<vigilantes.size();i++)
        {
            System.out.println(vigilantes.get(i).nome);
        }
        
    }
    
    /**
     * metodo para listar todos os vigilantes nao docentes do exame
     */
    public void listarNaoDoc()
    {
        for(int i =0;i<naoDocentes.size();i++)
        {
            System.out.println(naoDocentes.get(i).nome);
        }
    }
    
    
    
    
    public int getDuracao()
    {
        return duracao;
    }
    @Override
    public String toString(){
        return "Exame de "+disciplina.getNome()+" de epoca "+tipoDeExame+".\n -> Esta marcado para as "+data.toString()+" na sala "+sala.getNome()+".\n-> Docente responsavel: "+docenteResponsavel.getNome()+".\n-> Vigilantes: "+vigilantes.toString()+"\n -> Vigilantes nao docentes: "+naoDocentes.toString();
    }

    public String getTipoDeExame() {
        return tipoDeExame;
    }

    public void setTipoDeExame(String tipoDeExame) {
        this.tipoDeExame = tipoDeExame;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date dat) {
        this.data = dat;
    }

    public Docente getDocenteResponsavel() {
        return docenteResponsavel;
    }

    public void setDocenteResponsavel(Docente docenteResponsavel) {
        this.docenteResponsavel = docenteResponsavel;
    }

    public ArrayList<Docente> getDocentes() {
        return vigilantes;
    }

    public void setDocentes(ArrayList<Docente> docentes) {
        this.vigilantes = docentes;
    }

    public ArrayList<NaoDocente> getNaoDocentes() {
        return naoDocentes;
    }

    public void setNaoDocentes(ArrayList<NaoDocente> naoDocentes) {
        this.naoDocentes = naoDocentes;
    }

    public ArrayList<Sala> getSalas() {
        return salas;
    }

    public void setSalas(ArrayList<Sala> salas) {
        this.salas = salas;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public ArrayList<Double> getNotas() {
        return notas;
    }

    public void setNotas(int i,Double nota) {
        notas.add(i,nota);
    }
    
    
}
