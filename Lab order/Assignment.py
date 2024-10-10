import itertools
import time
start=time.time()
def calculate_distance(city1, city2):
    return ((city1[0] - city2[0]) ** 2 + (city1[1] - city2[1]) ** 2) ** 0.5

def total_distance(route, distance_matrix):
    total = 0
    for i in range(len(route) - 1):
        total += distance_matrix[route[i]][route[i + 1]]
    total += distance_matrix[route[-1]][route[0]]  
    return total

def tsp_bruteforce(cities):
    n = len(cities)
    distance_matrix = [[calculate_distance(cities[i], cities[j]) for j in range(n)] for i in range(n)]
    
    min_distance = float('inf')
    best_route = None

    for route in itertools.permutations(range(n)):
        current_distance = total_distance(route, distance_matrix)
        if current_distance < min_distance:
            min_distance = current_distance
            best_route = route

    return best_route, min_distance



cities = [(0, 1), (2, 4), (3, 5), (7, 8)]  
best_route, min_distance = tsp_bruteforce(cities)
print("the cities are:",cities)
print("The Best route:", best_route)
print("The Minimum distance is:", min_distance)
end=time.time()
print('time complexity is',end-start)
