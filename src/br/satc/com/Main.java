
package br.satc.com;

import java.util.Scanner;

/**
 *
 * @author Edutec
 */

/* Criar um software que calcule a quantidade de impostos pagos em um produto.
O programa irá pedir o valor do imposto e se foi fabricado no Brasil. Para 
produtos nacionais com valor menor de 1000,00 paga-se 10% do valor em impostos.
Para produtos nacionais com valor maior ou igual a 1000, paga-se 15% de impostos.
Para produtos importados, paga-se 50% do valor em impostos. Após o cálculo, 
mostrar o valor do produto sem imposto e o valor do imposto a ser pago. */

public class Main {

    public static void main(String[] args) { 
        Scanner entrada = new Scanner(System.in);
        float valorp;
        System.out.println("Qual o valor do produto?");
        valorp = entrada.nextFloat();
        System.out.println("O produto é nacional? (sim ou nao)");
        String produto = entrada.next();
        
        if ((produto.equals("sim")) && (valorp<1000)) {
            System.out.println("O valor do produto é:" +valorp+ " e o valor do"
                    + "imposto é" +(valorp*0.10)); }
        
        else if ((produto.equals("sim")) && (valorp>1000)) {
            System.out.println("O valor do produto é:" +valorp+ " e o valor do"
                    + "imposto é:" +(valorp*0.15)); } 
 
        else if (produto.equals("nao")){ 
            System.out.println("O valor do produto é:" +valorp+ " e o valor do"
                    + "imposto é:" +(valorp*0.5));
        }
            
        
    
        
             
            
        
        
   
        
        
        
        
        
        
             
                
                
        }
    }
    

