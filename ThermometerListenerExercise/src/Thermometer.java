

import java.util.ArrayList;
import java.util.List;

public class Thermometer implements Listener {

    private SwitchTo switchTo;
    private WaterTemperature waterTemperature;
    private List<Listener> listeners = new ArrayList<>();
    private Alarm alarm;


    public void onChange( Object obj ) {

        switchTo = ( SwitchTo ) obj;

        switch ( switchTo ) {
            case ON:
                waterTemperature = WaterTemperature.HOT;

                for ( Listener listener : listeners )

                    if ( listener instanceof Alarm ) {
                        alarm = ( Alarm ) listener;
                        alarm.onChange( WaterTemperature.HOT );
                    }

                break;

            case OFF:
                waterTemperature = WaterTemperature.COLD;
                break;

        }

    }

    public void addListener(Listener listener){

        listeners.add( listener );

    }



}
