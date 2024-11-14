import numpy as np
a11=int(input("Enter the integer a11"))
a12=int(input("Enter the integer a12"))
a21=int(input("Enter the integer a21"))
a22=int(input("Enter the integer a22"))
b11=int(input("Enter the integer b11"))
b12=int(input("Enter the integer b12"))
b21=int(input("Enter the integer b21"))
b22=int(input("Enter the integer b22"))
x = np.array([[a11, a12], [a21, a22]])
y = np.array([[b11, b12], [b21, b22]])
z = np.zeros((2, 2))
m1, m2, m3, m4, m5, m6, m7 = 0, 0, 0, 0, 0, 0, 0
print("The first matrix is: ")
for i in range(2):
    print()
    for j in range(2):
        print(x[i][j], end="\t")
print("\nThe second matrix is: ")
for i in range(2):
    print()
    for j in range(2):
        print(y[i][j], end="\t")
m1 = (x[0][0] + x[1][1]) * (y[0][0] + y[1][1])
m2 = (x[1][0] + x[1][1]) * y[0][0]
m3 = x[0][0] * (y[0][1] - y[1][1])
m4 = x[1][1] * (y[1][0] - y[0][0])
m5 = (x[0][0] + x[0][1]) * y[1][1]
m6 = (x[1][0] - x[0][0]) * (y[0][0] + y[0][1])
m7 = (x[0][1] - x[1][1]) * (y[1][0] + y[1][1])

z[0][0] = m1 + m4 - m5 + m7
z[0][1] = m3 + m5
z[1][0] = m2 + m4
z[1][1] = m1 - m2 + m3 + m6

print("\nProduct achieved using Strassen's algorithm: ")
for i in range(2):
    print()
    for j in range(2):
        print(z[i][j], end="\t")
