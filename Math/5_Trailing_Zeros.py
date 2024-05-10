n = int(input())
trailing_zeros = 0
num = 5
while n // num  > 0 :
    trailing_zeros += n // num
    n = n // num

print(trailing_zeros)