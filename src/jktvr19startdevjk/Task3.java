/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktvr19startdevjk;

import java.io.PrintStream;
import java.util.Random;

/**
 *
 * @author pupil
 */
public class Task3 {
    public void run(){
        System.out.println("----- Задача 3 ------");
        System.out.println("Создаем одномерный массив  из 10 ячеек типа int, \nзаполняем его случайными числами и выводим \nего значения в цикле");
        int myArr[] =new int[10] ;/**/
        Random n = new Random();
        int sumArr = 0;
        int minArr = 0;
        int maxArr =0;
        
        for(int j =0 ; j < myArr.length; j++){
            myArr[j] = n.nextInt(10);
            sumArr = sumArr + myArr[j];
            System.out.printf("%5d", myArr[j]);
            
            if (myArr[j] > maxArr){
                maxArr = myArr[j];
            }
            if (myArr[j] < minArr){
                minArr = myArr[j];
            }
             
        }
        System.out.println("\nСумма всех чисел массива: "+sumArr);
        System.out.println("min = "+minArr);
        System.out.println("max = "+maxArr);
        System.out.println("----- конец задачи 3 ------");
    }
}
