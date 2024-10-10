import time
a=time.time()
def add_matrices(A, B):
    return [[A[i][j] + B[i][j] for j in range(len(A[0]))] for i in range(len(A))]

def subtract_matrices(A, B):
    return [[A[i][j] - B[i][j] for j in range(len(A[0]))] for i in range(len(A))]

def strassen(A, B):
    n = len(A)
    if n == 1:
        return [[A[0][0] * B[0][0]]]

    
    mid = n // 2
    A11 = [row[:mid] for row in A[:mid]]
    A12 = [row[mid:] for row in A[:mid]]
    A21 = [row[:mid] for row in A[mid:]]
    A22 = [row[mid:] for row in A[mid:]]

    B11 = [row[:mid] for row in B[:mid]]
    B12 = [row[mid:] for row in B[:mid]]
    B21 = [row[:mid] for row in B[mid:]]
    B22 = [row[mid:] for row in B[mid:]]

    
    M1 = strassen(add_matrices(A11, A22), add_matrices(B11, B22))
    M2 = strassen(add_matrices(A21, A22), B11)
    M3 = strassen(A11, subtract_matrices(B12, B22))
    M4 = strassen(A22, subtract_matrices(B21, B11))
    M5 = strassen(add_matrices(A11, A12), B22)
    M6 = strassen(subtract_matrices(A21, A11), add_matrices(B11, B12))
    M7 = strassen(subtract_matrices(A12, A22), add_matrices(B21, B22))

    C11 = add_matrices(subtract_matrices(add_matrices(M1, M4), M5), M7)
    C12 = add_matrices(M3, M5)
    C21 = add_matrices(M2, M4)
    C22 = add_matrices(subtract_matrices(add_matrices(M1, M3), M2), M6)
    C = []
    for i in range(mid):
        C.append(C11[i] + C12[i])
    for i in range(mid):
        C.append(C21[i] + C22[i])

    return 

def main():
    print("Getting input in Matrix A")
    print()
    A=[]
    n=int(input("Enter the number of rows to be in matrix : "))
    for i in range(n):
        l1=[]
        ele=int(input(f"Enter the number of elements to be in row {i+1} : "))
        for j in range(ele):
            e1=int(input(f"Enter the element {ele+1} : "))
            l1.append(e1)
        A.append(l1)
    print("Getting input in Matrix B")
    print()
    B=[]
    n=int(input("Enter the number of rows to be in matrix "))
    for i in range(n):
        l2=[]
        ele=int(input(f"Enter the number of elements to be in row {i+1} : "))
        for j in range(ele):
            e1=int(input(f"Enter the element {ele+1} : "))
            l1.append(e1)
        B.append(l1)
    print("Matrix loading of Matrix B is Complete ")
    result = strassen(A, B)
    print("Result of Strassen's Matrix Multiplication : ")
    for row in result:
        print(row)

if __name__ == "__main__":
    main()
b=time.time()
print('Time complexity',b-a)
