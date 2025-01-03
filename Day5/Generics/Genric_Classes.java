package day4;

class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "(" + key + ", " + value + ")";
    }
}

public class Genric_Classes {
    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("Age", 25);
        System.out.println("Pair 1: " + pair1);

        Pair<Integer, String> pair2 = new Pair<>(101, "Alice");
        System.out.println("Pair 2: " + pair2);

        Pair<String, String> pair3 = new Pair<>("Key", "Value");
        System.out.println("Pair 3: " + pair3);

        Pair<Double, Boolean> pair4 = new Pair<>(99.99, true);
        System.out.println("Pair 4: " + pair4);
    }
}
