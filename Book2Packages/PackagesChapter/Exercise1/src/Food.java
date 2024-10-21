public class Food {
    private String name;
    private FreshType freshness;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FreshType getFreshness() {
        return this.freshness;
    }

    public FreshType setFreshness(FreshType freshness) {
        return this.freshness = freshness;
    }

    @Override
    public String toString() {
        
        return "(Food:)\n"
        + "Name: " + this.name + "\t" + "Freshness: " + this.freshness;
    }
    
}
