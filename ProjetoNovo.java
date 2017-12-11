/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetonovo;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Catarina Gonçalves
 */
public class ProjetoNovo {

   public static void menu(){
        System.out.println("*******MENU*******");
        System.out.println("|1 - Docente     |\n"+
                           "|2 - Nao Docente |\n"+
                           "|3 - Aluno       |\n"+
                           "|4 - Secretaria  |\n"+ //Coisas gerais listar tudo o que esta no dei
                           "|5 - Sair        |\n"+
                           "******************\n"+
                           "Opcao: ");
    }
    public static void menuDocente(){
        System.out.println("*********************DOCENTE**********************");
        System.out.println("|1 - Criar Exame                                 |\n"+
                           "|2 - Eliminar Exame                              |\n"+
                           "|3 - Lancar notas                                |\n"+
                           "|4 - listar vigilancias                          |\n"+
                           "|5 - listar classificaçoes de um exame           |\n"+
                           
                           "|7 - listar disciplinas\n"+
                           //"|8 - Listar alunos inscritos a exame\n"+
                           
                           "|8 - Voltar                                      |\n"+
                          
                           "**************************************************\n"+
                           "Opcao: ");
    }
    public static void menuNaoDocente(){
        
        System.out.println("*********NAO DOCENTE**********");
        System.out.println("|1 - Listar exames envolvidos|\n"+
                           "|2 - Voltar                  |\n"+
                           
                           "******************************\n"+
                           "opcao: ");
    }
    public static void menuAluno(){
        System.out.println("*****************ALUNO****************");
        System.out.println("|1 - Inscrever em Exame              |\n"+
                           "|2 - Listar inscriçoes em exame      |\n"+
                           "|3 - Listar classificaçoes e exames  |\n"+//historico do aluno
                           "|4 - Listar exames                   |\n"+
                           "|5 - Desinscrever em exame           |\n"+
                           "|6 - Listar as disciplinas           |\n"+
                           "|7 - Inscrever em disciplina         |\n"+
                           "|8 - Voltar                          |\n"+
                          
                           "**************************************\n"+
                           "Opcao: ");
    }
    public static void menuSecretaria(){
        System.out.println("*********SECRETARIA*********");
        System.out.println("|1 - Listar Docentes       |\n"+
                           "|2 - Listar Nao Docentes   |\n"+
                           "|3 - Listar Alunos         |\n"+
                           "|4 - Listar Exames e Salas |\n"+
                           "|5 - Listar Disciplinas    |\n"+
                           "|6 - Criar Docente         |\n"+//novo
                           "|7 - Criar Nao Docente     |\n"+//novo
                           "|8 - Criar Aluno           |\n"+//novo
                           "|9 - Criar Disciplina      |\n"+//novo
                           "|10 - Voltar               |\n"+
                          
                           "****************************\n"+
                           "Opcao: ");
    }
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Dei dei=new Dei();
        
        Curso lei=new Curso("lei",3);
        Curso ldm=new Curso("ldm",3);
        //Ficheiros fo=new Ficheiros();
       // File sal=new File("salas.txt");
        //sal.createNewFile();
        dei.cursos.add(lei);
        dei.cursos.add(ldm);
        //ei.carregaArrays();
        //Date date = new Date (12,12,12,12,12);  
        //Docente doc2 = new Docente("docente","email",1,"c","a");
        //dei.docentes.add(doc2);
        //Disciplina dis2 = new Disciplina ("BD",doc2);
        //dei.disciplinas.add(dis2);
        Sala salita=new Sala("c.5.2");
        Sala sala1=new Sala("c.5.1");
        dei.salas.add(salita);
        dei.salas.add(sala1);
        dei.carregaArrays();
      
      Scanner sc = new Scanner(System.in);
        
     
       
