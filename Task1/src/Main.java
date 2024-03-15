import java.util.Arrays;

/**
 * @author Alena
 */
class Main {
    /**
     *
     * @param args вводим массив строк
     */
    public static void main(String[] args) {
        System.out.println("Starting project");
//2
        int a = 214;
        long b = 777777777;
        short c = 30000;
        byte d = 127;
        float f = 3.3F;
        boolean h = true;
        double g = 55.55;
        System.out.println("this is a int:" + a);
        System.out.println("this is a long:" + b);
        System.out.println("this is a short:" + c);
        System.out.println("this is a byte:" + d);
        System.out.println("this is a float:" + f);
        System.out.println("this is a boolean:" + h);
        System.out.println("this is a double:" + g);

        byte v_byte = 120;
        short v_short = 129;
        char v_char = 'a'; //a
        int v_int = 65999;
        long v_long = 4294967296L;//L
        float v_float = 0.33333334F;//F
        double v_double=0.3333333333333333;
        boolean v_boolean = true;//v_double --> boolean
        //3
        for(int i = 96; i <= 122; i ++){
            System.out.println((char)i);
        }
        long begin = new java.util.Date().getTime();
        System.out.println(begin);

        for(int i = 0;i <= 100000000; i++){
            //System.out.println(i);
        }
        for(long i = 0;i <= 100000000; i++){
            //System.out.println(i);
        }
        long end = new java.util.Date().getTime();
        System.out.println(end-begin);
        //5
        int[] mas = {12,43,12,-65,778,123,32,76};
        int max = mas[0];
        for(int i = 1; i < mas.length; i++){
            if(mas[i] > max){
                max = mas[i];
            }
        }
            System.out.println(max);
    }
}