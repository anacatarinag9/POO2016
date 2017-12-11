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
public class NaoDocente extends Funcionario implements Serializable{
    
    private String cargo;
    private ArrayList<Exame> examesEnvol=new ArrayList<Exame>();
    private int tipo=2;
    
    
    public NaoDocente(String n,String e,int nr,String c,String cargo){
        super(n,e,nr,c);
        this.cargo = cargo;
        
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
 
    /**
     * metodo para listar todos os exames em que o docente tem vigilancias
     */
    public void listarExamesEnvol(){
        for(int i=0;i<examesEnvol.size();i++){
            System.out.println(examesEnvol.get(i).getDisciplina().getNome()+" Data: "+examesEnvol.get(i).getData().toString());
        }
    }

    public ArrayList<Exame> getExamesEnvol() {
        return examesEnvol;
    }

    public void setExamesEnvol(ArrayList<Exame> examesEnvol) {
        this.examesEnvol = examesEnvol;
    }
    
    
    
    @Override
    public String toString(){
        return super.toString()+" Cargo: "+cargo+".";
    }
   
    public String getCargo(){
        return this.cargo;
    }
    public void setCargo(String cargo){
        this.cargo = cargo;
    }
    
    
    
}
