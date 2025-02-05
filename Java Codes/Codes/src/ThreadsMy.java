
import java.util.*;
public class ThreadsMy extends Thread {
    public void run()
    {
        for(int i=0;i<=100;i++)
        {
            System.out.println(i);
        }
    }
    public static void main(String[] args)
    {
        ThreadsMy th= new ThreadsMy();
        th.start();
    }
}
