public class Alarm  implements Listener{

    private String siren;

    public void onChange(WaterTemperature waterTemperature){

        if ( waterTemperature == WaterTemperature.HOT ){

            siren = "Ring...";
        }

        System.out.println(siren);
    }




}
