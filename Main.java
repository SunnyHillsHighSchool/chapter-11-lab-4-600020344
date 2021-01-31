class Main {
  public static void main(String[] args) {
      //add test cases 
      StringRemover a = new StringRemover("xR-MxR-MHelloxR-M","R-M");
      System.out.println(a + "\n\n\n");
      StringRemover b = new StringRemover("sxsssxssxsxssexssxsesss","xs");
      System.out.println(b + "\n\n\n");
      StringRemover c = new StringRemover("fuxqwexqwertyxqwexqwertyrtyxqwertyrtyn","qwerty");
      System.out.println(c + "\n\n\n");
      StringRemover d = new StringRemover("dogdogcatddodogdogdoggog","dog");
      System.out.println(d);
  }
}
