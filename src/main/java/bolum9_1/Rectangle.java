package bolum9_1;

public class Rectangle{
    private double width=1;
    private double height=1;
    
    public Rectangle(){
    }
    
    public Rectangle(double width, double height){
        //değişken ve parametre isimleri aynı olduğu için this anahtar kelimesini kullandım.
        this.height= height;
        this.width= width;
    }
    
    //Alan hesaplayan method
    public double getArea(){
        return this.height*this.width;
    }
    //Çevre hesaplayan method
    public double getPerimeter(){
        return 2*(this.height+this.width);
    }
    //Genişlik değişkeninin okunmasını sağlayan method
    public double getWidth(){
        return this.width;
    }
    
    public double getHeight(){
        return  this.height;
    }
    
    
}

