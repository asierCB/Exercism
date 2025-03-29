"""Functions to automate Conda airlines ticketing system."""

import math

asientos_fila = ['A', 'B', 'C', 'D']

def generate_seat_letters(number):
    """Generate a series of letters for airline seats.

    :param number: int - total number of seat letters to be generated.
    :return: generator - generator that yields seat letters.

    Seat letters are generated from A to D.
    After D it should start again with A.

    Example: A, B, C, D

    """
    
    for i in range (number):
        yield asientos_fila[i % 4]
        


def generate_seats(number):
    """Generate a series of identifiers for airline seats.

    :param number: int - total number of seats to be generated.
    :return: generator - generator that yields seat numbers.

    A seat number consists of the row number and the seat letter.

    There is no row 13.
    Each row has 4 seats.

    Seats should be sorted from low to high.

    Example: 3C, 3D, 4A, 4B

    """
    number = number + 4 if number > 48 else number
    letra = generate_seat_letters(number)
    for i in range (number):
        asiento = '' 
        fila = math.ceil((i+1)/4)
        if fila == 13:
            continue
        else:
            asiento += str(fila)
            asiento += next(letra)
            yield asiento
            
            

def assign_seats(passengers):
    """Assign seats to passengers.

    :param passengers: list[str] - a list of strings containing names of passengers.
    :return: dict - with the names of the passengers as keys and seat numbers as values.

    Example output: {"Adele": "1A", "Björk": "1B"}

    """

    asiento = generate_seats(len(passengers))
    diccionario_asientos = {}
    for pasajero in passengers:
        diccionario_asientos[pasajero] = next(asiento)
    return diccionario_asientos

def generate_codes(seat_numbers, flight_id):
    """Generate codes for a ticket.

    :param seat_numbers: list[str] - list of seat numbers.
    :param flight_id: str - string containing the flight identifier.
    :return: generator - generator that yields 12 character long ticket codes.

    """
    
    for asiento in seat_numbers:
        codigo_tickets = f'{asiento}{flight_id}'
        while len(codigo_tickets) != 12:
            codigo_tickets += '0'
        yield codigo_tickets   
