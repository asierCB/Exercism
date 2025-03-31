def is_valid(isbn):
    isbn = isbn.replace('-', '')

    if len(isbn) != 10: return False

    x = 10
    suma = 0

    for i in range(len(isbn)):
        if isbn[i] == 'X' and i != 9:
            return False
        if isbn[i] == 'X' and i == 9:
            suma += 10 * x
        elif isbn[i].isdigit():
            suma += int(isbn[i]) * x
        else:
            return False
        x -= 1
    return True if suma % 11 == 0 else False