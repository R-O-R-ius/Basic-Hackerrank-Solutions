def solve(s):
    
    # We can't use title() here, consider the case: "123name" -> "123Name", which isn't correct.
    for substring in s.split():
        s = s.replace(substring, substring.capitalize())
    return s 
