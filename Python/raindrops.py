def convert(number):
    sonido = ''
    if number % 3 == 0: sonido += 'Pling'
    if number % 5 == 0: sonido += 'Plang'
    if number % 7 == 0: sonido += 'Plong'
        
    if len(sonido) == 0:
        return str(number)
    else:
        return sonido
    
print(convert(8))