def factorial(n):
    if n == 0 or n == 1:
        return 1
    else:
        return n * factorial(n - 1)
print(factorial(6))
import time
def display():
    print("find time complexity")
start=time.time()
display()
end=time.time()
print("the time complexity is",end-start)

