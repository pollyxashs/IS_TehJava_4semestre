public class GenericItem {
    public int ID;
    public String Name;
    public float price;
    public Category General;

    void printALL(){
        System.out.printf("ID : %d, Name: %-20s, price : %5.2f, general:%s,\n",ID,Name,price, General);
    }
}
