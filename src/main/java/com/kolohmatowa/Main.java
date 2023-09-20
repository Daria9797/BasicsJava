package com.kolohmatowa;

public class Main {
    public static void main(String[] args)
    {   //1) поупражняться с математическими и логическими операторами
        int a=230;
        int b=50;
        byte s=127;
        short c=-32768;
        long d=2000;
        double l=0.008090;
        float w=0.008090f;
        System.out.println("a+b="+(a+b));
        System.out.println("a-b="+(a-b));
        System.out.println("a*b="+(a*b));
        System.out.println("a/d="+(a/d));
        System.out.println("a%d="+(a%d));
        System.out.println("a++="+(a++));
        System.out.println("a++="+(++a));

        if ((a>100)&&(c>0))
        {
            System.out.println("Сумма="+(a+b));
        }
        else {
            System.out.println("Разность="+(a-b));//выведет разность,так как второе условие не выполнилось
        }

        if ((a>100)||(c>0))
        {
            System.out.println("Сумма="+(a+b));//выведет сумму ,так как одно из условий выполнилось
        }
        else {
            System.out.println("Разность="+(a-b));
        }

        //добиться переполнения при вычислениях, посмотреть результаты (вывести в консоль)
        System.out.println("Пример переполнения1 (s+1)"+(s+1));
        System.out.println("Пример переполнения2 (c-1)="+(c-1));

        //2) попробовать вычисления комбинаций типов данных (int и double)

        System.out.println("a/l="+(a/l));
        System.out.println("a/w="+(a/w));
        System.out.println("d*w="+(d*w));
    }
}