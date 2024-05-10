def gcd(n,m):
  if n == 0 or m == 0:
    return n+m
  elif n <= m :
    return gcd(n, m%n)
  else:
    return gcd(n%m , m)

N = int(input()) +1
total = 0 
for i in range(1, N):
  for j in range(1, N):
    i_j_gcd = gcd(i,j)
    for k in range(1, N):
      total += gcd(i_j_gcd, k)

print(total)