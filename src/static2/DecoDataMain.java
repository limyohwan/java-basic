package static2;

import static static2.DecoData.staticCall; // 정적 메서드를 import할 수 있으며 호출할 때 클래스명을 생략할 수 있음, 정적 변수에도 사용가능
// import static static2.DecoData.*; // 정적 메서드를 import할 수 있으며 호출할 때 클래스명을 생략할 수 있음


public class DecoDataMain {

    public static void main(String[] args) {
        System.out.println("정적 호출");
        staticCall();
        staticCall();
        staticCall();
        staticCall();
        staticCall();


        System.out.println("인스턴스 호출");
        DecoData data1 = new DecoData();
        data1.instanceCall();

        System.out.println("인스턴스2 호출");
        DecoData data2 = new DecoData();
        data2.instanceCall();

        System.out.println("DecoData.staticCall 호출");
        staticCall(data2);

        // 추가
        DecoData data3 = new DecoData();
        data3.staticCall(); // 이것도 인스턴스 메서드인지 클래스 메서드인지 헷갈림을 유발하므로 사용하지 않는게 좋음

        staticCall();
        staticCall();

    }
}
