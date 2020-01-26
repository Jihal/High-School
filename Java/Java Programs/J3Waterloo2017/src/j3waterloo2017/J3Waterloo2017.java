    /*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
     */
    package j3waterloo2017;

    /**
     *
     * @author Jihal
     */
    import java.util.Scanner;
    public class J3Waterloo2017 {

        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) {
            // TODO code application logic here
            Scanner input = new Scanner(System.in);
            int energy;
            int store1, store2;
            boolean checker = false;
            int [] ab = new int [2];
            int odd;

            String inputAB = input.nextLine();

            String[] space1 = inputAB.split(" ");

            for (int i = 0; i < space1.length; i++) {
                ab[i] = Integer.parseInt(space1[i]);
            }

            int [] cd = new int [2];

            String inputCD = input.nextLine();
            String[] space2 = inputCD.split(" ");

            for (int i = 0; i < space1.length; i++) {
                cd[i] = Integer.parseInt(space2[i]);
            }

            energy = input.nextInt();

            int diff1, diff2;

            diff1 = cd[0] - ab[0];
            diff2 = cd[1] - ab[1];

            while (energy != 0) {
                //DIFF1
            if (diff1 > 0) {
                ab[0]+=1;
                energy--;
                diff1--;
                if (energy==0 && diff1 > 0) {
                    System.out.println("N");
                    break;
                }
                if (energy > 0 && diff1 == 0) {
                    checker = true;
                }
            } else if (diff1 < 0) {
                ab[0]-=1;
                energy--;
                diff1++;
                if (energy == 0 && diff1 < 0)  {
                    System.out.println("N");
                    break;
                }
                if (energy > 0 && diff1 == 0) {
                    checker = true;
                }
            }
            //Diff2
            if (diff2 > 0) {
                ab[1] += 1; 
                energy--;
                diff2--;
                if (energy ==0 && diff2 >= 0) {
                    System.out.println("N");
                    break;
                }
                if (energy > 0 && diff2 == 0) {
                    checker = true;
                }
            } else if (diff2 < 0) {
                ab[1]-=1;
                energy--;
                diff2++;
                if (energy == 0 && diff2 < 0)  {
                    System.out.println("N");
                    break;
                }
                if (energy > 0 && diff2 == 0) {
                    checker = true;
                }
            //After
            if (checker == true) {
                odd = energy%2;
                if(odd == 0) {
                ab[1] += 1;
                energy--;
                if (energy == 0) {
                    System.out.println("N");
                    break;
                } else {
                    ab[1] -= 1;
                    energy--;
                    if (energy == 0) {
                        System.out.println("Y");
                        break;
                    }
                }
            } else if (odd == 1) {
                    System.out.println("N");
                    break;
            } else if (odd != 0 && odd !=1) {
                ab[1] += 1;
                energy--;
                ab[0] += 1;
                energy--;
                if (energy <= 0 || energy ==1) {
                    System.out.println("N");
                    break;
                } else {
                    ab[1] -=1;
                    energy--;
                    ab[0] -=1;
                    energy--;
                    if (energy==0) {
                        System.out.println("Y");
                    }
                }
            }

            }
            if (energy > 0 && diff1 == 0 && energy > 0 && diff2 == 0) {
                ab[1] += 1;
                energy--;
                if (energy ==0) {
                    System.out.println("N");
                    break;
                } else {
                    ab[1] -= 1;
                    if (energy == 0) {
                        System.out.println("Y");
                        break;
                    }
                }
            }
        }
        }
    }
    }