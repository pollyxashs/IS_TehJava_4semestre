package ru.billing.stocklist;

public class GenericItem {
    private int ID;
    private String name;
    private float price;
    private ru.billing.stocklist.Category GENERAL;
    private GenericItem analog;
    private static int currentID;
    ru.billing.stocklist.Category category;
    public GenericItem(String name, float price, ru.billing.stocklist.Category category) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.ID = GenericItem.currentID++;
    }

    public GenericItem(String name, float price) {
        this.name = name;
        this.price = price;
        this.ID = GenericItem.currentID++;
    }

    public GenericItem(String name, float price, GenericItem analog) {
        this.name = name;
        this.price = price;
        this.analog = analog;
        this.ID = GenericItem.currentID++;
    }

    public GenericItem() {
        this.ID = GenericItem.currentID++;
    }

    void printAll() {
        System.out.printf("ID: %d , Name: %-20s , price:%5.2f, general:%s \n", ID, name, price, GENERAL);
    }
    public int getID(){
        return ID;
    }
    public void setID(int ID){
        this.ID = ID;
    }
    public String getname(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public float getPrice(){
        return price;
    }
    public void setPrice(float Price){
        this.price = Price;
    }
    public ru.billing.stocklist.Category getGENERAL(){
        return GENERAL;
    }
    public void setGENERAL(ru.billing.stocklist.Category GENERAL){
        this.GENERAL = GENERAL;
    }
    public GenericItem getAnalog(){
        return analog;
    }
    public void setAnalog(GenericItem analog){
        this.analog = analog;
    }
    public int getCurrentID(){
        return currentID;
    }
    public void setCurrentID(int currentID){
        this.currentID = currentID;
    }
}
