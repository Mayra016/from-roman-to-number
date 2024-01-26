import java.util.HashMap;

public class Main {
    
	public static void main(String[] args) {
		System.out.println(fromRoman("XXI"));
	}

  public static int fromRoman(String romanNumeral) {
        HashMap<Character, Integer> values = new HashMap<>();
        values.put('I', 1);
        values.put('V', 5);
        values.put('X', 10);
        values.put('L', 50);
        values.put('C', 100);
        values.put('D', 500);
        values.put('M', 1000);
        
        int result = 0;
        
        for ( byte i = 0; i < romanNumeral.length(); i++ ) {
            int value = values.get(romanNumeral.charAt(i));
            int nextValue = i != romanNumeral.length() - 1 ? values.get(romanNumeral.charAt(i+1)) : 0;
            
            if ( nextValue > value ) {
                result -= value;
            } else {
                result += value;
            }
        }
        return result;
  }

}
