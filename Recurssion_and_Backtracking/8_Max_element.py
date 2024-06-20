def find_max(arr, ind):
    if ind == 0 :
        return arr[0]
    return max(arr[ind], find_max(arr, ind-1))

N = int(input())
arr  = list(map(int,  input().split()))

print(find_max(arr,  N-1))