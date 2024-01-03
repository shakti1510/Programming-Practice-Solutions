package String_Day15;

class StringOperator {
	void countAlphaNum(String s) {
		int uc=0,lc=0,dc=0,spc=0;
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>='A'&&ch[i]<='Z')
				uc++;
			else if(ch[i]>='a'&&ch[i]<='z')
				lc++;
			else if(ch[i]>='0'&&ch[i]<='9')
				dc++;
			else
				spc++;
		}
		System.out.println("No of Capital Letter:"+uc);
		System.out.println("No of Small Letter:"+lc);
		System.out.println("No of Digit:"+dc);
		System.out.println("No of Special Character:"+spc);
	}
	
	//To Check if given String is Palindrome or not
	boolean isPalindrome(String s) {
		int i=0,j=s.length()-1;
		while(i<=j) {
			if(s.charAt(i)!=s.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}
	String reverseStr(String s) {
		String s1="";
		for(int i=s.length()-1;i>=0;i--)
			s1+= s.charAt(i);
		return s1;
	}
	
	// to reverse a String
	String revStr(String s) {
		char[] ch=s.toCharArray();
		int i=0,j=s.length()-1;
		while(i<j) {
			char temp=ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
			i++;
			j--;
		}
		s=new String(ch);
		return s;
	}
	
	//Count the frequency of every Character in a String
	void freqChar(String s) {
		boolean[] b=new boolean[s.length()];
		int[] k=new int[s.length()];
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			int j=i+1;
			if(!b[i]) {
				while(j<s.length()) {
					if(ch==s.charAt(j)) {
						k[i]++;
						b[j]=true;
					}
					j++;
				}
			}
		}
		for(int i=0;i<k.length;i++) {
			if(!b[i]) {
				System.out.println(s.charAt(i)+" -> "+(k[i]+1));
			}
		}
		System.out.println();
	} 
	
	//Converts all the Characters in a String to UpperCase
	String upperCaseStr(String s) {
		char[] ch=s.toCharArray();
		for(int i=0;i<s.length();i++) {
			if(ch[i]>='a'&&ch[i]<='z') {
				ch[i]=(char)(ch[i]-32);
			}
		}
		return new String(ch);
	}
 
	// Return the number of WORDS in a Sentence
	int worldCount(String s) {
		int c=0;
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(i==0&&ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' ') {
				c++;
			}
		} 
		return c;
	}

	//Swapping First and Last Character of every word in the string
	String letterSwap(String s) {
		int d=0;
		char[] ch=s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(i==0&&ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' ')
				d=i;
			else if(i==ch.length-1&&ch[i]!=' '||ch[i]!=' '&&ch[i+1]==' ') {
				char t=ch[i];
				ch[i]=ch[d];
				ch[d]=t;
			}
		}
		return new String(ch);
	}

	// Convert First and Last Character of every word to Capital and remaining to small 
	String capFirstLast(String s) {
		char[] ch=s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(i==0&&ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' ') {
				if(ch[i]>='a'&&ch[i]<='z')
					ch[i]=(char)(ch[i]-32);
			}
			else if(i==ch.length-1&&ch[i]!=' '||ch[i]!=' '&&ch[i+1]==' ') {
				if(ch[i]>='a'&&ch[i]<='z')
					ch[i]=(char)(ch[i]-32);
			}
			else {
				if(ch[i]>='A'&&ch[i]<='Z')
					ch[i]=(char)(ch[i]+32);
			}
		}
		return new String(ch);
	}
	// Reverse every word in a Sentence 
	String revWord(String s) {
		char[] ch=s.toCharArray();
		int  d=0;
		for(int i=0;i<ch.length;i++) {
			if(i==0&&ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' ')
				d=i;
			else if(i==ch.length-1&&ch[i]!=' '||ch[i]!=' '&&ch[i+1]==' ') {
				int j=i;
				while(d<j) {
					char t=ch[d];
					ch[d]=ch[j];
					ch[j]=t;
					d++;j--;
				}
			}
		}
		return new String(ch);
	}

	//Reverse the sentence but not the words.
	String revSentence(String s) {
		char[] ch=s.toCharArray();
		String s1=new String();
		int f=0,l=0;
		for(int i=ch.length-1;i>=0;i--) {
			if(i==0&&ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' ') {
				f=i;
				for(int j=f;j<=l;j++)
					s1+=ch[j];
			}
			else if(i==ch.length-1&&ch[i]!=' '||ch[i]!=' '&&ch[i+1]==' ') {
				l=i;
			}
			else if(ch[i]==' '){
				s1+=ch[i];
			}
		}
		return s1;

	}
	// Return sum of all the NUMBERS in a String
	int sumNum(String s) {
		int sum=0,d=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='0'&&ch<='9') {
				d=d*10+ch-48;
			} else {
				sum +=d;
				d=0;
			}
		}
		sum+=d;
		return sum;
	}
}
