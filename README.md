# 김영한의 실전 자바 - 기본편

## 클래스, 객체, 인스턴스 정리

### 클래스
- 클래스 = 객체를 생성하기 위한 틀, 설계도
- 속성(변수)과 기능(메서드)를 정의
- 자동차 설계도(클래스), 테슬라 Y(객체, 인스턴스)

### 객체
- 클래스에서 정의한 속성과 기능을 가진 실체
- 객체는 서로 독립적인 상태를 가짐
- student1은 학생1의 속성, student2는 학생2의 속성을 가지는 객체이며 같은 클래스에서 만들어졌지만 서로 다른 객체임

### 인스턴스
- 특정 클래스로부터 생성된 객체
- 객체가 어떤 클래스에 속해 있는지 강조, student1은 Student클래스의 인스턴스라고 표현
- 객체보다 좀더 관계에 초점을 맞춘 단어
- 모든 인스턴스 = 객체

## 기본형 vs 참조형
- 기본형(primitive type) = 사용하는 값을 변수에 직접 넣음 (int, long, double, boolean ...)
- 참조형(reference type) = 객체가 저장된 메모리의 위치를 가르키는 참조값을 넣음 (new로 생성하는 것들)

### 자바는 항상 변수의 값을 복사해서 대입함
- 기본형 = 변수에 들어 있는 실제 사용하는 값을 복사해서 대입
- 참조형 = 변수에 들어 있는 참조값을 복사해서 대입

## 변수의 종류
- 멤버 변수(필드) = 클래스에 선언
- 지역 변수 = 메서드에 선언, 매개 변수도 지역 변수의 한 종류

## 변수 값 초기화
- 멤버 변수 = 자동 초기화, 초기값 지정 가능, 기본형(int = 0, boolean = false ...), 참조형 = null
- 지역 변수 = 수동 초기화

## 절차 지향 프로그래밍 vs 객체 지향 프로그래밍

### 절차 지향 프로그래밍
- 실행 순서를 중요하게 생각하는 방식
- 프로그램의 흐름을 순차적으로 따르며 처리하는 방식, 어떻게를 중심으로 프로그래밍
- 데이터와 기능이 분리되어 있기 때문에 유지보수와 변경에 용이하지 않음

### 객체 지향 프로그래밍
- 객체를 지향함
- 실제 세계의 사물이나 사건을 객체로 보고 이 객체들 간의 상호작용을 중심으로 처리하는 방식, 무엇을 중심으로 프로그래밍
- 객체지향 대표적인 특징(캡슐화 상쇽 다형성)

### 차이점
- 절차 지향은 데이터와 해당 데이터에 대한 처리 방식이 분리되어 있음
- 객체 지향은 데이터와 그 데이터에 대한 행동(메서드)이 하나의 객체안에 포함되어 있음

## 패키지

### 패키지 규칙
- 패키지의 이름과 위치는 폴더(디렉토리) 위치와 같아야 함(필수)
- 패키지 이름은 모두 소문자를 사용(관례)
- 패키지 이름 앞부분에는 일반적으로 회사 도메인의 이름을 거꾸로 사용함(com.naver.webtoon)(관례)

### 패키지 계층 구조
- a
  - b
  - c
- a, a.b, a.c 패키지는 각각 다른 패키지이며 import해서 사용해야함

## 접근 제어자

### 접근 제어자 종류
- private = 모든 외부 호출 막음(클래스내에서만 사용)
- default(package-private) = 같은 패키지 안에서만 허용
- protected = 같은 패키지 안에서 호출 허용, 패키지가 달라도 상속 관계에서 호출 허용
- public = 모든 외부 호출 허용
- private -> default -> protected -> public

### 사용 위치
- 클래스에는 일부 사용 (public, default)
  - public class는 반드시 파일명과 이름이 같아야함
  - 하나의 자바파일에 public class는 하나만 등장 가능
  - 하나의 자바파일에 default 접근자를 사용하는 클래스는 무한정 만들 수 있음
- 필드, 생성자. 메서드

### 캡슐화
- 접근 제어자를 사용해 캡슐화를 안전하게 완성시켜줌
- 데이터를 숨겨라 = 데이터는 메서드를 통해서 접근해야함
- 기능을 숨겨라 = 내부에서만 사용하는 기능은 숨겨야함

## 자바 메모리 구조

