package q06;

public class MyClass {
    public static void main(String[] args) {
        int[][] nums = {{20}, {30}, {40}};
        int sum = 0;
        // INSERT HERE
        for (int[] row : nums)
            for (int val : row)
                sum += val;
        System.out. println(sum);
    }
}
/*
* Which code will compile and print 90 at runtime?
Select the one correct answer.
a.
  for (int[] row : nums[])
    for (int val : nums[row])
      sum += val;
b.
  for (int[] row : nums[][])
    for (int val : nums[row])
      sum += val;
* c.
for (int[] row : nums)
    for (int val : nums[row])
      sum += val;
d.
  for (int[] row : nums)
    for (int val : row)
      sum += val;
e.
  for (Integer[] row : nums)
    for (int val : row)
      sum += val;
* */