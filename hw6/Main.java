package hw6;

public class Main {
    public static void main(String[] args) {
        CalcModel model = new CalcModel();
        CalcView view = new CalcView();
        CalcController calcController = new CalcController(model, view);

        calcController.calculate();
    }
}
