import java.util.Scanner;

public class NextPermutation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int nums[] = new int[n];

        // Take array input
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Step 1: Find breakpoint
        int index = -1;

        for (int i = n - 2; i >= 0; i--) {

            if (nums[i] < nums[i + 1]) {

                index = i;
                break;
            }
        }

        // Step 2: If no breakpoint
        if (index == -1) {

            reverse(nums, 0, n - 1);

        } else {

            // Step 3: Find element just greater than nums[index]
            for (int i = n - 1; i > index; i--) {

                if (nums[i] > nums[index]) {

                    int temp = nums[i];

                    nums[i] = nums[index];

                    nums[index] = temp;

                    break;
                }
            }

            // Step 4: Reverse the right part
            reverse(nums, index + 1, n - 1);
        }

        // Print next permutation
        System.out.print("Next permutation = ");

        for (int i = 0; i < n; i++) {

            System.out.print(nums[i] + " ");
        }
    }

    // Method to reverse part of the array
    public static void reverse(int[] nums, int left, int right) {

        while (left < right) {

            int temp = nums[left];

            nums[left] = nums[right];

            nums[right] = temp;

            left++;
            right--;
        }
    }
}
