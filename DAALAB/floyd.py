                                                                         
import time

def floyd_warshall(graph):
    n = len(graph)
    t_c = [row[:] for row in graph]
    for k in range(n):
        for i in range(n):
            for j in range(n):
                if t_c[i][j] > t_c[i][k] + t_c[k][j]:
                    t_c[i][j] = t_c[i][k] + t_c[k][j]
    return t_c

def main():
    n_v = int(input("Enter number of vertices: "))
    print()

    # Initialize graph with infinities
    graph = [[float('99999') for _ in range(n_v)] for _ in range(n_v)]

    # Set the distance from each vertex to itself to 0
    for i in range(n_v):
        graph[i][i] = 0

    n_e = int(input("Enter number of edges: "))
    print()
    for _ in range(n_e):
        while True:
            try:
                u = int(input(f"Enter start vertex (1 to {n_v}): ")) - 1
                v = int(input(f"Enter end vertex (1 to {n_v}): ")) - 1
                weight = int(input("Enter weight of the edge: "))
                if 0 <= u < n_v and 0 <= v < n_v:
                    graph[u][v] = weight
                    graph[v][u] = weight  # For undirected graph
                    break
                else:
                    print("Vertex out of bounds. Try again.")
            except ValueError:
                print("Invalid input. Please enter integers.")

    print("Input graph (adjacency matrix):")
    print()
    for row in graph:
        print(row)

    shortest_paths = floyd_warshall(graph)
    print("\nShortest paths between all pairs of vertices:")
    print()
    for row in shortest_paths:
        print(row)

if __name__ == "__main__":
    start = time.time()
    main()
    end = time.time()
    print("Execution time:", end - start)
''' OUTPUT
Enter number of vertices: 4

Enter number of edges: 5

Enter start vertex (1 to 4): 2
Enter end vertex (1 to 4): 1
Enter weight of the edge: 3
Enter start vertex (1 to 4): 1
Enter end vertex (1 to 4): 3
Enter weight of the edge: 2
Enter start vertex (1 to 4): 3
Enter end vertex (1 to 4): 2
Enter weight of the edge: 7
Enter start vertex (1 to 4): 3
Enter end vertex (1 to 4): 4
Enter weight of the edge: 1
Enter start vertex (1 to 4): 4
Enter end vertex (1 to 4): 1
Enter weight of the edge: 6
Input graph (adjacency matrix):

[0, 3, 2, 6]
[3, 0, 7, 99999.0]
[2, 7, 0, 1]
[6, 99999.0, 1, 0]

Shortest paths between all pairs of vertices:

[0, 3, 2, 3]
[3, 0, 5, 6]
[2, 5, 0, 1]
[3, 6, 1, 0]
Execution time: 60.62252640724182
'''
