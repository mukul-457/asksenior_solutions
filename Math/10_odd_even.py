for i in range(int(input())):
    N = int(input())
    if N %2 != 0:
        print("Odd")
    elif N % 4 != 0:
        print("Same")
    else:
        print("Even")