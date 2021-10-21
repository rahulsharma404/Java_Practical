interface Vehicle{
    public void apply_breaks();
    public void speed_up();
    public void gear_change();
}
class Bicycle implements Vehicle{
    public void apply_breaks(){
        System.out.println("Applying Breaks to the Bicycle.");

    }
    public void speed_up(){
        System.out.println("Speeding Up the Bicycle.");


    }
    public void gear_change(){
        System.out.println("Changing Gears of the Bicycle.");
    }
}
class Bike implements Vehicle{
    public void apply_breaks(){
        System.out.println("Applying Breaks to the Bike.");

    }
    public void speed_up(){
        System.out.println("Speeding Up the Bike.");


    }
    public void gear_change(){
        System.out.println("Changing Gears of the Bike.");
    }
}
class Car implements Vehicle{
    public void apply_breaks(){
        System.out.println("Applying Breaks to the Car.");

    }
    public void speed_up(){
        System.out.println("Speeding Up the Car.");


    }
    public void gear_change(){
        System.out.println("Changing Gears of the Car.");
    }
}
public class program{
    public static void main(String[] args) {
        System.out.println("------------------------------------------------");
        System.out.println("Bicycle class implementing Vehicle interface :");
        Bicycle bi = new Bicycle();
        bi.apply_breaks();
        bi.speed_up();
        bi.gear_change();
        System.out.println("------------------------------------------------\n");

        System.out.println("------------------------------------------------");
        System.out.println("Bicycle class implementing Vehicle interface :");
        Bike b = new Bike();
        b.apply_breaks();
        b.speed_up();
        b.gear_change();
        System.out.println("------------------------------------------------\n");

        System.out.println("------------------------------------------------");
        System.out.println("Bicycle class implementing Vehicle interface :");
        Car c = new Car();
        c.apply_breaks();
        c.speed_up();
        c.gear_change();
        System.out.println("------------------------------------------------\n");

        
    }
}


/*
Output :

------------------------------------------------
Bicycle class implementing Vehicle interface :  
Applying Breaks to the Bicycle.
Speeding Up the Bicycle.
Changing Gears of the Bicycle.
------------------------------------------------

------------------------------------------------
Bicycle class implementing Vehicle interface :  
Applying Breaks to the Bike.
Speeding Up the Bike.
Changing Gears of the Bike.
------------------------------------------------

------------------------------------------------
Bicycle class implementing Vehicle interface :  
Applying Breaks to the Car.
Speeding Up the Car.
Changing Gears of the Car.
------------------------------------------------


*/
