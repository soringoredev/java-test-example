//import pachet1.Clasa1p;

public class Clasa2 {
    public static void main(String[] args) {

        // obiect Clasa 1 din default package
        Clasa1 objectClasa1 = new Clasa1();
        objectClasa1.numberCl1 = 100;


        // obiect Clasa 1 din pachet1
     //objectClasa1p.number = 150;

       // Clasa1p obj = new Clasa1p();
        //obj.number = 3500;


        System.out.println("Numarul din Clasa 1: " + objectClasa1.numberCl1);
        System.out.println(objectClasa1.calculeazaSuma(10,50));
       // System.out.println("Numarul din Clasa 1 din pachet1: " + objectClasa1p.number );


    }
}
