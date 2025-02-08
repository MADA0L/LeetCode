class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int[] remainder = new int[2];
        for (int i =0 ;i < students.length ; i++){
            if (students[i] == 0){
                remainder[0]++;
            }else {
                remainder[1]++;
            }
        }
        
        int j = 0;
        while (j < sandwiches.length){
            if (sandwiches[j] == 0 && remainder[0] > 0){
                remainder[0]--;
            } else if (sandwiches[j] == 1 && remainder[1] >0){
                remainder[1]--;
            } else {
                return remainder[0]+remainder[1];
            }
            j++;
        }
        return remainder[0] + remainder[1];
    }
}