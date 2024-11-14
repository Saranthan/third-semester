#                                        EX NO:10A
import itertools
import time
start=time.time()
def calculate_cost(cost_matrix, assignment):
    total_cost = 0
    for agent, task in enumerate(assignment):
        total_cost += cost_matrix[agent][task]
    return total_cost

def exhaustive_assignment(cost_matrix):
    num_agents = len(cost_matrix)
    tasks = range(num_agents)
    
    all_assignments = itertools.permutations(tasks)
    min_cost = float('inf')
    best_assignment = None
    for assignment in all_assignments:
        cost = calculate_cost(cost_matrix, assignment)
        if cost < min_cost:
            min_cost = cost
            best_assignment = assignment
            
    return best_assignment, min_cost


cost_matrix = [
    [10, 15, 20],
    [20, 10, 15],
    [15, 20, 10]
]

best_assignment, min_cost = exhaustive_assignment(cost_matrix)
print(f"Best assignment: {best_assignment}, Minimum cost: {min_cost}")
end=time.time()
print('time complexity is',end-start)

"""OUTPUT

Best assignment: (0, 1, 2), Minimum cost: 30
time complexity is 0.0

"""



