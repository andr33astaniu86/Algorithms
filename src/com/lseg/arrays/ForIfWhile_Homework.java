package com.lseg.arrays;

public class ForIfWhile_Homework {

    public static void main(String[] args) {
        Home1(10);
        System.out.println();
        Home2(10);
        System.out.println();
        Home3(10);
        System.out.println();
        Home4(10);
        System.out.println();
        Home5(6);
        System.out.println();
    }


    static void Home1(int n) {
        int rand, coloana;

        for (rand = 0; rand < n; rand++) {
            for (coloana = 0; coloana < n; coloana++) {
                System.out.print(coloana);
            }
            System.out.println();

        }
    }

    static void Home2(int n) {
        int rand, coloana;

        for (rand = 0; rand < n; rand++) {
            for (coloana = 0; coloana < n; coloana++) {
                if (coloana == rand) {
                    System.out.print(1);
                } else {
                    System.out.print(0);

                }
            }
            System.out.println();
        }
    }

    private static void Home3(int n) {
        int rand, coloana;

        for (rand = 0; rand < n; rand++) {
            for (coloana = 0; coloana < n; coloana++) {
                if (coloana == rand+1) {
                    System.out.print(1);
                } else {
                    System.out.print(0);

                }
            }
            System.out.println();
        }
    }
    private static void Home4(int n) {
        int rand, coloana;

        for (rand = 0; rand < n; rand++) {
            for (coloana = 0; coloana < n; coloana++) {
                if (coloana == n-1-rand) {
                    System.out.print(1);
                } else {
                    System.out.print(0);

                }
            }
            System.out.println();
        }
    }

    private static void Home5(int n) {
        int i,j;

        for(i=0;i<n;i++) {
            for (j=0; j<=i; j++){
                System.out.print(i);


            }
            System.out.println();

        }
    }
}

