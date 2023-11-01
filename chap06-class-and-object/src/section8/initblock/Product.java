package section8.initblock;

public class Product {
    //1.필드를 초기화 하지 않으면 jvm이 정한 기본 값으로 객체가 생성된다
//    private String name;
//    private  int price;
//    private static String brand;


    //2. 명시적 초기화//
    private String name = "갤럭시";
    private  int price = 100000;
    private static String brand ="삼성";


    //3. 초기화 블럭//
    //초기화 블럭들이 덮어쓰기를 한다(우선순위)
    //인스턴스 초기화 블럭
    {    name =" 사이언";
        price = 8000;
       //static 초기화 블럭에서 이미 "헬지"로 초기화 되어 있지만
        //인스턴스 생성 시 다시 인스턴스 초기화 블럭이 동작하며 "사과" 로 값이 변경됨
        brand = "사과";
        System.out.println("인스턴스 초기화 블럭 동작..");
    }
//-----------------------------------------------------------
    //static초기화 블럭
    static {
//        name = " 아이폰";          //static 초기화 블럭에서는 non-static 필드 초기화 불가능
//        price + 1500000;
        brand = "헬지";

    System.out.println("static 초기화 블럭 동작..");
    }


    public Product() {
        System.out.println("기본 초기화 블럭 동작..");
    }


    public Product(String name, int price, String brand) {
        this.name = name;
        this.price = price;
        Product.brand = brand;
    }

    public String getInformation() {
        return "product [" + this.name + ", price =" + this.price + ",brand =" + Product.brand + "]";
    }





}
