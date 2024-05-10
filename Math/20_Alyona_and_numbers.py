n , m = list(map(int, input().split()))

total_pairs =( n // 5 ) * ( m // 5)
for rem in range(1,5):
    set1_numbers = n // 5  + int(n % 5 >= rem )
    set2_numbers = m // 5  +  int(m%5 >= (5-rem))

    total_pairs += set1_numbers*set2_numbers

print(total_pairs)
