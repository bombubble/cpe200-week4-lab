package cpe200;


import java.text.DecimalFormat;

public class BinaryCalculator {
    private Operand firstOperand;
    private Operand secondOperand;

    public BinaryCalculator() {
    }

    public void setFirstOperand(Operand operand) {
        this.firstOperand = operand;
    }


    public void setSecondOperand(Operand operand) {
        this.secondOperand = operand;
    }

    public String add() {
        double x = Double.parseDouble(firstOperand.getOp())+Double.parseDouble(secondOperand.getOp());
        if(x == Math.floor(x)){
            int t = (int)x;
            return Integer.toString(t);
        }
        else{
            return Double.toString(x);
        }
    }

    public String subtract() {
        double x = Double.parseDouble(firstOperand.getOp()) - Double.parseDouble(secondOperand.getOp());
        if(x == Math.floor(x)){
            int t = (int)x;
            return Integer.toString(t);
        }
        else{
            x = x*100;
            x = Math.ceil(x);
            int y = (int)x;
            x = (double)y / 100;
            return Double.toString(x);
        }
    }

    public String multiply() {
        double x = Double.parseDouble(firstOperand.getOp())*Double.parseDouble(secondOperand.getOp());
        if(x == Math.floor(x)){
            int t = (int)x;
            return Integer.toString(t);
        }
        else{
            return Double.toString(x);
        }
    }

    /* This method should throw an exception when divide by zero */
    public String division() throws ArithmeticException {
        if(Double.parseDouble(secondOperand.getOp()) != 0) {
            double x = Double.parseDouble(firstOperand.getOp()) / Double.parseDouble(secondOperand.getOp());
            if (x == Math.floor(x)) {
                int t = (int) x;
                return Integer.toString(t);
            } else {
                x = x*100000;
                x = Math.floor(x);
                int y = (int)x;
                x = (double)y/100000;
                return Double.toString(x);
            }
        }
        else {
            int x=1/0;
            return "";
        }

    }

    public String power() {


        double x = Math.pow(Double.parseDouble(firstOperand.getOp()),Double.parseDouble(secondOperand.getOp()));
        if(x == Math.floor(x)) {
            int i = (int) x;
            return Integer.toString(i);
        }
        else {
            return Double.toString(x);
        }
    }

}
