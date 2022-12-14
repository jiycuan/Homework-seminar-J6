/*

Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. 
Критерии фильтрации можно хранить в Map. Например:
“Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет …
Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class market {

    public static void main(String[] args) {

        Notebook n1 = new Notebook();
        n1.name_model = "Он красненький";
        n1.OS = "Windows";
        n1.CPU = 4.3;
        n1.RAM = 8;
        n1.VC = 2;
        n1.HDD = 500;
        n1.color = "Red";
        n1.price = 30000;

        Notebook n2 = new Notebook();
        n2.name_model = "Зелёный, спокойный, совсем не отстойный";
        n2.OS = "Linux";
        n2.CPU = 6.3;
        n2.RAM = 16;
        n2.VC = 4;
        n2.HDD = 700;
        n2.color = "Green";
        n2.price = 60000;

        Notebook n3 = new Notebook();
        n3.name_model = "Синий, дерзкий, как пуля резкий";
        n3.OS = "MacOS";
        n3.CPU = 7.2;
        n3.RAM = 16;
        n3.VC = 16;
        n3.HDD = 900;
        n3.color = "Blue";
        n3.price = 180000;

        Notebook n4 = new Notebook();
        n4.name_model = "Это вовсе не потому что он чёрный";
        n4.OS = "Unix";
        n4.CPU = 10.2;
        n4.RAM = 32;
        n4.VC = 32;
        n4.HDD = 950;
        n4.color = "Black";
        n4.price = 1000000;

        List<Notebook> notebooks = new ArrayList<Notebook>(Arrays.asList(n1, n2, n3, n4));

        Notebook user_n = new Notebook();
        Scanner in = new Scanner(System.in);
        System.out.println("Укажите минимальные характеристики искомого ноутбука.");
        System.out.println("Тактовая частота процессора (в гигагерцах, с точностью до десятой доли): ");
        user_n.CPU = (double) in.nextInt();
        System.out.println("Объём оперативной пямяти: ");
        user_n.RAM = in.nextInt();
        System.out.println("Объём пямяти видеокарты: ");
        user_n.VC = in.nextInt();
        System.out.println("Объём жесткого диска: ");
        user_n.HDD = in.nextInt();
        in.close();

        for (int i = 0; i < notebooks.size(); i++) {
            if (notebooks.get(i).equals(user_n)) {
                notebooks.get(i).info();
                System.out.println();
            }
        }
    }
}