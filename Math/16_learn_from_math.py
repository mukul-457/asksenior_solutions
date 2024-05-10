N = int(input())
all_nums = [i for i in range(N+1)]
primes = set()
for i in range(2, N+1):
    if all_nums[i] == i :
        primes.add(i)
        for k in range(i, N+1, i):
            all_nums[k] = i
for d1 in range(4, N//2+1):
    if d1 not in primes and N-d1 not in primes:
        print(d1, N-d1)
        break