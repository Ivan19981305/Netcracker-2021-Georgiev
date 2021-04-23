package Task1;

public class Car {
    private String wheels;
    private String engine;
    private String carBody;

    private Boolean trunk;



    public Car(String wheels, String engine, String carBody) {
        this.wheels = wheels;
        this.engine = engine;
        this.carBody = carBody;
        if (carBody != null && carBody.charAt(0) == '1')
        {
            trunk = true;
        }
        if (carBody != null && carBody.charAt(0) == '2')
        {
            trunk = false;
        }
    }

    public Car() {

    }

    public String getWheels() {
        return wheels;
    }

    public void setWheels(String wheels) {
        this.wheels = wheels;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getCarBody() {
        return carBody;
    }

    public void setCarBody(String carBody) {
        if (carBody != null && carBody.charAt(0) == '1')
        {
            trunk = true;
        }
        if (carBody != null && carBody.charAt(0) == '2')
        {
            trunk = false;
        }
        this.carBody = carBody;
    }

    public Boolean getTrunk() {
        return trunk;
    }

    public void setTrunk(Boolean trunk) {
        this.trunk = trunk;
    }

    @Override
    public String toString() {
        return "Car{" +
                "wheels='" + wheels + '\'' +
                ", engine='" + engine + '\'' +
                ", carBody='" + carBody + '\'' +
                ", trunk=" + trunk +
                '}';
    }
}
