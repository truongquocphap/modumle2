package bai8_clean_code.thuchanh.refactor_bien_va_hang;

public class RefactorVariableAndFinal {
    private int firstOperand;
    private int secondOperand;
    private char operator;
    public static final char ADDITION = '+';
    public static final char SUBTRACTION = '-';
    public static final char MULTIPLICATION = '*';
    public static final char DIVISION = '/';

    public RefactorVariableAndFinal() {
    }

    public RefactorVariableAndFinal(int firstOperand, int secondOperand, char operator) {
        this.firstOperand = firstOperand;
        this.secondOperand = secondOperand;
        this.operator = operator;
    }

    public int getFirstOperand() {
        return firstOperand;
    }

    public void setFirstOperand(int firstOperand) {
        this.firstOperand = firstOperand;
    }

    public int getSecondOperand() {
        return secondOperand;
    }

    public void setSecondOperand(int secondOperand) {
        this.secondOperand = secondOperand;
    }

    public char getOperator() {
        return operator;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    public static double calculate(int firstOperand, int secondOperand, char operator) {
        switch (operator) {
            case ADDITION:
                return firstOperand + secondOperand;
            case SUBTRACTION:
                return firstOperand - secondOperand;
            case MULTIPLICATION:
                return firstOperand * secondOperand;
            case DIVISION:
                if (secondOperand != 0) {
                    return firstOperand / secondOperand;
                } else {
                    throw new RuntimeException("con not divide by 0");
                }
            default:
                throw new RuntimeException("unsupported operation");

        }
    }
}