### 비유
- 메서드 영역 = 클래스 정보 보관(붕어빵 틀)
- 스택 영역 = 실제 프로그램이 실행되는 영역, 메서드를 실행할 때마다 하나씩 쌓임
- 힙 영역 = 객체(인스턴스)가 생성되는 영역, new 명령어를 사용하면 이 영역을 사용함, 붕어빵 틀로부터 생성된 붕어빵이 존재하는 공간, 배열도 이 공간을 사용함

### 실제
- 메서드 영역(method area) = 프로그램 실행에 필요한 공통 데이터 관리
  - 클래스 정보 = 클래스의 실행 코드(바이트 코드), 필드, 메서드와 생성자 코드 등
  - static 영역 = static 변수들을 보관
  - 런타임 상수 풀 = 프로그램을 실행하는데 필요한 공통 리터럴 상수를 보관, "hello"라는 문자열가 있으면 이런 문자를 공통으로 묶어서 관리함
- 스택 영역(stack area) = 자바 실행 시 하나의 실행 스택이 생성됨, 각 스택 프레임은 지역 변수, 중간 연산결과, 메서드 호출 정보등을 포함함
  - 스택 프레임 = 스택 영역에 쌓이는 네모 박스가 하나의 스택 프레임임, 메서드 호출할 떄마다 하나의 스택 프레임이 쌓이고 메서드가 종료되면 해당 스택 프레임이 제거됨
  - 각 쓰레드 별로 하나의 실행 스택이 생성됨 = 쓰레드 수 만큼의 스택 영역이 생성됨
- 힙 영역(heap area) = 객체(인스턴스)와 배열이 생성되는 영역, 가비지 컬렉션(GC)이 이루어지는 주요 영역, 더이상 참조하지 않는 객체는 GC에 의해 제거됨
  - 힙 영역 안에서만 인스턴스끼리 서로 참조해도 GC에서 제거됨

### 메서드 코드는 메서드 영역에
- 클래스가 100개의 인스턴스를 생성하면 힙 메모리에 100개의 인스턴스가 생기지만 메서드는 메서드 영역에 있는 공통된 코드를 공유함
- 새로운 객체가 생성될 때 인스턴스 변수에는 메모리가 할당되지만 메서드에 대한 새로운 메모리 할당은 없음

### 스택 영역
- 자바는 스택영역을 사용하여 메서드 호출과 지역 변수(매개 변수)를 관리함
- 메서드 호출마다 스택 프레임이 계속 쌓임
- 스택 프레임 종료시 지역 변수도 함께 제거됨
- 스택 프레임 모두 제거 시 프로그램도 종료됨

## 멤버 변수(필드)의 종류
- 인스턴스 변수 = static이 붙지않음
  - 인스턴스를 생성해야 사용할 수 있으며 인스턴스에 소속됨
  - 인스턴스 변수를 만들 때 마다 새로 만들어짐
- 클래스 변수 = static이 붙음
  - 클래스 변수, 정적 변수, static 변수
  - 인스턴스와 무관하게 클래스에 바로 접근해서 사용가능, 클래스에 소속되어 있음
  - 자바 프로그램이 시작할 때 딱 1개가 만들어짐, 인스턴스와는 다르게 보통 여러곳에서 공유하는 목적으로 사용함

### 변수와 생명주기
- 지역 변수(매개변수 포함) = 스택영역안에 스택프레임안에 보관됨, 메서드가 종료되면 스택 프레임도 제거되는데 이때 해당 스택프레임에 포함된 지역변수도 함께 제거됨, 생존주기가 짧음
- 인스턴스 변수 = 인스턴스에 있는 멤버변수, 힙 영역을 사용함, 힙영역은 GC가 발생하기 전까지 생존하기 때문에 지역변수보다 생존주기가 김
- 클래스 변수 = 메서드 영역의 static 영역에 보관됨, 메서드 영역은 프로그램 전체에서 사용하는 공용 공간, 클래스 변수는 해당 클래스가 JVM에 로딩되는 순간 생성됨, JVM이 종료될 때 까지 생명주기가 이어짐, 생명주기가 제일 김

## 멤버 메서드의 종류
- 인스턴스 메서드 = static이 붙지않음
- 클래스 메서드 = static이 붙음
  - 클래스 메서드, 정적 메서드, static 메서드

### 정적 메서드 활용
- 객체 생성 없이 메서드의 호출만으로 필요한 기능을 수행할 때 사용
- 유틸리티성 메서드에 자주 사용

