import java.util.*;
public class RandomStringChooser
{
  private ArrayList<String> w;
  RandomStringChooser(String[] words){
    w = new ArrayList<String>();
    for(int i = 0; i < words.length; i++){
      w.add(words[i]);
    }
  }
  public String getNext(){
    if(w.size()<=0){
      return "NONE";
    }
    return w.remove((int)(Math.random()*w.size()));
  }
}
