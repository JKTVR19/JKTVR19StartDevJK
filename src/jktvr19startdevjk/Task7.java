/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktvr19startdevjk;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class Task7 {
    public void run(){
        System.out.println("----- Задача 7 ------");
        Scanner scanner = new Scanner(System.in);/*считываем с входящего потока*/
        
        System.out.println("Введите строку");
        String str = scanner.nextLine();
        // посчитайте сколько раз в строке встречается введенная вами буква
        System.out.println("Введите букву: ");
        String letter = scanner.nextLine();
        
        int n = 0;
        
        while (str.indexOf(letter)<0){
            n++;
        }
        
        
        System.out.println("Буква \""+letter+"\" встречается в тексте "+ n + "раз");
        System.out.println("");
        System.out.println("----- конец задачи 6 ------");
    }
    
}
