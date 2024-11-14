#                               EX NO : 9B
import numpy as np

class BranchAndBoundTSP:
    def __init__(self, cost_matrix):
        self.n = len(cost_matrix)
        self.cost_matrix = cost_matrix
        self.best_cost = float('inf')
        self.best_tour = []

    def row_reduction(self):
        matrix = np.copy(self.cost_matrix)
        for i in range(self.n):
            min_value = np.min(matrix[i])
            matrix[i] -= min_value
        return matrix

    def col_reduction(self, matrix):
        for j in range(self.n):
            min_value = np.min(matrix[:, j])
            matrix[:, j] -= min_value
        return matrix

    def calculate_lower_bound(self, tour, visited):
        matrix = self.row_reduction()
        matrix = self.col_reduction(matrix)
        lb = 0
        for i in range(self.n):
            if not visited[i]:
                row_min = np.min(matrix[i])
                lb += row_min
        for j in range(self.n):
            if not any(matrix[i][j] == 0 and visited[i] for i in range(self.n)):
                col_min = np.min(matrix[:, j])
                lb += col_min
        return lb

    def branch_and_bound(self, tour, visited, current_cost, level):
        if level == self.n:
            total_cost = current_cost + self.cost_matrix[tour[-1]][tour[0]]
            if total_cost < self.best_cost:
                self.best_cost = total_cost
                self.best_tour = tour + [tour[0]]
            return

        lower_bound = self.calculate_lower_bound(tour, visited)
        if current_cost + lower_bound >= self.best_cost:
            return

        for city in range(self.n):
            if not visited[city]:
                visited[city] = True
                self.branch_and_bound(tour + [city], visited, current_cost + self.cost_matrix[tour[-1]][city], level + 1)
                visited[city] = False

    def solve(self):
        visited = [False] * self.n
        visited[0] = True
        self.branch_and_bound([0], visited, 0, 1)
        return self.best_cost, self.best_tour


cost_matrix = [
    [0, 10, 15, 20, 25],
    [10, 0, 35, 25, 30],
    [15, 35, 0, 30, 5],
    [20, 25, 30, 0, 15],
    [25, 30, 5, 15, 0]
]

bb_tsp = BranchAndBoundTSP(cost_matrix)
best_cost, best_tour = bb_tsp.solve()

print(f"Best cost: {best_cost}")
print(f"Best tour: {best_tour}")
''' OUTPUT
Best cost: 70
Best tour: [0, 1, 3, 4, 2, 0]
'''