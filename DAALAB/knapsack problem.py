def knapsack(W,wt,val,n):
    if n==0 or W==0:
        return 0
    if(wt[n-1]>W):
        return knapsack(W,wt,val,n-1)
    else:
        return max(val[n-1]+knapsack(W-wt[n-1],wt,val,n-1),knapsack(W,wt,val,n-1))
W=int(input("Enter knapsack capacity:"))
n=int(input("Enter the number of objects:"))
wt=[]
val=[]
for i in range(n):
    ob=int(input("enter the weight of the object:"))
    wt.append(ob)
    print('i=',i)
for j in range(n):
    v=int(input("enter the values of the object:"))
    val.append(v)
    print('j=',j)
print("The maximum value is:",knapsack(W,wt,val,n))


''' OUTPUT
Enter knapsack capacity:5
Enter the number of objects:3
enter the weight of the object:1
i= 0
enter the weight of the object:2
i= 1
enter the weight of the object:3
i= 2
enter the values of the object:2
j= 0
enter the values of the object:3
j= 1
enter the values of the object:4
j= 2
The maximum value is: 7'''


