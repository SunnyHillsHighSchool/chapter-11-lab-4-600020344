//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

class StringRemover
{
   private String remove;
   private String sentence;

	public StringRemover( String sen, String rem )
	{
    sentence = sen;
    remove = rem;
	}

	public void removeStrings()
	{
    int index = sentence.indexOf(remove);
    while (index>-1)
    {
      if (index!=0)
        sentence = sentence.substring(0,index-1) + sentence.substring(index+remove.length());
      else
        sentence = sentence.substring(0,index) + sentence.substring(index+remove.length());
     index = sentence.indexOf(remove);
    }
	}

	public String toString()
	{
    String sen = sentence;
    removeStrings();
		return sen + " - String to remove " + remove +"\n" +sentence;

	}
}
