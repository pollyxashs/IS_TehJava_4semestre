import java.util.SplittableRandom;

public class Main {
    public static void main(String[] args) {
        GenericItem ball = new GenericItem();
        ball.ID = 0;
        ball.Name = "ball";
        ball.price = 77;
        ball.printALL();

        GenericItem doll = new GenericItem();
        ball.ID = 1;
        ball.Name = "doll";
        ball.price = 12;
        ball.printALL();

        FoodItem chicken = new FoodItem();
        chicken.ID = 2;
        chicken.Name = "chicken";
        chicken.price = 30;
        chicken.expires = 15;
        chicken.printALL();

        TechnicalItem laptop = new TechnicalItem();
        laptop.ID = 3;
        laptop.Name = "laptop";
        laptop.price = 777;
        laptop.warrantyTime = 90;
        laptop.printALL();
        System.out.println("-----------------------------------");
        GenericItem[] mass = new GenericItem[2];
        mass[0] = chicken;
        mass[1] = laptop;
        for(int i = 0; i < mass.length; i++){
        mass[i].printALL();
        }
    }
}
