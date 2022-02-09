package com.example.identidade20;

public class Funcionarios {

    private String matricula, nome, DataNascimento, setor, NOMEFUNCAO, estadoCivil, EMAIL, enderecoFoto;

    public Funcionarios() {
    }

    public Funcionarios(String matricula, String nome, String dataNascimento, String setor, String NOMEFUNCAO, String estadoCivil, String EMAIL, String enderecoFoto) {
        this.matricula = matricula;
        this.nome = nome;
        DataNascimento = dataNascimento;
        this.setor = setor;
        this.NOMEFUNCAO = NOMEFUNCAO;
        this.estadoCivil = estadoCivil;
        this.EMAIL = EMAIL;
        this.enderecoFoto = enderecoFoto;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return DataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        DataNascimento = dataNascimento;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getNOMEFUNCAO() {
        return NOMEFUNCAO;
    }

    public void setNOMEFUNCAO(String NOMEFUNCAO) {
        this.NOMEFUNCAO = NOMEFUNCAO;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    public String getEnderecoFoto() {
        return enderecoFoto;
    }

    public void setEnderecoFoto(String enderecoFoto) {
        this.enderecoFoto = enderecoFoto;
    }
}
