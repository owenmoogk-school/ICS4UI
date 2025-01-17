// essay class
// subclass of document

public class Essay extends Document {

  public static final int min_words = 1500;
  public static final int max_words = 3000;

  public Essay(){
    super();
  }

  public boolean validLength(){
    if (words > min_words & words < max_words){
      return(true);
    }
    else{
      return(false);
    }
  }
}