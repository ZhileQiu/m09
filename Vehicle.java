package Vehicle;

public class Vehicle {
    private int velocitat;
    private int NumRodesixos;
    private int numRodes;

    public Vehicle(int velocitat, int numRodesixos, int numRodes) {
        this.velocitat = velocitat;
        NumRodesixos = numRodesixos;
        this.numRodes = numRodes;
    }

    public int getVelocitat() {
        return velocitat;
    }

    public void setVelocitat(int velocitat) {
        this.velocitat = velocitat;
    }

    public int getNumRodesixos() {
        return NumRodesixos;
    }

    public void setNumRodesixos(int numRodesixos) {
        NumRodesixos = numRodesixos;
    }

    public int getNumRodes() {
        return numRodes;
    }

    public void setNumRodes(int numRodes) {
        this.numRodes = numRodes;
    }
}
