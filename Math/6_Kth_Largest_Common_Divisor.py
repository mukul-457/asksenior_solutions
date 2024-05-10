A, B , K = list(map(int,  input().split()))


till_now = 0
possible_divisor = min(A, B)
while possible_divisor  > 0  :
    if A % possible_divisor  == 0  and  B % possible_divisor  == 0 : 
        if till_now + 1 == K :
            print(possible_divisor)
            break
        till_now += 1
    possible_divisor -= 1

