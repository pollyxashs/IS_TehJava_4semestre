public class TechicalItem extends GenericItem{
    public short warrantyTime;

    @Override
    void printAll(){
        System.out.printf("ID: %d , Name: %-20s , price:%5.2f, general:%s, warrantyTime: %d\n",ID,name,price, GENERAL, warrantyTime);
    }

}