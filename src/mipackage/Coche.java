package mipackage;

public class Coche {
    private  int numPuertas;


    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public void incrementaPuertas(int inc){
        this.numPuertas = this.numPuertas + inc;
    }
}
