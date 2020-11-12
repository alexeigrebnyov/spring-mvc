package web.model;

public class Car {
    private String model;
    private int seres;
    private String color;

    public Car(){}

    public Car(String model, int seres, String color) {
        this.model = model;
        this.seres = seres;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeres() {
        return seres;
    }

    public void setSeres(int seres) {
        this.seres = seres;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", seres=" + seres +
                ", color='" + color + '\'' +
                '}';
    }
}
