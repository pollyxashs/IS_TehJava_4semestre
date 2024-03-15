public class GenericItem{
    public int ID;
    protected String name;
    protected float price;
    protected Category GENERAL;
    protected GenericItem analog;
    public static int currentID;
    Category category;

    public GenericItem(String name, float price, Category category){
        this.name = name;
        this.price = price;
        this.category = category;
        this.ID = GenericItem.currentID++;
    }
    public GenericItem(String name, float price, GenericItem analog){
        this.name = name;
        this.price = price;
        this.analog = analog;
        this.ID = GenericItem.currentID++;
    }
    public GenericItem(){
        this.ID = GenericItem.currentID++;
    }

    public static void main(String[] args) {
    }

    void printAll(){
        System.out.printf("ID: %d , Name: %-20s , price:%5.2f, general:%s \n",ID,name,price, GENERAL);
    }
}