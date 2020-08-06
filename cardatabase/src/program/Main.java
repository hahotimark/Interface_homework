package program;

import carType.Auto;
import carType.Mercedes;
import carType.W210;

public class Main {


    public static void main(String[] args) {

        Data carDB = new Data();

        W210 merci = new W210();

        merci.setYear(1999);

        carDB.addAuto(merci);



    }

}