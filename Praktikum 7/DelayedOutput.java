/*
 Nama : Ricky Wijaya
 NIM : 18222043
 Praktikum 7
 */

/**
 * DelayedOutput.java 
 * Kelas ini berguna untuk menampilkan sebuah output namun diberikan delay selama delayMilisec
 * @author 18222043 Ricky Wijaya
 */
public class DelayedOutput{
  public static void printDelayed(int delayMillisec, String output) {
        Thread thd = new Thread(new Runnable() {
            @Override
            public void run(){
                try{
                    Thread.sleep(delayMillisec);
                    System.out.println(output);
                }
                catch (InterruptedException e){}
            }
        });
        thd.start();
  }
} 
