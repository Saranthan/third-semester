import time

def warshall(graph):
    n = len(graph)
    t_c = [row[:] for row in graph]  
    for k in range(n):
        for i in range(n):
            for j in range(n):
                t_c[i][j] = t_c[i][j] or (t_c[i][k] and t_c[k][j])
    return t_c

def main():
    n_v = int(input("Enter number of vertices: "))
    print()
    
    # Initialize graph with 0s
    graph = [[0 for _ in range(n_v)] for _ in range(n_v)]  

    n_e = int(input("Enter number of edges: "))
    print()
    for _ in range(n_e):
        while True:
            try:
                u = int(input(f"Enter start vertex (1 to {n_v}): ")) - 1
                v = int(input(f"Enter end vertex (1 to {n_v}): ")) - 1
                if 0 <= u < n_v and 0 <= v < n_v:
                    graph[u][v] = 1
                    graph[v][u] = 1  
                    break
                else:
                    print("Vertex out of bounds. Try again.")
            except ValueError:
                print("Invalid input. Please enter integers.")

    print("Input graph (adjacency matrix):")
    print()
    for row in graph:
        print(row)

    t_c = warshall(graph)
    print("\nTransitive closure:")
    print()
    for row in t_c:
        print(row)

if __name__ == "__main__":
    start = time.time()
    main()
    end = time.time()
    print("Execution time:", end - start)
