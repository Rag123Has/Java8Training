package HomeTask1;

public class TestRunnableJavaEight_4 {
    public static void main(String[] args){
        Thread t = new Thread(()->{
            for(int i=0;i<=10;i++){
                System.out.println(i);
            }
        });

        t.start();
    }
}
