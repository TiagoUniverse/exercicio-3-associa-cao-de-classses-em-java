import java.util.Scanner;

public class Program {
   public static void main(String[] args) {
    
      CadastrarTurma();

    /*
    Professor Raomi = new Professor();
    Raomi.nome = "Raomi";
    Raomi.chapa = "12";
    Raomi.cpf = "123456789";
    Raomi.identidade = "1234567";
    Raomi.sexo = "Masculino";
    Raomi.turma = turma1.disciplina;


    Aluno Tiago = new Aluno();
    Tiago.cpf = "9876543221";
    Tiago.curso = Raomi.turma;
    Tiago.identidade = "1239449";
    Tiago.matricula = "12929";
    Tiago.nome = "Tiago";
    Tiago.sexo = "Masculino";

    System.out.println("Turma de "+turma1.disciplina+" cadastrada!");
*/
   }

   public static void CadastrarTurma(){
      String nome1;
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
      System.out.println("Por fim, esta turma já está disponível? ");
      turma1.disponivel = sc.nextBoolean();

      System.out.println("Turma "+turma1.disciplina+" cadastrada!");
      
  /*
      Turma turma1 = new Turma();
  turma1.bloco = 1;
  turma1.disciplina = "codigo";
  turma1.disponivel = true;
  turma1.numeroDaSala = 1;
  turma1.numeroTurma = 2; 
  */

  }

  
}
