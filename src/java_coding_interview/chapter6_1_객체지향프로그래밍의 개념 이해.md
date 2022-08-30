6.1 객체지향 프로그래밍의 개념 이해
============


## 6.1.1 객체란 무엇인가

- 객체는 객체지향 프로그래밍의 핵심 개념 중 하나
- 객체는 실세계의 개체
- 객체는 상태(필드)와 동작(메서드)를 가진다. 
- 객체는 클래스의 인스턴스를 나타낸다.
- 객체는 메모리에서 공간을 차지한다. 
- 객체는 다른 객체와 소통할 수 있다.

> 객체는 객체지향 프로그래밍의 핵심 개념 중 하나입니다. 객체는 차, 탁자, 고양이와 같은 실세계의 개체와 
> 같습니다. 수명 주기(life cycle) 동안 객체는 상태와 동작을 가집니다. 예를 들어 고양이의 '상태'는 색,
> 이름, 품종이 될 수 있고 고양이의 '동작'은 놀고, 먹고, 자고, 야옹 소리를 내는 것일 수 있습니다. 
> 자바에서 객체는 new 키워드를 통해 만들어진 클래스의 인스터스로 필드에 상태를 저장하고 메서드로 동작을 표현합니다. 
> 각 인스턴스는 메모리 공간을 차지하며 다른 객체와 소통할 수 있습니다. 예를 들어 다른 객체에 해당하는 '소년'은 
> 역시 전체에 해당하는 고양이를 어루만지거나 잠을 재울 수 있습니다. 

## 6.1.2 클래스란 무엇인가? 

- 클래스는 객체지향 프로그래밍의 핵심 개념 중 하나
- 클래스는 객체를 생성하기 위한 템플릿 또는 청사진
- 클래스는 인스턴스화하기 전까지는 메모리의 힙 영역을 소모하지 않는다.
- 클래스는 여러 번 인스턴스화할 수 있습니다. 
- 하나의 클래스는 하나의 작업만 합니다. 

> 클래스는 객체지향 프로그래밍의 핵심개념 중 하나입니다. 클래스는 특정 타입의 객체를 만드는 데 필요한 지침의 집합입니다.
> 클래스는 템플릿, 청사진 또는 객체를 만드는 방법을 알려주는 레시피라고 할 수 있습니다. 
> 객체를 만드는 과정을 '인스턴스화한다'고 하며 new 키워드로 수행할 수 있습니다. 
> 클래스는 여러 번 인스턴스화하여 원하는 만큼 많은 객체를 만들 수 있습니다. 
> 클래스의 정의는 파일 형태로 하드 드라이브에 저장될 뿐 메모리의 힙 영역을 소모하지 않습니다. 
> 클래스를 인스턴스화하면 생성된 객체는 메모리 힙 영역에 할당됩니다. 
> 클래스가 따라야 하는 중요한 원칙 중 하나는 단일 책임 원칙(single responsibility principle, SRP)입니다.
> 클래스는 이 원칙을 따르면서 단 하나의 일을 할 수 있도록 설계 및 작성되어야 합니다. 

## 6.1.3 추상화란 무엇인가?

- 추상화는 객체지향 프로그래밍의 핵심 개념 중 하나입니다. 
- 추상화는 사용자와 관련 있는 내용만 노출하고 나머지 세부 내용은 숨기는 개념입니다. 
- 추상화를 통해 사용자는 애플리케이션이 일을 수행하는 방법이 아니라 애플리케이션이 수행하는 일 자체에 집중할 수 있습니다. 

> 아인슈타인은 '모든 것은 더 단순하게 만드는 것이 아니라 가능한 한 단순하게 만들어야 한다'고 말했습니다.
> 추상화는 사용자를 위해 무언가를 최대한 간단하게 만들고자 하는 객체지향 프로그래밍의 핵심 개념 중 하나입니다. 
> 객체지향 프로그래밍의 객체는 사용자에게 높은 수준의 작업 집합만 노출하고 작업의 내부 구현 내용은 숨겨야 한다는 말이 있습니다. 
> 이 개념을 구현하는 추상화를 통해 사용자는 애플리케이션이 일을 수행하는 방법이 아니라 수행하는 일 자체에 집중할 수 있습니다. 
> 즉, 내용을 노출하는 복잡성을 줄이고 코드의 재사용성을 높이며 코드 중복을 방지하고 낮은 결합도와 높은 응집도를 유지합니다. 
> 또한 중요한 내용만 공개하여 애플리케이션의 보안과 재량권을 유지합니다. 

실생활의 예를 들어보겠습니다. 차를 운전하는 남자가 있다고 가정하겠습니다. 이때 남자는 각각의 페달이 무슨 일을 하는지, 핸들이
무슨 일을 하는지 알고 있지만, 페달과 핸들에 힘을 실어주는 차 내부의 메커니즘은 전혀 알지 못하는 경우가 많습니다. 이것이 추상화입니다.

추상화를 좀 더 이해하도록 차를 운전하는 남자에 관해서 계속 이야기해보겠습니다. 이 남자는 적잘한 페달을 이용해서 차의 속도를 높이거나 늦출 수 있습니다. 
또한 바퀴 조종장치의 도움으로 좌회전과 우회전을 할 수도 있습니다. 이 모든 작업은 Car라는 이름의 인터페이스로 통합할 수 있습니다. 

``` java
public interface Car {
    public void speedUp();
    public void slowDown();
    public void turnRight();
    public void turnLeft();
    public String getCarType();
}
```
다음으로 각 차량 타입은 Car 인터페이스 구현에 정의된 동작의 내용을 제공하기 위해 메서드를 오버라이드해야 합니다. 
이 구현 내용은 차를 운전하는 남자인 사용자에게는 노출되지 않습니다. 

예를 들어 ElectricCar 클래스는 다음과 같이 나타냅니다(물론 실제 세계에서는 System.out.println대신 훨씬 복잡한 비즈니스 논리가 있을 것입니다.)


``` java
public class ElectricCar implements Car{
    private final String carType;

    public ElectricCar(String carType) {
        this.carType = carType;
    }

    @Override
    public void speedUp() {
        System.out.println("Speed up the electric car");
    }

    @Override
    public void slowDown() {
        System.out.println("Slow down the electric car");
    }

    @Override
    public void turnRight() {
        System.out.println("Turn right the electric car");
    }

    @Override
    public void turnLeft() {
        System.out.println("Turn left the electric car");
    }

    @Override
    public String getCarType() {
        return this.carType;
    }
}

```
이 클래스의 사용자는 구현 내용을 전혀 몰라도 public 메서드에 접근할 수 있습니다. 

``` java
public class Main {

    public static void main(String[] args) {
        Car electricCar = new ElectricCar("BMW");
        Car petrolCar = new ElectricCar("Audi");

        System.out.println("Driving the electric car: " + electricCar.getCarType() + "\n");
        electricCar.speedUp();
        electricCar.turnLeft();
        electricCar.slowDown();

        System.out.println("\n\nDriving the petrol car: " + petrolCar.getCarType() + "\n");
        petrolCar.slowDown();
        petrolCar.turnRight();
        petrolCar.turnLeft();

    }
}
```

## 6.1.4 캡슐화란 무엇인가?


## 6.1.5 상속이란 무엇인가?
