import java.time.Duration;
import java.time.Instant;


public class Main {
        public static void main(String[] args) throws InterruptedException {
        int num_of_students[] = {1, 10, 100, 1000, 10000};
       // int num_of_students[] = {1,10,100};
        for (int i = 0; i < num_of_students.length; i++) {
            float ran[] = new float[num_of_students[i]];
            float tan[] = new float[num_of_students[i]];
            for(int j=0;j<num_of_students[i];j++){
                float a = (float) (Math.random()*10);
                ran[j] = a;
                tan[j] = a;
            }
            long start1 = System.currentTimeMillis();
            nonparallel.oddEvenSort(ran,num_of_students[i]);
            long end1 = System.currentTimeMillis();

            long start2 = System.currentTimeMillis();
            parallel.loop(num_of_students[i],tan);
            long end2 = System.currentTimeMillis();

            System.out.println("Non-parallel:  " + (end1 - start1) + "ms");
            System.out.println("Parallel:  " + (end2 - start2) + "ms");
            System.out.println("");

        }



    }
}

