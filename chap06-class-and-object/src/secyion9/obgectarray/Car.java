package secyion9.obgectarray;

public class Car {
    private String modelName;
    private int maxSpeed;

    public Car(String modelName, int maxSpeed) {
        this.modelName = modelName;
        this.maxSpeed = maxSpeed;
    }
    public void driveMaxSpeed() {
        System.out.println(modelName+"이(가) 최고 시속" + maxSpeed + " km/h 달려간다");
    }



}
