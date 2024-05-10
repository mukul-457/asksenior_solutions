from collections import OrderedDict
N, k =  list(map(int, input().split()))

primes = OrderedDict()
all_nums = [i for i in range(N+1)]
for i in range(2, N+1):
    if all_nums[i] == i :
        primes[i] = 1
        for j in range(i,N+1,i):
            all_nums[j] = i
k_calculated = 0
prime_list = sorted(list(primes))
for i  in range(len(prime_list)-1):
    if prime_list[i] + prime_list[i+1] + 1    in primes:
        k_calculated += 1
        if k_calculated >= k :
            break
if k_calculated >= k:
    print("YES")
else:
    print("NO")
