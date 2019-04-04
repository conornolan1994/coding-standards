package code;

public class LineLength {
	
	int longLengthExpression = 0;
	
	
	
	//GOOD EXAMPLE
	public void goodLineLengthExample()
	{
		if ((longLengthExpression == 1) || (longLengthExpression == 2) || (longLengthExpression == 3) ||
				(longLengthExpression == 4) || (longLengthExpression == 5))
				{
					//do something
				}
	}
	
	
	
	//BAD EXAMPLE
		public void badLineLengthExample()
		{
			if ((longLengthExpression == 1) || (longLengthExpression == 2) || (longLengthExpression == 3) ||(longLengthExpression == 4) || (longLengthExpression == 5))
			{
				
			}
		}
	

}
