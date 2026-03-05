import java.util.ArrayList;
public class PairSum1{

    // Pair sum sorted array
    // find if any pair ina sorted arrayList has a target sum

    // list = [1,2,3,4,5,6]
    // target = 5

    // Approach1
    // the brute force approach
    // check all possible pairs 
    // and for each pair chcek if num1 + num2 == target
    // if yes return true 
    
    public static boolean pairSum1(ArrayList<Integer> list , int target){
        
        for(int i =0 ; i<list.size();i++){
            for(int j = i+1; j<list.size()-1;j++){
                if(list.get(i) + list.get(j) == target){
                    return true;
                }
            }
        }
        
        return false;
    }
    // time complexity of this approach is 
    // O(n^2)
    // because in the worst case 
    // it will run n times for all n elements

    // Approach2
    // The 2 pointer approach
    // take 2 pointers
    // left =0 
    // right = list.size()-1

    // and compare there sum with target
    // case1 : if (leftNum + rightNum == target)
    // return true

    // case2 : if(leftNum + rightNum < target)
    // left++

    // case3 : if(leftNum + rightNum > target)
    // right--

    // repeat ths in a loop 
    // while (left != right)

    public static boolean pairSum12(ArrayList<Integer> list , int target){
        int n = list.size();
        int left = 0;
        int right = n-1;

        while(left!= right){
            // case1 
            if(list.get(left) + list.get(right) == target){
                return true;
            }

            // case2 
            if(list.get(left) + list.get(right) < target){
                left++;
            }

            // case 3
            else{
                right--;
            }
        }
        return false;
    } 
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);

        System.out.println(pairSum1(list, 5));
        System.out.println(pairSum12(list, 5));
        System.out.println(pairSum1(list, 50));
        System.out.println(pairSum12(list, 50));

    }
}