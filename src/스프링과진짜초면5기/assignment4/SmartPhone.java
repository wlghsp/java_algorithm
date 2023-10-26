package 스프링과진짜초면5기.assignment4;

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
