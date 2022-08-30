public class Main {
    public static void main(String args[]){
        /*For the following expressions write out using code step by step how the
        compiler will evaluate it
        Example:
        System.out.println(2 * 5 + 3);
        System.out.println(10 + 3);
        System.out.println(13);
        Only complete one computation per line of code
        The output for every line is always equal to the same number
        In example above the out put should be
        13
        13
        13
        */
        //Expression 1
        System.out.println((9 - 4)+ 10/2 - (4 - 8)/3);
        //My Answer: 5 + 10/2 +4/3
                     5 + 5 + 1
                    = 11

        //Expression 2
        System.out.println(23%4 + (18 - 3 / 2));
        //My Answer: 3 + (18-1)
                     3 + 17
                   = 20

        //Expression 3
        System.out.println(((8 - 5) + Math.pow(3,4)/5));
        //My Answer: 3 + (81/5)
                     3 + 16.2
                   = 19.2

        //Expression 4
        System.out.println((9 % 4) - 8 + Math.pow(2,3) / 8 + (Math.sqrt(81) / 3));
        //My Answer: 1 - 8 + 8 / 8 + 9 / 3
                     1 - 8 + 1 + 3
                    = - 3


        //Expression 5
        System.out.println(((14 / 2 + 3) * Math.sin(45) + 2) - Math.pow(Math.sqrt(25), 3));
        //My Answer: (7 + 3) *  (.71 + 2) - Math.pow(5,3)
                     10 * 2.71 - 125
                     27.1 - 125
                     = - 97.9
    }
}
