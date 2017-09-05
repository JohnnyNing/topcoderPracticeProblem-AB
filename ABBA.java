import org.jetbrains.annotations.NotNull;

public class ABBA {
    private static boolean isPossible;
    private static int num = 0;
    private static StringBuilder sb;

    public static void main(String[] args) {
        System.out.print(canObtain("A", "BB"));

    }

    @NotNull
    public static String canObtain(String initial, String target) {
        int move = target.length() - initial.length();

        sb = new StringBuilder(target);

        while (move > 0) {
            trimString(sb);
            move--;
        }
        if (num == 0) {
            isPossible = sb.toString().equals(initial);

        } else {

            isPossible = sb.reverse().toString().equals(initial);
        }

        return isPossible ? "Possible" : "Impossible";
    }

    private static void trimString(StringBuilder sb) {
        switch (num) {
            case 0:
                if (sb.charAt(sb.length() - 1) == 'A') {
                    sb.deleteCharAt(sb.length() - 1);
                    num = 0;

                } else {
                    sb.deleteCharAt(sb.length() - 1);
                    num = 1;
                }
                break;
            case 1:
                if (sb.charAt(0) == 'A') {
                    sb.deleteCharAt(0);
                    num = 1;
                } else {
                    sb.deleteCharAt(0);
                    num = 0;
                }
                break;
        }
    }


}
