// You are climbing a stair case. It takes n steps to reach to the top
// Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

// This problem could be solved by dynamic programming. We maintain an array to store the distinct ways for each level n;
// When we move to n step, we have only two choices: climb 1 step from s[n-1] or climb 2 steps from s[n-2], thus
// s[n] = s[n-1] + s[n-2];


public class ClimbingStairs {
	public int climbStairs(int n){
		if (n <= 0){
			return 0;
		}
		int[] s = new int[n+1];
		s[0] = 1;
		s[1] = 1;
		for (int i = 2; i <= n; i++){
			s[i] = s[i-2] + s[i-1];
		}
		return s[n];
	}
}
