package complete_coding_interview_guide_in_java.object_oriented_programming.abstraction.abstraction_via_abstract_class;

abstract class Car {
    private final String carType;

    public Car(String carType) {
        this.carType = carType;
    }

    abstract void speedUp();
    abstract void slowDown();
    abstract void turnRight();
    abstract void turnLeft();

    // 이것은 구상 메서드입니다.
    public String getCarType() {
        return carType;
    }
}
