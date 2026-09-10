int reverse(double x) {
    double c=0;
    int d=x;
    if(x<0){
        d=-x;
    }
    int a=log10(d)+1;
    for(int i=0;i<a;i++){
        c=c*10+d%10;
        d=d/10;
    }
    if(x<0){
        c=c*-1;
    }
    if(c<pow(-2,31) || c>pow(2,31)-1){
        c=0;
    }
    return c;
}