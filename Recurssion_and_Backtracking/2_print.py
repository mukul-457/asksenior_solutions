def nprint(n):
    if n == 0 :
        return
    else:
        nprint(n-1)
        print("I love Recursion") 

nprint(int(input()))