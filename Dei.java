/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetonovo;

import java.io.IOException;
import java.io.Serializable;
import java.util.*;


/**
 *
 * @author Catarina Gonçalves
 */
public class Dei implements Serializable{
    public ArrayList <Disciplina> disciplinas = new ArrayList <Disciplina> ();//tds as disciplinas
    public ArrayList <Exame> exames = new ArrayList <Exame> ();//tds os exames do departamneto
    public ArrayList <Aluno> alunos = new ArrayList <Aluno> ();//tds os alunos
    public ArrayList <Docente> docentes = new ArrayList <Docente>();//tds os docentes
    public ArrayList <NaoDocente> naoDoc = new ArrayList <NaoDocente>();//tds os nao docentes
    public ArrayList <Sala> salas = new ArrayList <Sala>();
    public ArrayList<Curso> cursos=new ArrayList<Curso>();

    
    public Ficheiros fo=new Ficheiros();
    
    /**
     * Quando inicializamos o programa lemos toda a informação de todos os ficheiros e carregamos os arrays com
     * a informação contida nos ficheiros que estao a ser lidos
     * @throws IOException 
     */
     public void atualizaFicheiros() throws IOException
   {
       ////alunos
       fo.abreEscritaObj("alunos.dat");
          try{
              fo.escreveObjeto(alunos);
              
              
          }catch(IOException e)
          {
              System.out.println("Ocorreu um erro do tipo "+e);
          }
          //System.out.println("Foi inserido");
          fo.fechaEscritaObj();
          
      ////docentes
      fo.abreEscritaObj("docentes.dat");
          try{
              fo.escreveObjeto(docentes);
              
              
          }catch(IOException e)
          {
              System.out.println("Ocorreu um erro do tipo "+e);
          }
          //System.out.println("Foi inserido");
          fo.fechaEscritaObj();
          
      ////nao docentes
      
      fo.abreEscritaObj("naoDocentes.dat");
          try{
              fo.escreveObjeto(naoDoc);
              
              
          }catch(IOException e)
          {
              System.out.println("Ocorreu um erro do tipo "+e);
          }
          //System.out.println("Foi inserido");
          fo.fechaEscritaObj();
       ////exames
       
       fo.abreEscritaObj("exames.dat");
          try{
              fo.escreveObjeto(exames);
              
              
          }catch(IOException e)
          {
              System.out.println("cenas");
          }
          //System.out.println("Foi inserido");
          fo.fechaEscritaObj();
          
          
        ///disciplinas
        
        fo.abreEscritaObj("disciplinas.dat");
          try{
              fo.escreveObjeto(disciplinas);
              
              
          }catch(IOException e)
          {
              System.out.println("Ocorreu um erro do tipo "+e);
          }
          //System.out.println("Foi inserido");
          fo.fechaEscritaObj();
          
       ////cursos
       
       fo.abreEscritaObj("cursos.dat");
          try{
              fo.escreveObjeto(cursos);
              
              
          }catch(IOException e)
          {
              System.out.println("Ocorreu um erro do tipo "+e);
          }
         // System.out.println("Foi inserido");
          fo.fechaEscritaObj();
          
          fo.abreEscritaObj("salas.dat");
          try{
              fo.escreveObjeto(salas);
              
              
          }catch(IOException e)
          {
              System.out.println("Ocorreu um erro do tipo "+e);
          }
          //System.out.println("Foi inserido");
          fo.fechaEscritaObj();
       
          
   }
   /**
    * 
    * @throws IOException 
    */
  public void carregaArrays() throws IOException  
  {
      if(fo.abreLeituraObj("alunos.dat")==true){ //atualiza o array de alunos
          try{
              alunos=(ArrayList)fo.leObjecto();
          }catch(ClassNotFoundException e)
          {
              System.out.println("Ocorreu um erro do tipo "+e);
          }
          fo.fechaLeituraObj();
      } 
      if(fo.abreLeituraObj("docentes.dat")==true){//atualiza o array de docentes
          try{
              docentes=(ArrayList)fo.leObjecto();
          }catch(ClassNotFoundException e)
          {
              System.out.println("Ocorreu um erro do tipo "+e);
          }
              fo.fechaLeituraObj();
      }
      if(fo.abreLeituraObj("disciplinas.dat")==true){ //atualiza o array de disciplinas
          try{
              disciplinas=(ArrayList)fo.leObjecto();
          }catch(ClassNotFoundException e)
          {
              System.out.println("Ocorreu um erro do tipo "+e);
          }
          fo.fechaLeituraObj();}
      if(fo.abreLeituraObj("cursos.dat")==true){ //atualiza array de cursos
          try{
              cursos=(ArrayList)fo.leObjecto();
          }catch(ClassNotFoundException e)
          {System.out.println("Ocorreu um erro do tipo "+e);}
          fo.fechaLeituraObj();
      }
      if(fo.abreLeituraObj("exames.dat")==true) //atualiza array de exames
      {
          try{
              exames=(ArrayList)fo.leObjecto();
          }catch(ClassNotFoundException e){ System.out.println("Ocorreu um erro do tipo "+e);}
          fo.fechaLeituraObj();
      }
      if(fo.abreLeituraObj("naoDocentes.dat")==true) //atualiza array de Nao Docentes
      {
          try{
              naoDoc=(ArrayList)fo.leObjecto();
          }catch(ClassNotFoundException e){System.out.println("Ocorreu um erro do tipo "+e);}
          fo.fechaLeituraObj();
        
      
  }
      
     if(fo.abreLeituraObj("salas.dat")==true) //atualiza array de Nao Docentes
      {
          try{
              salas=(ArrayList)fo.leObjecto();
          }catch(ClassNotFoundException e){System.out.println("Ocorreu um erro do tipo "+e);}
          fo.fechaLeituraObj();
        
      
  }
      
        
        ////////SALAS EM FICHEIROS DE TEXTO
  }
  //Recebe novos arrays atualizados e manda para o ficheiro
  /**
   * Atualiza o ficheiro correspondente com o respetivo array que foi atualizado entretanto
   * @param filename
   * @param info
   * @throws IOException 
   */
  /* public void atualizaFicheiros(String filename,ArrayList info) throws IOException
   {
       fo.abreEscritaObj(filename);
          try{
              fo.escreveObjeto(info);
              
              
          }catch(IOException e)
          {
              System.out.println("cenas");
          }
          System.out.println("Foi inserido");
          fo.fechaEscritaObj();
          
   }*/
    /**
     * metodo para procurar exame. Percorre array de todos os exames e compara tipo de exame, disciplina e 
     * docente responsavel pela disciplina.
     * @param tipo
     * @param disciplina
     * @return v. retorna 1 se o exame existir, 0 se o exame nao existir.
     */
    public int procurarExame(String tipo,Disciplina disciplina){
        int v =0;
        for (int i = 0; i<exames.size();i++){
            if(exames.get(i).getTipoDeExame().equals(tipo) && exames.get(i).getDisciplina().equals(disciplina)){
                v = 1;
            }
            
        }
        return v;
    }
    
