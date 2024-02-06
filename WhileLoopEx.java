void main(){

    int i = 5;
    while (i > 0) {
        int j = 0;
        while (j < i) {
            System.out.print("*");
            j++;
        }
        System.out.println();
        i--;
    }
}