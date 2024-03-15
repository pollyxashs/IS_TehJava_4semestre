public class TechnicalItem extends GenericItem{
    public short warrantyTime;
    @Override
    void printALL(){
        System.out.printf("ID : %d, Name: %-20s, price : %5.2f, general:%s, warrantyTime:%d\n",ID,Name,price, General,warrantyTime);
    }
}
