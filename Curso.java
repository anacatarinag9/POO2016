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
public class Curso implements Serializable{
    
    private String nome;
    private int duracao;
    private ArrayList<Disciplina> disciplinas=new ArrayList<Disciplina>();
    
    
    Curso(){
        
    }
    
    Curso(String nome, int duracao)
    {
        this.nome=nome;
        this.duracao=duracao;
    }
    
    public String getNome()
    {
        return nome;
    }
    
    public int getDuracao()
    {
        return duracao;
        
    }
    
    public void setNome(String nome)
    {
        this.nome=nome;
    }
    
    public void setDuracao(int duracao)
    {
        this.duracao=duracao;
    }
    
    public void adicionaDisciplina(Disciplina disciplina)
    {
        disciplinas.add(disciplina);
    }
    
    public String toString()
    {
        return nome;
    }
}

