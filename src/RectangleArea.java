import java.awt.*;
import java.awt.geom.Area;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
    public static void main(String[]args) throws IOException {
        RectangleArea rg = new RectangleArea();
        rg.getData();
        rg.computeField();
        rg.fieldDisplay();
    }
}
public class RectangleArea {
    //public static void getData () throws IOException {
         float width;
         float height;
         float area;

         public void getData() throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Welcome Intruder ;) \n This is where we calculate the area of a rectangle");
            System.out.println("Please type in the width of rectangle: ");
            width = Float.parseFloat(br.readLine());
            System.out.println("Alrighty! Please type in the height of rectangle: ");
            height = Float.parseFloat(br.readLine());
        }

   // }
    public void computeField() {
        area = width * height;
    }

    public void fieldDisplay() {
        System.out.println("I hope you enjoyed using my area calculator :)");
        System.out.println("The area of a rectangle for the given values is: " + area);
    }

    }

