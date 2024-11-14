#                                               EX NO- 7
import numpy as np
from fractions import Fraction 
print("**** Simplex Algorithm ****\n")
A = np.array([[1, 1, 0, 1], [2, 1, 1, 0]])
b = np.array([8, 10]) 
c = np.array([1, 1, 0, 0]) 
cb = np.array([c[2], c[3]])  
B = np.array([[3], [2]]) 
xb = np.transpose([b]) 
table = np.hstack((B, cb.reshape(-1, 1))) 
table = np.hstack((table, xb))  
table = np.hstack((table, A)) 
table = np.array(table, dtype='float')
MIN = 0 
print("Table at iteration = 0")
print("B \tCB \tXB \ty1 \ty2 \ty3 \ty4")
for row in table:
    for el in row:
        print(Fraction(el).limit_denominator(100), end='\t')
    print()
print("Simplex Working....\n")
reached = False
itr = 1
unbounded = False
alternate = False
while not reached:
    print(f"Iteration: {itr}")
    print("B \tCB \tXB \ty1 \ty2 \ty3 \ty4")
    for row in table:
        for el in row:
            print(Fraction(el).limit_denominator(100), end='\t')
        print()
    rel_prof = []
    for i in range(len(A[0])):
        rel_profit = c[i] - np.sum(table[:, 1] * table[:, 3 + i])
        rel_prof.append(rel_profit)
    print("Relative profit: ", end="")
    
    for profit in rel_prof:
        print(Fraction(profit).limit_denominator(100), end=", ")
    print()
    b_var = table[:, 0]
    
    for i in range(len(A[0])):
        if i not in b_var and rel_prof[i] == 0:
            alternate = True
            print("Case of Alternate solution found")
            break
    if alternate:
        break
    if all(profit <= 0 for profit in rel_prof):
        print("All profits are <= 0, optimality reached")
        reached = True
        break
    k = np.argmax(rel_prof)
    min_ratio = float('inf')
    r = -1

    for i in range(len(table)):
        if table[i, 2] > 0 and table[i, 3 + k] > 0:
            ratio = table[i, 2] / table[i, 3 + k]
            if ratio < min_ratio:
                min_ratio = ratio
                r = i  
    if r == -1:
        unbounded = True
        print("Case of Unbounded solution")
        break

    print(f"Pivot element index: {r}, {3 + k}")
    pivot = table[r, 3 + k]
    print(f"Pivot element: {Fraction(pivot).limit_denominator(100)}")
    table[r, 2:] = table[r, 2:] / pivot 
    for i in range(len(table)):
        if i != r:
            table[i, 2:] -= table[i, 3 + k] * table[r, 2:]
    table[r, 0] = k
    table[r, 1] = c[k]
    itr += 1
    print()
print("***************************************************************")
if unbounded:
    print("UNBOUNDED LPP")
else:
    if alternate:
        print("ALTERNATE Solution")
print("Optimal table:")
print("B \tCB \tXB \ty1 \ty2 \ty3 \ty4")
for row in table:
    for el in row:
        print(Fraction(el).limit_denominator(100), end='\t')
    print()
Z = 0
basis = []
for i in range(len(table)):
    Z += c[int(table[i, 0])] * table[i, 2]
    basis.append(f"x{int(table[i, 0]) + 1}")

if MIN == 1:
    Z = -Z 
print(f"Value of Z at optimality: {Fraction(Z).limit_denominator(100)}")
print(f"Final Basis: {basis}")
print("Simplex Finished...")

''' OUTPUT

**** Simplex Algorithm ****

Table at iteration = 0
B       CB      XB      y1      y2      y3      y4
3       0       8       1       1       0       1
2       0       10      2       1       1       0
Simplex Working....

Iteration: 1
B       CB      XB      y1      y2      y3      y4
3       0       8       1       1       0       1
2       0       10      2       1       1       0
Relative profit: 1, 1, 0, 0,
Pivot element index: 1, 3
Pivot element: 2

Iteration: 2
B       CB      XB      y1      y2      y3      y4
3       0       3       0       1/2     -1/2    1
0       1       5       1       1/2     1/2     0
Relative profit: 0, 1/2, -1/2, 0,
Pivot element index: 0, 4
Pivot element: 1/2

Iteration: 3
B       CB      XB      y1      y2      y3      y4
1       1       6       0       1       -1      2
0       1       2       1       0       1       -1
Relative profit: 0, 0, 0, -1,
Case of Alternate solution found
***************************************************************
ALTERNATE Solution
Optimal table:
B       CB      XB      y1      y2      y3      y4
1       1       6       0       1       -1      2
0       1       2       1       0       1       -1
Value of Z at optimality: 8
Final Basis: ['x2', 'x1']
Simplex Finished...
'''
