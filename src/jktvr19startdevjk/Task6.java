/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktvr19startdevjk;

import java.util.Random;

/**
 *
 * @author Juri
 */
public class Task6 {
    public void run(){
        System.out.println("----- Задача 6 ------");
        System.out.println("Создаем ДВУХМЕРНЫЙ ЗУБЧАТЫЙ массив  из 10х(5,6,7,8,9..15) ячеек типа int, \nзаполняем его случайными числами и выводим \nего значения в цикле");
        int myArr[][] = new int[10][];
        Random random = new Random(); 
        int n =5;/**forms the number of array in arraj[i] **/
        for (int i=0; i<myArr.length; i++){/**forms the number of array in myArr[i] from 6 to 10 **/
            myArr[i] = new int[n];
            if (n>16){
                break;
            }
            n++;
        }
        
        for (int i = 0;i< myArr.length;i++) {
            for (int j = 0; j < myArr[i].length; j++) {
                myArr[i][j] = random.nextInt(10)+1;
                System.out.print("  " + myArr[i][j]);
            }
            System.out.println();
        }
        
        System.out.println("----- конец задачи 6 ------");
    }
}
/*https://javarush.ru/quests/lectures/questsyntaxpro.level05.lecture05*/
/*for (int i  = 0; i < array.length; i++){
           for (int j = 0; j < array[i].length; j++){
               array[i][j] = random.nextInt(10)+1;
               System.out.print("  "+array[i][j]);
               */