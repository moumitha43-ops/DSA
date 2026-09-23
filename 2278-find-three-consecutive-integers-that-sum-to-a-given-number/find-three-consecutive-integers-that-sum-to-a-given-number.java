class Solution {
    public long[] sumOfThree(long num) {
        long[] l = new long[3];
        if(num%3!=0)return new long[0];
        long a = num/3;
        l[0]=a-1;
        l[1]=a;
        l[2]=a+1;
        return l;
    }
}