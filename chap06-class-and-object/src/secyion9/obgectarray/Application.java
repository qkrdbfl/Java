package secyion9.obgectarray;

public class Application {
    public static void main(String[] args) {
        //객체 배열에 대해 이해할수 있다

        //동일 타입의 인스턴스를 여러개 사용해야 할때 객체 배열을 이요하면 보다 효율적으로 사용이 가능하다
        Car[] carArray = new Car[5];

        //carArray의 각 인덱스는 기본 값 null로 초기화 되어 잇기 때문에 인덱스별로 인스턴스를 생성해야한다
        carArray[0] = new Car("페라리", 300);
        carArray[1] = new Car("람보르기", 300);
        carArray[2] = new Car("롤스로이스", 300);
        carArray[3] = new Car("부가티베이론", 300);
        carArray[4] = new Car("포터", 300);

        //배열은 반복문을 통해 일괼 처리가 가능하다는 장점
        for (int i = 0; i < carArray.length; i++) {
            carArray[i].driveMaxSpeed();
        }

        //객체 배열도 할당과 동시에 초기화 할수있음
        Car[] carArray2 = {
                new Car("페라리", 300),
        new Car("람보르기", 300),
        new Car("롤스로이스", 300),
        new Car("부가티베이론", 300),
        new Car("포터", 300),
        };

        //향상된 for문도 사용이 가능하다
        for (Car car : carArray2) {
            car.driveMaxSpeed();
        }
    }
}
