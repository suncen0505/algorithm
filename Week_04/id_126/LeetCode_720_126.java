class Solution {
    public String longestWord(String[] words) {
      //排序
        Arrays.sort(words);
        List<String> list = new ArrayList<>();
        int length = 0;
        int newLenght = 0;
        String resultStr = "";
        //循环，看看前边的单词是否包含当前的单词
        for (int i = 0; i < words.length; i++) {
            if(words[i].length()==1||list.contains(words[i].substring(0,words[i].length()-1))){
                resultStr=words[i].length()>resultStr.length()?words[i]:resultStr;
                list.add(words[i]);
            }
        }
        return resultStr;
        
    }
}