/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entradadedados;

/**
 *
 * @author VALENTINAHANNECKERLO
 */
import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o seu nome:");
        
        String nome = entrada.nextLine();
        
        System.out.println("Ola, " + nome);
    }
}
