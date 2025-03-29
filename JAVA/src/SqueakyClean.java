class SqueakyClean {
    static String clean(String identifier) {
       /* Primera limpieza cambiamos los espacios en blanco por _*/
		String primeraLimpia = identifier.replace(" ","_");
        String cuartaLimpia = primeraLimpia.replaceAll("[^a-zA-Z0-9_]", "");
        if(identifier == ""){
            return "";
        }
		
		/* Segunda limpieza, quitamos los - y cambiamos el caracter que viene a continuacion por 
			mayúscula*/
		int posicion = identifier.indexOf("-");
		char despuesGuion = identifier.charAt(posicion +1);
		int i = 0;
		while(i <= cuartaLimpia.length()-1) {
			if(primeraLimpia.charAt(i) == '-') {
				String segundaLimpia = cuartaLimpia.replace("-","");
				String segundaLimpia2 = segundaLimpia.replace(identifier.charAt(posicion +1), Character.toUpperCase(despuesGuion));
				return segundaLimpia2;
			}	
            i++;
		}
        /* Tercera limpieza leetspeack, cambiar numeros que se relacionan con un caracter en concreto*/
		if(cuartaLimpia.contains("0") || cuartaLimpia.contains("1") || cuartaLimpia.contains("3")
				|| cuartaLimpia.contains("4") || cuartaLimpia.contains("7")) {String terceraLimpia = cuartaLimpia.replace("0", "o").replace("1", "l").replace("3", "e").replace("4", "a").replace("7","t");
			return terceraLimpia;
		}

        /* Cuarta limpieza quitar caracteres que no sean leatras o los anteriores*/
        //String cuartaLimpia = primeraLimpia.replaceAll("[^a-zA-Z0-9_]", "");  He puesto la cuartaLimpia arriba para poder meter en los while la cuartaLimpia
        return cuartaLimpia; 
    }
}
