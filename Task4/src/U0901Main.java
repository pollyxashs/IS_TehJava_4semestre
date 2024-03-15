public class U0901Main {
    public static void main(String[] args) {
        Integer[] intArr = {10,20,15};
        Float[] floatArr = new Float[3];
        floatArr[0] = 1.1F;
        for(int i = 0; i < floatArr.length; i++){
            floatArr[i] = (float)(i + 1.7);
            System.out.println(floatArr[i]);
        }
        U0901WorkArray insWorkArrayIn = new U0901WorkArray(intArr);
        U0901WorkArray insWorkArrayFloat = new U0901WorkArray<>(floatArr);
        double a = insWorkArrayIn.Sum();
        System.out.println(a);
        double b = insWorkArrayFloat.Sum();
        System.out.println(b);
       /* String[] arr = {"a", "b", "c"};
        U0901WorkArray insworkArraySTR = new U0901WorkArray(arr);
        System.out.println(insworkArraySTR.Sum());*/
    }
}
