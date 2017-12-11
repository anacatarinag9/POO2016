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
public class Docente extends Funcionario implements Serializable{
    
    private String area;
    private ArrayList <Exame> exames = new ArrayList <Exame> ();
    private ArrayList <Disciplina> disciplinas = new ArrayList <Disciplina>();
    private int tipo=1;
    public Docente (String n,String e, int nr,String c, String area){
        super(n,e,nr,c);
        this.area=area;
    }
    
    
    /**
     * metodo para listar todos os exames em que o docentes esta a fazer vigilancias
     */
    public void listarExamesEnvol()
    {
        System.out.println("Exames Envolvido");
        if (!exames.isEmpty()){
            
            for(int i=0;i<exames.size();i++)
            {
            System.out.println(nome+"\nDisciplina: "+exames.get(i).getDisciplina().getNome()+" Tipo: "+exames.get(i).getTipoDeExame()+" Data: "+exames.get(i).getData().toString());
                
            }    

        }
        else
            System.out.println("Docente nao tem vigilancias");
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
    public void listarDisciplinas(){
        System.out.println("Disciplinas!");
        if (!disciplinas.isEmpty()){
            
            for(int i=0;i<disciplinas.size();i++)
            {
                System.out.println("\n"+disciplinas.get(i).toString());
                
            }    

        }
        else
            System.out.println("Docente nao tem disciplinas");
    }
                    
    
   
    public ArrayList<Exame> getVigilancias(){
        return exames;
        
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(Disciplina disciplina) {
        this.disciplinas.add(disciplina);
    }
    
    
    
 
    @Override
    public String toString(){
        return super.toString()+" Area: "+area+".";
    }
    
    public String getArea(){
        return this.area;
    }
    public void setArea (String area){
        this.area = area;
    }
    
    
}
