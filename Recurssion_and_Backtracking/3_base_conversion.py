def convert_to_base_2(n):
    if n == 0 :
        return
    convert_to_base_2(n//2)
    print(n%2, end = "")

for t in range(int(input())):
    convert_to_base_2(int(input()))
    print()
