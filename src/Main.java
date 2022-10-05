import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String[] data = {"Rosa", "Pepe", "María", "Pepe", "Pepe", "Rosa"};

        HistogramGenerator histogramGenerator = new HistogramGenerator(data);
        Map<String, Integer> histogram = histogramGenerator.getHistogram();

        for (Map.Entry<String, Integer> entry : histogram.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

    }
}