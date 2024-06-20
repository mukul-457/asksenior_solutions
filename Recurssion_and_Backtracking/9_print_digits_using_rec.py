def print_digits(n):
    if n < 10 :
        print(n%10, end=" ")
    else:
        print_digits(n // 10)
        print(n%10 , end=" ")

for t in range(int(input())):
    n = int(input())
    if n >=10:
        print_digits(n//10)
    print(n%10)