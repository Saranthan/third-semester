import random
import time
def binarysearch(arr,target):
    low=0
    high=len(arr)-1
    while low<=high:
        mid=(low+high)//2
        if arr[mid]==target:
            return mid
        elif arr[mid]<target:
            low=mid+1
        else:
            high=mid-1
    return-1
number=[1,2,3,4,5]
number1=[int(i) for i in range(1000000)]
number1=sorted(number)
target=2
result=binarysearch(number,target)
print("\n","Using larger array","\n")
if result !=-1:
    print(f"element are  found at {result}")
else:
    print("element is not  found")
def display():
    print("find time complexity")
start=time.time()
display()
end=time.time()
print("the time complexity is",end-start)
result1=binarysearch(number,200)
result=binarysearch(number1,target)
print("\n")
print("using smaller array")
if result !=-1:
    print(f"element are  found at {result}")
else:
    print("element is not  found")
def display():
    print("find time complexity")
start=time.time()
display()
end=time.time()
print("the time complexity is",end-start)
