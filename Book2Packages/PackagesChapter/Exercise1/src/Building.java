public abstract class Building {
    //an abstract class that another object can instantiate from 
    //which will allow the properties to be assigned to it 
    //remember to use super to call the functions in the child 
    //of this class

    protected String addres;
    protected int sizeMetersSquared;

    public String getAddres() {
        return this.addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public int getSizeMetersSquared() {
        return this.sizeMetersSquared;
    }
    
    public int setSizeMetersSquared(int sizeMetersSquared) {
        this.sizeMetersSquared = sizeMetersSquared;
        return sizeMetersSquared;
    }

    @Override
    public String toString() {
        
        return "(Object Name): \n" 
        + this.getClass()
        + " Address= " 
        + this.addres
        + "/size = "
        + this.sizeMetersSquared;
    }




}
