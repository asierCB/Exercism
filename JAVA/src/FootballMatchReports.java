public class FootballMatchReports {    
    public static String onField(int shirtNum) {
        String onField = "";
        String mensaje = "El número de camiseta debe de estar entre 1 y 11";
        switch(shirtNum){
            case 1:
                onField = "goalie";
                break;
            case 2:
                onField = "left back";
                break;
            case 3:
            case 4:
                onField = "center back";
                break;
            case 5:
                onField = "right back";
                break;
            case 6:
            case 7:
            case 8:
                onField = "midfielder";
                break;
            case 9:
                onField = "left wing";
                break;
            case 10:
                onField = "striker";
                break;
            case 11:
                onField = "right wing";
                break;
            default:
                //onField = "Throw IllegalArgumentException";
                throw new IllegalArgumentException(mensaje);
        }
        return onField;
    }
}