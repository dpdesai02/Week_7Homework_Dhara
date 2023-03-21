public class Programme15_Wall {
    double width, height;

    public static void main(String[] args) {

        Programme15_Wall wall = new Programme15_Wall(5, 4);//width and height as per Programme criteria
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }



    public Programme15_Wall(double width, double height) {
        if (width > 0 && height < 0) {
            this.width = width;
            this.height = 0;
        } else if (width < 0 && height > 0) {
            this.width = 0.0;
            this.height = height;
        } else if (width < 0 && height < 0) {
            this.width = 0.0;
            this.height = 0.0;
        } else {
            this.width = width;
            this.height = height;
        }
    }
    public void setWidth(double width) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }
    public double getWidth() {
        return width;
    }
    public void setHeight(double height) {
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }
    public double getHeight() {//no parameter with return
        return height;//return value
    }
    public double getArea() {//no parameter with return method
        return this.width * this.height;//return value
    }
}


