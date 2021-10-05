public class API {

    public static void main( String[] args ) {
        Geyser geyser = new Geyser();
        Thermometer thermometer = new Thermometer();
        Alarm alarm = new Alarm();

        geyser.addListener( thermometer );
        thermometer.addListener( alarm );

        geyser.switchLever( SwitchTo.ON);





    }
}
