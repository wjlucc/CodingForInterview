package code;

/*请实现一个函数，将一个字符串中的空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
*/
public class Solution2 {
	
	// 用一个新的字符串不断的添加子串进来，需要开辟很多空间
	public String replaceSpace(StringBuffer str) {
		StringBuffer result = new StringBuffer("");
		int l = 0,r = 0;		
		for(int i = 0;i < str.length();i++){
			System.out.println(i);
			if(str.charAt(i) == ' '){
				r = i;
				result.append(str.subSequence(l, r));
				result.append("%20");
				l = i + 1;
			}
		}		
		result.append(str.subSequence(l, str.length()));
    	return result.toString();
    }
	
//	先计算空格数目，再对原来的串进行扩充，从后向前移动字符，这样更加节省空间
	public String replaceSpace2(StringBuffer str){
//		System.out.println(str);
		int spaceNum = 0;
		for(int i = 0;i<str.length();i++){
			if(str.charAt(i) == ' ')
				spaceNum += 1;
		}
		
		int oldLength = str.length()-1;
		int newLength = str.length()+2*spaceNum;
		str.setLength(newLength);
		int newIndex = newLength-1;
		
		for(; oldLength >= 0 && newIndex >= 0; oldLength--){
			
			if(str.charAt(oldLength) != ' '){				
				str.setCharAt(newIndex, str.charAt(oldLength));
				newIndex -= 1;
			}else{
				str.setCharAt(newIndex, '%');
				newIndex -= 1;
				str.setCharAt(newIndex, '0');
				newIndex -= 1;
				str.setCharAt(newIndex, '2');
				newIndex -= 1;
				
			}
		}
		
		return str.toString();
	}
}


