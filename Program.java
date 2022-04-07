import java.util.Scanner;

public class Program {

  // Objeto Professor e Turma de forma GLOBAL
  static Professor prof1 = new Professor();
  static Turma turma1 = new Turma();
  static Aluno aluno1 = new Aluno();

  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    /*Objeto Professor e Turma de forma LOCAL
    // Professor prof1 = new Professor();
    // Turma turma1 = new Turma();
*/
    CadastrarProfessorTurma();

    System.out.println("Dados do professor: " + prof1.imprimir());

    CadastrarAluno();

    System.out.println("Dados do aluno: "+ aluno1.imprimir() );  
    /* CadastrarTurma();

    /*
     * CadastrarProfessor();
     * 
     * CadastrarAluno();
     * 
     */
    /*
     * System.out.println("Turma de "+turma1.disciplina+" cadastrada!");
     */

    entrada.close();
  }
  

  public static void CadastrarProfessorTurma() {
    Scanner sc = new Scanner(System.in);
    // Dados Professor
    // Professor prof1 = new Professor();
    System.out.println("Bem vindo ao cadastro de professores!");
    System.out.println("1ª - Informe o nome do professor: ");
    prof1.nome = sc.nextLine();
    System.out.println("2ª - Informe a sua chapa: ");
    prof1.chapa = sc.nextLine();
    System.out.println("3ª - Informe o cpf: ");
    prof1.cpf = sc.nextLine();
    System.out.println("4ª - Informe o número da identidade: ");
    prof1.identidade = sc.nextLine();
    System.out.println("5ª -  Qual o sexo do professor? (masculino || feminino)");
    prof1.sexo = sc.nextLine();

    // System.out.println("Professor " + prof1.nome + " da turma " + prof1.turma + "
    // cadastrado!");

    // Cadastro da turma do professor

    // Atributos
    String analise;
    int analiseValida = 0;

    // Turma turma1 = new Turma();
    System.out.println("\n Bem vindo ao cadastro de turma!");
    System.out.println("1ª- Informe o título da turma: ");
    turma1.disciplina = sc.nextLine();
    System.out.println("2ª- Informe o bloco da turma: ");
    turma1.bloco = sc.nextLine();

    // Verificação se as informações foram digitadas corretamente
    // Resetando as variáveis de validação, visto que elas serão reutilizadas
    analise = "";
    analiseValida = 0;
    do {
      System.out.println("3ª- Informe o número da turma: ");
      analise = sc.nextLine();
      // Verificação se a resposta do usuário é número
      if (!analise.matches("[0-9]+")) {
        analiseValida = 0;
        System.out.println();
        System.out.println("Número inválido. Por favor, digite apenas um número: ");
      } else {
        // O sistema entra no else quando as informações estão corretas
        analiseValida = 1;
        turma1.numeroTurma = Integer.parseInt(analise);
        // System.out.println(turma1.numeroTurma);
      }
    } while (analiseValida == 0);

    analise = "";
    analiseValida = 0;
    do {
      System.out.println("4ª- Informe o número da sala: ");
      analise = sc.nextLine();
      // Verificação se a resposta do usuário é número
      if (!analise.matches("[0-9]+")) {
        analiseValida = 0;
        System.out.println();
        System.out.println("Número inválido. Por favor, digite apenas um número: ");
      } else {
        // O sistema entra no else quando as informações estão corretas
        analiseValida = 1;
        turma1.numeroDaSala = Integer.parseInt(analise);
        System.out.println(turma1.numeroDaSala);
      }
    } while (analiseValida == 0);

    analise = "";
    analiseValida = 0;
    do {
      System.out.println("5ª- Por fim, esta turma já está disponível? (Sim / Nao)");
      // Verificação do usuário caso ele diga sim ou não
      analise = sc.next();
      if (analise.equals("Sim") || analise.equals("sim") || analise.equals("Si") || analise.equals("si")
          || analise.equals("Yes") || analise.equals("yes") || analise.equals("True") || analise.equals("true")) {
        // Se a análiseValida for igual a 1, então o usuário digitou corretamente
        analiseValida = 1;
        turma1.disponivel = true; // || = ou
      } else if (analise.equals("Nao") || analise.equals("nao") || analise.equals("Não") || analise.equals("não")
          || analise.equals("No") || analise.equals("no") || analise.equals("False") || analise.equals("false")
          || analise.equals("NÆo")) {
        analiseValida = 1;
        turma1.disponivel = false;
      } else {
        System.out.println();
        System.out.println("Informação inválida! Por favor, digite novamente: ");
      }
    } while (analiseValida == 0);

    System.out.println("Turma " + turma1.disciplina + " cadastrada!");

    sc.close();
    // Associação entre Professor e Turma
    prof1.setTurmaProf(turma1);

    // System.out.println("\n Dados do professor: " + prof1.imprimir());

  }
  // Cadastrar Turma
  /*
   * public static void CadastrarTurma() {
   * // Atributos
   * String analise;
   * int analiseValida = 0;
   * Scanner sc = new Scanner(System.in);
   * 
   * Turma turma1 = new Turma();
   * System.out.println("Bem vindo ao cadastro de turma!");
   * System.out.println("1ª- Informe o título da turma: ");
   * turma1.disciplina = sc.nextLine();
   * System.out.println("2ª- Informe o bloco da turma: ");
   * turma1.bloco = sc.nextLine();
   * 
   * // Verificação se as informações foram digitadas corretamente
   * // Resetando as variáveis de validação, visto que elas serão reutilizadas
   * analise = "";
   * analiseValida = 0;
   * do {
   * System.out.println("3ª- Informe o número da turma: ");
   * analise = sc.nextLine();
   * // Verificação se a resposta do usuário é número
   * if (!analise.matches("[0-9]+")) {
   * analiseValida = 0;
   * System.out.println();
   * System.out.println("Número inválido. Por favor, digite apenas um número: ");
   * } else {
   * // O sistema entra no else quando as informações estão corretas
   * analiseValida = 1;
   * turma1.numeroTurma = Integer.parseInt(analise);
   * System.out.println(turma1.numeroTurma);
   * }
   * } while (analiseValida == 0);
   * 
   * analise = "";
   * analiseValida = 0;
   * do {
   * System.out.println("4ª- Informe o número da sala: ");
   * analise = sc.nextLine();
   * // Verificação se a resposta do usuário é número
   * if (!analise.matches("[0-9]+")) {
   * analiseValida = 0;
   * System.out.println();
   * System.out.println("Número inválido. Por favor, digite apenas um número: ");
   * } else {
   * // O sistema entra no else quando as informações estão corretas
   * analiseValida = 1;
   * turma1.numeroDaSala = Integer.parseInt(analise);
   * System.out.println(turma1.numeroDaSala);
   * }
   * } while (analiseValida == 0);
   * 
   * analise = "";
   * analiseValida = 0;
   * do {
   * System.out.println("5ª- Por fim, esta turma já está disponível? (Sim / Nao)"
   * );
   * // Verificação do usuário caso ele diga sim ou não
   * analise = sc.next();
   * if (analise.equals("Sim") || analise.equals("sim") || analise.equals("Si") ||
   * analise.equals("si")
   * || analise.equals("Yes") || analise.equals("yes") || analise.equals("True")
   * || analise.equals("true")) {
   * // Se a análiseValida for igual a 1, então o usuário digitou corretamente
   * analiseValida = 1;
   * turma1.disponivel = true; // || = ou
   * } else if (analise.equals("Nao") || analise.equals("nao") ||
   * analise.equals("Não") || analise.equals("não")
   * || analise.equals("No") || analise.equals("no") || analise.equals("False") ||
   * analise.equals("false")
   * || analise.equals("NÆo")) {
   * analiseValida = 1;
   * turma1.disponivel = false;
   * } else {
   * System.out.println();
   * System.out.println("Informação inválida! Por favor, digite novamente: ");
   * }
   * } while (analiseValida == 0);
   * 
   * System.out.println("Turma " + turma1.disciplina + " cadastrada!");
   * 
   * sc.close();
   * 
   * /*
   * Turma turma1 = new Turma();
   * turma1.bloco = 1;
   * turma1.disciplina = "codigo";
   * turma1.disponivel = true;
   * turma1.numeroDaSala = 1;
   * turma1.numeroTurma = 2;
   * 
   * }
   */

  // Cadastrar Professor
  /*
   * public static void CadastrarProfessor() {
   * Scanner sc = new Scanner(System.in);
   * 
   * Professor prof1 = new Professor();
   * System.out.println("Bem vindo ao cadastro de professores!");
   * System.out.println("1ª - Informe o nome do professor: ");
   * prof1.nome = sc.nextLine();
   * System.out.println("2ª - Informe a sua chapa: ");
   * prof1.chapa = sc.nextLine();
   * System.out.println("3ª - Informe o cpf: ");
   * prof1.cpf = sc.nextLine();
   * System.out.println("4ª - Informe o número da identidade: ");
   * prof1.identidade = sc.nextLine();
   * System.out.println("5ª -  Qual o sexo do professor? (masculino || feminino) "
   * );
   * prof1.sexo = sc.nextLine();
   * 
   * // Falta acrescentarr a sessão de turma no professor
   * 
   * /*
   * System.out.println("Por fim, qual é a turma deste professor? ");
   * prof1.turma = sc.nextLine();
   * 
   * System.out.println("Professor " + prof1.nome + " da turma " + prof1.turma +
   * " cadastrado!");
   */
  /*
   * 
   * sc.close();
   * /*
   * Professor Raomi = new Professor();
   * Raomi.nome = "Raomi";
   * Raomi.chapa = "12";
   * Raomi.cpf = "123456789";
   * Raomi.identidade = "1234567";
   * Raomi.sexo = "Masculino";
   * Raomi.turma = turma1.disciplina;
   * 
   * }
   */
  // CadastrarAluno
  
    public static void CadastrarAluno() {
    Scanner sc = new Scanner(System.in);
    
    //atributos
    String analise;
    int analiseValida;

    //Aluno aluno1 = new Aluno();
    System.out.println("Bem vindo à matrícula de alunos!");
    System.out.println("1ª- Informe o nome do aluno: ");
    aluno1.nome = sc.nextLine();
    System.out.println("2ª- Informe o cpf: ");
    aluno1.cpf = sc.nextLine();
    System.out.println("3ª- Informe o número da identidade: ");
    aluno1.identidade = (sc.nextLine());
    System.out.println("4ª- Informe a matrícula: ");
    aluno1.matricula = (sc.nextLine());
    System.out.println("5ª- Qual o sexo do aluno? (masculino || feminino) ");
    aluno1.sexo = (sc.nextLine());
    System.out.println("6ª- Por fim, o curso deste aluno é o: " +turma1.getDisciplina());
    
    //resetando 
    analise ="";
    analiseValida = 0;
    do {
      System.out.println("5ª- Por fim, esta turma já está disponível? (Sim / Nao)");
      // Verificação do usuário caso ele diga sim ou não
      analise = sc.next();
      if (analise.equals("Sim") || analise.equals("sim") || analise.equals("Si") || analise.equals("si")
          || analise.equals("Yes") || analise.equals("yes") || analise.equals("True") || analise.equals("true")) {
        // Se a análiseValida for igual a 1, então o usuário digitou corretamente
        analiseValida = 1;
        aluno1.curso = turma1.getDisciplina(); // || = ou
      } else if (analise.equals("Nao") || analise.equals("nao") || analise.equals("Não") || analise.equals("não")
          || analise.equals("No") || analise.equals("no") || analise.equals("False") || analise.equals("false")
          || analise.equals("NÆo")) {
        analiseValida = 1;
            System.out.println("Que pena que não está participando do curso. Então nos informe o seu curso:");
            aluno1.curso = sc.nextLine();
      } else {
        System.out.println();
        System.out.println("Informação inválida! Por favor, digite novamente: ");
      }
    } while (analiseValida == 0);

  //  System.out.println("Aluno " + aluno1.nome + " do curso " + aluno1.curso +" cadastrado!");
    sc.close();
    
    /*
   * Aluno Tiago = new Aluno();
   * Tiago.cpf = "9876543221";
   * Tiago.curso = Raomi.turma;
   * Tiago.identidade = "1239449";
   * Tiago.matricula = "12929";
   * Tiago.nome = "Tiago";
   * Tiago.sexo = "Masculino";
   * 
   * }
   */
    }
    //Método Experimental SimOuNao
    /*
public static boolean simOuNao(){
    String analise;
    int analiseValida = 0;
    Scanner sc = new Scanner(System.in);
  do {
      // Verificação do usuário caso ele diga sim ou não
      analise = sc.next();
      if (analise.equals("Sim") || analise.equals("sim") || analise.equals("Si") || analise.equals("si")
          || analise.equals("Yes") || analise.equals("yes") || analise.equals("True") || analise.equals("true")) {
        // Se a análiseValida for igual a 1, então o usuário digitou corretamente
        analiseValida = 1;
        return true;
        break; // || = ou
      } else if (analise.equals("Nao") || analise.equals("nao") || analise.equals("Não") || analise.equals("não")
          || analise.equals("No") || analise.equals("no") || analise.equals("False") || analise.equals("false")
          || analise.equals("NÆo")) {
        analiseValida = 1;
        return false;
      } else {
        System.out.println();
        System.out.println("Informação inválida! Por favor, digite novamente: ");
      }
    } while (analiseValida == 0);
      
}
  */
 

  }
