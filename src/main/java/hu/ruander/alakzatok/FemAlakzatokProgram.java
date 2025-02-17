package hu.ruander.alakzatok;

import java.util.ArrayList;

public class FemAlakzatokProgram {
    private ArrayList<FemAlakzat> alakzat;

    public ArrayList<FemAlakzat> getLista() {

        return ArrayList<FemAlakzat>alakzat;
    }

    public double osszSuly() {
        double osszes=0;
        for(FemAlakzat femAlakzat:alakzat){
            osszes+=femAlakzat.suly();
        }
        return osszes;
    }

    public double gombokOsszSuly() {
        double osszes=0;
        for(FemAlakzat femAlakzat:Gomb){
            osszes+=femAlakzat.suly();
        }
        return osszes;
    }

    public FemAlakzat minV() {
        return null;
    }

    public FemAlakzat maxV() {
        return null;
    }


    public void ujAlakzat(Hasab hasab) {

    }

    public void ujAlakzat(Gomb gomb) {
    }
}
