N, A, B = list(map(int,  input().split()))

print( A * (N // ( A+B)) + min(A, N%(A+B)))
