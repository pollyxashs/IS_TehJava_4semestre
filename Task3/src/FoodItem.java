import java.util.Date;
public class FoodItem extends GenericItem{
    public Date dateOfIncome;
    public short expires;
    public FoodItem analog;
    Date date = new Date();

    public FoodItem(String name, float price, FoodItem analog, Date date, short expires){
        super(name, price, analog);
        this.expires = expires;
        this.dateOfIncome = date;
    }
    public FoodItem(String name, float price, short expires){
        this(name, price, null, null, expires);

    }
    public FoodItem(String name){
        this(name, 0.0f, null, null, (short)0);
    }
    public FoodItem(){}


    @Override
    void printAll(){
        System.out.printf("ID: %d , Name: %-20s , price:%5.2f, general:%s, dateOfIncome: %tc, expires: %d \n",ID,name,price, GENERAL, dateOfIncome, expires);
    }


}