for t in range(int(input())):
    A, B = list(map(int, input().split()))
    if B <= 1 :
        print("NO")
        continue
    elif B == 2:
        print("YES")
        print(A, A*3 , A*B*2)
        continue
    print("YES")
    print(A, A*(B-1) , A*B)