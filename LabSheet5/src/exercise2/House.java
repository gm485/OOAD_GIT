package exercise2;

public class House extends Building {
    private int numBedrooms;
    private int numBathrooms;


    public int getNumBathrooms() {
        return this.numBathrooms;
    }

    public void setNumBathrooms(int numBathrooms) {
        this.numBathrooms = numBathrooms;
    }

    public int getNumBedrooms() {
        return this.numBedrooms;
    }

    public void setNumBedrooms(int numBedrooms) {
        this.numBedrooms = numBedrooms;
    }

    @Override
    public String toString() {
        return getClass()
        + " { "
        + "address"
        + getAddress()
        + " / size= "
        + getSizeMetersSquared() 
        + numBathrooms 
        + "bathrooms/" 
        + numBedrooms + "bedrooms" 
        +"}";
    }

    
}
