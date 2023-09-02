package hw3.prog4;

interface Operations {

    int add(int a, int b);

    default int subtract(int a, int b) {
        return a*b;
    }
}