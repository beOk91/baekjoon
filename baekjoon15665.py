import sys
def f(limit,arr1,arr2):
    if len(arr2)==limit:
        result.add(" ".join(str(i) for i in arr2));return
    for i in range(len(arr1)):
        f(limit,arr1,arr2+[arr1[i]])
n,m=map(int,sys.stdin.readline().strip().split())
n_list=sorted(list(set(list(map(int,sys.stdin.readline().strip().split())))))
result=set([])
f(m,n_list,[])
result=sorted(list(map(int,element.strip().split())) for element in result)
print("\n".join(" ".join(str(i) for i in element) for element in result))