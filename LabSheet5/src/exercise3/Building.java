package exercise3;

public abstract class Building {
    protected String address;
    protected int sizeMetersSquared;

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSizeMetersSquared() {
        return this.sizeMetersSquared;
    }

    public void setSizeMetersSquared(int sizeMetersSquared) {
        this.sizeMetersSquared = sizeMetersSquared;
    }

    @Override
    public String toString() {
        
        return getClass()
        + "address = " 
        + address
        + "/size "
        + sizeMetersSquared
        + "sq.m. "; 
    }
}
