package homework_week_7;

/**
 * Write a class with the name Wall. The class needs two fields (instance variables)
 * with name width and height of type double.
 * Write the following methods (instance methods):
 *  Method named getWidth without any parameters, it needs to return the value of width field.
 *  Method named getHeight without any parameters, it needs to return the value of height field.
 *  Method named setWidth with one parameter of type double, it needs to set the value of the width field.
 *  If the parameter is less than 0 it needs to set the width field value to 0.
 *  Method named setHeight with one parameter of type double, it needs to set the value of the  height field. If the parameter is less than 0 it needs to set the height field value to 0.
 *  Method named getArea without any parameters, it needs to return the area of the wall.
 */
public class Programme_15_Wall {
   private double width;
   private double height;

    // no args constructor
    public Programme_15_Wall() {
        this.width = 0;
        this.height = 0;
    }

    //Constructor with parameters, ensuring non-negative values
    public Programme_15_Wall(double width, double height) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }

    public void setHeight(double height) {
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    public double getArea() {
        return  width * height;
    }


    public static void main(String[] args) {
        Programme_15_Wall wall  = new Programme_15_Wall(5,4);
        System.out.println("area = " + wall.getArea());

        wall.setHeight(-1.5);
        System.out.println("width = " + wall.getWidth());
        System.out.println("height = " + wall.getHeight());
        System.out.println("area = " + wall.getArea());
    }
}










