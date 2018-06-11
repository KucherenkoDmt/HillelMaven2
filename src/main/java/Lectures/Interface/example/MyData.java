package Lectures.Interface.example;

public interface MyData {

    default void print(String str) {
        if (!isNull(str))
            System.out.println("Класс MyData. Печатаем строку: " + str);
    }

    static boolean isNull(String str) {
        System.out.println("Статический метод проверки на null");
        return str == null ? true : "".equals(str) ? true : false;
    }

}
