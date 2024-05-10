N , K = list(map(int, (input().split())))
Ids = list(map(int, (input().split())))
sweet_map = {id: K // N for id in Ids}
K = K % N
Ids.sort()
k_smallest_ids = Ids[:K] 
for id in k_smallest_ids:
    sweet_map[id] = sweet_map[id] + 1
for sweet in sweet_map.values():
    print(sweet)


