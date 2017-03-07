    class Multi extends Thread{  

    public void run(){  
    System.out.println("thread is running...");  
    }

    Handler h = new Handler(){
    @Override
    public void handleMessage(Message msg){
        if(msg.what == 0){
           System.out.println("thread is running...");  
        }else{
            showErrorDialog();
        }
    }
};

Thread t = new Thread() {
    @Override
    public void run(){
        doSomeWork();
        if(succeed){
            //we can't update the UI from here so we'll signal our handler and it will do it for us.
            h.sendEmptyMessage(0);
        }else{
            h.sendEmptyMessage(1);
        }
    }   
};  

    public static void main(String args[]){  
    	Multi t1=new Multi();  
    	t1.start();  
     }

    }  

