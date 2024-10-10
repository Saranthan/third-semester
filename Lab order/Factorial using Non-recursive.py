def factorial(n):
    result=1
    for i in range(1,n+1):
        result *=i
    return result
print(factorial(4))
import time
def display():
    print("find time complexity")
start=time.time()
display()
end=time.time()
print("the time complexity is",end-start)