## 상속
- 객체 지향 프로그래밍의 핵심 요소
- extends 키워드 사용
- 부모클래스(슈퍼클래스) = 상속을 통해 자신의 필드와 메서드를 다른 클래스에 제공
- 자식클래스(서브클래스) = 부모 클래스로부터 필드와 메서드를 받아 사용
- 자바는 다중 상속을 지원하지 않음 -> 인터페이스 다중 구현 허용으로 한계 돌파
- 중복 코드 제거

### 상속과 메모리 구조
- 상속 관계의 객체를 생성하면 그 내부에는 부모와 자식이 모두 생성됨
- 상속 관계의 객체를 호출할 때 대상 타입을 정해야함. 이때 호출자의 타입을 통해 대상 타입을 찾음
- 현재 타입에서 기능을 찾지 못하면 부모 타입으로 기능을 찾아서 실행함. 기능을 찾지못하면 컴파일 에러가 발생함

### 메서드 오버라이딩 조건
- 메서드 이름
- 메서드 매개변수
- 반환 타입
- 접근 제어자는 상위 클래스보다 더 제한적이어선 안됨
- 하위타입 예외 선언 불가
- static final private은 오버라이딩 불가함
- 생성자는 오버라이딩 불가함

### 접근제어자 UML 표기법
- `+` = public = 모든 외부 호출 가능
- `#` = protected = 같은 패키지안에서 호출 허용, 패키지가 달라도 상속관계 호출 허용
- `~` = default = 같은 패키지 호출 허용
- `-` = private = 모든 외부호출 막음

### super 생성자
- 자식 클래스 생성자에서 부모 클래스 생성자를 무조건 호출해주어야함

### final
- 클래스에 final이 붙으면 상속이 불가함
- 메서드에 final이 붙으면 오버라이딩이 불가함

## 다형성
- 객체지향 프로그래밍의 꽃
- 다양한 형태, 한 객체가 여러 타입의 객체로 취급됨

### 다형적 참조
- 부모 타입의 변수가 자식 인스턴스 참조
- 부모는 자식을 담을 수 있음
- 하나의 변수 타입으로 다양한 자식 인스턴스를 참조할 수 잇는 기능

### 캐스팅
- 업캐스팅 = 부모 타입으로 변경
- 다운 캐스팅 = 자식 타입으로 변경

### 메서드 오버라이딩
- 인스턴스 안에서 오버라이딩 된 메서드는 항상 우선권을 가짐
- 기존 기능을 하위 타입에서 새로운 기능으로 재정의

## 상속
- 적절한 제약이 있는 프로그래밍이 좋은 프로그래밍이다

### 추상 클래스
- abstract 키워드를 클래스 선언 앞에 붙여줌
- 인스턴스화 불가함 -> 개발자 실수 방지

### 추상 메서드
- 자식 클래스가 반드시 오버라이딩해야하는 메서드 -> 개발자 실수 방지
- 실체가 없음
- 바디가 없음
- 추상 메서드가 하나라도 있는 클래스는 추상클래스로 선언해야함 -> 실체가 없는 메서드이기 때문에 사용할 수 없으므로 클래스가 인스턴스화되면 안되기 때문임

### 순수 추상 클래스
- 인스턴스를 생성할 수 없음
- 상속시 자식은 모든 메서드를 오버라이딩 해야함
- 주로 다형성을 위해 사용됨
- 자바에서는 사용하지 않는 개념임
- 자바에서는 순수 추상 클래스를 위해 인터페이스라는 개념을 제공함

### 인터페이스
- public abstract 키워드 생략 가능
- 순수 추상 클래스와 같으며 약간의 편의 기능이 추가됨
- 다중 구현(상속)을 지원함
- 인터페이스에 멤버 변수 사용 가능 -> 인터페이스의 멤버변수는 public static final이 모두 포함되어 있다고 간주됨
- 메서드 이름만 있는 설계도
- 제약 = 순수 추상클래스는 미래에 누군가가 추상 메서드가 아닌 메서드를 생성할 수 있음 -> 자식 클래스에서 실수하고 구현하지 않을 수 있으며 순수 클래스가 아니게됨
- 다중 구현
- 자바8의 default 메서드, 자바9의 private 메서드

### 다중 상속 문제
- 클래스 계층 구조가 복잡해짐
- 부모에 같은 메서드가 있을시 어떤 메서드를 호출할지 애매해짐, 다이아몬드 문제

### 다중 구현
- 인터페이스에서는 다이아몬드 문제가 발생하지 않음