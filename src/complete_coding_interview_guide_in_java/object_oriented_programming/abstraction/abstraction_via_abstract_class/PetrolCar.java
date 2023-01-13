package complete_coding_interview_guide_in_java.object_oriented_programming.abstraction.abstraction_via_abstract_class;

public class PetrolCar extends Car {
    public PetrolCar(String carType) {
        super(carType);
    }
         
    @Override
    public void speedUp() {
        System.out.println("Speed up the petrol car");
    }

    @Override
    public void slowDown() {
        System.out.println("Slow down the petrol car");
    }

    @Override
    public void turnRight() {
        System.out.println("Turn right the petrol car");
    }

    @Override
    public void turnLeft() {
        System.out.println("Turn left the petrol car");
    }
}
