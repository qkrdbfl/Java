package section8.initblock;

public class Application {
    public static void main(String[] args) {
        //초기화 블럭의 동작 순서를 이해하고 이를 활용하여 인스턴스를 생성할수 있다

        //기본 생성자로 인스턴스 생성
        Product product= new Product();

        System.out.println(product.getInformation());

        //매개변수 생성자로 인스턴스 생성
        Product product2 = new Product("폰",30000,"새오미");
        System.out.println(product2.getInformation());
    }
}
