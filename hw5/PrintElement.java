package hw5;

public class PrintElement <T> {
    
    private T element;

    public PrintElement (T element) {

        this.element = element;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public void printElement() {
        System.out.println(element.getClass().getName() + " - " + element);
    }


    public static void main(String[] args) {
        
        PrintElement<Integer> intPrint = new PrintElement<Integer>(42);
        PrintElement<Double> doublePrint = new PrintElement<Double>(3.3);
        PrintElement<String> stringPrint = new PrintElement<>("Привет, мир!");

        intPrint.printElement();
        doublePrint.printElement();
        stringPrint.printElement();
    }
}
