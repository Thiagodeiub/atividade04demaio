import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Produtos produto = new Produtos();
        Scanner scan = new Scanner(System.in);
        System.out.println("digite o nome do produto");
        produto.nomedoproduto = scan.nextLine();
        System.out.println("digite o preço de venda");
        produto.precodevenda = scan.nextFloat();
        System.out.println("digite a quantidade no estoque");
        produto.quantidadedeestoque = scan.nextInt();

        System.out.println("Produto: " + produto.nomedoproduto + " o preço de venda é: R$" + produto.precodevenda + " No estoque tem: "+produto.quantidadedeestoque+ " unidades.");
    }
}
