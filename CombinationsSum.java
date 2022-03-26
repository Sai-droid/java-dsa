import java.util.*;
class CombinationsSum {


    public static ArrayList<ArrayList<Integer>> combination(int[] candidates, int target) {
    ArrayList<ArrayList<Integer>> result = new ArrayList<>();
    ArrayList<Integer> list = new ArrayList<>();
    int check = 0;
    generateCombinations(result,list,0,candidates,target);    
    return result;
    }

    public static void generateCombinations(ArrayList<ArrayList<Integer>> result, ArrayList<Integer> list, int index,int arr[],int target ){

        if(target==0){
            result.add(new ArrayList<>(list));
            return ;
        }

        if(target<0){
            return;
        }
        if(index==arr.length){
            return ;
        }
     
            list.add(arr[index]);
            generateCombinations(result,list,index,arr,target-arr[index]);
            list.remove(list.size()-1);
            generateCombinations(result,list,index+1,arr,target);
        
         

    
       
    }
    
    public static void main(String args[]) {
        int arr[] = {8, 10, 6, 11, 1, 16, 8};
     
        System.out.println(combination(arr,28));
    }
}
