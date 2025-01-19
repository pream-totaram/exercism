RESISTOR_MAP = {
    "black": 0,
    "brown": 1,
    "red": 2,
    "orange": 3,
    "yellow": 4,
    "green": 5,
    "blue": 6,
    "violet": 7,
    "grey": 8,
    "white": 9
}
def label(colors):
    ohms = ((RESISTOR_MAP[colors[0]] * 10) + RESISTOR_MAP[colors[1]]) * (10**RESISTOR_MAP[colors[2]])
    if ohms == 0:
        return "0 ohms"
    elif ohms % 10**9 == 0:
        return str(ohms//10**9) + " gigaohms"
    elif ohms % 10**6 == 0:
        return str(ohms//10**6) + " megaohms"
    elif ohms % 10**3 == 0:
        return str(ohms//10**3) + " kiloohms"
    else:
        return str(ohms) + " ohms"
