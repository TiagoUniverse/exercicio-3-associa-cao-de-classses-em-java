import java.util.Scanner;

public class Program {
   public static void main(String[] args) {
    
     CadastrarTurma();

     /*
    CadastrarProfessor();

    CadastrarAluno();

    */
/*
    System.out.println("Turma de "+turma1.disciplina+" cadastrada!");
*/
   }
   public static void CadastrarTurma(){
    String analise;
    int analiseValida = 0;
    Scanner sc = new Scanner(System.in);

    Turma turma1 = new Turma();
    System.out.println("Bem vindo ao cadastro de turma!");
    System.out.println("Informe o título da turma: ");
    turma1.disciplina= sc.nextLine();
    System.out.println("Informe o bloco da turma: ");
    turma1.bloco= sc.nextLine();
    System.out.println("Informe o número da turma: ");
    turma1.numeroTurma= Integer.parseInt(sc.nextLine()); 
    System.out.println(" Informe o número da Sala: ");
    turma1.numeroDaSala= Integer.parseInt(sc.nextLine()); 
    
    do{
    System.out.println("Por fim, esta turma já está disponível? ");
    //Verificação do usuário caso ele diga sim ou não
      analise = sc.next();
      if(analise.equals("Sim") || analise.equals("sim") || analise.equals("Si") || analise.equals("si")|| analise.equals("Yes") || analise.equals("yes") || analise.equals("True") || analise.equals("true") ){
       // Se a análiseValida for igual a 1, então o usuário digitou corretamente
        analiseValida = 1;
        turma1.disponivel = true;  // || = ou
      } else if(analise.equals("Nao") || analise.equals("nao") || analise.equals("Não") || analise.equals("não")  ||  analise.equals("No") || analise.equals("no") || analise.equals("False") || analise.equals("false") || analise.equals("NÆo")){
        analiseValida = 1;
        turma1.disponivel = false;
      } else{
        System.out.println("Informação inválida! Por favor, digite novamente: ");
      }
    }while(analiseValida == 0);

    System.out.println("Turma "+turma1.disciplina+" cadastrada!");   
    
    sc.close();
  }
/*
    Turma turma1 = new Turma();
turma1.bloco = 1;
turma1.disciplina = "codigo";
turma1.disponivel = true;
turma1.numeroDaSala = 1;
turma1.numeroTurma = 2; 
*/



public static void CadastrarProfessor(){
  Scanner sc = new Scanner(System.in);

  Professor prof1 = new Professor();
  System.out.println("Bem vindo ao cadastro de professores!");
  System.out.println("Informe o nome do professor: ");
  prof1.nome= sc.nextLine();
  System.out.println("Informe a sua chapa: ");
  prof1.chapa= sc.nextLine();
  System.out.println("Informe o cpf: ");
  prof1.cpf= (sc.nextLine()); 
  System.out.println(" Informe o número da identidade: ");
  prof1.identidade= (sc.nextLine()); 
  System.out.println(" Qual o sexo do professor? ");
  prof1.sexo= (sc.nextLine()); 
  System.out.println("Por fim, qual é a turma deste professor? ");
  prof1.turma = sc.nextLine();

  System.out.println("Professor "+prof1.nome+" da turma "+prof1.turma+" cadastrado!");    
  sc.close();
/*
    Professor Raomi = new Professor();
    Raomi.nome = "Raomi";
    Raomi.chapa = "12";
    Raomi.cpf = "123456789";
    Raomi.identidade = "1234567";
    Raomi.sexo = "Masculino";
    Raomi.turma = turma1.disciplina;
*/
  }
  public static void CadastrarAluno(){
    Scanner sc = new Scanner(System.in);

    Aluno aluno1 = new Aluno();
    System.out.println("Bem vindo à matrícula de alunos!");
    System.out.println("Informe o nome do aluno: ");
    aluno1.nome= sc.nextLine();
    System.out.println("Informe o cpf: ");
    aluno1.cpf= sc.nextLine();
    System.out.println("Informe o número da identidade: ");
    aluno1.identidade= (sc.nextLine()); 
    System.out.println(" Informe a matrícula: ");
    aluno1.matricula= (sc.nextLine()); 
    System.out.println(" Qual o sexo do aluno? ");
    aluno1.sexo= (sc.nextLine()); 
    System.out.println("Por fim, qual é o curso deste aluno? ");
    aluno1.curso = sc.nextLine();
  
    System.out.println("Aluno "+aluno1.nome+" do curso "+aluno1.curso+" cadastrado!"); 
    sc.close();    
  
    /*
    Aluno Tiago = new Aluno();
    Tiago.cpf = "9876543221";
    Tiago.curso = Raomi.turma;
    Tiago.identidade = "1239449";
    Tiago.matricula = "12929";
    Tiago.nome = "Tiago";
    Tiago.sexo = "Masculino";
    */
  }

}
