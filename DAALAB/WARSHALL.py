def warshall(graph):
   
    n = len(graph)

   
    reach = [[graph[i][j] for j in range(n)] for i in range(n)]

    for k in range(n):
        for i in range(n):
            for j in range(n):
                reach[i][j] = reach[i][j] or (reach[i][k] and reach[k][j])

    return reach


if __name__ == "__main__":

    graph = [
        [0, 1, 0, 0],
        [0, 0, 1, 0],
        [1, 0, 0, 1],
        [0, 0, 0, 0]
    ]

    reachability_matrix = warshall(graph)

    print("Transitive closure (reachability matrix):")
    for row in reachability_matrix:
        print(row)
