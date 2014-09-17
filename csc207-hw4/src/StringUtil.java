public class StringUtil {

	static public String[] splitAt(String thread, char splitter) {
		int occurrencescount = countOccurrences(thread, splitter);

		String[] ParsedArray = new String[occurrencescount + 1];
		int firstofpart = 0;
		int lastofpart = thread.indexOf(splitter, firstofpart);
		for (int i = 0; i < occurrencescount + 1; i++) { //run through loop
			if (lastofpart == -1) {
				lastofpart = thread.length();
			}//if
			ParsedArray[i] = thread.substring(firstofpart, lastofpart);
			firstofpart = lastofpart + 1;
			lastofpart = thread.indexOf(splitter, lastofpart + 1);
		}//for
		return ParsedArray;
	}//splitAt(String, char)
	
	
	// adapted from http://stackoverflow.com/questions/275944/how-do-i-
			// count-the-number-of-occurrences-of-a-char-in-a-string
	public static int countOccurrences(String thread, char splitter) {
		int count = 0;
		for (int i = 0; i < thread.length(); i++) {
			if (thread.charAt(i) == splitter) {
				count++;
			}//if
		}//for
		return count;
	}//countOccurrences(thread, splitter)


	  public static int countOccurrences2(String thread)
	  {
	    int count = 0;
	    int quoteCount = 0;
	    for (int i = 0; i < thread.length(); i++)
	      {
	        if (thread.charAt(i) == ',' && isPositive(quoteCount))
	          {
	            count++;
	          }//if
	        if (thread.charAt(i) == '\"')
	          {
	            if (doubleQuote(thread, i))
	              {
	              i++;
	              }//if
	            else
	              {
	              quoteCount++;
	              }//else
	          }//if
	      }//for

	    return count;
	  }//countOccurrences2

	  static public boolean doubleQuote(String thread, int position)
	  {
	    if (thread.charAt(position) == '\"' && 
	        thread.charAt(position + 1) == '\"')
	      {
	      return true;
	      }//if
	    else
	      {
	      return false;
	      }//else
	  }//doubeQuote

	  static public boolean isPositive(int num)
	  {
	    if (num % 2 == 0)
	      {
	      return true;
	      }//if
	    else
	      {
	      return false;
	      }//else
	  }//isPositive

	  static public String[] splitCSV(String thread)
	  {
	    int numberOfOccurrences = countOccurrences2(thread) + 1;
	    String[] ParsedArray = new String[numberOfOccurrences];
	    int quoteCount = 0;
	    int length = thread.length();
	    StringBuffer buffer = new StringBuffer("\"");
	    int p = 0;

	    // int startPos = 0;
	    //int lastPos = 0;

	    for (int i = 0; i < length; i++)
	      {
	        char iterator = thread.charAt(i);

	        if (iterator == '\"')
	          {
	            if (doubleQuote(thread, i))
	              {
	                buffer.append('\"');
	                i++;
	              }//if
	            else
	              {
	              quoteCount++;
	              }//else
	            continue;
	          }//if

	        if (iterator == ',' && isPositive(quoteCount))
	          {
	            ParsedArray[p] = buffer.append("\"").toString();
	            buffer = new StringBuffer("\"");
	            //commaCount++;
	            p++;
	            continue;
	          }//if

	        buffer = buffer.append(iterator);
	        if (i == length - 1)
	          {
	          ParsedArray[p] = buffer.append("\"").toString();
	          }//if
	      }//for
	    return ParsedArray;
	  }
}//class StringUtil
