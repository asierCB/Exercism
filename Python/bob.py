def response(hey_bob):
    hey_bob = hey_bob.strip()
    if hey_bob.endswith('?') and hey_bob.isupper():
        return "Calm down, I know what I'm doing!"
    if hey_bob.endswith('?'):
        return 'Sure.'
    if hey_bob.isupper():
        return "Whoa, chill out!"
    if '\n' in hey_bob or '\r' in hey_bob or '\t' in hey_bob or len(hey_bob) == 0:
        return "Fine. Be that way!"
    else:
        return "Whatever."