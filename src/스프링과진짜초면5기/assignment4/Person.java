package 스프링과진짜초면5기.assignment4;

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
