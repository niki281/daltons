/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.daltons;

import java.util.Scanner;

/**
 *
 * @author nicke
 */
public class Daltons {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de datos a introducir: ");
        int cantidad = sc.nextInt();

       
        int[] datos = new int[cantidad];

       
        System.out.println("Ingrese los numeros uno por uno:");
        for (int i = 0; i < cantidad; i++) {
            datos[i] = sc.nextInt();
        }

        
        boolean daltonas = true;
        boolean daltondes = true;
        boolean desconocidos = true;

        for (int i = 1; i < cantidad; i++) {
            if (datos[i] > datos[i - 1]) {
                daltondes = false;
                
            } else if (datos[i] < datos[i - 1]) {
                daltonas = false;
                
            } else {
                desconocidos = false;
            }
        }

        
        if (daltonas) {
            System.out.println("Son dalton");
            
        } else if (daltondes) {
            System.out.println("Son dalton");
            
        } else if (desconocidos) {
            System.out.println("Son desconocidos");
            
        } else {
            System.out.println("Los datos no son correctos");
        }

        
        
    }
}
