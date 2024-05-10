for i in range(int(input())):

    x, y  = list(map(int, input().split()))
    
    box_number = max(x,y)
    prev_square_count = (box_number-1)**2

    if box_number %2 != 0 :
        if y  == box_number :
            print(prev_square_count + y + box_number-x)
        else:
            print(prev_square_count + y)
    else :
        if x == box_number:
            print(prev_square_count + x + box_number-y)
        else:
            print(prev_square_count + x)
