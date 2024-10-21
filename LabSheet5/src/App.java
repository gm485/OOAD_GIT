import exercise2.House;
import exercise4.Building;
import exercise4.Warehouse;

public class App {
    public static void main(String[] args) {
        Food food1 = new Food();
        food1.setName("lettuce");
        food1.setFreshType(FreshType.FRESH);

        Food food2 = new Food();
        food2.setName("apple");
        food2.setFreshType(FreshType.OUT_OF_DATE);

        System.out.println(food1);
        System.out.println(food2);

        //exercise 2 
        System.out.println("\n =================Exercise 2=================");
        House house = new House();
        house.setAddress("24 Main Street");
        house.setSizeMetersSquared(2000);
        house.setNumBathrooms(2);
        house.setNumBedrooms(2);
        System.out.println(house);
        System.out.println("\n =================Exercise 2 Finished=================");

        //Exercise 3
        System.out.println("\n =================Exercise 3=================");
        exercise3.House house2 = new exercise3.House();
        house2.setAddress("24 Main Street");
        house2.setSizeMetersSquared(2000);
        house2.setNumBedrooms(3);
        house2.setNumBathrooms(2);
        System.out.println(house2);
        System.out.println("\n =================Exercise 3 Finished=================");

        //Exercise 4
        // exercise4.Building building1 = new exercise4.Building();
        exercise4.House house1 = new exercise4.House();
        exercise4.Warehouse warehouse1 = new Warehouse();


        //Exercise 5
        System.out.println("\n =================Exercise 5=================");
        
        System.out.println("\n =================Exercise 5 Finished=================");

    }
}
