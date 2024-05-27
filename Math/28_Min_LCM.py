for t in range(int(input())):
    n = int(input())
    i = 1
    ans_a = 0
    while i*i <= n :
        if n%i == 0 :
            if n//i <= n//2 :
                ans_a = max(ans_a, n//i)
            if i <= n//2 :
                ans_a = max(ans_a, i)
        i += 1
    print(ans_a , n-(ans_a))