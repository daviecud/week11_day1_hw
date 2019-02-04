public class Calculator {

//    private int add;
//    private int divide;
//    private int multiply;
//    private int subtract;
        int num1;
        int num2;





public Calculator(int num1, int num2) {
//    this.add = add;
//    this.divide = divide;
//    this.multiply = multiply;
//    this.subtract = subtract;
    this.num1 = num1;
    this.num2 = num2;

}

public int getAddition(){
    return num1 + num2;
}

public int getDivision(){
    return num1 / num2;
}

public int getMultiply(){
    return num1 * num2;
}

public int getSubtract(){
    return num1 - num2;
}

}