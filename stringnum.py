def is_number(s):
    try:
        float(s)
        return True
    except ValueError:
        pass
 
    try:
        import unicodedata
        unicodedata.numeric(s)
        print("yes")
    except (TypeError, ValueError):
        pass
 
print("false")



