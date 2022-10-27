/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package promedio;

import java.util.*;

public class Promedio {

    public static void main(String[] args) {
        String[] nombres = solicitarNombres();
        Double[] notascurso = solicitarNotas();
        Double promedio = calcularPromedio(notascurso);
        System.out.println("el promedio del curso es " + promedio);
        System.out.println("los estudiantes que tienen promedio bajo son:");
        for (int i = 0; i < notascurso.length; i++) {
            String nombre = nombres[i];
            Double nota = notascurso[i];
            if (nota < promedio) {
                System.out.println("el nombre del estudiante " + nombre + " la nota que obtuvo fue " + nota);
            }
        }

    }

    private static Double calcularPromedio(Double[] notas) {
        Double suma = 0.0;
        for (int i = 0; i < notas.length; i++) {
            Double nota = notas[i];
            suma += nota;
        }

        Double promedio = suma / notas.length;
        return promedio;
    }

    private static String[] solicitarNombres() {
        String[] nombres = new String[5];
        Scanner tecla = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el nombres del estudiante ");
            nombres[i] = tecla.next();
        }
        return nombres;
    }

    private static Double[] solicitarNotas() {
        Double[] notas = new Double[5];
        Scanner teclado = new Scanner(System.in);
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Ingrese las notas");
                Double nota = teclado.nextDouble();
                // ciclo while obliga que el usuario ingrese un valor valido
                while (nota > 10 || nota < 1.0) {
                    System.out.println("El valor es incorrecto el valor minimo es 1,0 y el maximo 10,0");
                    System.out.println("Inserte la nota correcta");
                    nota = teclado.nextDouble();
                }
                notas[i] = nota;
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.print("Error, posiblemente datos no validos");
        }
        return notas;
    }
}
