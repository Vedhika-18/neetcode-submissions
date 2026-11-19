class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> sc = new HashSet<>();
        for(int num :nums){
            if(sc.contains(num)){
                return true;
            }
            else{
                sc.add(num);
            }
        }
        return false;
    }
}