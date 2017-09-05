public class Practice {
    //static int N,K,pointer;

    static char[] list;

    public static void main(String[] args) {
        System.out.print(createString(10, 12));
    }

    public static String createString(int N, int K) {

        int count = 0;
        int pointer = N - 1;
        list = new char[N];

        int Kmax = (N / 2) * (N % 2 + N / 2);
        if (Kmax < K) {
            return "";
        }


        if (K > Kmax / 2) {
            int moveCount = Kmax - K;
            for (int i = 0; i < N / 2; i++) {
                list[i] = 'A';
            }
            for (int j = N - 1; j >= N / 2; j--) {
                list[j] = 'B';
            }
            while (moveCount > 0) {
                swap1(list);
                moveCount -= 1;
            }


        } else if (K <= Kmax / 2) {
            int moveCount = K;

            for (int i = 0; i < N / 2; i++) {
                list[i] = 'B';
            }
            for (int j = N - 1; j >= N / 2; j--) {
                list[j] = 'A';
            }
            while (moveCount > 0) {
                swap2(list);
                moveCount -= 1;
            }

        }
        return String.valueOf(list);
    }

    private static void swap1(char[] list) {
        int a = list.length;
        for (int i = 0; i < a - 1; i++) {

            if (list[i] == 'A' && list[i + 1] == 'B') {

                char temp = list[i];
                list[i] = list[i + 1];
                list[i + 1] = temp;
                return;
            }
        }
    }


    private static void swap2(char[] list) {
        int a = list.length;
        for (int i = 0; i < a - 1; i++) {
            if (list[i] == 'B' && list[i + 1] == 'A') {
                char temp = list[i];
                list[i] = list[i + 1];
                list[i + 1] = temp;

                return;
            }
        }
    }

}





















