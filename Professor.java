public class Professor {
    public String nome;
    public String sexo;
    public String chapa;
    public String cpf;
    public String identidade;

    public Turma turmaProf;


    //default
    public Professor(){
       this.turmaProf  = new Turma();
    }

    public Professor(String nome, String sexo, String chapa, String cpf, String identidade){
       this.nome = nome;
       this.sexo = sexo;
       this.chapa = chapa;
       this.cpf = cpf;
       this.identidade = identidade;
       
       this.turmaProf  = new Turma();
    }

    public Professor(String nome, String sexo, String chapa, String cpf, String identidade, Turma turmaProf){
        this.nome = nome;
        this.sexo = sexo;
        this.chapa = chapa;
        this.cpf = cpf;
        this.identidade = identidade; 
        this.turmaProf = turmaProf;
     }


    //métodos de acesso
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return this.sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getChapa() {
        return this.chapa;
    }

    public void setChapa(String chapa) {
        this.chapa = chapa;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getIdentidade() {
        return this.identidade;
    }

    public void setIdentidade(String identidade) {
        this.identidade = identidade;
    }

    public Turma getTurmaProf() {
        return this.turmaProf;
    }

    public void setTurmaProf(Turma turmaProf) {
        this.turmaProf = turmaProf;
    }

    //impressão dos dados
    public String imprimir (){
        return "Nome: " + nome + "\n sexo: " + sexo + "\n chapa: " + chapa + "\n cpf: " + cpf + "\n Nª da identidade:" + identidade + "\n Turma: " + turmaProf.imprimir(); 
    }

/*
    public String nome;
    public String sexo;
    public String chapa;
    public String cpf;
    public String identidade;

    public Turma turmaProf;

*/
}

