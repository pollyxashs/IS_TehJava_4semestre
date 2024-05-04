package ru.billing.stocklist;

import java.util.Date;

public class FoodItem extends GenericItem {
    private Date dateOfIncome;
    private short expires;
    private FoodItem analog;
    Date date = new Date();
    public Date getDateOfIncome(){
        return dateOfIncome;
    }
    public void setDateOfIncome(Date dateOfIncome){
        this.dateOfIncome = dateOfIncome;
    }
    public short getExpires(){
        return expires;
    }
    public void setExpires(short expires){
        this.expires = expires;
    }
    public FoodItem getAnalog(){
        return analog;
    }
    public void setAnaloge(FoodItem analog){
        this.analog = analog;
    }
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
        System.out.printf("ID: %d , Name: %-20s , price:%5.2f, general:%s, dateOfIncome: %tc, expires: %d \n",getID(),getname(),getPrice(), getGENERAL(), dateOfIncome, expires);
    }


}