/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

/**
 *
 * @author VALENTINAHANNECKERLO
 */
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double numero1;
        double numero2;
        
        System.out.println("Digite o primeiro numero: ");
        numero1 = entrada.nextDouble();
        
        System.out.println("Digite o segundo numero: ");
        numero2 = entrada.nextDouble();
        
        System.out.println("Soma: " + (numero1 + numero2));
        System.out.println("Subtracao: " + (numero1 - numero2));
        System.out.println("Multiplicacao: " + (numero1 * numero2));
        System.out.println("Divisao: " + (numero1 / numero2));
    }
    
}
