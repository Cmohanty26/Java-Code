public class Shape {
    int dim1,dim2;
    Shape(int dim1,int dim2){
        this.dim1=dim1;
        this.dim2=dim2;
    }
    public int getDim1(){
        return this.dim1;
    }
    public int getDim2(){
        return this.dim2;
    }
    public void setDim1(int dim1){
        this.dim1=dim1;
    }
    public void setDim2(int dim2){
        this.dim2=dim2;
    }
    public class Rectangle extends Shape {
        Rectangle(int dim1,int dim2){
            super(dim1,dim2);
        }
        public int area(){
            return this.dim1*this.dim2;
        }

    }

    public class sphere extends Shape {
        sphere(int dim1,int dim2){
            super(dim1,dim2);
        }
        public double area(){
            return 4*3.14*this.dim1*this.dim1;
        }

    }
    public class Circle extends Shape {
        Circle(int dim1){
            super(dim1,-1);
        }
        public double area(){
            return 2*Math.PI* this.dim1*(this.dim1+this.dim2);
        }



    }
    public class Cylinder extends Shape {
        Cylinder(int dim1,int dim2){
            super(dim1,dim2);
        }
        public int area(){
            return this.dim1*this.dim2;
        }

    }
    public class Square extends Shape {
        Square(int dim1){
            super(dim1,-1);
        }
        public int area(){
            return this.dim1*this.dim1;
        }

    }

    public static void main(String[] args) {

    }
}

