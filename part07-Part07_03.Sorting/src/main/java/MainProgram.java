


public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        int[] numbers = {6, 5, 8, 7, 11};
        System.out.println("Smallest: " + MainProgram.smallest(numbers));
        System.out.println("Index of the smallest number: " + MainProgram.indexOfSmallest(numbers));
    }
    public static int smallest(int[] array){
        int index=array[0];
        for(int i=0;i<array.length;i++){
            if(index>array[i]){
                index=array[i];
            }
        }
        return index;
    }
    public static int indexOfSmallest(int[] array){
        int index=0;
        int smallest=array[0];
        for(int i=0;i<array.length;i++){
            if(array[index]>array[i]){
                index=i;
            }
        }
        return index;
    }
    public static int indexOfSmallestFrom(int[] table, int startIndex){
        int index=startIndex;
        int sma=table[startIndex];
        for (int i=startIndex+1;i<table.length;i++){
            if(table[index]>table[i]){
                index=i;
            }
        }
        return index;
    }
    public static void swap(int[] array, int index1, int index2){
        int temp=array[index1];
        array[index1]=array[index2];
        array[index2]=temp;
    }
    public static void sort(int[] array){
        for(int i=0;i<array.length;i++){
            int smallestindex=indexOfSmallestFrom(array, i);
            swap(array, i, smallestindex);
            
        }
    }
}
