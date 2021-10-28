
package com.mycompany.poop6ide;

/**
 *
 * @author brandon
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Clase empaquetada desde el IDE");
        System.out.println("La suma es: " + suma(2,2));
        System.out.println("Nueva Linea");
    }
    /**
     * Retorna una adicion de dos enteros 
     * @param a numero entero
     * @param b numero entero
     * @return la suma de a y b
     */
    public static int suma(int a, int b){
        return a+b;
    }
}
