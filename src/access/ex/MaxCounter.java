package access.ex;

public class MaxCounter {
    private int count;
    private int max;

    public MaxCounter(int max) {
        this(0, max);
    }

    private MaxCounter(int count, int max) {
        this.count = count;
        this.max = max;
    }

    public void increment() {
        // 검증 로직
        if (count >= max) {
            System.out.println("최대값 초과 불과");
            return;
        }

        // 실행 로직
        count++;
    }

    public int getCount() {
        return count;
    }
}
