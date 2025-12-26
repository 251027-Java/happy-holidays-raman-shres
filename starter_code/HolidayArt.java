import java.util.Random;

public class HolidayArt {

    public static void main(String[] args) {
        int height = 5;

        if (args.length > 0) {
            height = Integer.parseInt(args[0]);
        }

        printTree(height);
    }

    public static void printTree(int height) {
        Random random = new Random();
        
        for (int i = 1; i <= height; i++) {
            int spaces = height - i;
            int stars = 2 * i - 1;
            
            System.out.print(" ".repeat(spaces));

            StringBuilder row = new StringBuilder();
            for (int j = 0; j < stars; j++) {
                if (i != 1 && random.nextInt(100) < 30) {
                    row.append('o');
                } else {
                    row.append('*');
                }
            }
            System.out.println(row.toString());
        }
    
        System.out.print(" ".repeat(height-2));
        System.out.println("|||");
        
        System.out.println();
        System.out.println("Happy Holidays!");
    }
}
