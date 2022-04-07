public class Aluno {
    public String nome;
    public String sexo;
    public String matricula;
    public String cpf;
    public String identidade;
    public String curso;


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

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
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

    public String getCurso() {
        return this.curso;
    }

    public void setCurso(String curso) {
		this.curso = curso;
	}
    
    public String imprimir(){
        return "Nome: " +nome+ ",\n sexo: " +sexo+ ",\n Nª da matricula: " +matricula+ ",\n cpf:" +cpf+ ",\n Nª da identidade: " +identidade+ ", \n Curso: " +curso;
    }



    /*
        public String nome;
    public String sexo;
    public String matricula;
    public String cpf;
    public String identidade;
    public String curso;
    */
}