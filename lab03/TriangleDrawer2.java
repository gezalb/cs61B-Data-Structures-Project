import java.io.*;

public class TriangleDrawer2 {

    public static void main(String[] args) {
        int temp = 1;
        for (int row = 0; row < 10; row = row + 1) {
            for (int col = 0; col < temp; col = col + 1) {
                System.out.print('*');
            }
            temp = temp + 1;
            System.out.println();
        }
    }

}
