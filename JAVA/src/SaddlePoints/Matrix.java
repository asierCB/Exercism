package SaddlePoints;

import java.util.List;
import java.util.Set;

class Matrix {
    int cuenta = 0;
    Set<Integer> saddlePoints;

    Matrix(List<List<Integer>> values) {
        for(int i = 0; i< values.size(); i++){
            for(int j = 0; j < values.get(i).size(); j++){
                if(i == 0){
                    cuenta ++;
                    if(values.get(i + 1).get(j) > values.get(i).get(j)){
                        cuenta++;
                    }
                    if(values.get(i).get(j + 1) < values.get(i).get(j)){
                        cuenta++;
                    }
                    if(values.get(i).get(j - 1) < values.get(i).get(j)){
                        cuenta++;
                    }
                }else if(i == values.size() - 1){
                    cuenta++;
                    if(values.get(i - 1).get(j) > values.get(i).get(j)){
                        cuenta++;
                    }
                    if(values.get(i).get(j + 1) < values.get(i).get(j)){
                        cuenta++;
                    }
                    if(values.get(i).get(j - 1) < values.get(i).get(j)){
                        cuenta++;
                    }
                }else if(j == 0){
                    cuenta++;
                    if(values.get(i + 1).get(j) > values.get(i).get(j)){
                        cuenta++;
                    }
                    if(values.get(i - 1).get(j) > values.get(i).get(j)){
                        cuenta++;
                    }
                    if(values.get(i).get(j + 1) < values.get(i).get(j)){
                        cuenta++;
                    }
                }else if(j == values.get(i).size() - 1){
                    cuenta++;
                    if(values.get(i + 1).get(j) > values.get(i).get(j)){
                        cuenta++;
                    }
                    if(values.get(i - 1).get(j) > values.get(i).get(j)){
                        cuenta++;
                    }
                    if(values.get(i).get(j - 1) < values.get(i).get(j)){
                        cuenta++;
                    }
                }else{
                    if(values.get(i + 1).get(j) > values.get(i).get(j)){
                        cuenta++;
                    }
                    if(values.get(i - 1).get(j) > values.get(i).get(j)){
                        cuenta++;
                    }
                    if(values.get(i).get(j + 1) < values.get(i).get(j)){
                        cuenta++;
                    }
                    if(values.get(i).get(j - 1) < values.get(i).get(j)){
                        cuenta++;
                    }
                }
                if(cuenta == 4){
                    saddlePoints.add(values.get(i).get(j));
                }
                cuenta = 0;
            }
        }
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    Set<MatrixCoordinate> getSaddlePoints() {
        //return saddlePoints;
        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }
}
