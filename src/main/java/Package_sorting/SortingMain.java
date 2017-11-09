package Package_sorting;

import java.io.*;

/**
 * Класс - точка входа в программу
 */

public class SortingMain {

    private static int arrayLength; // размер массива

    public static void main(String[] args) throws IOException {

        System.out.println("Программа сортирует массив из чисел. Применяются 3 вида сортировки - вставками, выбором и пузырьком.");
        System.out.print("Будут созданы 3 разных массива, каждый из них будет заполнен случайными числами от 0 до 100. Для продолжения введите размер массива > ");
        String entered_capacity; // введенная пользователем строка

        // Организовываем считывание емкости массива от пользователя
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (boolean flag = false; flag == false; ) {
            entered_capacity = reader.readLine();
            try {
                arrayLength = Integer.parseInt(entered_capacity);
                flag = true;
            } catch (Exception e) {
                System.out.println("Введены некорректные данные! Размерность массива должна быть целым числом");
                System.out.print("Введите размер массива > ");
            }
        }

        System.out.println();

        // Создаем экземпляры классов для сортировки и вызываем у каждого из них метод сортировки
        ArraySortingInsertion as1 = new ArraySortingInsertion(arrayLength);
        as1.sort();
        ArraySortingSelection as2 = new ArraySortingSelection(arrayLength);
        as2.sort();
        ArraySortingBubble as3 = new ArraySortingBubble(arrayLength);
        as3.sort();

    }

}
