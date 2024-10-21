public class Food {
    private String name;
    private FreshType freshType;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FreshType getFreshType() {
        return this.freshType;
    }

    public void setFreshType(FreshType freshType) {
        this.freshType = freshType;
    }

    @Override
    public String toString() {
        
        return "Food(name= " + name + "freshType='" + freshType + ")";
    }
}
