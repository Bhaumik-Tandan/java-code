import java.util.Scanner;

class hj {

    public static void main(String args[]) {
        String cust[][] = new String[10][];
        for (int i = 0; i < 10; i++) {
            Scanner s = new Scanner(System.in);
            System.out.println("For Customer " + (i + 1));
            System.out.println("Enter the number of favourite food for customer " + (i + 1) + ": ");
            int k = s.nextInt();
            cust[i] = new String[k];
            for (int j = 0; j < k; i++) {
                System.out.println("Enter the of favourite food number " + (k + 1) + "for customer " + (j + 1) + ": ");
                cust[i][j] = s.next();
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Customer Number " + (i + 1) + " has folowing food common with following customers:- ");
            for (int j = 0; j < 10; j++) {
                if (i == j)
                    continue;
                for (int k = 0; k < cust[i].length; k++) {
                    for (int l = 0; l < cust[j].length; l++)
                        if (cust[i][k] == cust[j][l])
                            System.out.println("Customer Number " + (i + 1) + " has " + cust[i][k]
                                    + " common with customer " + (j + 1));
                }
            }
        }
    }
}
