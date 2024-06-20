import sys
sys.setrecursionlimit(1010)
def summation(arr , index):
    if index == -1:
        return 0 
    else:
        return arr[index] + summation(arr, index-1)

N = int(input())
arr = list(map(int, input().split()))
print(summation(arr, N-1))