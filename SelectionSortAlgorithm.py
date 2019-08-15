def selectionSort(array) :
    for i in range(len(array)) :
        min_index = i
        for j in range(i+1,len(array)) :
            if array[j]<array[min_index] :
                min_index = j
              
        #swap
        temp = array[min_index]
        array[min_index] = array[i]
        array[i]=temp
        
def main() :
    array = [9,3,4,1,8,6]
    selectionSort(array)
    for k in range(len(array)) :
        print(array[k]," ", end = '')

  
if __name__ == "__main__" :
    main()
