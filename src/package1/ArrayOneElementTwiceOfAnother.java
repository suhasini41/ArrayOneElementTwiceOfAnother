package package1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ArrayOneElementTwiceOfAnother
{
	private boolean findDouble(int[] n) {
		boolean flag = false;
		for(int i=0;i<n.length-1;i++)
		{
			for(int j=i+1;j<n.length;j++)
			{
				if((n[i]==n[j]*2)||(n[i]==n[j]/2))
				{
					flag = true;
					break;
				}
			}
			if(flag==true)
				break;
		}
		return flag;
	}
	
	@Test
	public void testCase1()
	{
		int[] n = {5,1,8,6,0};
		Assert.assertEquals(findDouble(n), false);
	}
	
	@Test
	public void testCase2()
	{
		int[] n = {5,1,8,6,10};
		Assert.assertEquals(findDouble(n), true);
	}
	
	@Test
	public void testCase3()
	{
		int[] n = {5,1,8,6,3};
		Assert.assertEquals(findDouble(n), true);
	}

}
