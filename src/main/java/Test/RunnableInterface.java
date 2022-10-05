package main.java.Test;

public class RunnableInterface {

    public static void main(String[] args){
        Thread t = new Thread(()-> {

            for (int i = 0; i < 2; i++) {
                System.out.println("CHILD THREAD");
            }
        }
                );
        t.start();
        for(int i=0;i<10;i++)
        {
            System.out.println("MAIN THREAD");
        }
    }

}
