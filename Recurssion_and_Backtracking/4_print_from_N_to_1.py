def nprint(n):
    if n == 1 :
        print(1)
    else:
        print(n, end=" ") 
        nprint(n-1)
        

nprint(int(input()))