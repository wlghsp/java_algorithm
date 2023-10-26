

# 네번째 과제 - 객체 지향 스럽게 핸드폰 사기

<br>

## 클래스: Person, Phone, SmartPhone

<br>

### Person 클래스 설명 
```java
public class Person {

    private final String name;
    private final String favoritePhone;
    private final String favoriteLetter;
    private Phone phone;

    public String getFavoritePhone() {
        return favoritePhone;
    }

    public String getFavoriteLetter() {
        return favoriteLetter;
    }

    public Person(String name, String favoritePhone, String favoriteLetter) {
        this.name = name;
        this.favoritePhone = favoritePhone;
        this.favoriteLetter = favoriteLetter;
    }

    public void buyPhone(Phone phone){
        this.phone = phone;
        System.out.println(this.name + "님이 "  + this.phone.getPhoneName() + "을 샀습니다.");
    }

    public void turnOnPhone() {
        System.out.println(this.name + "님이 " + this.phone.getPhoneName() + "을 켰습니다.");
        pushPowerButton();
    }

    public void turnOffPhone() {
        System.out.println(this.name + "님이 " + this.phone.getPhoneName() + "을 껐습니다.");
        pushPowerButton();
    }

    public void pushPowerButton() {
        phone.changePhoneStatus();
    }

}

```
- 사람 클래스

- 멤버 변수 
     1. name: String 타입의 사람의 이름  
     2. favoritePhone: String 타입의 좋아하는 전화기  
     3. favoriteLetter: String 타입의 좋아하는 문자  
     4. phone: Phone 타입의 Person이 가진 전화기
    * private 접근제한자로 캡슐화
- 메서드
     1. buyPhone : 입력된 전화기를 산다. 다형성으로 상속 받은 자식 객체를 주입 받을 수 있다.
     2. turnOnPhone : 전화기를 켠다.
     3. turnOffPhone : 전화기를 끈다.
     4. pushPowerButton : 전화기 전원버튼을 누른다. 

### Phone 클래스 설명 
```java
public class Phone {

    protected String phoneName; // 전화기 이름

    protected boolean isTurnedOn = false; // 전화기 상태:  초기 상태는 항상 꺼져 있음

    public Phone(String phoneName) {
        this.phoneName = phoneName;
    }

    public String getPhoneName() {
        return this.phoneName;
    }
    public void changePhoneStatus() {
        isTurnedOn = !isTurnedOn;
    }
}

```
- 전화기 클래스 

- 멤버 변수 
     1. phoneName: String 타입의 전화기 이름  
     2. isTurnedOn: boolean 타입의 전화기의 ON/OFF 상태
  * Protected 접근제한자를 사용하여 상속 관계의 클래스에서 변수를 활용할 수 있도록 함  
- 메서드
     1. getPhoneName : 전화기 이름을 반환한다.
     2. changePhoneStatus : 전화기의 상태를 변경

### SmartPhone 클래스 설명 

```java
public class SmartPhone extends Phone {

    private final String loadingLetter;

    public SmartPhone(String phoneName, String loadingLetter) {
        super(phoneName);
        this.loadingLetter = loadingLetter;
    }

    @Override
    public void changePhoneStatus() {
        if (isTurnedOn) {
            System.out.println(this.loadingLetter + " 폰 꺼지는 중 " + this.loadingLetter);

        } else {
            System.out.println(this.loadingLetter + " 폰 켜지는 중 " + this.loadingLetter);
        }
        super.changePhoneStatus();
    }
}

```

- 전화기 클래스를 상속받은 SmartPhone 클래스

- 멤버 변수 
     1. loadingLetter : String 타입의 스마트폰만이 가지는 문자열 변수
- 메서드
     1. changePhoneStatus : 오버라이딩하여 isTurnedOn 변수에 따라 폰이 켜지고 꺼지는 행위를 출력 하고 전화기의 상태를 변경한다.  


### Main 클래스 설명 
```java
public class Main {
    
    public static void main(String[] args) {

        Person[] personArr = {
              new Person("잡th", "삼송폰", "★★★"),
              new Person("거니", "사과폰", "@@@"),
        };

        for (Person person : personArr) {
            action(person);
        }

    }

    public static void action(Person person) {
        person.buyPhone(new SmartPhone(person.getFavoritePhone(), person.getFavoriteLetter()));
        person.turnOnPhone();
        person.turnOffPhone();
    }
}


```

- "잡th"라는 이름, 좋아하는 폰은 "삼송폰", 좋아하는 문자는 "★★★"인 Person 타입의 person 객체와  "거니"라는 이름을 가진 Person 타입의 person 객체를 가진 personArr이라는 변수명을 가진 Person 1차원 배열을 생성한다. 

- 반복문으로 action 이라는 정적 메서드에 personArr Person 배열의 Person 객체를 파라미터로 주입하여 action 함수를 실행한다.    

- action 함수는 Person 객체(자식인 SmartPhone 가능)를 파라미터로 받고 
Person이 좋아하는 전화기와 좋아하는 문자를 가지고 스마트폰 객체를 생성하여 사람 객체가 전화기를 사게 하고 전화기를 켜고 전화기를 끄는 행위를 한다. 