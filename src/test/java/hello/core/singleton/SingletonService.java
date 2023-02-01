package hello.core.singleton;

public class SingletonService { //객체를 미리 생성해두는 가장 안정적인 방법

    private static final SingletonService instance = new SingletonService();

    public static SingletonService getInstance() {
        return instance;
    }

    private SingletonService() { //new 호출을 못하게 막는다.

    }

    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }
}
