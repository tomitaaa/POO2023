package br.ifpr.aula.construtores;

public class Pessoa {
    String nome;
    String idade;
    int dtNasc;

    public Pessoa(){
        dtNasc = 1979;
    }

    public Pessoa(String nome){
        this();
        this.nome = nome;
        this.log();

  }
    public void log(){
        System.out.println(nome);
        System.out.println(idade);
        System.out.println(dtNasc);

    }
}
