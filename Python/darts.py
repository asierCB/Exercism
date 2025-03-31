import math

def score(x, y):
    distancia_centro = math.sqrt(x**2 + y**2)
    puntuacion = 0
    if distancia_centro <= 1: puntuacion += 10
    elif distancia_centro <= 5: puntuacion += 5
    elif distancia_centro <= 10: puntuacion += 1

    return puntuacion