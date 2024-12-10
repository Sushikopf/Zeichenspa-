import edu.princeton.cs.introcs.StdDraw;

import java.util.Random;

public class TestStdDraw {
    public static void main(String[] args) {
        StdDraw.setPenRadius(0.05);
        StdDraw.setPenColor(StdDraw.BLUE);

        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.filledRectangle(0.5, 0.2, 0.3, 0.1);
        double radius;
        int flag = 1;
        radius = 0.1;
        while(true)
        {
            if(StdDraw.isMousePressed()) {

                if(radius > 0.8) {
                    flag = -1;
                }
                if(radius < 0.1 ){
                    flag = 1;
                }
                //System.out.println(StdDraw.mouseX());
                StdDraw.setPenColor(StdDraw.RED);
                radius += 0.0005 * flag;
                StdDraw.setPenRadius(radius);
                StdDraw.point(StdDraw.mouseX(), StdDraw.mouseY());

        }
        }
    }
}
