import time
def fact_rec(n):
    if n==1 or n==0:
        return 1
    else:
        return(n*fact_rec(n-1))
s1=time.time()
n=int(input("Enter the range"))
print(fact_rec(n))
e1=time.time()
print("Time complexity",(e1-s1))
def fact_nonrec(n):
    result=0
    if n==0 or n==1:
        result1=1
        print(result1)
    for i in range(n+1):
            result=result*i
    print(result)
s2=time.time()
n=int(input("Enter the range"))
fact_nonrec(n)
e2=time.time()
print("Time complexity",(e2-s2))
