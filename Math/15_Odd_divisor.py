for t in range(int(input())):
    N = int(input())
    while N > 1 :
        if N % 2 != 0 :
            print("YES")
            break
        N = N // 2
    if  N==1:
        print("NO")

