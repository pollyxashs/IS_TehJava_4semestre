package ru.billing.stocklist;

import ru.billing.stocklist.GenericItem;
import ru.itmo.exceptions.ItemAlreadyExistsException;

import java.util.ArrayList;
import java.util.HashMap;


public class ItemCatalog {
    private HashMap<Integer, GenericItem> catalog = new HashMap<Integer, GenericItem>();
    private static ArrayList<GenericItem> ALCatalog = new ArrayList<GenericItem>();

    public void addItem(GenericItem item) throws ItemAlreadyExistsException{
        try{
            if(ALCatalog.contains(item)){
                throw new ItemAlreadyExistsException();
            }
        }catch (ItemAlreadyExistsException q){
            throw new ItemAlreadyExistsException();
        }
        try{
            if(catalog.containsValue(item)){
                throw new ItemAlreadyExistsException();
            }
        }catch (ItemAlreadyExistsException q){
            throw new ItemAlreadyExistsException();
        }

        catalog.put(item.getID(), item); // Добавляем товар в HashMap
        ALCatalog.add(item); // Добавляем тот же товар в ArrayList
    }
    public void printItems() {
        for (GenericItem i : ALCatalog) {
            System.out.println(i);
        }
    }
    public GenericItem findItemByID(int id) {
        //Если нет такого ID, возвращаем пустое значение
        if (!catalog.containsKey(id)) {
            return null;
        } else {
            return catalog.get(id);
        }
    }

    public GenericItem findItemByIDAL(int id) {
        for (GenericItem i : ALCatalog) {
            if (i.getID() == id) return i;
        }
        return null;
    }

    public static void main(String[] args) {

    }

}