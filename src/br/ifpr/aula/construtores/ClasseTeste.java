package br.ifpr.aula.construtores;
import java.util.Scanner;

public class ClasseTeste {
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);   
      int a, b, c = 0;


      System.out.println("Informe o primeiro valor");
      a = entrada.nextInt();
      System.out.println("Informe o segundo valor");
      b = entrada.nextInt();
      System.out.println("Informe o terceiro valor");
      c = entrada.nextInt();
    
      double media /*variavel media, criada agora pra chamar o metodo, ja que o metodo vai vir um double  */ = media(a,b,c); //essa é a função
      imprimir(media);
      
      
    }
    static double media(int a, int b, int c){ //função = possui retorno

        int soma = a + b + c;
        double media = soma/3;

        return media; 
    }
    static void imprimir(double media){ //procedimento = nao possui retorno, por isso é void
        System.out.println("sua média é: " + media);
    }
}
