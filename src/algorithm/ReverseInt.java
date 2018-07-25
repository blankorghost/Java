package algorithm;
/**
 *1.给定一个 32 位有符号整数，将整数中的数字进行反转。
 * 假设我们的环境只能存储 32 位有符号整数，其数值范围是 [−2^31,  2^31 − 1]。
 * 根据这个假设，如果反转后的整数溢出，则返回 0。
 * @author ghost
 *2.判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 */
public class ReverseInt {
    public static int reverse(int x) {
    	long a = 0;    
        int b =0;    
        if(x>=0){    
            b=(x+"").length();//正数    
            }    
        else{    
            b=(x+"").length()-1;//负数有一个负号  
            }    
        while (x!=0){    
            for(int i=0;i<b;i++){    
                int a1 = x%10;//当前最后一位数字 ，负数则显示的是负数-25%10 等于 -5   
                x=(x-a1)/10;//把最后一位数字剔除掉的新数字    
                a += (int) (a1*Math.pow(10,b-i-1));  //相当于将每次的最后一位乘以当前位在十进制中的权重。234 = 2*10^2+3*10^1+4*10^0  
            }    
        }    
        if((a>Math.pow(2,31)-1)||(a<(-1)*Math.pow(2,31))){  //超过范围的返回0  
            return 0;    
        }    
        return (int) a;   
     }  

    
    public static void main(String[] args) {
    	int i = 121;
    	System.out.println(isPalindrome(i));

    }
    
    //2.
    public static boolean isPalindrome(int x) {
    	/*long a = 0;
    	int y = x;
        int b =0; 
        if(x<0)return false;
        if(x>=0){ 
        	if(x==0)return true;
            b=(x+"").length();//正数  
            for(int i=0;i<b;i++){
            	int a1 = x%10;//当前最后一位数字
                x=(x-a1)/10;//把最后一位数字剔除掉的新数字    
                a += (int)(a1*Math.pow(10,b-i-1));  //相当于将每次的最后一位乘以当前位在十进制中的权重。234 = 2*10^2+3*10^1+4*10^0
               }
        	}
        if(a == y){
        	return true;
        }
        System.out.println(y);
        return false;*/
        
        
        if(x<0){  
            return false;  
        }  
        int d=1;  
        while(x/d>=10) d*=10;//得到最高有多少位的一个整数  
        while(x>0){  
            int q = x/d;//得到最高位  
            int r = x%10;//得到最低位  
            if(q!=r) return false;  
            x=x%d/10;//得到除去最高和最低  
            d/=100;//每次去掉两位，那个这个高的也去掉两个0，然后进行下一次计算  
        }  
        return true; 
    }

}
