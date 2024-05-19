from  collections import Counter 
for t in range(int(input())):
    n = int(input())
    all_seq =  []
    for i in range(n):
        all_seq.append(list(map(int, input().split())))
    actual_seq = [-1 for i in range(n)]
    for i in range(n-1):
        if n %2 ==0 and i == n//2 -1 :
            continue
        counter = Counter([seq[i] for seq in all_seq])
        for ele in counter:
            if counter[ele] == n-1-i:
                actual_seq[i] = ele
        if i == n-2:
            for ele in counter:
                if counter[ele] == n-1:
                    actual_seq[n-1] = ele
    if n %2 ==0 :
        i = n//2-1
        counter= Counter([seq[i] for seq in all_seq])
        for ele in counter:
            if counter[ele] ==  n//2 and actual_seq[i+1] != ele:
                actual_seq[i] = ele
    for ele in actual_seq:
        print(ele,  end = " ")
    print()  