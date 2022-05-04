import java.util.Scanner;
class bhaskara {

    public static void main(String[] args) {

        double d;
        double x1;
        double x2;

         double atributoA;
         double atributoB;
         double atributoC;


        Scanner scan = new Scanner(System.in);

        System.out.println("digite o valor de A");
        atributoA = scan.nextDouble();
        System.out.println("digite o valor de B");
        atributoB = scan.nextDouble();
        System.out.println("digite o valor de C");
        atributoC = scan.nextDouble();




        //b²-4.a.c
        d = Math.pow(atributoB,2)-4*atributoA*atributoC;

        x1=(-atributoB+ Math.sqrt(d))/atributoA*2;
        x2=(-atributoB- Math.sqrt(d))/atributoA*2;
        System.out.println( "O resultado de delta: "+d+". O resultado de x1 é igual a: "+x1+". o resultado de x2 é igual a: "+x2
        );







    }
}
  //  \\Faça um programa que calcule a equação do segundo grau,
    //  \\  crie uma classe equaçao para receber os atributos A, B e C,
    //  \\  e mostre ao final o resultado de delta, x1 e x2