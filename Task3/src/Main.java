import java.util.Arrays;
import java.util.Date;
public class Main {
    public static void main(String[] args) {

        GenericItem ball = new GenericItem();
        ball.ID = 44;
        ball.name = "ball";
        ball.price = 224;

        GenericItem  doll = new GenericItem();
        doll.ID = 28;
        doll.name = "doll";
        doll.price = 1999;

        ball.printAll();
        doll.printAll();

        FoodItem chicken2 = new FoodItem();
        FoodItem chicken = new FoodItem("chicken", 111.99F,chicken2,new Date(2017,11,11), (short)33);
        chicken.printAll();

        TechicalItem computer = new TechicalItem();
        computer.ID = 3;
        computer.name = "computer";
        computer.price = 10_999;
        computer.warrantyTime = 90;
        computer.printAll();
        System.out.println("-------------------------");
        GenericItem[] mass = new GenericItem[2];
        mass[0] = chicken;
        mass[1] = computer;

        for(int i = 0; i < mass.length; i ++){
            mass[i].printAll();
        }
        int[] mas =  new int[4];
        mas[0] = chicken.ID;
        mas[1] = ball.ID;
        mas[2] = doll.ID;
        mas[3] = computer.ID;
       GenericItem.currentID = mas[0];
        for(int i = 0; i < mas.length; i++) {
            if(mas[i] > GenericItem.currentID){
                GenericItem.currentID = mas[i];
            }
        }
            System.out.println("max ID: " + GenericItem.currentID);

        String line = "Конфеты ’Маска’;45;120";
        String[] item_fld = line.split(";");
        FoodItem product = new FoodItem(item_fld[0], Float.parseFloat(item_fld[1]), Short.parseShort(item_fld[2]));
        product.printAll();
    }
}