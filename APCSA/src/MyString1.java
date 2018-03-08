
public class MyString1 {
	//(Implement the String class) The String class is provided in the Java library. Provide your own implementation for the following methods (name the new class MyString1): 

	public static void main(String[] args) {
		MyString1 m = new MyString1(s);
		System.out.println(m);
		System.out.println(m.charAt(3));
		System.out.println(m.length());
		System.out.println(m.substring(1, 3));
	}
	

	 //char[] s = new char[0];
	char[] s = {'A','B','C','D'};
		public MyString1(char[] chars){
			
		s = chars;
			
		}
		public char charAt(int index){
			
			return s[index];
			
		}
		public int length(){
			
			return s.length;
			
		}
		public MyString1 substring(int begin, int end){
			char[] x  = new char[end-begin];
			for(int i = begin; i < end; i++){
				x[i-begin] = s[i];
			}
			
			MyString1 dank = new MyString1(x);
			return dank;
			
		}
		public MyString1 toLowerCase(){
			
			for(int i = 0; i < s.length; i++){
				int x = charAt(i) - '0';
				if(x>65 && x < 91){
					x = x + 32;
					s[i] = (char) x;
				}
				else{
					s[i] = x[i];
				}
			}
			
			
			return new MyString1(s);
			
		}
		public boolean equals(MyString1 s){
			int test = 0;
			for(int i = 0; i < s.getCharacters().length; i++){
				if(this.getCharacters()[i] == s.getCharacters()[i]){
					test++;
				}
			}
			if(test== s.getCharacters().length){
				return true;
			}
			return false;
			
		}
		public char[] getCharacters(){
			return s;
		}
		public static MyString1 valueOf(int num){
			
			int len = 0;
			while(num>0){
				len++;
				num = num/10;
			}
			
			
			char[] x = new char[len];
			
			for(int i = x.length-1; i > 0; i--){
				
				x[i] = (char) (num %10+48);
				num = num/10;
				
			}
			
			MyString1 newString = new MyString1(x);
			
			return newString;
			
		}
		public String toString(){
			String newString = "";
			for(char c : s){
				newString += c;
			}
			
			return newString;
		}

}
