package sem2.work4;

interface MathOperations {

    int add(int a, int b);

    default int subtract(int a, int b) {
        return a - b;
    }
}
