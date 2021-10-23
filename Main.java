import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
      double moto1 = 2; //moto1 recebendo valor fixo por entrega
      double moto2 = 2; //moto2 recebendo valor fixo por entrega
      double moto3 = 2; //moto3 recebendo valor fixo por entrega
      double moto4 = 2; //moto4 recebendo valor fixo por entrega
      double moto5 = 3; //moto5 recebendo valor fixo por entrega
      double loja1 = 150; //valor total dos 3 pedidos da Loja 1 
      double loja2 = 200; //valor total dos 4 pedidos da Loja 2 
      double loja3 = 200; //valor total dos 3 pedidos da Loja 3
      double p5 = 0.05; //comissão de 5% do valor do pedido
      double p15= 0.15; //comissão de 15% do valor do pedido
      int n;

      
      moto1 += loja2 * p5; //atende todas as lojas
      moto2 += loja3 *p15; // atende todas as lojas
      moto4 += loja1 * p5; //atende apenas loja1, tem prioridade
      
      Scanner ler = new Scanner(System.in); 
      System.out.printf("Informe o codigo do motoboy: "); //solicita informação na tela
      n = ler.nextInt();
      
      
      switch( n ) //case de escolha conforme valor informado
{
        case 1: //caso escolhido motoboy 1
            System.out.println("Moto 1 terá 3 pedidos da loja 2  e receberá o total de R$"+moto1);
            break;
    
        case 2: //caso escolhido motoboy 2
            System.out.println("Moto 2 terá 3 pedidos da loja 3  e receberá o total de R$"+moto2);
            break;
    
        case 3: //caso escolhido motoboy 3
            System.out.println("Moto 3 não terá pedidos");
            break;
            
        case 4: //caso escolhido motoboy 4
            System.out.println("Moto 4 terá 3 pedidos da loja 1  e receberá o total de R$"+moto4);
            break;
            
        case 5: //caso escolhido motoboy 5
            System.out.println("Moto 5 não terá pedidos");
            break;
    
    
        default: //caso não seja informado nenhum motoboy, exibira todas as informações
            System.out.println("Moto 1 terá 3 pedidos da loja 2  e receberá o total de R$"+moto1);
            System.out.println("Moto 2 terá 3 pedidos da loja 3  e receberá o total de R$"+moto2);
            System.out.println("Moto 3 não terá pedidos");
            System.out.println("Moto 4 terá 3 pedidos da loja 1  e receberá o total de R$"+moto4);
            System.out.println("Moto 5 não terá pedidos");
}


    }
}