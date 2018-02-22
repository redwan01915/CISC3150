public class CISC3150HW3MYString {
	
	private char string[];

	
	public CISC3150HW3MYString(char[] chars){
		string = characters;
	}
	public char charAt(int index){
		char c = string[index];
		return c;
	}
	public int length(){
		return string.length;
	}
	public CISC3150HW3MYString substring(int begin, int end){
		char [] c = new char[end-begin];
 		if(end > length())
 			end = length();
 		for(int i = 0; i < end - begin; i++){
 			c[i] = string[i+begin];
 		}
 		CISC3150HW3MYString temp = new CISC3150HW3MYString(c);
		return temp;
	}
	public CISC3150HW3MYString toLowerCase(){	
		for(int i = 0; i < length(); i++)
			string[i] = Character.toLowerCase(string[i]);
		return this;
	}
	public CISC3150HW3MYString toUpperCase(){
		for(int i = 0; i < length(); i++)
			string[i] = Character.toUpperCase(string[i]);
		return this;
	}
	public boolean equals(MyString s){
		if(this.length() != s.length())
			return false;
		for(int i = 0; i < s.length(); i++)
			if(this.charAt(i) != s.charAt(i))
				return false;
		return true;
	}
	public CISC3150HW3MYString getMyString(){
		return this;
	}
	public String toString(){
		String s = new String(string);
		return s;
	}
	public static CISC3150HW3MYString valueOf(int i){
		
		boolean negative = false;
		int place = 1;
		int length = 1;
		if(i < 0){
			negative = true;
			i *= -1;
			length++;
		}

		while(place*10 < i){
			place*=10;
			length++;
		}
		
		char [] c = new char[length];
		
		for(int j = 0; place >=1; j++){
			if(negative){
				c[0] = '-';
				j++;
				negative = false;
			}
			int temp = i/place + 48;
			i = i%place;
			place/=10;
			c[j] = (char) temp;	
		}
		
		final CISC3150HW3MYString temps = new CISC3150HW3MYString(c);
		return temps;
	}
}