import java.util.Arrays;
import static java.lang.System.out;



public class StringUtil {
static public String[] splitAt(String thread, char splitter)
{ 
    int occurrencescount = countOccurrences(thread, splitter);
   
    String[] ParsedArray = new String[occurrencescount+1];
    int firstofpart = 0;
	int lastofpart = thread.indexOf(splitter, firstofpart);
    for (int i=0; i < occurrencescount+1; i++){
	if (lastofpart == -1){
	    lastofpart = thread.length();
	}
	ParsedArray[i] = thread.substring(firstofpart, lastofpart);
	firstofpart = lastofpart+1;
	lastofpart = thread.indexOf(splitter, lastofpart+1);
    }
return ParsedArray;     
}
public static int countOccurrences(String thread, char splitter)
{
    int count = 0;
    for (int i=0; i < thread.length(); i++)
    {
        if (thread.charAt(i) == splitter)
        {
             count++;
        }
    }
    return count;
}//adapted from http://stackoverflow.com/questions/275944/how-do-i-
//count-the-number-of-occurrences-of-a-char-in-a-string
static public String[] splitCSV(String thread)
{ 
    String[] ParsedArray = new String[] {"shot"};
    return ParsedArray;
}
}

