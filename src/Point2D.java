public class Point2D {

    private int x;
    private int y;

    public Point2D(){
        this(0,0);
        System.out.println("Default data settled");
    }

    public Point2D(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }

    public void show(){
        System.out.println(getX()+","+getY());
    }
    public void stepX(int stepX){
        x =+ stepX;
        System.out.println("Moved "+x+", the new coordinate is "+getX()+" , "+getY());
    }
    public void stepY(int stepY){
        y =+ stepY;
        System.out.println("Moved "+y+", the new coordinate is "+getX()+" , "+getY());
    }
    public void stepXY(int stepX, int stepY){
        x =+ stepX;
        y =+ stepY;
        System.out.println("Moved "+stepX+" and "+stepY+", the new coordinate is "+getX()+" , "+getY());
    }
    public void moveTo(int xNew, int yNew){
        x = xNew;
        y = yNew;
        System.out.println("The new coordinate is "+getX()+" , "+getY());

    }



   }
