for t in range(int(input())):
    num_wheels = int(input())
    if num_wheels % 2 == 1 or num_wheels < 4: 
        print(-1)
        continue
    min_bus = 0
    max_bus = 0
    if num_wheels %  6  == 0 :
        min_bus = num_wheels // 6
    elif num_wheels % 6 == 2 :
        min_bus = (num_wheels - 8 ) // 6 +  2 
    else:
        min_bus = (num_wheels - 4) // 6 + 1

    if num_wheels % 4 == 0 :
        max_bus = num_wheels // 4
    else:
        max_bus = (num_wheels - 6) // 4  + 1
    print(min_bus,max_bus) 