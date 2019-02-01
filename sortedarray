import num as n



def selection_sort(x):
    for i in range(len(x)):
        swap = i + n.argmin(x[i:])
        (x[i], x[swap]) = (x[swap], x[i])
    return x
x = n.array([2, 1, 4, 3, 5])
selection_sort(x)

