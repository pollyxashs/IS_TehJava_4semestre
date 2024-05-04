package ru.billing.stocklist;

import ru.billing.stocklist.GenericItem;

public class TechicalItem extends GenericItem {
    private short warrantyTime;
    public short getWarrantyTime(){
        return warrantyTime;
    }
    public void setExpires(short warrantyTime){
        this.warrantyTime = warrantyTime;
    }

    @Override
    void printAll(){
        System.out.printf("ID: %d , Name: %-20s , price:%5.2f, general:%s, warrantyTime: %d\n",getID(),getname(),getPrice(), getGENERAL(), warrantyTime);
    }

}