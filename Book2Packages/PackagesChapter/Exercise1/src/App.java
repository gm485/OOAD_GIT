public class App {
    public static void main(String[] args) {
        // Food food1 = new Food();
        // food1.setName("lettuce");
        // food1.setFreshness(FreshType.FRESH);

        // //food2 
        // Food food2 = new Food();
        // food2.setName("apple");
        // food2.setFreshness(FreshType.OUT_OF_DATE);

        // System.out.println(food1);
        // System.out.println(food2);

        //Exercise 2 use public accessor methods in subclass code
        House house1 = new House(3, 2, "24 Main Street", 2000);
        
        house1.setAddres("31 Fake Lane Drive");
        System.out.println(house1);
    }
}
