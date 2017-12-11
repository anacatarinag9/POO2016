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
public class Sala implements Serializable{
    
    private String nome;
    private ArrayList <Date> horario = new ArrayList <Date>();
    
    public Sala(String nome){
        this.nome = nome;
    }

    /**
     * metodo para inserir data no array horario
     * @param data 
     */
    public void insereHora(Date data)
    {
        horario.add(data);
        
    }
    
    /**
     * metodo auxiliar usado em metodo "associarSala". Verifica a disponibilidade
     * @param data
     * @return boolean. true se horario estiver livre. false se data corresponder a data ja existente no array
     */
    public boolean verificaDisp(Date data)///falta a duraçao do exame
    {
        for(int i =0;i<horario.size();i++)
        {
            if(horario.get(i).getDia() == data.getDia() && horario.get(i).getMes() == data.getMes() && horario.get(i).getAno() == data.getAno() )
            {
                return false;
            }
            
        }
        return true;
    }
    
    @Override
    public String toString(){
        return "Sala :"+nome;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Date> getHorario() {
        return horario;
    }

    public void setHorario(ArrayList<Date> horario) {
        this.horario = horario;
    }
    public void listarHorario()
    {
        
        for(int i=0;i<horario.size();i++)
        {
            System.out.println("-> "+horario.get(i).getHora()+"h"+horario.get(i).getMin());
            
        }
    }
    
}