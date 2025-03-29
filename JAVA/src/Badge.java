class Badge {
    public String print(Integer id, String name, String department) {

        String idFinal = (id == null) ? "" : "[" + id + "] - ";
        
        String nameFinal = (name == null) ? "" : name + " - ";
        
        String departmentFinal = (department == null) ? "OWNER" : department.toUpperCase();
        
        String resultado = idFinal + nameFinal + departmentFinal;
        return resultado;
    }
}