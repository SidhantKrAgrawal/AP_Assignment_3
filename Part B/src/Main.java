import java.util.Collections;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

//        Math.random()*(max-min+1)+min
        int num_of_students[] = {10, 1000, 1000000};
//        int num_of_students[] = {10};
        for (int i = 0; i < num_of_students.length; i++) {
            double ran[] = new double[num_of_students[i]];
            TreeSet t = new TreeSet();
            for (int j = 0; j < num_of_students[i]; j++) {
                long max = 1000000000;
                long min = -1000000000;
                double a = (double) Math.random()*(max-min+1)+min;
                ran[j] = a;
                t.add(ran[j]);
            }

        }
    }
}