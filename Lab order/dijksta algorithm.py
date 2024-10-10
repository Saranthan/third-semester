import time
import sys
def dijkstra(graph,start):
    distances = {node : sys.maxsize for node in graph}
    distances[start] = 0
    for _ in range(len(graph)):
        start_time = time.time()
        current_node = min(distances,key = distances.get)
        print(f"processing node{current_node}..")
        print()
        for neighbor,weight in graph[current_node].items():
            distance = distances[current_node]+weight
            if distance < distances[neighbor]:
                distances[neighbor] = distance
        end_time = time.time()
        print(f"Time taken : {end_time - start_time} seconds")
    return distances
graph = {'P':{'Q':8 , 'R': 2},
         'Q': {'P':5 , 'R':6 , 'S':8},
         'R': {'P':5 , 'Q': 5 ,'S':4},
         'S': {'Q':4, 'R':1
               }
         }
graph2= {'P':{'Q':84 , 'R': 22},
         'Q': {'P':56 , 'R':66 , 'S':86},
         'R': {'P':5 , 'Q': 5 ,'S':4},
         'S': {'Q':40, 'R':10
               }
         }
graph3= {'P':{'Q':854 , 'R': 24323},
         'Q': {'P':5554 , 'R':654 , 'S':832},
         'R': {'P':5343 , 'Q': 5 ,'S':4},
         'S': {'Q':4000, 'R':1343
               }
         }
distances = dijkstra(graph,'P')
print()
distances2 = dijkstra(graph2,'P')
print()
distances3 = dijkstra(graph3,'P')
print()
print(f"Distances : { distances}")
print()
print(f"Distances : { distances2}")
print()
print(f"Distances : { distances3}")



""" O/P processing nodeP..
Time taken : 0.0 seconds
processing nodeP..
Time taken : 0.015452384948730469 seconds
processing nodeP..
Time taken : 0.0 seconds
processing nodeP..
Time taken : 0.0 seconds
Distances : {'P': 0, 'Q': 8, 'R': 6, 'S': 9223372036854775807}"""

