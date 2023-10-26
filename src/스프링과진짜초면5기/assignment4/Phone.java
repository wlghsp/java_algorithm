package 스프링과진짜초면5기.assignment4;

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
