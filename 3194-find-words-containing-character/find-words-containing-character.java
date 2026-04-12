class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> li=new ArrayList<>();
        String a=Character.toString(x);
        for(int i=0;i<words.length;i++){
            if(words[i].contains(a)) li.add(i);
        }
        return li;
    }
}