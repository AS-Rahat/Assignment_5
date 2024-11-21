
import java.util.*;
public class XshapePatternRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the side length of the box: ");
        int sideLength = scanner.nextInt();

        // Display the X shape pattern
        XshapePattern  XshapePattern=new  XshapePattern();
        XshapePattern.displayXShapePattern(sideLength);
        scanner.close();
    }
}