public class Hello {
	public static void main(String[] args) {
		        String input = "hello";
		        String output = removeAllDuplicates(input);
		        System.out.println("Output: " + output);
		    }

		    public static String removeAllDuplicates(String str) {
		        String result = "";
		        for (char c : str.toCharArray()) {
		            if (str.indexOf(c) == str.lastIndexOf(c)) {
		                result += c;
		            }
		        }
		        return result;
	}
} 