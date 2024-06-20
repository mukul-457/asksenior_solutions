def build_pyramid_layer(layer, space):
    if layer == 0 :
        return
    else:
        print(" "*(space) + "*"*(2*layer-1))
        build_pyramid_layer(layer-1, space+1)

N = int(input())
build_pyramid_layer(N,0)
