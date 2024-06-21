def nth_fib(n):
    if n == 1:
        return 0 
    elif n == 2:
        return 1
    return nth_fib(n-1) + nth_fib(n-2)


n = int(input())
print(nth_fib(n))