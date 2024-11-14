#                                     EX NO :9A
class BranchBound:
    def __init__(self, cost_matrix):
        self.n = len(cost_matrix) 
        self.cost_matrix = cost_matrix
        self.best_cost = float('inf')
        self.best_assignment = []
        self.lower_bound = 0
    def reduce_cost_matrix(self, matrix):
        row_reduced_matrix = matrix.copy()
        for i in range(self.n):
            min_row = min(row_reduced_matrix[i])
            for j in range(self.n):
                row_reduced_matrix[i][j] -= min_row
        col_reduced_matrix = row_reduced_matrix.copy()
        for j in range(self.n):
            min_col = min(col_reduced_matrix[i][j] for i in range(self.n))
            for i in range(self.n):
                col_reduced_matrix[i][j] -= min_col
        return col_reduced_matrix
    def branch_and_bound(self, matrix, row_mask, col_mask, level, current_cost, assignment):
        """Recursive branch and bound function."""
        if level == self.n:  
            if current_cost < self.best_cost:
                self.best_cost = current_cost
                self.best_assignment = assignment.copy()
            return
        reduced_matrix = self.reduce_cost_matrix(matrix)
        lower_bound = self.calculate_lower_bound(reduced_matrix, row_mask, col_mask)
        if lower_bound + current_cost >= self.best_cost:
            return
        for task in range(self.n):
            if not col_mask[task]:  
                new_row_mask = row_mask.copy()
                new_col_mask = col_mask.copy()
                new_row_mask[level] = True
                new_col_mask[task] = True
                self.branch_and_bound(matrix, new_row_mask, new_col_mask, level + 1,
                                      current_cost + matrix[level][task], assignment + [task])

    def calculate_lower_bound(self, matrix, row_mask, col_mask):
        """Calculate the lower bound for the given matrix."""
        lb = 0
        for i in range(self.n):
            if not row_mask[i]:
                lb += min(matrix[i]) 

        for j in range(self.n):
            if not col_mask[j]:
                col_min = min(matrix[i][j] for i in range(self.n))
                lb += col_min  
        return lb
    def solve(self):
        """Solve the assignment problem using branch and bound."""
        row_mask = [False] * self.n  # Mask for rows (workers)
        col_mask = [False] * self.n  # Mask for columns (tasks)
        self.branch_and_bound(self.cost_matrix, row_mask, col_mask, 0, 0, [])
        return self.best_cost, self.best_assignment
cost_matrix = [
    [4, 2, 8, 5],
    [6, 7, 3, 4],
    [9, 2, 5, 1],
    [3, 4, 2, 7]
]

bb = BranchBound(cost_matrix)
best_cost, best_assignment = bb.solve()
print(f"Best cost: {best_cost}")
print(f"Best assignment: {best_assignment}")


'''OUTPUT

Best cost: 0
Best assignment: [1, 2, 3, 0]

'''
