class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] part1 = s1.split(" ");
        String[] part2 = s2.split(" ");
        HashMap<String,Integer> temp = new HashMap<>(); //Making new HashMap to store the frequency of each word
        for(String word:part1){
            temp.put(word,temp.getOrDefault(word,0)+1);
        }
        for(String word:part2){
            temp.put(word,temp.getOrDefault(word,0)+1);
        }
        //Initializing a empty ArrayList to store Unique Words
        List<String> arrayList = new ArrayList<>();
        //(Map.entry is a different java interface to traverse HashMap, It is naot part of HasMap)
        //(And the functions used inside are also belongs too that interface)
        for(Map.Entry<String,Integer> entry : temp.entrySet()){
            if(entry.getValue()==1){
                arrayList.add(entry.getKey());
            }
        }
        return arrayList.toArray(new String[0]);
    }
}
