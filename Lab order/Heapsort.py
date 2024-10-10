

#                                                     Ex:No:4 HEAP SORT

import time
def heapify(arr,n,i):
  largest=i
  l=2*i+1
  r=2*i+2
  if l<n and arr[i]<arr[l]:
    largest=l
  if r<n and arr[largest]<arr[r]:
    largest=r
  if largest!=i:
    arr[i],arr[largest]=arr[largest],arr[i]
    heapify(arr,n,largest)
def heapSort(arr):
    n=len(arr)
    for i in range(n,-1,-1):
      heapify(arr,n,i)
    for i in range(n-1,0,-1):
      arr[i],arr[0]=arr[0],arr[i]
      heapify(arr,i,0)

arr=[]
s=time.time()
n=int(input("Enter the number of element:"))
for i in range(n):
  e=int(input("Enter the element:"))
  arr.append(e)
heapSort(arr)
e=time.time()
print("Sorted array is")
for i in range(n):
  print(arr[i],end=" ")
print("\ntime complexity:",e-s)

"""OUTPUT:
Enter the number of element:5
Enter the element:8
Enter the element:4
Enter the element:1
Enter the element:0
Enter the element:9
Sorted array is
0 1 4 8 9
time complexity: 18.404345512390137
"""
