public class parallel implements Runnable{



    int max_thread;
    int n;
    int t;
    float ran[];
    public parallel(int n,int t,float ran[]){
        int max_thread = (n+1)/2;
        this.n = n;
        this.t = t;
        this.ran = ran;
    }
//    Thread myThreads[] = new Thread[max_thread];

    @Override
    public void run() {
        if((t+1<n) && ran[t] >ran[t+1]){
            float temp = ran[t];
            ran[t] = ran[t+1];
            ran[t+1] = temp;
        }
    }

    public static void loop(int n,float ran[]) throws InterruptedException {
        int i;
        int max_thread = (n+1)/2;
        Thread myThreads[] = new Thread[max_thread];
        for(i=1;i<=n;i++){
            if(i%2 ==1){
                for(int j=0;j<max_thread;j++){
                    parallel thread = new parallel(n,2*j,ran);
                    myThreads[j] = new Thread(thread);
                    myThreads[j].start();
                }
                for(int j=0;j<max_thread;j++){
                    myThreads[j].join();
                }
            }
            else{
                for(int j=0;j<max_thread;j++){
                    parallel thread = new parallel(n,2*j+1,ran);
                    myThreads[j] = new Thread(thread);
                    myThreads[j].start();
                }
                for(int j=0;j<max_thread;j++){
                    myThreads[j].join();
                }
            }
        }
    }

}
