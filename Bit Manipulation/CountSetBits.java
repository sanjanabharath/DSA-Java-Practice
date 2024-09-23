class CountSetBits {
    //brute force
    static int count(int n){
        int cnt=0;

        while(n>1){
            if(n%2 != 0) {
            cnt++;
            }

            n /= 2;
        }

        if(n==1) cnt ++;

        return cnt;
    }

    //optimal using bitwise operator
    static int count(int n){
        int cnt=0;

        while(n>1){
            cnt += n&1; 

            n=n>>1;
        }

        if(n==1) cnt ++;

        return cnt;
    }
}