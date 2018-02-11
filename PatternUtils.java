package Users.Nabila.OCLSOP;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternUtils {
 
 public static final String URL = "\\b(https?)?\\W{0,3}(www)?\\.[\\w\\-\\/\\?%&]+\\.\\w{2,3}(\\.\\w{2})?(\\/[\\w\\-\\/\\?%&]+)?\\b";
 
 public static final String HTML_TAG = "</?\\w+((\\s+\\w+(\\s*=\\s*(?:\".*?\"|'.*?'|[^'\">\\s]+))?)+\\s*|\\s*)/?>";

 /*
  * this method implements the pattern matching for the xml files
  */
 public static synchronized String getWordAccordingToPattern(String text, String pattern){
  Pattern p = Pattern.compile(pattern);
  Matcher m = p.matcher(text);
  String result = "";

  if(m.find()){
   result = text.substring(m.start(),m.end()).trim();
  }
  return result;
 }
 
 public static synchronized List<String> getWordListAccordingToPattern(String text, String pattern){
  List<String> list = new ArrayList<String>();
  Pattern p = Pattern.compile(pattern);
  Matcher m = p.matcher(text);
  int i=0;
  while(i<text.length()){
   if(m.find(i)){
   list.add(text.substring(m.start(), m.end()).trim());
   i=i+m.end();
  }else{
   break;
  }
  }
  return list;
 }

}