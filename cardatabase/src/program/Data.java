package program;

import carType.Auto;
import carType.Mercedes;

import java.util.ArrayList;

public class Data {

    private ArrayList<Auto> carlist;

    public Data (){
        this.carlist = new ArrayList<Auto>();
    }

    public void addAuto(Auto newCAR) {
        this.carlist.add(newCAR);
    }
}
