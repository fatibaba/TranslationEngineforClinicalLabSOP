package Users.Nabila.OCLSOP;

/**
 * 
 * @author Emma Haddi
 *
 */

import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;

import opennlp.tools.cmdline.PerformanceMonitor;
import opennlp.tools.cmdline.postag.POSModelLoader;
import opennlp.tools.postag.POSModel;
import opennlp.tools.postag.POSTaggerME;
import opennlp.tools.tokenize.WhitespaceTokenizer;
import opennlp.tools.util.ObjectStream;
import opennlp.tools.util.PlainTextByLineStream;

public class TaggingModel {

 public static Map<String, String> syntacticTagging(String input) throws IOException {
  Map<String, String> wordsTagg = new HashMap<String, String>();
  POSModel model = new POSModelLoader().load(new File("Users/Nabila/OCLSOP/en-pos-maxent.bin"));
  PerformanceMonitor perfMon = new PerformanceMonitor(System.err, "sent");
  POSTaggerME tagger = new POSTaggerME(model);

  ObjectStream<String> lineStream = new PlainTextByLineStream(new StringReader(input));


  perfMon.start();
  String line;
  while ((line = lineStream.read()) != null) {

   String whitespaceTokenizerLine[] = WhitespaceTokenizer.INSTANCE.tokenize(line);
   String[] tags = tagger.tag(whitespaceTokenizerLine);
   //TODO extract adjectives, adverbs and articles 
   for(int i=0; i<whitespaceTokenizerLine.length;i++){
    wordsTagg.put(whitespaceTokenizerLine[i], tags[i]);
   }

   //POSSample sample = new POSSample(whitespaceTokenizerLine, tags);
   //sample.getTags();
   //System.out.println(sample.toString());


   perfMon.incrementCounter();
  }
  perfMon.stopAndPrintFinalResult();
  return wordsTagg;
 }
 
 
 
 public static void main(String[] args) throws IOException {
 
     String input = "write for 1-5 min eppendorf max 4∞ C";
  System.out.print(TaggingModel.syntacticTagging(input).keySet().toString());
  
 }
}
