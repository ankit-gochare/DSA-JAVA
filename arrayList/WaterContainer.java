import java.util.ArrayList;

public class WaterContainer {

    // Container with most water
    // for a given n lines on x axis , use 2 lines
    // and form a contatiner such that it holds maximum water

    // height = [1,8,6,2,5,4,8,3,7]
    // ans = 49

    // width between 2 lines = 1 unit

    // approach 1
    // The Brute force approach
    // we have to find a pair of 2 lines
    // from which if we make a container
    // then it will hold the maximum amount of water
    // and the container must be rectangle only

    // then we check each possibly pair by applying loop
    // start from the first line
    // and go to each line for it and calculate water
    // then for the second line and so on
    // and keep remind that
    // pairs must not be duplicated

    // waterStored = height * width
    // height = min(leftheight , rightheight)
    // width = rightIndex - leftIndex

    // afte calculating the water Stored
    // we will compare it with maxWater which is initially 0
    // maxWater = max(maxwater , waterStired)

    public static int storeWater1(ArrayList<Integer> height) {
        int maxWater = 0;

        // brute force
        for (int i = 0; i < height.size(); i++) {
            for (int j = i + 1; j < height.size(); j++) {

                int ht = Math.min(height.get(j), height.get(i));
                int wt = j - i;
                int currWater = ht * wt;

                maxWater = Math.max(maxWater, currWater);
            }
        }
        return maxWater;
    }
    // but the time complexity is
    // O(n^2)

    // approach 2
    // the 2 pointer approach

    // we will take 2 pointers
    // 1. left = 0
    // 2. right = height.size()-1

    // and assume that the line at left
    // and the line at right pointer
    // are the lines that make the container with most water

    // calculate height width and currentwater
    // compare currentWater with maxwater

    // then we have to update the pointer
    // if leftheight < rightheight => left++
    // else right--

    // perform all this in a while loop
    // while left < right

    // we update the minimum height because
    // the amount of water Stored is controlled by the min height only

    // the time complexity will be O(n)
    // because the loop runs while
    // left < right
    // so the total is n times
    // therefore this optimized algorithm
    // 2 pointer approach will solve the problem in O(n) time

    public static int storeWater2(ArrayList<Integer> height) {
        int maxWater = 0;

        int left = 0;
        int right = height.size() - 1;

        while (left < right) {
            // calculate water
            int ht = Math.min(height.get(left), height.get(right));
            int wt = right - left;
            int currWater = ht * wt;

            maxWater = Math.max(maxWater, currWater);

            // update the pointer
            if (height.get(left) < height.get(right)) {
                left++;
            } else {
                right--;
            }
        }

        return maxWater;
    }

    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(storeWater1(height));
        System.out.println(storeWater2(height));

    }
}