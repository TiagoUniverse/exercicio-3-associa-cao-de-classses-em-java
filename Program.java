import java.util.Scanner;

public class Program {
   public static void main(String[] args) {
    
     CadastrarTurma();

    CadastrarProfessor();

/*
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


}
