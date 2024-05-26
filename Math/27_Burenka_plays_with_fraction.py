for t in range(int(input())):
    a,b,c,d = list(map(int, input().split()))
    numerator = b*c 
    denominator = a*d 

    if a == 0 and c == 0 :
        print(0)
    elif a ==0  or b == 0 :
        print(1)
    elif numerator == denominator :
        print(0)
    elif numerator % denominator == 0 :
        print(1)
    elif denominator % numerator == 0 :
        print(1)
    else:
        print(2)
