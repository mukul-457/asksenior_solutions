N, k = list(map(int, input().split()))
if k == 1:
    print(N)
    exit(0)
SPF = [i for i in range(N+1)]
for i in range(2, N+1):
    if SPF[i] == i:
        for j in range(i+i ,N+1, i):
            if SPF[j] == j:
                SPF[j] = i

all_factors = []
factor = SPF[N]
count = 0 
prd = 1
while N > 1 :    
    while N % factor == 0 :
        all_factors.append(factor)
        prd *= factor
        count += 1
        N  = N // factor
        if count == k-1:
            break
    if count == k-1:
        break
    factor = SPF[N]

if count < k-1  or (count == k-1 and N ==  1 ):
    print(-1)
else:
    for f in all_factors:
        print(f ,end = " ")
    print(N)



# if len(all_factors) < k :
#     print(-1)
# elif len(all_factors) == k :
#     for f in all_factors:
#         print(f , end=" ")
# else:
#     for i in range(k):
#         print(all_factors[i], end=" ")
#     spl_fact = 1
#     for f in all_factors[k:]:
#         spl_fact *= f
#     print(spl_fact)