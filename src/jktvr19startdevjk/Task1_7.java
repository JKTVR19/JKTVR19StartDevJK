/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktvr19startdevjk;

import java.util.Scanner;

/**
 *
 * @author Juri
 */
class Task1_7 {
    private Scanner scanner = new Scanner(System.in);

    public void run(){
        System.out.println("Выберите задачу: ");
        String task = scanner.nextLine();
        switch (task) {
            case "1":
                System.out.println("Вы выбрали: ");
                System.out.println("----- Задача 1 ------");
                System.out.println("Введите число градусов по Цельсию: ");
                String insertTempCels = scanner.nextLine();
                System.out.println("По Фарингейту это будет: "+ this.task1(insertTempCels));
                System.out.println("----- конец задачи 1 ------");
                break;
           case "2":
                System.out.println("----- Задача 2 ------");
                System.out.println("Загадано число от 5 до 10: ");
                System.out.println("Введите число: ");
                int min = 0;
                int max = 10;
                /*int numberGuess = (int)(Math.random()*max);*/
                
                String numberGuess = Integer.toString((int) (Math.random()*max));
                System.out.println("Отгадай: "+numberGuess);/*отладка*/
                /*String numberGuess = Integer.valueOf(numberGuess0);*/
                
                System.out.println(this.task2(numberGuess));
                System.out.println("----- конец задачи 2 ------");
                
                break;
             /*case "3":
                System.out.println("Вы выбрали: ");
                System.out.println("3. заменить искомую строку на указанную");
                System.out.println("Результат: "+ this.replaceString(str));
                break;
            case "4":
                System.out.println("Вы выбрали: ");
                System.out.println("4. удалить все теги html из строки");*/
                /*<html><head><title>Hello</title></head>This text<body></body></head>*/
                /*System.out.println("результат: "+this.deleteTeg(str));
                break;
            case "5":
                System.out.println("Вы выбрали: ");
                System.out.println("5. удалить указанный тэг из строки");
                System.out.println("\nРезультат: \n"+deleteOneTeg(str));
                break;
            default:
                System.out.println("Нет такой задачи.");;*/
        }
        System.out.println("=== конец программы ===");
}



        private int task1 (String insertTempCels){
        float TC, TF;
        TC = Integer.parseInt(insertTempCels); 
        TF = TC * 9/5 + 32; 
        System.out.println("\n Введённая температура в градусах Цельсия: " + TC);
                return Math.round(TF);

        }
        private String task2 (String numberGuess){
        String numberOrder = scanner.nextLine();
        String result;

        if(!/*отладка*/numberOrder.equals(numberGuess) ){
            result = "Ты проиграл";
            System.out.println(result);
        }else{
            result = "Ты выиграл";
            System.out.println(result);
        }
            System.out.println("numberOrder: "+numberOrder);/*отладка*/
            System.out.println("numberGuess: "+numberGuess);/*отладка*/
            System.out.println("numberOrder.equals(numberGuess): "+numberOrder.equals(numberGuess));/*отладка*/
                
                return result;

        }
}