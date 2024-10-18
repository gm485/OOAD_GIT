public class Book {
    private String title;

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Im a Book my name is: " + this.title;
    }
}