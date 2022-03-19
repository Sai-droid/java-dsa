class TowerOfHanoi
{
	public static void move(int disks, int source, int auxiliary, int target)
	{
		if (disks > 0)
		{
			// move `n-1` discs from source to auxiliary using the target
			// as an intermediate pole
			move(disks - 1, source, target, auxiliary);

			// move one disc from source to target
			System.out.println("Move disk " + disks + " from " + source + " —> " +
								target);

			// move `n-1` discs from auxiliary to target using the source
			// as an intermediate pole
			move(disks - 1, auxiliary, source, target);
		}
	}

	// Tower of Hanoi Problem
	public static void main(String[] args)
	{
		int n = 3;
		move(n, 1, 2, 3);
	}
}