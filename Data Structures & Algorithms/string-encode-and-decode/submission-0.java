class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String str: strs){
            sb.append(str.length()).append("#").append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> decodedStrs = new ArrayList();

        int i = 0;
        while (i < str.length()){
            int startOfNum = i;
            while (Character.isDigit(str.charAt(i))){
                i++;
            }
            int strLength = Integer.parseInt(str.substring(startOfNum,i));
            i++; // skip delim char
            decodedStrs.add(str.substring(i, i + strLength));
            i+=strLength;
        }
        return decodedStrs;
    }
}
