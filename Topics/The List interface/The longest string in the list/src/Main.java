import java.util.*;

public class Main {

    static void changeList(List<String> list) {
        // write your code here
        int longest = Integer.MIN_VALUE;
        String willInsert = null;

        for (String s : list) {
            if (s.length() >= longest) {
                longest = s.length();
                willInsert = s;
            }
        }

        for (int i = 0; i < list.size(); i++) {
            list.set(i, willInsert);
        }
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        List<String> lst = Arrays.asList(s.split(" "));
        changeList(lst);
        lst.forEach(e -> System.out.print(e + " "));
    }
}