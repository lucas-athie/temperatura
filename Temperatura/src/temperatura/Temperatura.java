
package temperatura;
import java.util.Scanner;


public class Temperatura {

    
    public static void main(String[] args) {
        float temperatura = 0;
        int opcao;
        Scanner entrada = new Scanner(System.in);
        
        
        do {
            // menu feito para escolher qual operação o usuario quer
            System.out.println("Escolha uma das opções de 0 a 2 abaixo");
            System.out.println("1 - transformar de celsius para farenheit");
            System.out.println("2 - transformar de farenheit para celsius");
            System.out.println("0 - sair");
            opcao = entrada.nextInt();
            
            switch (opcao){
                case 1:
                    System.out.println("Digite o valor da temperatura: ");
                    temperatura = entrada.nextFloat();
            
                    //chamando o metodo e ja exibindo ele
                    System.out.println("Sua temperatura em farenheit é de: " + Celsius (temperatura));
                    break;
                    
                case 2:
                    System.out.println("Digite o valor da temperatura: ");
                    temperatura = entrada.nextFloat();
                    
                    //chamando o metodo e ja exibindo ele
                    System.out.println("sua temperatura em celsius é de: " + Farenheit (temperatura));
                    break;
                    
                case 0:
                    opcao = 0;
                    break;
                    
                default: 
                    System.out.println("Número inválido, escolha um número entre 0 e 2");
              
            }
            
         }while(opcao != 0);
        
    }
    // mettodo feito para calcular de celsius para farenheit
    public static float Celsius (float celsius){
        float farenheit = 0;
        
        farenheit = (9*celsius/5) + 32;
    
        return farenheit;
    }
    //metodo feito para calcular de farenheit para celsius
     public static float Farenheit (float farenheit){
         float celsius = 0;
         
         celsius = 5*(farenheit - 32)/9;
    
        return celsius;
    }
}
