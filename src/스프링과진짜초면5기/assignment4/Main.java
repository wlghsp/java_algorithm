package 스프링과진짜초면5기.assignment4;

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
