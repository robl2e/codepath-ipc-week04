public class SolutionLetterPhone {
    public static final HashMap<Character, ArrayList<String>> 
        DIGIT_MAP = new HashMap<Character, ArrayList<String>>() {{
       put('0', new ArrayList<String>() {{
                add("0");
           }});
       put('1', new ArrayList<String>() {{
                add("1");
           }});
       put('2', new ArrayList<String>() {{
                add("a");
                add("b");
                add("c");
           }});
       put('3', new ArrayList<String>() {{
                add("d");
                add("e");
                add("f");
           }});
       put('4', new ArrayList<String>() {{
                add("g");
                add("h");
                add("i");
           }});           
       put('5', new ArrayList<String>() {{
                add("j");
                add("k");
                add("l");
           }});
       put('6', new ArrayList<String>() {{
                add("m");
                add("n");
                add("o");
           }});
       put('7', new ArrayList<String>() {{
                add("p");
                add("q");
                add("r");
                add("s");
           }});
        put('8', new ArrayList<String>() {{
                add("t");
                add("u");
                add("v");
           }});
        put('9', new ArrayList<String>() {{
                add("w");
                add("x");
                add("y");
                add("z");
           }});             
    }};
    
    ArrayList<String> ans = new ArrayList<>();
    
    public ArrayList<String> letterCombinations(String A) {
        if (A == null || A.length() == 0) return ans;
        
        letterCombUtil(A, "", 0);
        
        return ans;
    }
    
    public void letterCombUtil(String A, String perm, int start) {
        
  //      System.out.println("start = " + start + " perm = " + perm);
  
        if (start >= A.length()) {      
            ans.add(perm);
            return;
        }
        
      //  System.out.println("start = " + start + " perm = " + perm);
        
        char digit = A.charAt(start);
        ArrayList<String> letters = DIGIT_MAP.get(digit);
        
        //System.out.println("start = " + start + " perm = " + perm + " digit = " + digit);
        
        for (int j = 0; j < letters.size(); j++) {
            String letter = letters.get(j);
            perm = perm + letter;
            letterCombUtil(A, perm, start+1);
            perm = perm.substring(0, perm.length()-1);
        }
    }
}
