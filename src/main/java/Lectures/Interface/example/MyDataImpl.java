package Lectures.Interface.example;

public class MyDataImpl implements MyData{

    public boolean isNull(String str) {
        System.out.println("Проверяем на null");
        return str == null ? true : false;
    }

    public static void main(String args[]){
        MyDataImpl obj =  new MyDataImpl();
        obj.print("dgf");
        obj.isNull("abc");
    }
}
