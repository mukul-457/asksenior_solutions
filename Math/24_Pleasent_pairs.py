for t in range(int(input())):
    n = int(input())
    arr  = list(map(int, input().split()))
    total_count = 0
    for j in range(2, n+1):
        max_a_i= (2*j-1) // arr[j-1]
        for a_i in range(1, max_a_i+1):
            i = (a_i * (arr[j-1])) - (j)
            if i > 0 and i < n and arr[i-1] == a_i:
                total_count += 1
    print(total_count)
