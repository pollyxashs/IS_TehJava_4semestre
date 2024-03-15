import java.util.Date;

public class FoodItem extends GenericItem {
    public Date dateOfIncome;
    public short expires;
    @Override
    void printALL(){
        System.out.printf("ID : %d, Name: %-20s, price : %5.2f, general:%s, dateOfIncome:%d, expires:%d\n",ID,Name,price, General,dateOfIncome,expires );
}
}