        int opcao,opcao2,opcao3,opcao4,opcao5, numero;
        String tipoDeExame,nome,sala,disciplina;
        boolean keepRunning = true;
        while(keepRunning){
            do{
                menu();
                while(!sc.hasNextInt()){
                    System.out.println("Opcao Invalida");
                    System.out.println("Tente novamente: ");
                    sc.next();
                }
                opcao = sc.nextInt();
            }while(opcao<1 || opcao>5);
            switch(opcao){
                 case 1://DOCENTES
                     boolean keepRunning2 = true;
                     while(keepRunning2){
                            do{
                                menuDocente();

                                while(!sc.hasNextInt()){
                                System.out.println("Opcao Invalida");
                                System.out.println("Tente novamente: ");
                                sc.next();
                                }
                            opcao2 = sc.nextInt();
                            }while(opcao2<1 || opcao2>8);
                            switch(opcao2){
                                case 1://criar exames
                                    System.out.println("***Disciplinas***");
                                    dei.listarDisciplinas();
                                    System.out.println("\n\n***Docentes***");
                                    dei.listarDocentes();
                                    System.out.println("\n\n***Salas***");
                                    dei.listarSalas();
                                    
                                    System.out.println("\n\n****Criar Exames****");
                                    String tipos="Normal Recurso Especial";
                                    do{
                                        System.out.println("Tipo: ");
                                        tipoDeExame = sc.next();
                                    }while(!tipoDeExame.matches("[a-zA-Z]+") || !tipos.contains(tipoDeExame));
                                     System.out.println("Disciplina: ");
                                    do{//imprime duas vezes
                                       
                                        nome = sc.nextLine();
                                    }while(dei.confirmarDisciplina(nome)==0);//flag 0 -> nao existe
                                    
                                    System.out.println("Data de realizaçao do Exame!");
                                    System.out.println("Dia: ");
                                    while(!sc.hasNextInt() ){
                                        sc.next();
                                        System.out.println("Insira novamente: ");
                                    }
                                    int dia=sc.nextInt();
                                    
                                    while(dia<1 || dia>31)
                                    {
                                        System.out.println("Dia invalido! Tente Novamente...");
                                        while(!sc.hasNextInt()){
                                        sc.next();
                                        System.out.println("Insira novamente: ");
                                    }
                                        dia=sc.nextInt();
                                        
                                    }
                                    
                                    System.out.println("Mes: ");
                                    while(!sc.hasNextInt()){
                                        sc.next();
                                        System.out.println("Insira novamente: ");
                                    }
                                    int mes=sc.nextInt();
                                    while(mes<1||mes>12)
                                    {
                                        System.out.println("Mes invalido! Tente Novamente...");
                                        while(!sc.hasNextInt()){
                                        sc.next();
                                        System.out.println("Insira novamente: ");
                                    }
                                        mes=sc.nextInt();
                                        
                                    }
                                    if(((mes==2)||(mes==4)||(mes==6)||(mes==9)||(mes==11))&&(dia==31))
                                    {
                                        System.out.println("Este mes so tem 30 dias, insira novamente o dia: ");
                                        while(!sc.hasNextInt()){
                                        sc.next();
                                        System.out.println("Insira novamente: ");
                                    }
                                        dia=sc.nextInt();
                                        
                                    }
                                    System.out.println("Ano: ");
                                    while(!sc.hasNextInt()){
                                        sc.next();
                                        System.out.println("Insira novamente: ");
                                    }
                                    int ano=sc.nextInt();
                                    while(ano<2016)
                                    {
                                        System.out.println("Ano invalido!Tente novamente...");
                                        while(!sc.hasNextInt()){
                                        sc.next();
                                        System.out.println("Insira novamente: ");
                                    }
                                        ano=sc.nextInt();
                                    }
                                    System.out.println("Hora: ");
                                    while(!sc.hasNextInt()){
                                        sc.next();
                                        System.out.println("Insira novamente: ");
                                    }
                                    int hora=sc.nextInt();
                                    while(hora>23||hora<00)
                                    {
                                        System.out.println("Hora Invalida! Tente novamente...");
                                        while(!sc.hasNextInt()){
                                        sc.next();
                                        System.out.println("Insira novamente: ");
                                    }
                                        hora=sc.nextInt();
                                    }
                                    System.out.println("Minuto: ");
                                    while(!sc.hasNextInt()){
                                        sc.next();
                                        System.out.println("Insira novamente: ");
                                    }
                                    int minuto=sc.nextInt();
                                    while((minuto>59)||(minuto<00))
                                    {
                                        System.out.println("Minuto Invalido! Tente novamente... ");
                                        while(!sc.hasNextInt()){
                                        sc.next();
                                        System.out.println("Insira novamente: ");
                                    }
                                        minuto=sc.nextInt();
                                    }
                                    
                                    Date data = new Date(dia,mes,ano,hora,minuto);
                                    System.out.println("Duracao: ");
                                    while(!sc.hasNextInt()){
                                        sc.next();
                                        System.out.println("Insira novamente: ");
                                    }
                                    int duracao=sc.nextInt();
                                    System.out.println("Sala: ");
                                    do{
                                        
                                        sala = sc.nextLine();
                                        
                                    }while(dei.confirmarSala(sala) == 0);
                                    
                                    for(int i=0;i<dei.disciplinas.size();i++){
                                        if(dei.disciplinas.get(i).getNome().equals(nome)){
                                            for(int j=0;j<dei.salas.size();j++)
                                            {
                                                if(dei.salas.get(j).getNome().equals(sala))
                                                {
                                                    dei.criarExames(tipoDeExame, dei.disciplinas.get(i),data, dei.salas.get(j),duracao);
                                                }

                                            }
                                        }    
                                    }
                                    break;
                                case 2:
                                    System.out.println("\n*****Eliminar Exame*****");
                                    
                                    System.out.println("Tipo: ");
                                    tipoDeExame = sc.next();
                                    String tiposx="Normal Recurso Especial";
                                    
                                    while(!tiposx.contains(tipoDeExame))
                                    {
                                        System.out.println("Tipo inválido! Tente novamente...");
                                        
                                        tipoDeExame = sc.next();
                                        
                                        
                                    }System.out.println("Disciplina: ");
                                    do{//imprime duas vezes
                                        
                                        nome = sc.nextLine();
                                    }while(dei.confirmarDisciplina(nome)==0);
                                    

                                    for(int i=0;i<dei.disciplinas.size();i++){
                                        if(dei.disciplinas.get(i).getNome().equals(nome)){
                                            dei.EliminaExames(tipoDeExame, dei.disciplinas.get(i));
                                        }
                                    }

                                    break;
                                case 3:
                                    //LANCAR NOTAS
                                    System.out.println("\nInsira o seu numero mecanografico: ");
                                    while(!sc.hasNextInt()){
                                        sc.next();
                                        System.out.println("Insira novamente: ");
                                    }numero = sc.nextInt();
                                    System.out.println("Tipo de exame: ");
                                    tipoDeExame = sc.next();
                                    System.out.println("Exame (nome)");
                                    nome = sc.next();
                                    //so lanca as notas se for docentes responsavel. assim tem a certeza q tem a disciplina
                                    
                                    for (int i =0;i<dei.exames.size();i++){
                                        for (int k = 0; k<dei.disciplinas.size();k++){
                                            if(dei.exames.get(i).getDocenteResponsavel().getNr() == numero){
                                                if(dei.exames.get(i).getTipoDeExame().equals(tipoDeExame) && dei.exames.get(i).getDisciplina().getNome().equals(nome)){
                                                    dei.lancarNotas(dei.exames.get(i));
                                                    break;
                                                }
                                            
                                            }
                                       
                                        }
                                        
                                    }

                                    break;
                                case 4://TESTADO A FUNCIONAR
                                    //listar vigilancias
                                    System.out.println("\nInsira o seu numero mecanografico: ");
                                    numero = sc.nextInt();
                                    for(int i=0;i<dei.docentes.size();i++){
                                        if(dei.docentes.get(i).getNr() == numero){
                                            dei.docentes.get(i).listarExamesEnvol();
                                        }
                                    }
                                    break;
                                case 5:
                                    //listar classificaçoes DOS ALUNOS NUM EXAME
                                    do{
                                        System.out.println("\nExame(nome): ");
                                        nome = sc.next();
                                    }while(!nome.matches("[a-zA-Z]+"));
                                    
                                    System.out.println("Exame(tipo): ");
                                    tipoDeExame = sc.next();
                                    String tiposs="Normal Recurso Especial";
                                    do{
                                        System.out.println("Tipo: ");
                                        tipoDeExame = sc.next();
                                    }while(!tipoDeExame.matches("[a-zA-Z]+") || !tiposs.contains(tipoDeExame));
                                    for(int i=0;i<dei.exames.size();i++){
                                        if(dei.exames.get(i).getDisciplina().getNome().equals(nome)&& dei.exames.get(i).getTipoDeExame().equals(tipoDeExame)){
                                            dei.exames.get(i).listarAlunosEClassi();
                                        }
                                    }
                                    break;
                                case 6:
                                    break;
                                case 7://listar disciplinas do docente
                                    System.out.println("\nInsira o seu numero mecanografico: ");
                                    while(!sc.hasNextInt()){
                                        sc.next();
                                        System.out.println("Insira novamente: ");
                                    }
                                     numero = sc.nextInt();
                                     int c=0;
                                    for(int i=0;i<dei.docentes.size();i++){
                                        
                                        if(dei.docentes.get(i).getNr() != numero){
                                            c++;
                                        }
                                        else{                                           
                                            dei.docentes.get(i).listarDisciplinas();
                                            c=0;                                            
                                            break;
                                        }
                                             
                                        
                                    }
                                    if(c!=0)
                                    {
                                        System.out.println("Este docente nao existe!");
                                    }
                                    
                                    break;
                                case 8:
                                    keepRunning2 = false;
                                    break;
                                
                                
                            }
                     }
                     break;
                     
                 case 2://NAO DOCENTE
                     boolean keepRunning3 = true;
                     while(keepRunning3){
                        do{
                            menuNaoDocente();

                            while(!sc.hasNextInt()){
                            System.out.println("Opcao Invalida");
                            System.out.println("Tente novamente: ");
                            sc.next();
                            }
                        opcao3 = sc.nextInt();
                        }while(opcao3<1 || opcao3>3);
                        switch(opcao3){
                            case 1:

                                //listar vigilancias
                                System.out.println("\nInsira o seu numero mecanografico: ");
                                while(!sc.hasNextInt()){
                                        sc.next();
                                        System.out.println("Insira novamente: ");
                                    }
                                numero = sc.nextInt();
                                int k=0;
                                for(int i=0;i<dei.naoDoc.size();i++){
                                    if(dei.naoDoc.get(i).getNr() == numero){
                                        dei.naoDoc.get(i).listarExamesEnvol();
                                        k=0;
                                        break;
                                    }
                                    else
                                        k++;
                                        
                                }
                                if(k!=0)
                                {
                                    System.out.println("Numero nao existe");
                                }
                                break;
                            case 2:
                                //voltar
                                //System.out.println("volta ao menu!");
                                keepRunning3 = false;
                                break;
                            
                        }
                     }
                     break;
                 case 3: //ALUNOS
                     boolean keepRunning4 = true;
                     while(keepRunning4){
                        do{
                            menuAluno();

                            while(!sc.hasNextInt()){
                            System.out.println("Opcao Invalida");
                            System.out.println("Tente novamente: ");
                            sc.next();
                            }
                        opcao4 = sc.nextInt();
                        }while(opcao4<1 || opcao4>8);
                        switch(opcao4){
                            case 1:
                                //inscrever em exame
                                 System.out.println("\n****Inscriçao em exame******");
                                System.out.println("\nNumero de aluno: ");
                                while(!sc.hasNextInt()){
                                        sc.next();
                                        System.out.println("Insira novamente: ");
                                    }numero = sc.nextInt();
                                
                                System.out.println("Tipo de Exame(normal,recurso,especial): ");
                                tipoDeExame = sc.next();
                                String tipos="Normal Recurso Especial";
                                    
                                    while(!tipos.contains(tipoDeExame))
                                    {
                                        System.out.println("Tipo inválido! Tente novamente...");
                                        
                                        tipoDeExame = sc.next();
                                        
                                        
                                    }
                                    
                                 System.out.println("Disciplina: ");
                                    do{//imprime duas vezes
                                   
                                    disciplina = sc.nextLine();
                                    }while(dei.confirmarDisciplina(disciplina)==0);
                                
                                dei.increverAluno(numero, tipoDeExame, disciplina);
                                
                                
                                break;
                            case 2:
                                //listar inscricao em exame
                                System.out.println("\nNumero de aluno: ");
                                while(!sc.hasNextInt()){
                                        sc.next();
                                        System.out.println("Insira novamente: ");
                                    }
                                numero = sc.nextInt();
                                int m=0;
                                for(int i=0; i<dei.alunos.size();i++){
                                    if(dei.alunos.get(i).getNrAluno() == numero){
                                        dei.alunos.get(i).listarExames();//exames inscritos
                                        m=0;
                                        break;
                                    }
                                    else
                                        m++;
                                        
                                }
                                if(m!=0)
                                {
                                    System.out.println("Aluno nao existe");
                                }
                                break;
                            case 3:
                                //listar classificaçoes em exame
                                System.out.println("\nNumero de aluno: ");
                                while(!sc.hasNextInt()){
                                        sc.next();
                                        System.out.println("Insira novamente: ");
                                    }
                                numero = sc.nextInt();
                                int j=0;
                                for(int i=0; i<dei.alunos.size();i++){
                                    if(dei.alunos.get(i).getNrAluno() == numero){
                                        dei.alunos.get(i).listarAlunoNotas();
                                        j=0;
                                        break;
                                    }
                                    else
                                        j++;
                                        
                                }
                                if(j!=0)
                                {
                                    System.out.println("Aluno nao existe");
                                }
                                break;
                            case 4:
                                //LISTAR alunos inscritos no exame
                                System.out.println("Nome da disciplina ");
                                nome = sc.next();
                                System.out.println("Tipo: ");
                                tipoDeExame = sc.next();
                                for (int i = 0; i<dei.exames.size();i++){
                                    if(dei.exames.get(i).getTipoDeExame().equals(tipoDeExame) && dei.exames.get(i).getDisciplina().getNome().equals(nome)){
                                        
                                        dei.exames.get(i).listarAlunosInscritos();
                                    }
                                    else{
                                        continue;
                                    }
                                }
                                break;
                            case 5:
                                //DESINSCREVER EM EXAMES
                                System.out.println("\nNumero de Aluno:");
                                while(!sc.hasNextInt()){
                                        sc.next();
                                        System.out.println("Insira novamente: ");
                                    }
                                numero = sc.nextInt();
                                System.out.println("Tipo de exame: ");
                                tipoDeExame = sc.next();
                                String tiposx="Normal Recurso Especial";
                                    
                                    while(!tiposx.contains(tipoDeExame))
                                    {
                                        System.out.println("Tipo inválido! Tente novamente...");
                                        
                                        tipoDeExame = sc.next();
                                        
                                        
                                    }
                                    System.out.println("Disciplina: ");
                                do{//imprime duas vezes
                                        
                                        nome = sc.nextLine();
                                    }while(dei.confirmarDisciplina(nome)==0);

                                dei.desinscreverAlunoExame(numero, tipoDeExame, nome);
                                break;
                            case 6:
                                //listar disciplinas
                                System.out.println("\nNumero de aluno: ");
                                while(!sc.hasNextInt()){
                                        sc.next();
                                        System.out.println("Insira novamente: ");
                                    }
                                numero = sc.nextInt();
                                int f=0;
                                for(int i=0; i<dei.alunos.size();i++){
                                    if(dei.alunos.get(i).getNrAluno() == numero){
                                        dei.alunos.get(i).listarDisciplinas();
                                        f=0;
                                        break;
                                    }
                                    else
                                        f++;
                                }
                                if(f!=0)
                                {
                                   System.out.println("Aluno nao existe");

                                }
                                break;
                            case 7://INSCREVER UM ALUNO NUMA DISCIPLINA
                                System.out.println("\nNumero de aluno: ");
                                while(!sc.hasNextInt()){
                                        sc.next();
                                        System.out.println("Insira novamente: ");
                                    }numero = sc.nextInt();
                                System.out.println("Disciplina: ");
                                do{//imprime duas vezes
                                    
                                    disciplina = sc.nextLine();
                                    }while(dei.confirmarDisciplina(disciplina)==0);
                                int x=0;
                                for(int i=0; i<dei.alunos.size();i++){
                                    if(dei.alunos.get(i).getNrAluno() == numero){
                                        dei.inscreverDisciplina(numero, disciplina);
                                        x=0;
                                        break;
                                    }
                                    else
                                        x++;
                                }
                                if(x!=0)
                                {
                                   System.out.println("Aluno nao existe");

                                }
                                
                                
                                break;
                            case 8:
                                //voltar
                                //System.out.println("volta ao menu!");
                                keepRunning4 = false;
                                break;
                            
                        }
                     }
                     break;
                 case 4: //SECRETARIA
                     boolean keepRunning5 = true;
                     while (keepRunning5){
                        do{
                            menuSecretaria();

                            while(!sc.hasNextInt()){
                            System.out.println("Opcao Invalida");
                            System.out.println("Tente novamente: ");
                            sc.next();
                            }
                        opcao5 = sc.nextInt();
                        }while(opcao5<1 || opcao5>10);
                        switch(opcao5){

                            case 1:
                                //listar docentes
                                System.out.println("\n*Docentes do Departamento*\n");
                                dei.listarDocentes();
                                break;
                            case 2:
                                //listar nao docentes
                                System.out.println("\n/Nao Docentes do Departamento*\n");
                                dei.listarNaoDocentes();
                                break;
                            case 3:
                                //listar alunos
                                System.out.println("\n*Alunos do Departamento*\n");
                                dei.listarAlunos();
                                break;
                            case 4:
                                //listar exames
                                System.out.println("\n*Exames*\n");
                                dei.listarExames();
                                System.out.println("\nSalas\n");
                                dei.listarSalas();
                                break;
                            case 5:
                                //listar disciplinas
                                System.out.println("\n*Disciplinas*\n");
                                dei.listarDisciplinas();
                                break;
                                
                            case 6:
                                //criar docente
                                String email,categoria,area;
                                do{
                                    System.out.println("Nome: ");
                                    nome = sc.next();
                                }while(!nome.matches("[a-zA-Z]+"));
                                
                                System.out.println("Email: ");
                                email = sc.next();
                                    
                                System.out.println("Numero: ");
                                while(!sc.hasNextInt()){
                                        sc.next();
                                        System.out.println("Insira novamente: ");
                                    }
                                numero = sc.nextInt();
                                do{
                                    System.out.println("Categoria: ");
                                    categoria = sc.next();
                                }while(!categoria.matches("[a-zA-Z]+"));
                                do{
                                    System.out.println("Area: ");
                                    area = sc.next();
                                }while(!area.matches("[a-zA-Z]+"));
                                
                                dei.criarDocente(nome,email, numero,categoria,area);
                                break;
                            case 7:
                                //criar nao docente
                                
                                do{
                                    System.out.println("Nome: ");
                                    nome = sc.next();
                                }while(!nome.matches("[a-zA-Z]+"));
                                
                                System.out.println("Email: ");
                                email = sc.next();
                                
                                System.out.println("Numero: ");
                                while(!sc.hasNextInt()){
                                        sc.next();
                                        System.out.println("Insira novamente: ");
                                    }
                                numero = sc.nextInt();
                                
                                do{
                                    System.out.println("Categoria: ");
                                    categoria = sc.next();
                                }while(!categoria.matches("[a-zA-Z]+"));
                                
                                do{
                                    System.out.println("Area: ");
                                    area = sc.next();
                                }while(!area.matches("[a-zA-Z]+"));
                                
                                dei.criarNaoDocente(nome,email, numero,categoria, area);
                                break;
                            case 8:
                                //criar aluno
                                
                                String r;
                                do{
                                    System.out.println("Nome: ");
                                    nome = sc.next();
                                }while(!nome.matches("[a-zA-Z]+"));
                                System.out.println("Email: ");
                                email = sc.next();
                                    
                                System.out.println("Numero: ");
                                while(!sc.hasNextInt()){
                                        sc.next();
                                        System.out.println("Insira novamente: ");
                                    }
                                numero = sc.nextInt();
                                
                                String curso;
                                do{
                                    System.out.println("Curso: ");
                                    curso = sc.next();
                                    }while(!curso.matches("[a-zA-Z]+"));

                                System.out.println("Ano de Matricula: ");
                                while(!sc.hasNextInt()){
                                        sc.next();
                                        System.out.println("Insira novamente: ");
                                    }
                                int ano = sc.nextInt();
                                
                                do{
                                    System.out.println("Regime: ");
                                    r = sc.next();
                                    }while(!r.matches("[a-zA-Z]+"));
                                
                                dei.criarAlunos(nome, email, numero, curso, ano, r);
                                break;
                            case 9:
                                //cirar disciplina
                                System.out.println("Disciplina: ");
                                do{//imprime duas vezes
                                    
                                    disciplina = sc.next();
                                    }while(dei.confirmarDisciplina(disciplina)==1);//flag 1 -> existe
                              
                                    System.out.println("Docente Responsavel(numero): ");
                                    while(!sc.hasNextInt()){
                                        sc.next();
                                        System.out.println("Insira novamente: ");
                                    }
                                    numero = sc.nextInt();
                                int l=0;
                                for(int i =0;i<dei.docentes.size();i++){
                                    if(dei.docentes.get(i).getNr() == numero){
                                        dei.criarDisciplina(disciplina,dei.docentes.get(i));
                                        l=0;
                                        break;
                                    }
                                    else
                                        l++;
                                }
                                if(l!=0)
                                {
                                    System.out.println("Docente Responsavel nao existe");
                                }

                                break;
                            
                            case 10:
                                //voltar
                               // System.out.println("volta ao menu!");
                                keepRunning5 = false;
                                break;   
                        }
                     }
                     break;
                 case 5://SAIR
                     System.out.println("Programa Terminado!");
                     keepRunning = false;
                     System.exit(0);
                     
                     break;

            }
        }
       
      
        
    }
    
    
    
    
    
   
   
    
    
}
