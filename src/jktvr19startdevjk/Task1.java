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
class Task1 {
    public void run(){
        System.out.println("----- Задача 1 ------");
        System.out.println("Введите число градусов по Цельсию: ");
        
        // решение задачи
        String insertTempCels;
        float TC, TF;
        
        Scanner scanner = new Scanner(System.in);/*считываем с входящего потока*/
        insertTempCels = scanner.nextLine();
        
        TC = Integer.parseInt(insertTempCels);
        
        TF = TC * 9/5 + 32;
        
        System.out.println("\n Введённая температура в градусах Цельсия: " + TC);
        System.out.println("По Фарингейту это будет: "+ TF);
        System.out.println("----- конец задачи 1 ------");
    }
}
