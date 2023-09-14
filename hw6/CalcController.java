package hw6;

public class CalcController {
    
    private CalcModel model;
    private CalcView view;

    public CalcController (CalcModel  model, CalcView view){
        this.model = model;
        this.view = view;
    }

    public double inputNumberOne(){
        return view.numberOne();
    }
    public double inputNumberTwo(){
        return view.numberTwo();
    }
    public String inputOperator() {
        return view.oper();
    }

    public void calculate() {
        double result;
        try {
            switch (inputOperator()){
                case "+":
                    result = model.sumNumbers(inputNumberOne(), inputNumberTwo());
                    break;
                case "-":
                    result = model.substructNumbers(inputNumberOne(), inputNumberTwo());
                    break;
                case "*":
                    result = model.multiplNumbers(inputNumberOne(), inputNumberTwo());
                    break;
                case "/":
                    result = model.divideNumbers(inputNumberOne(), inputNumberTwo());
                    break;
                default:
                    view.printError("Identified operator! Try again!");
                    return;
            }
            view.printResult(result);
        } catch (ArithmeticException er) {
            view.printError(er.getMessage());
        }
    }
}
