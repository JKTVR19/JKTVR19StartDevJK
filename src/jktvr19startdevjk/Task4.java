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
public class Task4 {
    public void run(){
        System.out.println("----- Задача 4 ------");
        System.out.println("Создаем одномерный массив  из 10 ячеек типа int, \nзаполняем его случайными ЧЕТНЫМИ числами и выводим \nего значения в цикле");
        int myArr[] =new int[10] ;/**/
        Random random = new Random();
        int i = 0;
       
        int maxArr =0;
        for(int j =0 ; j < myArr.length; j++){
            while (true){ 
                int rondomNamber = random.nextInt(10);
                if (rondomNamber % 2 == 0){
                    myArr[i]= rondomNamber;
                    break;
                } 
            }    
            System.out.printf("%5d", myArr[i]);
        }
        System.out.println("\n----- конец задачи 4 ------");
    

}
}
