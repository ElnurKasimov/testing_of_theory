package SoftServe.Sprint7.Practice.Task3;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class Interactor {
    int x;
    //private Object lock = new Object();
    public synchronized void serve(UnaryOperator<Integer> uo, int initializer)throws InterruptedException{
        System.out.println("Serving thread running");
            System.out.println("Serving thread initializes the key");
            x = uo.apply(initializer);
            System.out.println("key = " + x);
            wait();
            System.out.println("Serving thread resumed");
    }
    public synchronized void consume(BinaryOperator<Integer> bo, int operand2)throws InterruptedException{
            wait(3000);
            System.out.println("Consuming thread received the key. key = " + x);
            x = bo.apply(x, operand2);
            System.out.println("Consuming thread changed the key. key = " + x);
            System.out.println("");
            notify();
    }
}
