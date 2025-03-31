import string

def is_pangram(sentence):
    #Eliminamos los espacios y convertimos el string a minúsculas
    frase = sentence.lower().replace(" ", "")
    #utilizamos el comando maketrans importado de string para eliminar todos los digitos y elementos de puntuacion
    tabla = str.maketrans('', '', string.digits + string.punctuation)
    cadena_convertida = frase.translate(tabla)
    #pasamos la cadena a un set para eliminar los elementos repetidos
    set_frase = set(cadena_convertida)

    #Y devolvemos True en el caso de que la longitud del set sea 26
    return len(set_frase) == 26
    #return set_frase

print(is_pangram("T1he quick brown fox jumps over the lazy dog"))