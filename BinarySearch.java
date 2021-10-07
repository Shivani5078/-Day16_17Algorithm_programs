package algorithm.com;

public class BinarySearch
{
	/*
	 * @purpose:Read in the list words comma separated and then enter the word to be searched.
	 * @author:shivani
     */
    public void search(String[] str)
  	{
       int firstIndex = 0;
       int lastIndex = str.length - 1;
       String searchStr = "March";
        while(firstIndex <= lastIndex)
        {
            int midIndex = (firstIndex + lastIndex) / 2;
            int research = searchStr.compareTo(str[midIndex]);
            if(research == 0)
            {
                System.out.println(searchStr + " is Found");
                break;
            }
            else if(research > 0)
            {
                firstIndex = midIndex + 1;
            }
            else if(research < 0)
            {
                lastIndex = midIndex - 1;
            }
         }
      } 
       public static void main(String[] args) 
       {
    	   String[] arr = {"Jan", "Feb", "March", "April" , "May" };
           BinarySearch binarysearch = new BinarySearch();
           binarysearch.search(arr);

        }
 }
