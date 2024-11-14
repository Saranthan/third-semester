import time
import sys
def dijkstra(graph,start):
    distances = {node : sys.maxsize for node in graph}
    distances[start] = 0
    previous={node:None for node in graph}
    unvisited=set(graph.keys())
    start_time = time.time()
    while unvisited:
        current= min(unvisited,key=lambda node:distances[node])
        if distances[current]==sys.maxsize:
           break
        unvisited.remove(current)
        print(f"processing node{current}..")
        for neighbour,weight in graph[current].items():
            distance = distances[current]+weight
            if distance < distances[neighbour]:
                distances[neighbour] = distance
                previous [neighbour]=current
        end_time = time.time()
        print(f"Time taken : {end_time - start_time} seconds")
    return distances,previous
graph = {'P':{'Q':8 , 'R': 2},
         'Q': {'P':5 , 'R':6 , 'S':8},
         'R': {'P':5 , 'Q': 5 ,'S':4},
         'S': {'Q':4, 'R':1
               }
         }
start_node='P'
distances,previous = dijkstra(graph,start_node)
print("Shortest distances from",start_node)
for node,distance in distances.items():
    print(node,":",distance)
print("\n Shortest paths from",start_node)
for node in graph:
   path=[]
   current=node
   while current is not None:
       path.append(current)
       current=previous[current]
   path.reverse()
   print(node,":",path)
print(graph)

