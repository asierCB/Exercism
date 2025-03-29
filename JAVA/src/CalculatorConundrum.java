class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
        int resultado = 0;
        if(operation == "+"){
            resultado = operand1 + operand2;
        }else if(operation == "*"){
            resultado = operand1 * operand2;
        }else if (operation == "/"){
            try{
            resultado = operand1 / operand2;
            }catch(ArithmeticException e){
                throw new IllegalOperationException ("Division by zero is not allowed", e); 
            }
        }else if(operation == ""){
            throw new IllegalArgumentException("Operation cannot be empty");
        }else if(operation == null){
            throw new IllegalArgumentException("Operation cannot be null");
        }else{
            throw new IllegalOperationException("Operation '" + operation + "' does not exist");
        }
        
        String calculo = "" + operand1 + " " + operation + " " + operand2 + " = " + resultado;
        
        
        return calculo;
    }
}