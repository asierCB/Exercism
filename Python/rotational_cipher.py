def key_from_value(dict, search_value):
    for key, value in dict.items():
        if value == search_value:
            print(key)
            return key

def rotate(text, key):
    alphabet_dict = {chr(i): i - 96 for i in range(ord('a'), ord('z') + 1)}
    result = ''
    
    for char in text:
        if 'a' <= char <= 'z':
            is_upper = False
        elif 'A' <= char <= 'Z':
            is_upper = True
            char = char.lower()

        if char in alphabet_dict:
            value = alphabet_dict[char] + key
            if value > 26: value = value - 26
            
            if is_upper == False:
                result += key_from_value(alphabet_dict, value)
            else:
                result += key_from_value(alphabet_dict, value).upper()
        else:
            continue
    
    return result

print(rotate('A',1))
        