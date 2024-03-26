enum PowerType{ELECTRIC, UNLEADED, DIESEL}

enum CarStyle{SEDAN, COUPE, TRUCK, SUV}

enum Make{HONDA, TOYOTA, SUBARU, NISSAN}

enum Model{CRV, FOUR_RUNNER, ACENT, MAXIMA}

public class Car {
    private int horsePower;
    private PowerType powerType;
    private CarStyle carStyle;
    private Make make;
    private Model model;
    private double mileage;
    static int numberOfCars;
    final int year;
    String carName;

    public double ConvertMileageToKilometers(double mileage){
        return this.mileage * 1.609;
    }
    

    public Car(Model model, Make make, int year){
        this.make = make;
        this.model = model;
        numberOfCars++;
        this.year = year;
    }

    public Model getModel(){
        return model;
    }

    public String toString(){
        return make + " " + model;
    }

    public double mileage(double mileage){
        return mileage;
    }

    public void Drive(double addMileage){
        mileage = mileage + addMileage;
    }

    public void HONK(){
        System.out.println("HONK");
    }

    //this is a public getter/accessor
    public int getHorsePower(){
        return horsePower;
    }

    //this is a public setter/mutator
    public void setHorsePower(int HP){
        if (HP < 100)
            horsePower = 100;
        else if (HP > 200)
            horsePower = 200;
        else horsePower = HP;
    
        this.horsePower = horsePower;
    }
    public PowerType getPowerType(){
        return powerType;
    }
    public void setPowerType(PowerType powerType){
        this.powerType = powerType;
    }
    public CarStyle getCarStyle(){
        return carStyle;
    }
    public void setCarStyle(CarStyle carStyle){
        this.carStyle = carStyle;
    }
}
