import java.sql.SQLOutput;

class MyThreadRunnable1 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <= 50; i++) {
            System.out.println("I am Batman");
        }
    }
}
class MyThreadRunnable2 implements Runnable{
    @Override
    public void run() {
        for (int j =0;j<=50;j++) {
            System.out.println("Hahahaha I am Joker");
        }
    }
}
public class ThreadEx2 {
    public static void main(String[] args) {
        MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
        Thread gun1 = new Thread(bullet1);
        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread gun2 = new Thread(bullet2);
        gun1.start();
        gun2.start();
    }
}
