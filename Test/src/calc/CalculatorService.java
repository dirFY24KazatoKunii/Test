package calc;

//フィールド定義
public class CalculatorService {
    private Calculator calculator;

//コンストラクター
    public CalculatorService(Calculator calculator) {
        this.calculator = calculator;
    }

//メソッド
    public String addAndReport(int a, int b) {
        int result = calculator.add(a, b);
        return "Result: " + result;
    }
//メソッド
    public String subtractAndReport(int a, int b) {
        int result = calculator.subtract(a, b);
        return "Result: " + result;
    }
}
