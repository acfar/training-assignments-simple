package eu.sig.training.ch03;

import java.awt.Color;
import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlagFactory {

    private static Map<Nationality, List<Color> > Flags = new HashMap<Nationality, List<Color>>()

    static {
        Flags.put(DUTCH,Arrays.asList(Color.RED, Color.WHITE, Color.Blue));
        Flags.put(GERMAN,Arrays.asList(Color.BLACK, Color.RED, Color.YELLOW));
        Flags.put(BELGIAN,Arrays.asList(Color.BLACK, Color.YELLOW, Color.RED));
        Flags.put(FRENCH,Arrays.asList(Color.BLUE, Color.WHITE, Color.RED));
        Flags.put(ITALIAN,Arrays.asList(Color.GREEN, Color.WHITE, Color.RED));
        Flags.put(ROMANIA,Arrays.asList(Color.BLUE, Color.YELLOW, Color.RED));
        Flags.put(IRELAND,Arrays.asList(Color.GREEN, Color.WHITE, Color.ORANGE));
        Flags.put(HUNGARIAN,Arrays.asList(Color.RED, Color.WHITE, Color.GREEN));
        Flags.put(BULGARIAN,Arrays.asList(Color.RED, Color.WHITE, Color.GREEN));
        Flags.put(RUSSIA,Arrays.asList(Color.RED, Color.WHITE, Color.GREEN));



    }

    // tag::getFlag[]
    public List<Color> getFlagColors(Nationality nationality) {
        List<Color> result=Flags.get(Nationality nationality);
        return result != null? result:Arrays.asList(Color.GRAY);

    }
    // end::getFlag[]

}