/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.minimo;

/**
 *
 * @author Armando
 */
public class Minimo {

    public static void main(String[] args) {

        int[] numeros = {6, 5, -9999, 10, 2, -10, 6};

        System.out.println("Minimo de [6, 5, -9999, 10, 2, -10, 6]: " + minimoRecursivo(numeros, 0, numeros[0]));

    }

    public static int minimoRecursivo(int[] numeros, int indice, int min) {

        //Cuando el indice sea igual a la longitud del array, terminaremos la recursividad
        if (indice != numeros.length) {

            //Si el valor actual es menor que el actual, lo llamaremos de forma distinta
            if (numeros[indice] < min) {
                min = minimoRecursivo(numeros, indice + 1, numeros[indice]);
            } else {
                min = minimoRecursivo(numeros, indice + 1, min);
            }

        }

        return min;

    }

}
