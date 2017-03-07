/*    class TestCallRun1 extends Thread{  
     public void run(){  
       System.out.println("running...");  
     }  
     public static void main(String args[]){  
      TestCallRun1 t1=new TestCallRun1();  
      t1.run();//fine, but does not start a separate call stack  
     }  
    }  
*/
        class TestCallRun1 extends Thread{  
     public void run(){  
      for(int i=1;i<5;i++){  
        try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}  
        System.out.println(i);  
      }  
     }  
     public static void main(String args[]){  
      TestCallRun1 t1=new TestCallRun1();  
      TestCallRun1 t2=new TestCallRun1();  
       
      t1.run();  
      t2.run();  
     }  
    }  