_ = input()
raw_inp = input().split()
odd = 0

for chr in  raw_inp:
    if int(chr) & 1 :
        odd += 1

if odd & 1 :
    print('NO')
else:
    print("YES")