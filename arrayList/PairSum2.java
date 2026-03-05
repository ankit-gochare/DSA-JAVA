import java.util.ArrayList;
public class PairSum2{
    
    // Pair Sum in sorted and rotaed array
    // Find if any pair in a sorted and rotated arrayList has a target sum

    // list = [11,15,6,8,9,10]
    // target = 16

    // Approach1 
    // The brute force approach 
    // chcek each possible pair 
    // and for each pair check if num1 + num2 == target
    // if yes then return true

    public static boolean pairSum2(ArrayList<Integer> list , int target){
        
        for(int i =0 ; i<list.size();i++){
            for(int j = i+1; j<list.size();j++){
                if(list.get(i) + list.get(j) == target){
                    return true;
                }
            }
        }
        
        return false;
    }
    // time complexity O(n^2)

    // Approach2 
    // The 2 Pointer approach 
    // find out the pivot ( breaking point) in the sorted array

    // in each sorted array 
    // list(i) < list(i+1)

    // and when the condition breaks means 
    // the element is the pivot element 
    // list = [11,15,6,8,9,10]
    // here pivot is 15
    // and in a rotated sorted array the kargets number is the pivot  

    // after finding the pivot 
    // take 2 pointers 
    // left = 0 ( smallest number)
    // right = pivotIndex (larget element)

    // and to update the pointers
    // we use modular arithmetic 
    
    // case1 : if(leftNum + rightNum == target)
    // return true

    // case2 : if (leftNum + rightNum < target)
    // left = (left+1)%list.size()

    // case3 : if(leftNum + rightNum > target)
    // right = (list.size() + right -1)%v list.size()

    // repeat this in a loop
    // while(left ! = right)

    public static boolean pairSum22(ArrayList<Integer> list , int target){
        int n = list.size();
        int bp =-1; // breaking point pivit 

        // first find the pivot (breaking point) 

        for(int i = 0 ; i <n ; i++){
            if(list.get(i)>list.get(i+1)){
                bp=i;
                break;
            }
        }

        // now loop
        int left = bp+1;
        int right = bp;
        while(left!= right){
            // case 1 
            if(list.get(left) +list.get(right) == target){
                return true;
            }

            // case2 
            if(list.get(left) + list.get(right) < target){
                left = (left+1)%n;
            }

            // case 3
            else{
                right = (n+right-1)%n;
            }
        }

        return false;
    }
    // time complexity of this 2 pointer approach is 
    // O(n)
    // because total movements of left and right will be n times in worst case
    // and so the loop runs n times 
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        
        System.out.println(pairSum2(list, 16));
        System.out.println(pairSum22(list, 16));
        System.out.println(pairSum2(list, 60));
        System.out.println(pairSum22(list, 60));
    }
}