package hu.ruander.alakzatok;

public class Gomb extends FemAlakzat {
    private double sugara;

    public Gomb(double r) {
        this.sugara=r;
    }

    @Override
    public double terfogat() {

        return 0;
    }
}
