public class nonparallel {
    public static void oddEvenSort(float arr[], int n)
    {
        boolean isSorted = false;
        int flag = 0;
        while (flag == 0) {
            flag = 1;
            float temp = 0;

            for (int i = 0; i <= n - 2; i = i + 2) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    flag = 0;
                }
            }

            for (int i = 1; i <= n - 2; i = i + 2) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    flag = 0;
                }
            }

        }

        return;
    }

}

