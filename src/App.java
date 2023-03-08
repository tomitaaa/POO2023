public class App {
    public static void main(String[] args) throws Exception {
       int contagem = 0;
       Carro fiat147 = new Carro(); // instanciando e dando a cor cinza pro carro
       fiat147.cor = "cinza";


       Anunciante dono = new Anunciante();
       dono.nome_anun = "tchola";  // instanciando o anunciante e dando um nome para ele
       System.out.println(dono.nome_anun);


       Anunciante teste = new Anunciante();
       teste.nome_anun = "nome teste"; // instanciando o anunciante teste e dando um nome para ele
      System.out.println(teste.nome_anun);
    }
}
