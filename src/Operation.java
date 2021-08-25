public class Operation {
    private final int first;
    private final int second;


    public Operation(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public int addition() {

        return first + second;
    }
    public int subtraction() {
        return  first - second;
    }
    public int multiplication() {
        return  first * second;
    }
    public int division() {
        return  first / second;
    }
}
