import java.util.ArrayList;
import java.util.List;

public class Geyser {

    private List<Listener> listeners = new ArrayList<>();
    private Thermometer thermometer;

    public void switchLever( SwitchTo switchTo ) {

        for ( Listener listener : listeners )

            if ( listener instanceof Thermometer ) {
                thermometer = ( Thermometer ) listener;

                thermometer.onChange( switchTo );
            }

    }

    public void addListener( Listener listener ) {
        listeners.add( listener );
    }

}


