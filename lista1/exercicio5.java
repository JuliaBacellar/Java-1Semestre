//ver a quantidade média de um produto no estoque,quantidade atual,quantidade máxima e quantidade mínima
//e com base nisso ver se pode ser feita uma compra nova ou não 

//ler valores de entrada atual,maxima e mínima do estoque
//calcular a quantidade média -> quantidade_média = quant_max + quant_min /2 
//comparar a quantidade atual com a quant_media se quant_atual for maior ou igual a quant_media mostra "nao efetuar compra"
//caso contrário imprimir "efetuar compra"


package lista1;

import java.util.Scanner;


public class exercicio5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); //sempre que for ler dados do usuario precisa criar a classe scanner,não precisa criar mais que uma vez

        //os valores atuais maximo e minimo
        System.out.print("digite aqui a quantidade atual em estoque:");
        int quantidade_atual = scanner.nextInt(); //fala o tipo da variavel e cria a variavel para armazenar o valor qu o usuario colocar,o método nativo do scanner para esperar o su

}
