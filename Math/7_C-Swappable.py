n = int(input())
A = list(map(int,input().split()))

freq = {}
total_pairs = 0 
for i in range(n):
    if A[i] in  freq :
        total_pairs -= freq[A[i]]
        freq[A[i]] += 1
    else:
        freq[A[i]] = 1
    total_pairs += n-1-i


print(total_pairs)

