import time
def factorial(n):
    if n == 0 or n == 1:
        return 1
    else:
        return n * factorial(n - 1)

def display(n):
    print(f"Finding  time complexity for input {n}","\n")
    print("The output is ","\n")
    start=time.time()
    print(factorial(n))
    print("\n")
    end=time.time()
    print("the time complexity is",end-start)
display(100)
display(1000)


