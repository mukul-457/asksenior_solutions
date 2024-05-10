arr = [i for i in range(10**5)]
for i in range(2, 10**5):
    if arr[i] :
        for j in range(i+i, 10**5, i):
            arr[j] = 0 
for t in range(int(input())):
    d = int(input())
    first_p = -1
    for k in range(1+d, 10**5):
        if arr[k]:
            first_p = k
            break
    second_p = -1
    for k in range(first_p+d, 10**5):
        if arr[k]:
            second_p = k
            break
    print(first_p*second_p)
