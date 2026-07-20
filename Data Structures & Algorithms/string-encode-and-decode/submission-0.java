class Solution {

    public String encode(List<String> strs) {
        String out = "";

        if(strs.size() < 1)
            return "";

        for(String str : strs){
            out+= str + (char) 169;
        }

        return out;
    }

    public List<String> decode(String str) {

        String[] words = str.split("©", -1);

        List<String> word_split = new ArrayList<>();

        if(str.length() < 1){
            return word_split;
        } 
        for(int i = 0; i < words.length - 1; i++){
            word_split.add(words[i]);
        }
        return word_split;
    }
}
