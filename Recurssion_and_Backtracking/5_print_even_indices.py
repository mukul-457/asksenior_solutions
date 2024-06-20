def print_even_ind_ele(ind, arr):
    if ind == 0:
        print(arr[0])
    else:
        print(arr[ind], end = " ")
        print_even_ind_ele(ind-2, arr)

last_index = int(input())-1
arr = input().split()

if last_index % 2 != 0 :
    last_index  -= 1

print_even_ind_ele(last_index, arr)