/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetonovo;

import java.io.Serializable;

/**
 *
 * @author Catarina Gonçalves
 */
public abstract class Pessoa implements Serializable{
    
    protected String nome;
    protected String email;
    protected int tipo;
    
    public Pessoa(String n, String e){
        this.nome = n;
        this.email =e;
    }
    
    
    @Override
    public String toString(){
        return "Nome: "+nome+" Email: "+email;
    }
    
    //// saber o tipo d epessoa 1=docente, 2=nao docente, 3=aluno
    public int getTipo()
    {
        return tipo;
    }
    
    public String getNome(){
        return this.nome;
    }
    public void setNome (String n){
        this.nome = n;
    }
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String e){
        this.email = e;
    }
}
