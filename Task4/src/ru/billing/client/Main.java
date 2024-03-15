package ru.billing.client;
import ru.billing.client.CatalogLoader;
import ru.billing.client.CatalogStubLoader;
import ru.billing.stocklist.Category;
import ru.billing.stocklist.GenericItem;
import ru.billing.stocklist.ItemCatalog;

import java.util.Date;
public class Main {
    public static void main(String[] args) {
        GenericItem b = new GenericItem();
        ItemCatalog cat = new ItemCatalog();
        GenericItem item1 = new GenericItem("Товар1", 100.0f, Category.DRESS);
        GenericItem item2 = new GenericItem("Товар2", 150.0f, Category.FOOD);
        GenericItem item3 = new GenericItem("Товар3", 200.0f, Category.PRINT);
        GenericItem item4 = new GenericItem("Товар4", 50.0f, Category.FOOD);
        GenericItem item5 = new GenericItem("Товар5", 120.0f, Category.DRESS);
        GenericItem item6 = new GenericItem("Товар6", 180.0f, Category.FOOD);
        GenericItem item7 = new GenericItem("Товар7", 90.0f, Category.GENERAL);
        GenericItem item8 = new GenericItem("Товар8", 160.0f, Category.FOOD);
        GenericItem item9 = new GenericItem("Товар9", 70.0f, Category.DRESS);
        GenericItem item10 = new GenericItem("Товар10", 130.0f, Category.PRINT);
        cat.addItem(item1);
        cat.addItem((item2));
        cat.addItem(item3);
        cat.addItem(item4);
        cat.addItem(item5);
        cat.addItem(item6);
        cat.addItem(item7);
        cat.addItem(item8);
        cat.addItem(item9);
        cat.addItem(item10);
        long begin = new Date().getTime();
        for (int i = 0; i < 100000; i++)
            cat.findItemByID(10);
        long end = new Date().getTime();
        System.out.println("In HashMap: " + (end - begin));
        begin = new Date().getTime();
        for (int i = 0; i < 100000; i++)
            cat.findItemByIDAL(10);
        end = new Date().getTime();
        System.out.println("In ArrayList: " + (end - begin));
        //4.2
        CatalogLoader loader = new CatalogStubLoader();
        loader.load(cat);
        System.out.println("Catalog items after loading:");
        cat.printItems();
    }
}