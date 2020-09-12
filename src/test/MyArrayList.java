package test;

public class MyArrayList {
    //Вывести на экран, переопределить метод to String
    private final Object[] arrayList = new Object[10];
    private int count = 0;

    // метод для добавления данных в конец массива
    public void add(Object object) {
        for (int i = 0; i < arrayList.length; i++) {
            fullnessArray(arrayList);
            addingInArray(object);
        }
    }

    // метод для добавления данных в любую часть массива
    public void add(int index, Object object) {
        if (index >= arrayList.length) {
            Object[] fooArray = new Object[arrayList.length + index];
            System.arraycopy(fooArray, 0, arrayList, 0, arrayList.length);
            for (int i = 0; i < fooArray.length; i++) {
                if (i == index) {
                    fooArray[i] = object;
                    count++;
                }
            }
        } else {
            Object[] fooArrayAfterIndex = new Object[arrayList.length - index];
            Object[] fooArrayBeforeIndex = arrayDivision(index);
            /*
             * Создать метод, принимающий на вход массив какой-то и ту длину, которую надо получить*/
            Object[] newArray = new Object[arrayList.length + index];
            System.arraycopy(arrayList, index, fooArrayAfterIndex, 0, arrayList.length - index);
            System.arraycopy(arrayList, 0, fooArrayBeforeIndex, 0, index);
            if (newArray.length >= 0) System.arraycopy(fooArrayBeforeIndex, 0, newArray, 0, fooArrayBeforeIndex.length);
            newArray[fooArrayBeforeIndex.length + 1] = object;
            System.arraycopy(fooArrayAfterIndex, fooArrayBeforeIndex.length + 1, newArray, fooArrayBeforeIndex.length, newArray.length - fooArrayBeforeIndex.length);
            count++;
        }
    }

    //!!!!!! метод поиска элемента массива глянуть и разобраться, почему на входе индекс, на выходе объект?
    public Object get(int index) {
        for (int i = 0; i < arrayList.length; i++) {
            if (i == index) {
                return arrayList[i];
            }
        }
        return -1;
    }

    //метод вывода на экран длины массива
    public int size() {
        return arrayList.length;
    }

    //добавление данных в массив *служебный метод
    private void addingInArray(Object object) {
        for (int i = 0; i < arrayList.length; i++) {
            arrayList[i] = object;
            count++;
        }
    }

    //проверка на заполненность массива *служебный метод
    private Object[] fullnessArray(Object[] array) {
        Object[] fooArray = new Object[array.length + 10]; // расширенный массив данных куда копируем закончившейся массив
        if (count == array.length) {
            System.arraycopy(array, 0, fooArray, 0, array.length);
            return fooArray;
        }
        return array;
    }

    //разделение массива на необходиую длину *служебный метод
    private Object[] arrayDivision(int length) {
         Object[] newArray = new Object[length];
         return newArray;
    }
}

