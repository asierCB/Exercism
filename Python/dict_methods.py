"""Functions to manage a users shopping cart items."""


def add_item(current_cart, items_to_add):
    """Add items to shopping cart.

    :param current_cart: dict - the current shopping cart.
    :param items_to_add: iterable - items to add to the cart.
    :return: dict - the updated user cart dictionary.
    """

    for item in items_to_add:
        if item in current_cart:
            current_cart[item] += 1
        else:
            current_cart[item] = 1
            
    return current_cart


def read_notes(notes):
    """Create user cart from an iterable notes entry.

    :param notes: iterable of items to add to cart.
    :return: dict - a user shopping cart dictionary.
    """
    dicc = {}
    for item in notes:
        dicc[item] = 1

    return dicc
        


def update_recipes(ideas, recipe_updates):
    """Update the recipe ideas dictionary.

    :param ideas: dict - The "recipe ideas" dict.
    :param recipe_updates: dict - dictionary with updates for the ideas section.
    :return: dict - updated "recipe ideas" dict.
    """

    for receta in recipe_updates:
        receta_name, receta_ingredients = receta
        ideas[receta_name] = receta_ingredients

    return ideas
        #if recetas.index() % 2 == 0 

        
    
    #Sale en VSCode pero aqui no

def sort_entries(cart):
    """Sort a users shopping cart in alphabetically order.

    :param cart: dict - a users shopping cart dictionary.
    :return: dict - users shopping cart sorted in alphabetical order.
    """

    return sorted(cart.items())


def send_to_store(cart, aisle_mapping):
    """Combine users order to aisle and refrigeration information.

    :param cart: dict - users shopping cart dictionary.
    :param aisle_mapping: dict - aisle and refrigeration information dictionary.
    :return: dict - fulfillment dictionary ready to send to store.
    """

    dict = {}
    for key_am, value_am in aisle_mapping.items():
        if key_am in cart:
            value_am.insert(0, cart[key_am])
            dict[key_am] = value_am

    return sorted(dict.items(), reverse = True)


def update_store_inventory(fulfillment_cart, store_inventory):
    """Update store inventory levels with user order.

    :param fulfillment cart: dict - fulfillment cart to send to store.
    :param store_inventory: dict - store available inventory
    :return: dict - store_inventory updated.
    """

    for key_fulfillment in fulfillment_cart:
        for key_store in store_inventory:
            if key_fulfillment == key_store:
                store_inventory[key_store][0] -= fulfillment_cart[key_fulfillment][0]
                if store_inventory[key_store][0] == 0:
                    store_inventory[key_store][0] = 'Out of Stock'
    return store_inventory