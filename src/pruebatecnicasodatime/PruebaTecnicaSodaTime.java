/*
 * 1. Implemente en su IDE Favorito y usando Java como lenguaje de
programación un programada de consola que, dado un número entero,
lleve a cabo las siguientes condiciones:
● Si es impar, imprimir “Quipux”
● Si es par y está en el rango inclusivo de 2 y 5, imprima “No
Quipux”
● Si es par y está en el rango inclusivo de 6 y 20, imprima “Quipux”
● Si es par y es mayor que 20, imprima “No Quipux”
Formato de entrada
Una sola línea que contiene un entero positivo.
Restricciones 1≤ ≤100
Formato de salida
Imprimir “Quipux” o “No Quipux” basado en las
restricciones anteriores
 */

package pruebatecnicasodatime;
import java.util.Scanner;
/**
 *
 * @author Jorge Meléndez
 */
public class PruebaTecnicaSodaTime {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numero;
    do {
      try{
        
        System.out.print("#. Ingrese un numero entero positivo mayor o igual que 1 y menor o igual que 100:\n");
      System.out.print("#. Cero para salir\n");
      numero = scanner.nextInt();
      if (numero >= 1 && numero <= 100) {
      
         // se verifica si el numero es impar   
        if (numero % 2 != 0) {
          System.out.println("Quipux -> es impar");
        } else {
          // Si numero es par
          // se verifica si el numero está en el rango de 2 a 5 (inclusive)
          if (numero >= 2 && numero <= 5) {
            System.out.println("No Quipux -> es par y está en el rango inclusivo de 2 y 5");
          } // se verifica si el numero está en el rango de 6 a 20 (inclusive)
          else if (numero >= 6 && numero <= 20) {
            System.out.println("Quipux -> es par y está en el rango inclusivo de 6 y 20,");
          } // Si el numero es mayor que 20
          else {
            System.out.println("No Quipux -> es par y es mayor que 20");
          }
        }
      } else {
         System.out.println("debe ingresar un numero entre 1 y 100 por lo tanto [ "+ numero + " ] no está en el rango");
      }
      System.out.println("------------------------------------------------");
        
      }catch (Exception e) {
        // Captura la excepción cuando el usuario ingresa un valor no válido como una letra
        System.out.println("Entrada invalida. Debe ingresar un número entero.");
        scanner.nextLine(); // limpio el bufer de entrada
        numero = -1; // Asigna un valor no válido para continuar el DO
      }
      
    } while (numero != 0);

  }
  
}
