package String_Program;

public class Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Hello World");
	
	String str="Selenium";
	
	char[] tmp1= str.toCharArray();
	for(int i=tmp1.length-1;i>=0;i--) {
	 System.out.print(tmp1[i]);
	
	}
	String str2="Hello World";
	System.out.println();
	char[] tmp2=str2.toCharArray();
	int l,r=0;
	r=tmp2.length-1;
	for(l=0;l<r;l++,r--) {
		char tmp=tmp2[l];
		tmp2[l]=tmp2[r];
		tmp2[r]=tmp;
	}
	for(char c:tmp2) {
		System.out.print(c);
		
	}
	
	}
	

}
