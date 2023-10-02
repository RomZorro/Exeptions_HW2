import Task.Method1;
import Task.FirstCodeToFix;
import Task.SecondCodeToFix;
import Task.Method3;

public class Main {
    public static void main(String[] args) {

//  задача 1:
        Method1 m1 = new Method1();
        m1.method();
//  задача 2.1:
        new FirstCodeToFix();
//  задача 2.2:
        new SecondCodeToFix();
//  задача 3:
        Method3 m3 = new Method3();
        m3.method();
    }
}
