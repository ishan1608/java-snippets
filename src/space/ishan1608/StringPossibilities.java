package space.ishan1608;

public class StringPossibilities {
    public static void main(String[] args) {
        // NOTE: a = 1, b = 2, ...x = 26
        // "12" --> "ab" or "l"
        // number of possibilities = 2
//        int[] data = {1};
//        int[] data = {1, 2, 1};
//        int[] data = {1, 9, 1};
//        int[] data = {1, 2, 3, 4, 5};
        int[] data = {1, 2, 1, 1, 1, 2, 3};

        int recursiveResult = recursivePossibilitiesCount(data);
        System.out.println(String.format("Possibilities: %d", recursiveResult));
    }

    private static int recursivePossibilitiesCount(int[] data) {
        int[] results = new int[data.length];
        return _recursiveCounter(data, 0, results);
    }

    private static int _recursiveCounter(int[] data, int index, int[] results) {
        if (index >= (data.length -1)) {
            return 1;
        }

        if (results[index] != 0) {
            return results[index];
        }

        int number;
        if (index + 1 < data.length) {
            number = data[index] * 10 + data[index + 1];
        } else {
            number = data[index];
        }
        int firstResult = _recursiveCounter(data, index + 1, results);
        int secondResult = 0;
        if ((number >= 10) && (number <= 26)) {
            secondResult = _recursiveCounter(data, index + 2, results);
        }
        results[index] = firstResult + secondResult;
        return results[index];
    }
}
