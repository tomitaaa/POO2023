package br.ifpr.aula.construtores;
import java.util.Scanner;

public class Ex1 {
   public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    
    double salario, porcentagem = 0;

    System.out.println("informe o salário"); 
    salario = entrada.nextDouble();
    System.out.println("Informe a porcentagem");
    porcentagem = entrada.nextDouble();
    
    double atualizado = atualiza(salario,porcentagem);
    System.out.println("atualizado: "+atualizado);
   } 
   static double atualiza(double salario, double porcentagem){

    double atualizado = (salario * porcentagem) + salario;


    return atualizado;
   }
}
