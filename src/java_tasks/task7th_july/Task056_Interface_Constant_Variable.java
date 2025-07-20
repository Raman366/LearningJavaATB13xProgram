package java_tasks.task7th_july;

public class Task056_Interface_Constant_Variable {
    public static void main(String[] args) {
        MotorCar car = new MotorCar();
        car.Speed_simit();
    }
}

interface SpeedLimit{
    int MAX_SPEED = 120; // public static final by default
}
class MotorCar implements SpeedLimit{
    public void Speed_simit(){
        System.out.println("The maximum speed of car is: " + SpeedLimit.MAX_SPEED);
    }
}