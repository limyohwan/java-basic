package access;

public class Speaker {
    private int volume; // 직접 접근 방지

    Speaker(int volume) {
        this.volume = volume;
    }

    void volumeUp() {
        if (volume >= 100) {
            System.out.println("최대 음량입니다");
        } else {
            volume += 10;
            System.out.println("음량 10 증가");
        }
    }

    void volumeDown() {
        volume-= 10;
        System.out.println("음량 10 감소");
    }

    void showVolume() {
        System.out.println("volume = " + volume);
    }
}
