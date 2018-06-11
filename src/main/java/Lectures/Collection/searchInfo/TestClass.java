package Lectures.Collection.searchInfo;

import org.testng.annotations.Test;

import java.util.Objects;

public class TestClass {
   private int a ;
   private int b ;

    public TestClass(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public static void main(String[] args) {
        TestClass t = new TestClass(1,2);
        TestClass q = new TestClass(1,2);
        System.out.println(t.hashCode());
        System.out.println(q.hashCode());
        System.out.println();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestClass testClass = (TestClass) o;
        return a == testClass.a &&
                b == testClass.b;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }

    @Test
    public void dsfTest() {

    }
}

class DemoBlackBox {
    public static void main(String[] args) {
        TestClass a = new TestClass(5,10);
        TestClass b = new TestClass(5,10);
    }
}