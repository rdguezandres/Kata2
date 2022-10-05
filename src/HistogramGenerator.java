import java.util.HashMap;
import java.util.Map;

public class HistogramGenerator {

    private final int [] data;

    public HistogramGenerator(int [] data) {
        this.data = data;
    }

    public Map<Integer, Integer> getHistogram() {
        Map<Integer, Integer> histogram = new HashMap<>();
        for (int key : data) {
            histogram.put(key, histogram.containsKey(key) ? histogram.get(key) + 1 : 1);
        }
        return histogram;
    }
}
