def build_pyramid_layer(number_of_star,number_of_space):
    if number_of_space == 0 :
        print("*"*number_of_star)
    else:
        print(" "*number_of_space + "*"*number_of_star)
        build_pyramid_layer(number_of_star+2, number_of_space-1)

N = int(input())
build_pyramid_layer(1,N-1)
