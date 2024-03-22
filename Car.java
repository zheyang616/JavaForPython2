enum PowerType{ELECTRIC, UNLEADED, DIESEL}

enum CarStyle{SEDAN, COUPE, TRUCK, SUV}

public class Car {
    private int horsePower;
    private PowerType powerType;
    private CarStyle carStyle;


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
