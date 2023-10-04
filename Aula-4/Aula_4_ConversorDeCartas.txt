import java.util.HashMap;
import java.util.Map;

public class ConversorDeCartas {

    private static final Map<String, Integer> CARTAS = new HashMap<>();

    static {
        CARTAS.put("A", 1);
        CARTAS.put("2", 2);
        CARTAS.put("3", 3);
        CARTAS.put("4", 4);
        CARTAS.put("5", 5);
        CARTAS.put("6", 6);
        CARTAS.put("7", 7);
        CARTAS.put("8", 8);
        CARTAS.put("9", 9);
        CARTAS.put("10", 10);
        CARTAS.put("J", 11);
        CARTAS.put("Q", 12);
        CARTAS.put("K", 13);
    }

    public int converteCartaParaInt(String carta) {
        return CARTAS.getOrDefault(carta.toUpperCase(), -1);
    }
}