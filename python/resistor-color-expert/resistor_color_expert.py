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

TOLERANCE_MAP = { 
    "grey": "0.05%",
    "violet": "0.1%",
    "blue": "0.25%",
    "green": "0.5%",
    "brown": "1%",
    "red": "2%",
    "gold": "5%",
    "silver": "10%" 
}

MAGNITUDES = [
    (1000000, "mega"),
    (1000, "kilo"),
    (1, ""),
]

def resistor_label(colors):
    if len(colors) == 1:
        return "0 ohms"
    *value_colors, multiplier_color, tolerance_color = colors
    base_value = sum(RESISTOR_MAP[color] * 10 ** exponent for exponent,color in enumerate(value_colors[::-1]))
    multiplied_value = base_value * 10 ** RESISTOR_MAP[multiplier_color]
    for magnitude, prefix in MAGNITUDES:
        if multiplied_value > magnitude:
            return f"{(multiplied_value/magnitude):g} {prefix}ohms ±{TOLERANCE_MAP[tolerance_color]}"
 
