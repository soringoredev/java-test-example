package pachet1;

public class Clasa2 {
    public static void main(String[] args) {

        Clasa1p object = new Clasa1p();
       // object.number = 200;

        //System.out.println(object.number);

//        final int TEST = 100;
//        System.out.println(TEST);
//
//        TEST = 200;
//        System.out.println(test);

        Clasa2 obj = new Clasa2();

        int rezultat = obj.calcSum(20,30);
        System.out.println(rezultat);

        System.out.println(numberTest2); //500
        System.out.println(obj.numberTest); // 250

    }

    public int calcSum(int a, int b) {
        return a + b;
    }

    public int        numberTest  = 250;
    public static int numberTest2 = 500;

}