public class House extends Building {
    private int numBedrooms;
    private int numBathrooms;

    public House(int numBedrooms, int numBathrooms, String address, int sizeMetersSquared) {
        this.numBedrooms = numBedrooms;
        this.numBathrooms = numBathrooms;
        this.addres = super.getAddres();
        super.setSizeMetersSquared(sizeMetersSquared);

    }

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
        + "\n Im a child of Building\n"
        + this.numBedrooms
        + " bedrooms"
        + "/ "
        + this.numBathrooms
        + " bathrooms";
        
        
    }



}
