public class wall {
    private double width;
    private double height;
    public wall(){

    }
    public wall(double width,double height){
        if(width<0){
            width=0;

        }
        if (height<0){
            height=0;
        }
        this.width=width;
        this.height=height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
    public void setWidth(double width){
        if(width<0){
            width=0;
        }
        this.width=width;
    }
    public void setHeight(double height){
        if(height<0){
            height=0;
        }
        this.height=height;
    }
    public double getArea(){
        return getWidth()*getHeight();
    }

    public static void main(String[] args) {
        wall obj=new wall(5,4);
        System.out.println("area="+obj.getArea());
        obj.setHeight(5);
        obj.setWidth(6);
        System.out.println("width="+obj.getWidth());
        System.out.println("height="+obj.getHeight());
        System.out.println("area is="+obj.getArea());
    }
}
