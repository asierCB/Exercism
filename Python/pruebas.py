class Alien:
    """Create an Alien object with location x_coordinate and y_coordinate.

    Attributes
    ----------
    (class)total_aliens_created: int
    x_coordinate: int - Position on the x-axis.
    y_coordinate: int - Position on the y-axis.
    health: int - Number of health points.

    Methods
    -------
    hit(): Decrement Alien health by one point.
    is_alive(): Return a boolean for if Alien is alive (if health is > 0).
    teleport(new_x_coordinate, new_y_coordinate): Move Alien object to new coordinates.
    collision_detection(other): Implementation TBD.
    """
    total_aliens_created = 0
    
    def __init__(self, x, y):
        self.health = 3
        self.x_coordinate = x
        self.y_coordinate = y
        Alien.total_aliens_created += 1

    def hit(self):
        self.health -= 1
        return self.health
        
    def is_alive(self):
        return self.health > 0

    def teleport(self, nueva_x, nueva_y):
        self.x_coordinate = nueva_x
        self.y_coordinate = nueva_y

    def collision_detection(self, other_object):
        pass
    

#TODO:  create the new_aliens_collection() function below to call your Alien class with a list of coordinates.

def new_aliens_collection(aliens):
    for index, alien in enumerate(aliens):
        #print(alien)
        #index = 
        Alien(alien[0], alien[1])
    



alien = Alien(2,0)
alien2 = Alien(1,1)
alien.hit()
#print(alien.total_aliens_created)


test_data = [(-2, 6), (1, 5), (-4, -3)]
alien = new_aliens_collection(test_data)

#print(alien)
print(1.health)