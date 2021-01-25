import java.util.ArrayList;
import java.util.List;
import java.io.FileFilter;

public class lc {
    //ArrayList<Integer> list = new ArrayList<Integer>();

    Runnable runnable = () -> new Runnable() {
        @Override
        public void run() {
            System.out.println("this is runnable");
        }
    };

    public void fun1()
    {
        int a, b, c;
        System.out.println("fun1");
    }
    int a = 1;
    public static void main(String[] args){
        System.out.println("hahaha");
        System.out.println("hehehe");
        FileFilter java = f -> f.getName().endsWith(".java");
        System.out.println("this is lc01.java");
    }
}