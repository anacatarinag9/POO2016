/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetonovo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author Catarina Gonçalves
 */
public class Ficheiros implements Serializable {
    
    private ObjectInputStream is;
    private ObjectOutputStream os;
    private BufferedReader fR;
    private BufferedWriter fW;
    
    public boolean abreLeituraObj(String nomeDoFicheiro){
        try{
            is = new ObjectInputStream(new FileInputStream(nomeDoFicheiro));
            return true;
        }catch (IOException e){
            return false;}
        
    }
    public void abreEscritaObj(String nomeDoFicheiro) throws IOException{
        
        os = new ObjectOutputStream(new FileOutputStream(nomeDoFicheiro));
        
        
    
    } 
    public Object leObjecto() throws IOException,ClassNotFoundException
    {
        return is.readObject();
        
    }
    
    public void escreveObjeto(Object o) throws IOException
    {
        os.writeObject(o);
        
    }
    
    public void fechaLeituraObj()throws IOException{
        is.close();
    }
    
    public void fechaEscritaObj()throws IOException
    {
        os.close();
    }

    public void abreLeituraTexto(String nomeFich) throws FileNotFoundException
    {
        fR = new BufferedReader(new FileReader(nomeFich));
    }
    
    public void abreEscritaTexto(String nomeFich) throws IOException
    {
        fW = new BufferedWriter(new FileWriter(nomeFich));
    }
    public String leLinhaTexto() throws IOException
    {
        return fR.readLine();
    }
    
    public void escreveLinhaTexto(String linha) throws IOException
    {
        fW.write(linha,0,linha.length());
        fW.newLine();
    }
    public void fechaLeituraTexto() throws IOException {
        fR.close();
    }
//Método para fechar um ficheiro aberto em modo escrita
    public void fechaEscritaTexto() throws IOException {
        fW.close();
    }
    
    public int[] leNumeroInt() throws IOException {
        int[] result = new int[2];
        String st = fR.readLine();
        if (st != null) {
            result[0] = 0;
            result[1] = Integer.parseInt(st);
        } else {
            result[0] = -1;}
        return result;
    } 
    public void escreveNumero(int num) throws IOException
{
        String st = "";
        st = st.valueOf(num);
        escreveLinhaTexto(st);
}
    }
