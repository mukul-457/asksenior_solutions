n = int(input())
array = list(map(int, input().split()))
array.sort()
found = False
for i in range(n-1):
    if array[i] != i+1 :
        print(i+1)
        found = True
        break
if not found:
    print(n)

