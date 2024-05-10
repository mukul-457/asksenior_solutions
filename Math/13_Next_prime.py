K  = int(input())
arr = [i for i in range(K+1)]
all_primes= []
for i in range(2,K+1):
    if arr[i] == i :
        all_primes.append(i)
        for  j in range(i, K+1, i):
            arr[j] = i
found = False
if K in  all_primes:
    print(K)
    exit(0)
K = K+1
while not found:
    found = True
    for p in all_primes:
        if K % p == 0 :
            found = False
            break
    if found :
        break
    K += 1
print(K)
