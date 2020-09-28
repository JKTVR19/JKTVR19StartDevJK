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
public class Task2 {
    public void run(){
        System.out.println("----- Задача 2 ------");
        System.out.println("Загадано число от 5 до 10: ");
        int min = 0;
        int max = 10;
        int numberGuess = min + (int)(Math.random()*max);
        
        System.out.println("Отгадай: "+numberGuess);/*отладка*/
        System.out.println("Введите чмсло: ");
        Scanner scanner = new Scanner(System.in);/*считываем с входящего потока*/
        int numberOrder = Integer.parseInt(scanner.nextLine());
        
        if(numberOrder==numberGuess ){
        System.out.println("Ты выиграл");
        }else{
        System.out.println("Ты ты проиграл");
        }
        System.out.println("----- конец задачи 2 ------");
    }
}
