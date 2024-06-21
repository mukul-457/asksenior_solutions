def log_base_2(n):
    if n <=1:
        return 0
    return 1 + log_base_2(n//2)

n = int(input())
print(log_base_2(n))