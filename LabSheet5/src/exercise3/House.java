package exercise3;

public class House extends Building{
    private int numBedrooms;
    private int numBathrooms;

    public int getNumBedrooms() {
        return this.numBedrooms;
    }

    public void setNumBedrooms(int numBedrooms) {
        this.numBedrooms = numBedrooms;
    }

    public int getNumBathrooms() {
        return this.numBathrooms;
    }

    public void setNumBathrooms(int numBathrooms) {
        this.numBathrooms = numBathrooms;
    }

    @Override
    public String toString() {
        
        return super.toString()
        + numBedrooms
        + "bedrooms"
        + "/ "
        + numBathrooms
        + "bathrooms";
    }
}
