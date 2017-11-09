package Package_sorting;

/**
 * В конструкторе данного абстрактного класса реализуется инициализация массива
 * случайными числами в диапазоне от 0 (включительно) до 100 (не включительно).
 * Абстрактный метод sort() будет реализован в классах-потомках.
 */

public abstract class ArraySorting {

    int[] array;
    abstract void sort();

    // В конструкторе уже заполняем массив
    public ArraySorting(int arrayLength) {
        array = new int[arrayLength];
        for (int i = 0; i < this.array.length; i++)
            array[i] = (int) (Math.random() * 100);
    }

    // Необходимо реализовать также конструктор по умолчанию
    public ArraySorting() {
        for (int i = 0; i < 10; i++)
            array[i] = (int) (Math.random() * 100);
    }
}

/**
 * Класс реализует сортировку массива вставками
 */

class ArraySortingInsertion extends ArraySorting {

    public ArraySortingInsertion(int arrayLength) {
        super(arrayLength);
    }

    @Override
    public void sort() {

        //Вывод неотсортированного массива
        System.out.print("Исходный массив для сортировки вставками: ");
        for (int anArray : this.array) {
            System.out.print(anArray + " ");
        }
        System.out.println();
        System.out.print("Сортировка данного массива чисел вставками: ");

        // Непосредственно сортируем массив вставками
        int temp;
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0 && array[j - 1] > array[j]; j--) {
                temp = array[j - 1];
                array[j - 1] = array[j];
                array[j] = temp;
            }
        }

        // Вывод уже отсортированного массива
        for (int element : array) System.out.print(element + " ");
        System.out.println();
        System.out.println();

    }

}

/**
 * Класс реализует сортировку массива выбором
 */

class ArraySortingSelection extends ArraySorting {

    public ArraySortingSelection(int arrayLength) {
        super(arrayLength);
    }

    @Override
    public void sort() {

        //Вывод неотсортированного массива
        System.out.print("Исходный массив для сортировки выбором: ");
        for (int anArray : array) {
            System.out.print(anArray + " ");
        }
        System.out.println();
        System.out.print("Сортировка данного массива чисел выбором: ");

        // Непосредственно сортируем массив выбором
        for (int i = 0; i < array.length - 1; i++) {
            int least = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[least]) {
                    least = j;
                }
            }
            int tmp = array[i];
            array[i] = array[least];
            array[least] = tmp;
        }

        // Вывод уже отсортированного массива
        for (int element : array) System.out.print(element + " ");
        System.out.println();
        System.out.println();

    }

}

/**
 * Класс реализует сортировку массива пузырьком
 */

class ArraySortingBubble extends ArraySorting {

    public ArraySortingBubble(int arrayLength) {
        super(arrayLength);
    }

    public void sort() {

        //Вывод неотсортированного массива
        System.out.print("Исходный массив для сортировки пузырьком: ");
        for (int anArray : array) {
            System.out.print(anArray + " ");
        }
        System.out.println();
        System.out.print("Сортировка данного массива чисел пузырьком: ");

        // Непосредственно сортируем массив пузырьком
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }

        // Вывод уже отсортированного массива
        for (int element : array) System.out.print(element + " ");
        System.out.println();
        System.out.println();

    }

}



