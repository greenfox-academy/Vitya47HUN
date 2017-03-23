//- Create an array variable named `t`
//        with the following content: `[1, 2, 3, 4, 5]`
//        - Increment the third element
//        - Print the third element
public class Exercise011 {
    public static void main(String[] args) {
        int t[] = {1,2,3,4,5};

//        t[2] = t[2] + 3;         ----- or you can use this

        t[2] += 3;
        System.out.println(t[2]);
    }
}