    /**
     * metodo para lancar notas e colocar as notas do aluno nos mesmos indices que os exames em que o aluno esta inscrito 
     * 
     * @param exame 
     */
    
    //NAO TESTADO
    public void lancarNotas(Exame exame) throws IOException
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("entrou");
        
        for(int i=0;i<exame.getAlunos().size();i++)
        {
            System.out.println("for lançar notas");
            System.out.println("Aluno: "+exame.getAlunos().get(i).nome+"/"+exame.getAlunos().get(i).getNrAluno()+" Classificaçao: ");
            double nota=sc.nextInt();
            exame.setNotas(i,nota);
            /*for(int j=0;j<exame.getAlunos().get(i).getExamesInscritos().size();j++)
            {
                if(exame.getAlunos().get(i).getExamesInscritos().get(j).equals(exame))//verificar se array de exames inscritos do aluno tem o exame
                {
                    exame.getAlunos().get(i).getNotas().add(j,nota);//coloca a nota no array de notas do aluno no mesmo indice q o array de exames do aluno
                    
                }
                            
            }*/
                    
            
        }
        atualizaFicheiros();
        
    }
    /**
     * metodo para associar sala. Este metodo é usado no metodo criar exame como metodo auxiliar. Recebe uma sala ja criada
     * e uma data. usa metodo da classe sala para verificar disponibilidade. Se existir insere hora no array horario 
     * da classe Sala e coloca a flag a 1. Caso sala nao esteja disponivel a flag continua a 0.
     * @param salita
     * @param data
     * @return flag. retorna 1 se sala disponivel. 0 se nao estiver disponivel.
     */
    //testado
    public int associarSala(Sala salita,Date data) throws IOException{
        int flag = 0;
        if(salita.verificaDisp(data)==true){
            
            salita.insereHora(data);
            flag = 1;
            System.out.println("Sala disponivel!");
            atualizaFicheiros();
        
        }
        else 
            System.out.println("Sala nao disponivel!");
        return flag;
    }
    /**
     * metodo para criar sala. Quando a sala é criada é adicionada ao array de salas global(todas as salas do departamento).
     * @param nome 
     */
    //testadoo!!!
    public void criarSala(String nome) throws IOException{
        int v =0;
        for(int i =0; i<salas.size();i++){
            if(salas.get(i).getNome().equals(nome)){
                v++;
                
            }
        }    
        if (v==0){
                Sala sala = new Sala(nome);
                salas.add(sala);
                atualizaFicheiros();
            
        }
        else
            System.out.println("sala ja existe");
        
        
    }
    /**
     * metodo para criar disciplinas. Quando disciplina é criada é adicionada ao array de disciplinas global(todas as disciplinas
     * do departamento)
     * @param nome
     * @param doc 
     */
    //TESTADO!!
    public void criarDisciplina(String nome,Docente doc) throws IOException{
        int v=0;
        Scanner sc=new Scanner(System.in);
        Disciplina d = new Disciplina (nome,doc);
        disciplinas.add(d);
        doc.getDisciplinas().add(d);
        
        ArrayList <Docente> novo = new ArrayList <Docente> ();
        
        System.out.println("Professores da disciplina(quantidade): ");
        int profs=sc.nextInt();
        int x=0;
        if(profs !=0){
            for(int k=1;k<profs+1;k++){
                
                System.out.println("\n Numero Mecanografico: ");
                int numeroMecano=sc.nextInt();
                for(int j=0;j<docentes.size();j++)
                    {
                        if((!docentes.get(j).equals(doc))){
                            if(docentes.get(j).getNr() == numeroMecano){
                                
                                
                            
                                d.getDocentes().add(docentes.get(j));
                                docentes.get(j).setDisciplinas(d);
                                System.out.println("docente adicionado com sucesso");
                                
                            }
                        }
                        
                    }
                }       
            }
        atualizaFicheiros();
            
        }
        
    
    /**
     * metodo para inscrever aluno numa disciplina. compara numero de aluno e nome da disciplina. Se ambos existirem
     * adiciona aluno no array de alunos na classe Disciplina.
     * @param nr
     * @param disciplina 
     * @throws java.io.IOException 
     */
    //TESTADO
    public void inscreverDisciplina(int nr,String disciplina) throws IOException{
        for(int i = 0;i<alunos.size();i++){
            if(alunos.get(i).getNrAluno() == nr){
                for(int k = 0;k<disciplinas.size();k++){
                    if(disciplinas.get(k).getNome().equals(disciplina)){
                        disciplinas.get(k).getAlunos().add(alunos.get(i));
                        alunos.get(i).getDisciplinas().add(disciplinas.get(k));
                        atualizaFicheiros();
                        System.out.println("Aluno inscrito na disciplina "+disciplinas.get(k).getNome());
                    }
                }
            }
        }
    }
    
    /**
     * metodo para criar exames de vario tipos. Certifica que exames do mesmo tipo e da mesma disciplina nao sao criados duas vezes. Usa metodo
     * associar sala para ajudar a criar exame. So cria uma sala. Quando exame é criado é adicionado ao array de exames global,
     * é adicionado ao array de exames na classe Disciplina. Este metodo usa dois metodos auxiliares(associarDoc e AssociarNaoDoc)
     * para associar docentes e nao docentes assim que o exame é criado.
     * @param tipo
     * @param disciplina
     * @param data 
     * @param salita 
     * @param duracao 
     * @throws java.io.IOException 
     */
    //TESTADO
    
    public void criarExames(String tipo,Disciplina disciplina,Date data,Sala salita,int duracao) throws IOException{
        int v =0;
        for (int i=0; i<exames.size();i++){
            if(exames.get(i).getTipoDeExame().equals(tipo) && exames.get(i).getDisciplina().equals(disciplina)){
                v++;
            }
        
               
        }
        if(associarSala(salita,data)== 1){
            if(v==0){
                if(tipo.equals("Normal") || tipo.equals("Recurso") || tipo.equals("Especial")){
                    Exame ex = new Exame (tipo,disciplina,data,disciplina.getDocenteResponsavel(),salita,duracao);
                    System.out.println("Exame da disciplina "+disciplina.getNome()+" para a epoca "+ex.getTipoDeExame()+" criado.");
                    exames.add(ex);
                    disciplina.getExames().add(ex);
                    associarDoc(disciplina.getDocentes(),ex);
                    associarNaoDoc(naoDoc,ex);
                    atualizaFicheiros(); 
                }
            }       
        }
        else
            System.out.println("Sala ocupada");
       
        
    }
    
    /**
     * metodo para eliminar exames. Elimina exames dos seguintes arrays: de todos os exames,do array de exames da classe da disciplina
     * remove das vigilancias dos docentes e nao docentes
     * @param tipo
     * @param disciplina 
     * @throws java.io.IOException 
     */
    
    public void EliminaExames(String tipo,Disciplina disciplina) throws IOException{
        for(int i=0;i<exames.size();i++){
            if (exames.get(i).getTipoDeExame().equals(tipo) && exames.get(i).getDisciplina().equals(disciplina)){
                exames.remove(i);
                disciplina.getExames().remove(i);
                if(!(docentes.get(i).getVigilancias().isEmpty() && naoDoc.get(i).getExamesEnvol().isEmpty())){
                    docentes.get(i).getVigilancias().remove(i);
                    naoDoc.get(i).getExamesEnvol().remove(i);
                }
                
                    
                
                atualizaFicheiros();
                System.out.println("Exame eliminado");
            }
        }
        
    }
    
    
    /**
     * metodo para criar alunos. Certifica que os alunos tem numeros diferentes. Quando aluno é criado é adicionado ao array global de alunos
     * @param n
     * @param e
     * @param nr
     * @param c
     * @param ano
     * @param r 
     */
    //testado
    public void criarAlunos(String n,String e,int nr,String c,int ano,String r) throws IOException{
        int v=0;
        for (int i=0;i<alunos.size();i++){
            if(alunos.get(i).getNrAluno() == nr){
                v++;
            }
            
        }
        if(v==0){
            Aluno al = new Aluno(n,e,nr,c,ano,r);
            alunos.add(al);
            atualizaFicheiros();
            System.out.println("O/A Aluno/a "+al.getNome()+" com o numero "+al.getNrAluno()+" foi criado com sucesso.");
            
        }
        else
            System.out.println("Aluno ja existe");
    }
      
    /**
     * metodo para criar Docentes. Certifica que os docentes tem numeros diferentes. Quando docente é criado é adicionado ao array
     * global dos docentes
     * @param n
     * @param e
     * @param nr
     * @param c
     * @param area 
     */
    //TESTADO
    public void criarDocente(String n,String e, int nr,String c, String area) throws IOException{
        int v=0;
        for (int i=0;i<docentes.size();i++){
            if(docentes.get(i).getNr()== nr){
                v++;
            }
        }
        if(v==0){
            Docente doc = new Docente(n,e,nr,c, area);
            docentes.add(doc);
            atualizaFicheiros();
            System.out.println("Docente "+doc.getNome()+" com numero "+doc.getNr()+" foi criado com sucesso");
            
        }
        else
            System.out.println("Docente ja existe");
    }
    
    /**
     * metodo para criar nao docentes. certifica que os nao docentes tem numeros diferentes entre eles e os docentes
     * @param n
     * @param e
     * @param nr
     * @param c
     * @param cargo 
     */
    //testado
    public void criarNaoDocente(String n,String e,int nr,String c,String cargo) throws IOException{
        int v=0;
        for (int i=0;i<naoDoc.size();i++){
            if(naoDoc.get(i).getNr() == nr){
                v++;
            }
        }
        if(v==0){
            NaoDocente naoDocente = new NaoDocente(n,e,nr,c, cargo);
            naoDoc.add(naoDocente);
            atualizaFicheiros();
            System.out.println("Nao Docente "+naoDocente.getNome()+" com o numero "+naoDocente.getNr()+ " foi criado com sucesso");
            
        }
    }
    
    /**
     * metodo para listar todos os exames do departamento
     */
    public void listarExames(){
        for(int i=0;i<exames.size();i++){
            System.out.println(exames.get(i));
        }
    }
    
    /**
     * metodo para listar todos os alunos do departamento
     */
    public void listarAlunos(){
        for (int i=0;i<alunos.size();i++){
            System.out.println(alunos.get(i));
        }
    }
    
    /**
     * metodo para listar todos os docentes do departamento
     */
    public void listarDocentes(){
        for(int i=0;i<docentes.size();i++){
            System.out.println(docentes.get(i).toString());
        }
    }
    
    /**
     * metodo para listar todos os nao docentes do departamento
     */
    public void listarNaoDocentes(){
        for(int i=0;i<naoDoc.size();i++){
            System.out.println(naoDoc.get(i).toString());
        }
    }
    /**
     * metodo para listar todas as disciplinas do departamento
     */
    public void listarDisciplinas()
    {
        for(int i=0;i<disciplinas.size();i++){
            System.out.println(disciplinas.get(i).toString()+"\n");
            disciplinas.get(i);
            System.out.println("Docentes da Disciplina de "+disciplinas.get(i).getNome());
            System.out.println("\n   ");
            disciplinas.get(i).listarDocDaDisciplina();
        }
    }
    public void listarSalas(){
        for(int i=0;i<salas.size();i++){
            System.out.println(salas.get(i).toString()+"\n");
        }
    }
    /**
     * Método para desinscrever Aluno de um Exame.
     * Percorre o ArrayList de todos os alunos, de todas as disciplinas e usa o método auxiliar "confirmaAluno" para ajudar a verificar se Aluno tem a Disciplina. 
     * No fim, retira o Aluno da ArrayList de exames e retira o Exame da ArrayList de exames inscritos da classe Aluno
     * @param nrAluno
     * @param tipoDeExame
     * @param disciplina
     */
    //TESTADO
    public void desinscreverAlunoExame(int nrAluno,String tipoDeExame,String disciplina) throws IOException{
        for(int i=0;i<alunos.size();i++){
            if(nrAluno == alunos.get(i).getNrAluno()){
                for(int k=0;k<disciplinas.size();k++){
                    if(disciplinas.get(k).getNome().equals(disciplina) && confirmaAluno(nrAluno,disciplinas.get(k)) == 1){
                        for(int j=0;j<disciplinas.get(k).getExames().size();j++){
                            if(disciplinas.get(k).getExames().get(j).getTipoDeExame().equals(tipoDeExame)){
                                
                                disciplinas.get(k).getExames().get(j).getAlunos().remove(alunos.get(i));//remove aluno do array de exames
                                alunos.get(i).getExamesInscritos().remove(j);   
                                atualizaFicheiros();
                                System.out.println("Aluno desinscrito do exame");
                                    
                                    
                                
                                   
                            }
                        }
                    }
                }
            }
        }
    }
    
  /**
     * Método auxiliar para confirmar se Aluno tem a Disciplina. 
     * Usa o número de Aluno para identificar o Aluno e procura no ArrayList global de disciplinas se Disciplina existe. 
     * Caso exista a flag fica a 1. Se nao existir a flag continua a 0.
     * @param nrAluno
     * @param disciplina 
     * @return  flag.
     */
    
    public int confirmaAluno(int nrAluno, Disciplina disciplina){
        int flag =0;
        for(int i=0; i<disciplinas.size();i++){
            if(disciplinas.get(i).equals(disciplina)){
                for(int k=0;k<disciplinas.get(i).getAlunos().size();k++){
                    if(disciplinas.get(i).getAlunos().get(k).getNrAluno()==nrAluno){
                        flag = 1;
                        return flag;
                    }
                }
            }
        }
        return flag;
        
    }
    /**
     * metodo para confirmar que a disciplina ja esta criada
     * @param disciplina
     * @return 
     */
    public int confirmarDisciplina (String disciplina){
        int flag =0;
        for(int i =0; i<disciplinas.size();i++){
            if(disciplinas.get(i).getNome().equals(disciplina)){
                flag = 1;
                return flag;
            }
                
        }
        return flag;
    }
    /**
     * metodo para confirmar que a sala ja esta criada
     * @param nome
     * @return 
     */
    public int confirmarSala(String nome){
        int flag =0;
        for(int i =0; i<salas.size();i++){
            if(salas.get(i).getNome().equals(nome)){
                flag = 1;
                return flag;
            }
                
        }
        return flag;
    }
    
    
     /**
     * Método para inscrever alunos no Exame. 
     * Adiciona Aluno ao ArrayList de exames da classe Exame e usa o método addExameAoAluno para adicionar Exame ao ArrayList de exames da classe Aluno. 
     * Percorre o ArrayList de todos os alunos para identificar o número de Aluno. Existindo esse Aluno no ArrayList, percorre o ArrayList disciplinas e verifica se tem essa Disciplina.
     * Usa o método auxiliar "confimaAluno" para confirmar que o Aluno tem a Disciplina. 
     * Tendo essa Disciplina, verifica se essa Disciplina tem Exame do tipo que se pretende inscrever.
     * Por fim adiciona o Aluno ao ArrayList de exames da classe Exame.
     * 
     * @param nrAluno
     * @param tipoDeExame
     * @param disciplina 
     */
    
    //testado
    public void increverAluno(int nrAluno,String tipoDeExame,String disciplina) throws IOException{//add aluno aos array de exames da classe disciplina e da classe exame
        
        for(int i=0;i<alunos.size();i++){
            if(nrAluno == alunos.get(i).getNrAluno()){
                for(int k=0;k<disciplinas.size();k++){
                    if(disciplinas.get(k).getNome().equals(disciplina) && confirmaAluno(nrAluno,disciplinas.get(k)) == 1){//confirma se aluno pertence a disciplina
                        for(int j=0;j<disciplinas.get(k).getExames().size();j++){
                            if(disciplinas.get(k).getExames().get(j).getTipoDeExame().equals(tipoDeExame)){
                                if(addExameAoAluno(nrAluno,tipoDeExame,disciplinas.get(k).getExames().get(j))== 1){
                                    disciplinas.get(k).getExames().get(j).getAlunos().add(alunos.get(i));// aluno no array de alunos da classe Exame e Disciplina
                                    
                                    
                                    atualizaFicheiros();
                                    System.out.println("Aluno inscrito com sucesso no exame: "+disciplinas.get(k).getExames().get(j).toString());
                                }
                                
                                
                            }
                                     
                        }
                    }
                    else{
                        System.out.println("O aluno nao esta inscrito a disciplina!");
                        break;
                    }
                    
                }
            }
            
        }
    }
        
  /**
     * Método para adicionar Exame à ArrayList de exames do Aluno. 
     * Usa o número do Aluno para verificar se esse Aluno tem o regime necessário para poder se inscrever no tipo de Exame que prentende. 
     * Se as condições se verificarem adiciona a Disciplina a que prentende se inscrever no ArrayList de exames inscritos da classe Aluno
     * @param nrAluno 
     * @param tipoDeExame 
     * @param exame 
     * @return  
     */  
    public int addExameAoAluno(int nrAluno,String tipoDeExame,Exame exame) throws IOException{    
        int flag=0;

        for(int i=0;i<alunos.size();i++){
            if(nrAluno == alunos.get(i).getNrAluno()){
                if(alunos.get(i).getRegime().equals("Normal") || alunos.get(i).getRegime().equals("Erasmus")){//alunos em regime normal ou erasmus so se podem inscrever em normal e recurso
                    if(tipoDeExame.equals("Normal") || tipoDeExame.equals("Recurso")){
                        alunos.get(i).getExamesInscritos().add(exame);//??fazer novo metodo para adicionar disciplina ao array de exames
                        flag = 1;
                        
                        atualizaFicheiros();
                        System.out.println("Aluno com numero "+nrAluno+" foi inscrito com sucesso no exame do tipo "+tipoDeExame+ " da disciplina "+exame.getDisciplina().getNome()+"");
                    }
                    else{//no entanto se tiverem no 3º ano podem se inscrever em especial
                        
                        if(exame.getData().getAno()- alunos.get(i).getAnoMatricula() == 3){
                            alunos.get(i).getExamesInscritos().add(exame);
                            flag = 1;
                            atualizaFicheiros();
                            System.out.println("Aluno com numero "+nrAluno+" foi inscrito com sucesso no exame do tipo "+tipoDeExame+ " da disciplina "+exame.getDisciplina().getNome()+"");
                        }
                        else//se nenhuma condiçao se verificar nao se podem inscrever em especial
                            System.out.println("Aluno nao tem estatuto para se increver em "+tipoDeExame);
                    }
                }
                else{//alunos com outro tipo de regime podem se inscrever em tds os exames
                    alunos.get(i).getExamesInscritos().add(exame);
                    flag = 1;
                    atualizaFicheiros();
                    System.out.println("Aluno com numero "+nrAluno+" foi inscrito com sucesso no exame do tipo "+tipoDeExame+ " da disciplina "+exame.getDisciplina().getNome());
                }   
            }
        }
    return flag;
        
    }
    /**
     * Método para associar docentes para vigilância num Exame. 
     * Verifica se Docente tem Data disponível usando um contador.
     * Caso esse contador fique a zero o Docente pode ser adicionado ao ArrayList de docentes da classe Exame, simultâneamente
     * o Exame será adicionado ao ArrayList de vigilâncias da classe Docente
     * @param docentes
     * @param exame 
     */
    
    //TESTADO
    public void associarDoc(ArrayList<Docente> docentes,Exame exame) throws IOException{
        int v=0;
        
        for(int i=0;i<docentes.size();i++){
            for(int j=0;j<docentes.get(i).getVigilancias().size();j++)
            {
                if(docentes.get(i).getVigilancias().get(j).getData()!=exame.getData())
                {continue;}
                else{ v++;}
            }
            if(v==0)
            {
                exame.getDocentes().add(docentes.get(i));
                System.out.println("VIGILANTES:");
                exame.listarVigilantes();
                docentes.get(i).getVigilancias().add(exame);
                //System.out.println("listar vigilancias:");
                //docentes.get(i).listarExamesEnvol();
                atualizaFicheiros();
                System.out.println("O docente "+docentes.get(i).getNome()+" foi adicionado com sucesso.");
                }
            else{
                continue;
            }
        }

        
        
    } 
    
    
   /**
     * Método para adicionar Não Docentes à vigilância de exames. São pedidos ao utilizador o número de Não Docentes a convocar
     * São gerados aleatoriamente a quantidade de números que foi pedido ao utilizador. Esses números aleatórios serão posteriormente guardados num array. 
     * É percorrido o ArrayList e o ArrayList de todos os Não Docentes.
     * Os números aleatórios serão comparados com os índices do ArrayList que corresponderão aos Não Docentes convocados. 
     * @param naoDoc
     * @param ex 
     */
    
    public void associarNaoDoc(ArrayList <NaoDocente> naoDoc,Exame ex) throws IOException{//TESTADO
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Quantos Nao Docentes quer convocar: ");
        int func=sc.nextInt();
        
        int[]funcionarios=new int[func];
        int tam = naoDoc.size();
        Random generator = new Random();
        if (tam !=0){
            for(int i=0;i<func;i++){
            
            funcionarios[i]=generator.nextInt(tam);//guarda no array funcionarios os numeros aleatorios q dps corresponderam aos indices dos funcionarios   
            
            }//fazer sem repetir numeros!!!!
            
            for(int i=0;i<funcionarios.length;i++){
                for(int j=0;j<tam;j++){
                    if(funcionarios[i] == j){
                        ex.getNaoDocentes().add(naoDoc.get(j));
                        naoDoc.get(i).getExamesEnvol().add(ex);
                        atualizaFicheiros();
                        System.out.println("Nao Docente "+naoDoc.get(j).getNome()+" foi adicionado com sucesso.");
                    }
                }
            }
        }
        else
            System.out.println("Nao existem nao docentes criados");
        
        
       
        
        
    }
    
    
   
       
}

    
