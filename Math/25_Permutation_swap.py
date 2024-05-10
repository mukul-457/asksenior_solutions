def gcd(a,b):
    if a == 0 or b == 0:
        return a+b
    elif a >= b :
        return gcd(a%b , b)
    elif a < b :
        return gcd(a, b%a)


for t in range(int(input())):
    n = int(input())
    arr = list(map(int, input().split()))
    for i in range(n):
        index_after_sort = arr[i]-1
        diff = abs(i-index_after_sort)
        arr[i] = diff
    gcd_arr = 0
    for diff in arr:
        gcd_arr = gcd(gcd_arr, diff)
    print(gcd_arr)

