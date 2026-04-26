package Example;

public class SmartHomeApp {

    public static void main(String[] args) {

        Lights myLights = new LivingRoomLights();
        Heating myHeating = new CentralHeating();
        SecuritySystem mySecurity = new HomeSecuritySystem();
        SmartHomeFacade myHome = new SmartHomeFacade(myLights, myHeating, mySecurity);

        // call 'easy' methods provided by the facade class
        myHome.arriveHome();
        myHome.leaveHome();

        // directly call subsystem methods if needed
        mySecurity.readLog();
    }
}
