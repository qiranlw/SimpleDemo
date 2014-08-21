public class JiuLianHuan {
	public static int count = 0;

	public static void main(String[] args){
		takeOn(9);
		System.out.println(count);
	}
	
	public static void takeOff(int n){
		if (n == 1) {
			System.out.println("把第1个环拿下来");
		} else if(n == 2){
			System.out.println("把第1个和第2个环一块拿下来");
			count += 2;
			return;
		} else{
			takeOff(n-2);
			System.out.println("把第"+n+"个环拿下来");
			takeOn(n-2);
			takeOff(n-1);
		}
		count += 1;
	}
	
	public static void takeOn(int n){
		if(n == 1){
			System.out.println("把第1个环放上去");
		} else if(n == 2){
			System.out.println("把第1个和第2个环一块放上去");
			count +=2;
			return;
		}else{
			takeOn(n-1);
			takeOff(n-2);
			System.out.println("把第"+n+"个环放上去");
			takeOn(n-2);
		}
		count += 1;
	}
}
