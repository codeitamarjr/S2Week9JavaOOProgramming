public class Main {

    public static void main(String[] args) {
        Point2D me = new Point2D();
        me.show();
        me.stepX(1);
        me.stepY(3);
        me.stepXY(-1,-3);
        me.moveTo(10,10);

    }
}
