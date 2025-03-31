import string

def is_isogram(frase_inicial):
    correccion = str.maketrans('', '', string.punctuation)

    frase = frase_inicial.lower().replace(' ', '').translate(correccion)

    set_de_palabra = set(frase)

    return True if len(set_de_palabra) == len(frase) else False

print(is_isogram("Dermatog lyph ics"))


