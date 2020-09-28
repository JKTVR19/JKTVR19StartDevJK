/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktvr19startdevjk;

import java.util.Random;

/**
 *
 * @author pupil
 */
public class Task5 {
    public void run(){
        System.out.println("----- Задача 5 ------");
        System.out.println("Создаем ДВУХМЕРНЫЙ массив  из 10х5 ячеек типа int, \nзаполняем его случайными числами и выводим \nего значения в цикле");
        
        int[][] myArr = new int [10][5];
        Random random = new Random();
        for ( int i = 0; i < 10; i++) {
            for ( int j = 0; j < 5; j++) {
                myArr[i][j] = random.nextInt(10);
                System.out.printf("%5d", myArr[i][j]);
            }
            System.out.println("\n");
        }
        /*System.out.print(myArr[i][j]);*/
        System.out.println("----- конец задачи 5 ------");
    }
}
