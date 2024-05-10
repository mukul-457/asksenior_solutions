_  = int(input())
nums = list(map(int, input().split()))

max_even = -1
smax_even = -1
max_odd = -1
smax_odd = -1

for n in nums :
    if n %2 == 0 :
        if n > max_even:
            smax_even = max_even
            max_even = n
        elif n > smax_even:
            smax_even  = n
    else:
        if n > max_odd:
            smax_odd = max_odd
            max_odd = n
        elif n > smax_odd:
            smax_odd = n
val1 = -1
if max_even != -1 and smax_even != -1:
    val1 = max_even + smax_even
val2 = -1
if max_odd != -1 and smax_odd != -1:
    val2 = max_odd + smax_odd

print(max(val1 , val2))