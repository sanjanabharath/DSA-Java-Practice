class CheckPowerTwo {
    static boolean check(int n){
        if((n && n-1) == 0){
            return true;
        }

        return false;
    }
}