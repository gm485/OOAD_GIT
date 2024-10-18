package tudublin;

public class Student {
    private String name;
    
    private Programme programme;
    //name getter/setter
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Student Name: " + name
        + ", Programme: " + programme.getName() + ", Level: " + programme.getLevel();
    }

    public Programme getProgramme() {
        return this.programme;
    }

    public void setProgramme(Programme programme) {
        this.programme = programme;
    }

    
}//end of class
