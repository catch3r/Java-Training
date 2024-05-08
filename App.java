import math.geometry.Point;

public class App {
    public static void main(String[] args) {
        // 程式進入點
        System.out.println(Point.Origin_X);
        Point.renderOrigin();
        // 呼叫建構式，產生 Point 物件實體
        Point obj = new Point(3, 4);
        System.out.println(obj.x);
        obj.render();
        Point p2 = new Point(1, 1);
        System.out.println(p2.x);
        p2.render();
    }
}
