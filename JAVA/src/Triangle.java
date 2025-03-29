class Triangle {
    private double side1;
    private double side2;
    private double side3;

    Triangle(double side1, double side2, double side3) throws TriangleException {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        if((side1 + side2 >= side3) && (side2 + side3 >= side1) && (side1 + side3 >= side2)){
        //Por la condicion anterior si uno de los términos es cero se consideraria que todos lo son, asi quitamos la entrada de
            //todo ceros
            if(side1 == 0){
                throw new TriangleException();
            }
        }else{
            throw new TriangleException();
        }
    }

    boolean isEquilateral() {
        return (side1 == side2 && side1 == side3) ? true : false;
    }

    boolean isIsosceles() {
        return ((side1 == side2) || (side1 == side3) || (side2 == side3)) ? true : false;
    }

    boolean isScalene() {
        return (side1 != side2 && side2 != side3 && side1 != side3) ? true : false;
    }
}

class TriangleException extends Exception {

}