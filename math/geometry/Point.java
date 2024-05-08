package math.geometry;

public class Point {
    // 類別的屬性和方法 (static)
    public static int Origin_X = 0;
    public static int Origin_Y = 0;
    public static void renderOrigin(){
        System.out.println(Point.Origin_X + ", " + Point.Origin_Y);
    }

    // 物件的屬性、方法和建構式 (non-static)
    public int x;
    public int y;
    public Point(int xArg, int yArg){
        this.x = xArg;
        this.y = yArg;
    }
    public void render(){
        System.out.println(this.x + ", " + this.y);
    }
}