package section7.kindsofvariable;

public class KindsOfVarible {
    //다양한 변수를 이해하고 사용할수 있다

    //non-static field를 인스턴스 변수라고 한다 (인스턴스 생성 시점에 사용가능한 변수라는 의미
    private int globalNum;
    //static field를 클래스 변수 (정적필드)라고 한다. (정적 메모리 영역에 생성되는 변수라는 의미)
    private static int staticNum;

    public void method(int num) {

        int localNum;

        //매개변수는 호출시 값이 전달 되므로 별도의 값 대입은 필요없다.
        System.out.println("num : " + num);
        //지역 변수는 선언 외의 다시 사용하기 위해서는 반드시 초기화 되어야 한다
        //System.out.println("LocalNum : " + localNum);

        System.out.println("globalNum : " + globalNum);
        System.out.println("globalNum : " + staticNum);

    }
    public void method2() {
        //지역변수는 해당 (블럭 내)에서만 사용가능.
        //System.out.println("globalNum : " + localNum); //위에 int localNum;로 선언한건 괄호 밖이라서 외부껀 다른걸로 침
        System.out.println("globalNum : " + globalNum);
        System.out.println("globalNum : " + staticNum);
    }







}
