def linearsearch(arr,target):
    for i,value in enumerate(arr):
        if value==target:
            return i
        return-1
num=[6,7,8,9,4,3]
target=2
result=linearsearch(num,target)
if result !=-1:
    print("element are found")
else:
    print("element are not found")
import time
def display():
    print("find time complexity")
start=time.time()
display()
end=time.time()
print("the time complexity is",end-start)

