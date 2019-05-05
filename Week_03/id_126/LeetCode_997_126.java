class Solution {
    public int findJudge(int N, int[][] trust) {
        int[][] persons = new int[N][2];
        List<Integer> faguanList = new ArrayList<>();

        Map<Integer,List<Integer>> map=new HashMap<>();
        List<Integer> valueList;
        for(int i=0;i<trust.length;i++){
            valueList=new ArrayList<>();
            if(map.get(trust[i][0])==null){

                valueList.add(trust[i][1]);
                map.put(trust[i][0],valueList);
            }else{
                valueList=map.get(trust[i][0]);
                valueList.add(trust[i][1]);
                map.put(trust[i][0],valueList);
            }
        }


        for (int i = 1; i <= N; i++) {
            //看看谁不在里边，可能为法官
            if (map.get(i) == null) {
                faguanList.add(i);
            }
        }
        if (faguanList.size() == 0||faguanList.size()>1) {
            return -1;
        } else {
            int faguan=faguanList.get(0);

            for(int i=0;i<map.keySet().size();i++){
                if(!map.get(map.keySet().toArray()[i]).contains(faguan)){
                    return -1;
                }
            }
            return faguanList.get(0);
        }
    }
}