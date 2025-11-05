import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        
        // This creates the hero
        Hero hero = new Hero();
        addObject(hero, 100, 100);
        
        // This creates the car
        Car car = new Car();
        addObject (car, 600, 100);
    }
}
