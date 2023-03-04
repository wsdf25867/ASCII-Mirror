import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        String nums = scanner.nextLine();
        int target = scanner.nextInt();
        int min = Integer.MAX_VALUE;
        ArrayList<Integer> numbers = new ArrayList<>();
        for (String s : nums.split(" ")) {
            int temp = Integer.parseInt(s);
            int difference = Math.abs(temp - target);
            min = Math.min(min, difference);
            numbers.add(temp);
        }

        Collections.sort(numbers);
        for (Integer i : numbers) {
            if (Math.abs(i - target) == min) {
                System.out.printf("%d ",i);
            }
        }

    }
}