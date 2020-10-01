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
class App {
    private Scanner scanner = new Scanner(System.in);

    public void run(){
        System.out.println("Выберите задачу: ");
        
//        String task = scanner.nextLine();
        boolean repeat = true;
        do{
            System.out.println("Список задач: ");
            System.out.println("0. Закончить программу");
            System.out.println("1. Введите число градусов по Цельсию: По Фарингейту это будет: ");
            System.out.println("2. Загадано число от 5 до 10: Отгадай:");
            System.out.println("3. Создаем одномерный массив  из 10 ячеек типа int, \\nзаполняем его случайными числами и выводим \\nего значения в цикле");
            System.out.println("4. Создаем одномерный массив  из 10 ячеек типа int, \\nзаполняем его случайными ЧЕТНЫМИ числами и выводим \\nего значения в цикле\"");
            System.out.println("5. Создаем ДВУХМЕРНЫЙ массив  из 10х5 ячеек типа int, \\nзаполняем его случайными числами и выводим \\nего значения в цикле");
            System.out.println("6. Создаем ДВУХМЕРНЫЙ ЗУБЧАТЫЙ массив  из 10х(5,6,7,8,9...15) ячеек типа int, \\nзаполняем его случайными числами и выводим \\nего значения в цикле");
            System.out.println("7. посчитайте сколько раз в строке встречается введенная вами буква");
            System.out.println("---------------------------------------------");
            System.out.println("---------------------------------------------");
            System.out.println("Выберите номер задачи: ");
            String task = scanner.nextLine();
        switch (task) {
            case "0":
                System.out.println("Вы выбрали: ");
                System.out.println("----- Задача 1 ------");
                repeat = false;
                break;
            case "1":
                System.out.println("Вы выбрали: ");
                System.out.println("----- Задача 1 ------");
//                System.out.println("Введите число градусов по Цельсию: ");
//                String insertTempCels = scanner.nextLine();
//                System.out.println("По Фарингейту это будет: "+ this.task1(insertTempCels));
//                System.out.println("----- конец задачи 1 ------");
                Task1 task1= new Task1();
                task1.run();
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
             case "3":
                System.out.println("Вы выбрали: ");
                System.out.println("3. заменить искомую строку на указанную");
                Task3 task3 = new Task3();
                task3.run(); 
                break;
            case "4":
                System.out.println("Вы выбрали: ");
                System.out.println("4. Создаем одномерный массив  из 10 ячеек типа int, \\nзаполняем его случайными ЧЕТНЫМИ числами и выводим \\nего значения в цикле\"");
                Task4 task4 = new Task4();
                task4.run();
                break;
            case "5":
                System.out.println("Вы выбрали: ");
                System.out.println("5. Создаем ДВУХМЕРНЫЙ массив  из 10х5 ячеек типа int, \\nзаполняем его случайными числами и выводим \\nего значения в цикле");
                Task5 task5 = new Task5();
                task5.run();
                break;
             case "6":
                System.out.println("Вы выбрали: ");
                System.out.println("6. Создаем ДВУХМЕРНЫЙ ЗУБЧАТЫЙ массив  из 10х(5,6,7,8,9...15) ячеек типа int, \\nзаполняем его случайными числами и выводим \\nего значения в цикле");
                Task6 task6 = new Task6();
                task6.run();
              case "7":
                System.out.println("Вы выбрали: ");
                System.out.println("7. посчитайте сколько раз в строке встречается введенная вами буква");
                Task7 task7 = new Task7();
                task7.run();
                break;
                
            default:
                System.out.println("Нет такой задачи.");;
        }
        System.out.println("=== конец программы ===");
        }while(repeat);
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