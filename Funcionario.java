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
public abstract class Funcionario extends Pessoa {
    protected int nrMecanografico;
    protected String categoria;
    
    public Funcionario (String n, String e,int nr,String c){
        super(n,e);
        this.nrMecanografico = nr;
        this.categoria = c;
    }
    
    
    @Override
    public String toString(){
        return super.toString()+"| Numero Mecanografico: "+nrMecanografico+"| Categoria: "+categoria+" | ";
    }
    public int getNr(){
        return nrMecanografico;
    }
    public void setNr(int nr){
        this.nrMecanografico = nr;
    }
    public String getCategoria(){
        return this.categoria;
    }
    public void setCategoria(String categoria){
        this.categoria = categoria;
    }
}
