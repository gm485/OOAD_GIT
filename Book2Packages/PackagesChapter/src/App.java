import tudublin.*;

public class App {
    public static void main(String[] args) {
        Programme prog1 = new Programme();
        prog1.setName("HCet Computing");
        prog1.setLevel(6);
        
        Student student = new Student();
        student.setName("Joelle Murphy");
        student.setProgramme(prog1);
        
        System.out.println(student);
        
    }
}
