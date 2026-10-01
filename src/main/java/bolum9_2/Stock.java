package bolum9_2;

public class Stock {
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;
    
    //Kurucu metot;
    public Stock(String symbol, String name){
        this.symbol=symbol;
        this.name=name;
    }
    //Değişim yüzdeliğini hesaplayan metot
    public double getChangePercent(){
    
        return ((this.currentPrice-this.previousClosingPrice)/this.previousClosingPrice)*100;
    }
    
    public void setPreviousClosingPrice(double price){
        this.previousClosingPrice=price;
    }
    
    public void setCurrentPrice(double price){
        this.currentPrice=price;
    }
    
}