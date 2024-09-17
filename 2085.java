class Solution {
    public int countWords(String[] words1, String[] words2) {
        HashMap<String,Integer> temp1 = new HashMap<>(); //for storing frequency of word in array words1
        HashMap<String,Integer> temp2 = new HashMap<>();// for storing fr of word in words2 who is also in words1
        for(String word:words1){
            temp1.put(word,temp1.getOrDefault(word,0)+1);
        }
        int count = 0;
        for(String word:words2){
            if(temp1.containsKey(word) && temp1.get(word)==1){
                temp2.put(word,temp2.getOrDefault(word,0)+1);
            }
        }
        for(Map.Entry<String,Integer> entries: temp2.entrySet()){
            if(entries.getValue()==1){
                count = count +1;
            }
        }
        return count;
    }
}
