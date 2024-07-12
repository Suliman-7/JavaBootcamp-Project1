import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;

public class Project1 {


    public static void tictactoe(int round) {

        Scanner input = new Scanner (System.in);

        boolean win = false ;
        boolean lose = false ;
        boolean draw  = false ;
        int wins = 0 ;
        int loses = 0 ;
        int draws = 0 ;
        int nRound = 1 ;

        String arrRow1[][] = { { " " , " " , " " } , { " " , " " , " " } , { " " , " " , " " } } ;

        System.out.println(" --------------------- " );

        try {

            while( win == false && lose == false && draw == false ) {


                boolean wrong = false ;

                System.out.println("        |     |      " );
                System.out.println("     "+arrRow1[0][0]+"  |  "+arrRow1[0][1]+"  |  "+arrRow1[0][2]+"   " );
                System.out.println(" --------------------- " );
                System.out.println("     "+arrRow1[1][0]+"  |  "+arrRow1[1][1]+"  |  "+arrRow1[1][2]+"   " );
                System.out.println(" --------------------- " );
                System.out.println("     "+arrRow1[2][0]+"  |  "+arrRow1[2][1]+"  |  "+arrRow1[2][2]+"   " );
                System.out.println("        |     |      " );


                int position = input.nextInt() ;


                if( position == 1 && arrRow1[0][0]== " " ) {
                    arrRow1[0][0] = "X" ;
                }else if( position == 2 && arrRow1[0][1]== " " ) {
                    arrRow1[0][1] = "X" ;
                }else if( position == 3 && arrRow1[0][2]== " " ) {
                    arrRow1[0][2] = "X" ;
                }else if( position == 4 && arrRow1[1][0]== " " ) {
                    arrRow1[1][0] = "X" ;
                }else if( position == 5 && arrRow1[1][1]== " " ) {
                    arrRow1[1][1] = "X" ;
                }else if( position == 6 && arrRow1[1][2]== " " ) {
                    arrRow1[1][2] = "X" ;
                }else if( position == 7 && arrRow1[2][0]== " " ) {
                    arrRow1[2][0] = "X" ;
                }else if( position == 8 && arrRow1[2][1]== " " ) {
                    arrRow1[2][1] = "X" ;
                }else if( position == 9 && arrRow1[2][2]== " " ) {
                    arrRow1[2][2] = "X" ;

                }else if ( position > 9 || position < 1 ){
                    System.out.println(" Please  Enter (from 1-9) !! ");
                }else {
                    System.out.println("the position is taken !! please choose available position");
                    wrong = true;

                }


                if(arrRow1[0][0].equalsIgnoreCase("x") &&  arrRow1[0][1].equalsIgnoreCase("x") && arrRow1[0][2].equalsIgnoreCase("x")) {
                    wins++;
                    if ( (round==3 && nRound == 3 && ( wins>=loses )) || round==1 ) {
                        System.out.println(" game finished result : You "+wins+" Computer "+loses+ " Draws " + draws);
                        System.out.println("        |     |      " );
                        System.out.println("     "+arrRow1[0][0]+"  |  "+arrRow1[0][1]+"  |  "+arrRow1[0][2]+"   " );
                        System.out.println(" --------------------- " );
                        System.out.println("     "+arrRow1[1][0]+"  |  "+arrRow1[1][1]+"  |  "+arrRow1[1][2]+"   " );
                        System.out.println(" --------------------- " );
                        System.out.println("     "+arrRow1[2][0]+"  |  "+arrRow1[2][1]+"  |  "+arrRow1[2][2]+"   " );
                        System.out.println("        |     |      " );
                        win=true;
                    }else {
                        System.out.println("        |     |      " );
                        System.out.println("     "+arrRow1[0][0]+"  |  "+arrRow1[0][1]+"  |  "+arrRow1[0][2]+"   " );
                        System.out.println(" --------------------- " );
                        System.out.println("     "+arrRow1[1][0]+"  |  "+arrRow1[1][1]+"  |  "+arrRow1[1][2]+"   " );
                        System.out.println(" --------------------- " );
                        System.out.println("     "+arrRow1[2][0]+"  |  "+arrRow1[2][1]+"  |  "+arrRow1[2][2]+"   " );
                        System.out.println("        |     |      " );
                        System.out.println(" Congratulations round "+nRound+" finish You "+wins+" Computer "+loses + " Draws " + draws );
                        nRound++;
                        arrRow1[0][0] = " " ;
                        arrRow1[0][1] = " " ;
                        arrRow1[0][2] = " " ;
                        arrRow1[1][0] = " " ;
                        arrRow1[1][1] = " " ;
                        arrRow1[1][2] = " " ;
                        arrRow1[2][0] = " " ;
                        arrRow1[2][1] = " " ;
                        arrRow1[2][2] = " " ;


                    }
                }else if (arrRow1[1][0].equalsIgnoreCase("x") &&  arrRow1[1][1].equalsIgnoreCase("x") && arrRow1[1][2].equalsIgnoreCase("x")) {
                    wins++;
                    if ( (round==3 && nRound == 3 && ( wins>=loses )) || round==1 ) {
                        System.out.println(" game finished result : You "+wins+" Computer "+loses + " Draws " + draws );
                        System.out.println("        |     |      " );
                        System.out.println("     "+arrRow1[0][0]+"  |  "+arrRow1[0][1]+"  |  "+arrRow1[0][2]+"   " );
                        System.out.println(" --------------------- " );
                        System.out.println("     "+arrRow1[1][0]+"  |  "+arrRow1[1][1]+"  |  "+arrRow1[1][2]+"   " );
                        System.out.println(" --------------------- " );
                        System.out.println("     "+arrRow1[2][0]+"  |  "+arrRow1[2][1]+"  |  "+arrRow1[2][2]+"   " );
                        System.out.println("        |     |      " );
                        win=true;
                    }else {
                        System.out.println("        |     |      " );
                        System.out.println("     "+arrRow1[0][0]+"  |  "+arrRow1[0][1]+"  |  "+arrRow1[0][2]+"   " );
                        System.out.println(" --------------------- " );
                        System.out.println("     "+arrRow1[1][0]+"  |  "+arrRow1[1][1]+"  |  "+arrRow1[1][2]+"   " );
                        System.out.println(" --------------------- " );
                        System.out.println("     "+arrRow1[2][0]+"  |  "+arrRow1[2][1]+"  |  "+arrRow1[2][2]+"   " );
                        System.out.println("        |     |      " );
                        System.out.println(" Congratulations round "+nRound+" finish You "+wins+" Computer "+loses + " Draws " + draws );
                        nRound++;
                        arrRow1[0][0] = " " ;
                        arrRow1[0][1] = " " ;
                        arrRow1[0][2] = " " ;
                        arrRow1[1][0] = " " ;
                        arrRow1[1][1] = " " ;
                        arrRow1[1][2] = " " ;
                        arrRow1[2][0] = " " ;
                        arrRow1[2][1] = " " ;
                        arrRow1[2][2] = " " ;

                    }
                }else if (arrRow1[2][0].equalsIgnoreCase("x") &&  arrRow1[2][1].equalsIgnoreCase("x") && arrRow1[2][2].equalsIgnoreCase("x")) {
                    wins++;
                    if ( (round==3 && nRound == 3 && ( wins>=loses )) || round==1 ) {
                        System.out.println(" game finished result : You "+wins+" Computer "+loses + " Draws " + draws );
                        System.out.println("        |     |      " );
                        System.out.println("     "+arrRow1[0][0]+"  |  "+arrRow1[0][1]+"  |  "+arrRow1[0][2]+"   " );
                        System.out.println(" --------------------- " );
                        System.out.println("     "+arrRow1[1][0]+"  |  "+arrRow1[1][1]+"  |  "+arrRow1[1][2]+"   " );
                        System.out.println(" --------------------- " );
                        System.out.println("     "+arrRow1[2][0]+"  |  "+arrRow1[2][1]+"  |  "+arrRow1[2][2]+"   " );
                        System.out.println("        |     |      " );
                        win=true;
                    }else {
                        System.out.println("        |     |      " );
                        System.out.println("     "+arrRow1[0][0]+"  |  "+arrRow1[0][1]+"  |  "+arrRow1[0][2]+"   " );
                        System.out.println(" --------------------- " );
                        System.out.println("     "+arrRow1[1][0]+"  |  "+arrRow1[1][1]+"  |  "+arrRow1[1][2]+"   " );
                        System.out.println(" --------------------- " );
                        System.out.println("     "+arrRow1[2][0]+"  |  "+arrRow1[2][1]+"  |  "+arrRow1[2][2]+"   " );
                        System.out.println("        |     |      " );
                        System.out.println(" Congratulations round "+nRound+" finish You "+wins+" Computer "+loses + " Draws " + draws );
                        nRound++;
                        arrRow1[0][0] = " " ;
                        arrRow1[0][1] = " " ;
                        arrRow1[0][2] = " " ;
                        arrRow1[1][0] = " " ;
                        arrRow1[1][1] = " " ;
                        arrRow1[1][2] = " " ;
                        arrRow1[2][0] = " " ;
                        arrRow1[2][1] = " " ;
                        arrRow1[2][2] = " " ;

                    }


                }else if (arrRow1[0][0].equalsIgnoreCase("x") &&  arrRow1[1][0].equalsIgnoreCase("x") && arrRow1[2][0].equalsIgnoreCase("x")) {
                    wins++;
                    if ( (round==3 && nRound == 3 && ( wins>=loses )) || round==1 ) {
                        System.out.println(" game finished result : You "+wins+" Computer "+loses + " Draws " + draws );
                        System.out.println("        |     |      " );
                        System.out.println("     "+arrRow1[0][0]+"  |  "+arrRow1[0][1]+"  |  "+arrRow1[0][2]+"   " );
                        System.out.println(" --------------------- " );
                        System.out.println("     "+arrRow1[1][0]+"  |  "+arrRow1[1][1]+"  |  "+arrRow1[1][2]+"   " );
                        System.out.println(" --------------------- " );
                        System.out.println("     "+arrRow1[2][0]+"  |  "+arrRow1[2][1]+"  |  "+arrRow1[2][2]+"   " );
                        System.out.println("        |     |      " );
                        win=true;
                    }else {
                        System.out.println("        |     |      " );
                        System.out.println("     "+arrRow1[0][0]+"  |  "+arrRow1[0][1]+"  |  "+arrRow1[0][2]+"   " );
                        System.out.println(" --------------------- " );
                        System.out.println("     "+arrRow1[1][0]+"  |  "+arrRow1[1][1]+"  |  "+arrRow1[1][2]+"   " );
                        System.out.println(" --------------------- " );
                        System.out.println("     "+arrRow1[2][0]+"  |  "+arrRow1[2][1]+"  |  "+arrRow1[2][2]+"   " );
                        System.out.println("        |     |      " );
                        System.out.println(" Congratulations round "+nRound+" finish You "+wins+" Computer "+loses + " Draws " + draws );
                        nRound++;
                        arrRow1[0][0] = " " ;
                        arrRow1[0][1] = " " ;
                        arrRow1[0][2] = " " ;
                        arrRow1[1][0] = " " ;
                        arrRow1[1][1] = " " ;
                        arrRow1[1][2] = " " ;
                        arrRow1[2][0] = " " ;
                        arrRow1[2][1] = " " ;
                        arrRow1[2][2] = " " ;

                    }


                }else if (arrRow1[0][1].equalsIgnoreCase("x") &&  arrRow1[1][1].equalsIgnoreCase("x") && arrRow1[2][1].equalsIgnoreCase("x")) {
                    wins++;
                    if ( (round==3 && nRound == 3 && ( wins>=loses )) || round==1 ) {
                        System.out.println(" game finished result : You "+wins+" Computer "+loses + " Draws " + draws );
                        System.out.println("        |     |      " );
                        System.out.println("     "+arrRow1[0][0]+"  |  "+arrRow1[0][1]+"  |  "+arrRow1[0][2]+"   " );
                        System.out.println(" --------------------- " );
                        System.out.println("     "+arrRow1[1][0]+"  |  "+arrRow1[1][1]+"  |  "+arrRow1[1][2]+"   " );
                        System.out.println(" --------------------- " );
                        System.out.println("     "+arrRow1[2][0]+"  |  "+arrRow1[2][1]+"  |  "+arrRow1[2][2]+"   " );
                        System.out.println("        |     |      " );
                        win=true;
                    }else {
                        System.out.println("        |     |      " );
                        System.out.println("     "+arrRow1[0][0]+"  |  "+arrRow1[0][1]+"  |  "+arrRow1[0][2]+"   " );
                        System.out.println(" --------------------- " );
                        System.out.println("     "+arrRow1[1][0]+"  |  "+arrRow1[1][1]+"  |  "+arrRow1[1][2]+"   " );
                        System.out.println(" --------------------- " );
                        System.out.println("     "+arrRow1[2][0]+"  |  "+arrRow1[2][1]+"  |  "+arrRow1[2][2]+"   " );
                        System.out.println("        |     |      " );
                        System.out.println(" Congratulations round "+nRound+" finish You "+wins+" Computer "+loses + " Draws " + draws );
                        nRound++;
                        arrRow1[0][0] = " " ;
                        arrRow1[0][1] = " " ;
                        arrRow1[0][2] = " " ;
                        arrRow1[1][0] = " " ;
                        arrRow1[1][1] = " " ;
                        arrRow1[1][2] = " " ;
                        arrRow1[2][0] = " " ;
                        arrRow1[2][1] = " " ;
                        arrRow1[2][2] = " " ;

                    }


                }else if (arrRow1[0][2].equalsIgnoreCase("x") &&  arrRow1[1][2].equalsIgnoreCase("x") && arrRow1[2][2].equalsIgnoreCase("x")) {
                    wins++;
                    if ( (round==3 && nRound == 3 && ( wins>=loses )) || round==1 ) {
                        System.out.println(" game finished result : You "+wins+" Computer "+loses + " Draws " + draws );
                        System.out.println("        |     |      " );
                        System.out.println("     "+arrRow1[0][0]+"  |  "+arrRow1[0][1]+"  |  "+arrRow1[0][2]+"   " );
                        System.out.println(" --------------------- " );
                        System.out.println("     "+arrRow1[1][0]+"  |  "+arrRow1[1][1]+"  |  "+arrRow1[1][2]+"   " );
                        System.out.println(" --------------------- " );
                        System.out.println("     "+arrRow1[2][0]+"  |  "+arrRow1[2][1]+"  |  "+arrRow1[2][2]+"   " );
                        System.out.println("        |     |      " );
                        win=true;
                    }else {
                        System.out.println("        |     |      " );
                        System.out.println("     "+arrRow1[0][0]+"  |  "+arrRow1[0][1]+"  |  "+arrRow1[0][2]+"   " );
                        System.out.println(" --------------------- " );
                        System.out.println("     "+arrRow1[1][0]+"  |  "+arrRow1[1][1]+"  |  "+arrRow1[1][2]+"   " );
                        System.out.println(" --------------------- " );
                        System.out.println("     "+arrRow1[2][0]+"  |  "+arrRow1[2][1]+"  |  "+arrRow1[2][2]+"   " );
                        System.out.println("        |     |      " );
                        System.out.println(" Congratulations round "+nRound+" finish You "+wins+" Computer "+loses + " Draws " + draws );
                        nRound++;
                        arrRow1[0][0] = " " ;
                        arrRow1[0][1] = " " ;
                        arrRow1[0][2] = " " ;
                        arrRow1[1][0] = " " ;
                        arrRow1[1][1] = " " ;
                        arrRow1[1][2] = " " ;
                        arrRow1[2][0] = " " ;
                        arrRow1[2][1] = " " ;
                        arrRow1[2][2] = " " ;
                    }


                }else if (arrRow1[0][0].equalsIgnoreCase("x") &&  arrRow1[1][1].equalsIgnoreCase("x") && arrRow1[2][2].equalsIgnoreCase("x")) {
                    wins++;
                    if ( (round==3 && nRound == 3 && ( wins>=loses )) || round==1  ) {
                        System.out.println(" game finished result : You "+wins+" Computer "+loses + " Draws " + draws );
                        System.out.println("        |     |      " );
                        System.out.println("     "+arrRow1[0][0]+"  |  "+arrRow1[0][1]+"  |  "+arrRow1[0][2]+"   " );
                        System.out.println(" --------------------- " );
                        System.out.println("     "+arrRow1[1][0]+"  |  "+arrRow1[1][1]+"  |  "+arrRow1[1][2]+"   " );
                        System.out.println(" --------------------- " );
                        System.out.println("     "+arrRow1[2][0]+"  |  "+arrRow1[2][1]+"  |  "+arrRow1[2][2]+"   " );
                        System.out.println("        |     |      " );
                        win=true;
                    }else {
                        System.out.println("        |     |      " );
                        System.out.println("     "+arrRow1[0][0]+"  |  "+arrRow1[0][1]+"  |  "+arrRow1[0][2]+"   " );
                        System.out.println(" --------------------- " );
                        System.out.println("     "+arrRow1[1][0]+"  |  "+arrRow1[1][1]+"  |  "+arrRow1[1][2]+"   " );
                        System.out.println(" --------------------- " );
                        System.out.println("     "+arrRow1[2][0]+"  |  "+arrRow1[2][1]+"  |  "+arrRow1[2][2]+"   " );
                        System.out.println("        |     |      " );
                        System.out.println(" Congratulations round "+nRound+" finish You "+wins+" Computer "+loses + " Draws " + draws );
                        nRound++;
                        arrRow1[0][0] = " " ;
                        arrRow1[0][1] = " " ;
                        arrRow1[0][2] = " " ;
                        arrRow1[1][0] = " " ;
                        arrRow1[1][1] = " " ;
                        arrRow1[1][2] = " " ;
                        arrRow1[2][0] = " " ;
                        arrRow1[2][1] = " " ;
                        arrRow1[2][2] = " " ;
                    }


                }else if (arrRow1[0][2].equalsIgnoreCase("x") &&  arrRow1[1][1].equalsIgnoreCase("x") && arrRow1[2][0].equalsIgnoreCase("x")) {
                    wins++;
                    if ( (round==3 && nRound == 3 && ( wins>=loses )) || round==1  ) {
                        System.out.println(" game finished result : You "+wins+" Computer "+loses + " Draws " + draws );
                        System.out.println("        |     |      " );
                        System.out.println("     "+arrRow1[0][0]+"  |  "+arrRow1[0][1]+"  |  "+arrRow1[0][2]+"   " );
                        System.out.println(" --------------------- " );
                        System.out.println("     "+arrRow1[1][0]+"  |  "+arrRow1[1][1]+"  |  "+arrRow1[1][2]+"   " );
                        System.out.println(" --------------------- " );
                        System.out.println("     "+arrRow1[2][0]+"  |  "+arrRow1[2][1]+"  |  "+arrRow1[2][2]+"   " );
                        System.out.println("        |     |      " );
                        win=true;
                    }else {
                        System.out.println("        |     |      " );
                        System.out.println("     "+arrRow1[0][0]+"  |  "+arrRow1[0][1]+"  |  "+arrRow1[0][2]+"   " );
                        System.out.println(" --------------------- " );
                        System.out.println("     "+arrRow1[1][0]+"  |  "+arrRow1[1][1]+"  |  "+arrRow1[1][2]+"   " );
                        System.out.println(" --------------------- " );
                        System.out.println("     "+arrRow1[2][0]+"  |  "+arrRow1[2][1]+"  |  "+arrRow1[2][2]+"   " );
                        System.out.println("        |     |      " );
                        System.out.println(" Congratulations round "+nRound+" finish You "+wins+" Computer "+loses + " Draws " + draws );
                        nRound++;
                        arrRow1[0][0] = " " ;
                        arrRow1[0][1] = " " ;
                        arrRow1[0][2] = " " ;
                        arrRow1[1][0] = " " ;
                        arrRow1[1][1] = " " ;
                        arrRow1[1][2] = " " ;
                        arrRow1[2][0] = " " ;
                        arrRow1[2][1] = " " ;
                        arrRow1[2][2] = " " ;
                    }
                }

                else {


                    int count = 0 ;

                    ArrayList<Integer> arr = new ArrayList() ;



                    Random rand = new Random();

                    for ( String[] i:arrRow1 ) {
                        for( String j:i) {



                            if(j.equals(" ")) {
                                arr.add(count+1) ;

                            }
                            count++;

                        }
                    }

                    if( arr.size()>0 && wrong == false ) {

                        int pc = rand.nextInt(arr.size());

                        int index = arr.get(pc);

                        if( index == 1 ) {
                            arrRow1[0][0] = "O" ;
                        }else if( index == 2 ) {
                            arrRow1[0][1] = "O" ;
                        }else if( index == 3 ) {
                            arrRow1[0][2] = "O" ;
                        }else if( index == 4 ) {
                            arrRow1[1][0] = "O" ;
                        }else if( index == 5 ) {
                            arrRow1[1][1] = "O" ;
                        }else if( index == 6 ) {
                            arrRow1[1][2] = "O" ;
                        }else if( index == 7 ) {
                            arrRow1[2][0] = "O" ;
                        }else if( index == 8 ) {
                            arrRow1[2][1] = "O" ;
                        }else if( index == 9 ) {
                            arrRow1[2][2] = "O" ;
                        }


                    }





                    if(arrRow1[0][0].equalsIgnoreCase("o") &&  arrRow1[0][1].equalsIgnoreCase("o") && arrRow1[0][2].equalsIgnoreCase("o")) {
                        loses++;
                        if ( (round==3 && nRound == 3 && ( wins<=loses )) || round==1 ) {
                            System.out.println(" game finished result : You "+wins+" Computer "+loses + " Draws " + draws );
                            System.out.println("        |     |      " );
                            System.out.println("     "+arrRow1[0][0]+"  |  "+arrRow1[0][1]+"  |  "+arrRow1[0][2]+"   " );
                            System.out.println(" --------------------- " );
                            System.out.println("     "+arrRow1[1][0]+"  |  "+arrRow1[1][1]+"  |  "+arrRow1[1][2]+"   " );
                            System.out.println(" --------------------- " );
                            System.out.println("     "+arrRow1[2][0]+"  |  "+arrRow1[2][1]+"  |  "+arrRow1[2][2]+"   " );
                            System.out.println("        |     |      " );
                            lose=true;
                        }else {
                            System.out.println("        |     |      " );
                            System.out.println("     "+arrRow1[0][0]+"  |  "+arrRow1[0][1]+"  |  "+arrRow1[0][2]+"   " );
                            System.out.println(" --------------------- " );
                            System.out.println("     "+arrRow1[1][0]+"  |  "+arrRow1[1][1]+"  |  "+arrRow1[1][2]+"   " );
                            System.out.println(" --------------------- " );
                            System.out.println("     "+arrRow1[2][0]+"  |  "+arrRow1[2][1]+"  |  "+arrRow1[2][2]+"   " );
                            System.out.println("        |     |      " );
                            System.out.println(" Hardluck round "+nRound+" finish You "+wins+" Computer "+loses + " Draws " + draws );
                            nRound++;
                            arrRow1[0][0] = " " ;
                            arrRow1[0][1] = " " ;
                            arrRow1[0][2] = " " ;
                            arrRow1[1][0] = " " ;
                            arrRow1[1][1] = " " ;
                            arrRow1[1][2] = " " ;
                            arrRow1[2][0] = " " ;
                            arrRow1[2][1] = " " ;
                            arrRow1[2][2] = " " ;

                        }

                    }else if (arrRow1[1][0].equalsIgnoreCase("o") &&  arrRow1[1][1].equalsIgnoreCase("o") && arrRow1[1][2].equalsIgnoreCase("o")) {
                        loses++;
                        if ( (round==3 && nRound == 3 && ( wins<=loses )) || round==1 ) {
                            System.out.println(" game finished result : You "+wins+" Computer "+loses + "Draws " + draws );
                            System.out.println("        |     |      " );
                            System.out.println("     "+arrRow1[0][0]+"  |  "+arrRow1[0][1]+"  |  "+arrRow1[0][2]+"   " );
                            System.out.println(" --------------------- " );
                            System.out.println("     "+arrRow1[1][0]+"  |  "+arrRow1[1][1]+"  |  "+arrRow1[1][2]+"   " );
                            System.out.println(" --------------------- " );
                            System.out.println("     "+arrRow1[2][0]+"  |  "+arrRow1[2][1]+"  |  "+arrRow1[2][2]+"   " );
                            System.out.println("        |     |      " );
                            lose=true;
                        }else {
                            System.out.println("        |     |      " );
                            System.out.println("     "+arrRow1[0][0]+"  |  "+arrRow1[0][1]+"  |  "+arrRow1[0][2]+"   " );
                            System.out.println(" --------------------- " );
                            System.out.println("     "+arrRow1[1][0]+"  |  "+arrRow1[1][1]+"  |  "+arrRow1[1][2]+"   " );
                            System.out.println(" --------------------- " );
                            System.out.println("     "+arrRow1[2][0]+"  |  "+arrRow1[2][1]+"  |  "+arrRow1[2][2]+"   " );
                            System.out.println("        |     |      " );
                            System.out.println(" Hardluck round "+nRound+" finish You "+wins+" Computer "+loses + " Draws " + draws );
                            nRound++;
                            arrRow1[0][0] = " " ;
                            arrRow1[0][1] = " " ;
                            arrRow1[0][2] = " " ;
                            arrRow1[1][0] = " " ;
                            arrRow1[1][1] = " " ;
                            arrRow1[1][2] = " " ;
                            arrRow1[2][0] = " " ;
                            arrRow1[2][1] = " " ;
                            arrRow1[2][2] = " " ;
                        }

                    }else if (arrRow1[2][0].equalsIgnoreCase("o") &&  arrRow1[2][1].equalsIgnoreCase("o") && arrRow1[2][2].equalsIgnoreCase("o")) {
                        loses++;
                        if ( (round==3 && nRound == 3 && ( wins<=loses )) || round==1 ) {
                            System.out.println(" game finished result : You "+wins+" Computer "+loses + " Draws " + draws );
                            System.out.println("        |     |      " );
                            System.out.println("     "+arrRow1[0][0]+"  |  "+arrRow1[0][1]+"  |  "+arrRow1[0][2]+"   " );
                            System.out.println(" --------------------- " );
                            System.out.println("     "+arrRow1[1][0]+"  |  "+arrRow1[1][1]+"  |  "+arrRow1[1][2]+"   " );
                            System.out.println(" --------------------- " );
                            System.out.println("     "+arrRow1[2][0]+"  |  "+arrRow1[2][1]+"  |  "+arrRow1[2][2]+"   " );
                            System.out.println("        |     |      " );
                            lose=true;
                        }else {
                            System.out.println("        |     |      " );
                            System.out.println("     "+arrRow1[0][0]+"  |  "+arrRow1[0][1]+"  |  "+arrRow1[0][2]+"   " );
                            System.out.println(" --------------------- " );
                            System.out.println("     "+arrRow1[1][0]+"  |  "+arrRow1[1][1]+"  |  "+arrRow1[1][2]+"   " );
                            System.out.println(" --------------------- " );
                            System.out.println("     "+arrRow1[2][0]+"  |  "+arrRow1[2][1]+"  |  "+arrRow1[2][2]+"   " );
                            System.out.println("        |     |      " );
                            System.out.println(" Hardluck round "+nRound+" finish You "+wins+" Computer "+loses + " Draws " + draws);
                            nRound++;
                            arrRow1[0][0] = " " ;
                            arrRow1[0][1] = " " ;
                            arrRow1[0][2] = " " ;
                            arrRow1[1][0] = " " ;
                            arrRow1[1][1] = " " ;
                            arrRow1[1][2] = " " ;
                            arrRow1[2][0] = " " ;
                            arrRow1[2][1] = " " ;
                            arrRow1[2][2] = " " ;

                        }

                    }else if (arrRow1[0][0].equalsIgnoreCase("o") &&  arrRow1[1][0].equalsIgnoreCase("o") && arrRow1[2][0].equalsIgnoreCase("o")) {
                        loses++;
                        if ( (round==3 && nRound == 3 && ( wins<=loses )) || round==1 ) {
                            System.out.println(" game finished result : You "+wins+" Computer "+loses + " Draws " + draws );
                            System.out.println("        |     |      " );
                            System.out.println("     "+arrRow1[0][0]+"  |  "+arrRow1[0][1]+"  |  "+arrRow1[0][2]+"   " );
                            System.out.println(" --------------------- " );
                            System.out.println("     "+arrRow1[1][0]+"  |  "+arrRow1[1][1]+"  |  "+arrRow1[1][2]+"   " );
                            System.out.println(" --------------------- " );
                            System.out.println("     "+arrRow1[2][0]+"  |  "+arrRow1[2][1]+"  |  "+arrRow1[2][2]+"   " );
                            System.out.println("        |     |      " );
                            lose=true;
                        }else {
                            System.out.println("        |     |      " );
                            System.out.println("     "+arrRow1[0][0]+"  |  "+arrRow1[0][1]+"  |  "+arrRow1[0][2]+"   " );
                            System.out.println(" --------------------- " );
                            System.out.println("     "+arrRow1[1][0]+"  |  "+arrRow1[1][1]+"  |  "+arrRow1[1][2]+"   " );
                            System.out.println(" --------------------- " );
                            System.out.println("     "+arrRow1[2][0]+"  |  "+arrRow1[2][1]+"  |  "+arrRow1[2][2]+"   " );
                            System.out.println("        |     |      " );
                            System.out.println(" Hardluck round "+nRound+" finish You "+wins+" Computer "+loses + " Draws " + draws );
                            nRound++;
                            arrRow1[0][0] = " " ;
                            arrRow1[0][1] = " " ;
                            arrRow1[0][2] = " " ;
                            arrRow1[1][0] = " " ;
                            arrRow1[1][1] = " " ;
                            arrRow1[1][2] = " " ;
                            arrRow1[2][0] = " " ;
                            arrRow1[2][1] = " " ;
                            arrRow1[2][2] = " " ;

                        }

                    }else if (arrRow1[0][1].equalsIgnoreCase("o") &&  arrRow1[1][1].equalsIgnoreCase("o") && arrRow1[2][1].equalsIgnoreCase("o")) {
                        loses++;
                        if ( (round==3 && nRound == 3 && ( wins<=loses )) || round==1 ) {
                            System.out.println(" game finished result : You "+wins+" Computer "+loses + " Draws " + draws );
                            System.out.println("        |     |      " );
                            System.out.println("     "+arrRow1[0][0]+"  |  "+arrRow1[0][1]+"  |  "+arrRow1[0][2]+"   " );
                            System.out.println(" --------------------- " );
                            System.out.println("     "+arrRow1[1][0]+"  |  "+arrRow1[1][1]+"  |  "+arrRow1[1][2]+"   " );
                            System.out.println(" --------------------- " );
                            System.out.println("     "+arrRow1[2][0]+"  |  "+arrRow1[2][1]+"  |  "+arrRow1[2][2]+"   " );
                            System.out.println("        |     |      " );
                            lose=true;
                        }else {
                            System.out.println("        |     |      " );
                            System.out.println("     "+arrRow1[0][0]+"  |  "+arrRow1[0][1]+"  |  "+arrRow1[0][2]+"   " );
                            System.out.println(" --------------------- " );
                            System.out.println("     "+arrRow1[1][0]+"  |  "+arrRow1[1][1]+"  |  "+arrRow1[1][2]+"   " );
                            System.out.println(" --------------------- " );
                            System.out.println("     "+arrRow1[2][0]+"  |  "+arrRow1[2][1]+"  |  "+arrRow1[2][2]+"   " );
                            System.out.println("        |     |      " );
                            System.out.println(" Hardluck round "+nRound+" finish You "+wins+" Computer "+loses + " Draws " + draws );
                            nRound++;
                            arrRow1[0][0] = " " ;
                            arrRow1[0][1] = " " ;
                            arrRow1[0][2] = " " ;
                            arrRow1[1][0] = " " ;
                            arrRow1[1][1] = " " ;
                            arrRow1[1][2] = " " ;
                            arrRow1[2][0] = " " ;
                            arrRow1[2][1] = " " ;
                            arrRow1[2][2] = " " ;

                        }

                    }else if (arrRow1[0][2].equalsIgnoreCase("o") &&  arrRow1[1][2].equalsIgnoreCase("o") && arrRow1[2][2].equalsIgnoreCase("o")) {
                        loses++;
                        if ( (round==3 && nRound == 3 && ( wins<=loses )) || round==1 ) {
                            System.out.println(" game finished result : You "+wins+" Computer "+loses + " Draws " + draws );
                            System.out.println("        |     |      " );
                            System.out.println("     "+arrRow1[0][0]+"  |  "+arrRow1[0][1]+"  |  "+arrRow1[0][2]+"   " );
                            System.out.println(" --------------------- " );
                            System.out.println("     "+arrRow1[1][0]+"  |  "+arrRow1[1][1]+"  |  "+arrRow1[1][2]+"   " );
                            System.out.println(" --------------------- " );
                            System.out.println("     "+arrRow1[2][0]+"  |  "+arrRow1[2][1]+"  |  "+arrRow1[2][2]+"   " );
                            System.out.println("        |     |      " );
                            lose=true;
                        }else {
                            System.out.println("        |     |      " );
                            System.out.println("     "+arrRow1[0][0]+"  |  "+arrRow1[0][1]+"  |  "+arrRow1[0][2]+"   " );
                            System.out.println(" --------------------- " );
                            System.out.println("     "+arrRow1[1][0]+"  |  "+arrRow1[1][1]+"  |  "+arrRow1[1][2]+"   " );
                            System.out.println(" --------------------- " );
                            System.out.println("     "+arrRow1[2][0]+"  |  "+arrRow1[2][1]+"  |  "+arrRow1[2][2]+"   " );
                            System.out.println("        |     |      " );
                            System.out.println(" Hardluck round "+nRound+" finish You "+wins+" Computer "+loses + " Draws " + draws );
                            nRound++;
                            arrRow1[0][0] = " " ;
                            arrRow1[0][1] = " " ;
                            arrRow1[0][2] = " " ;
                            arrRow1[1][0] = " " ;
                            arrRow1[1][1] = " " ;
                            arrRow1[1][2] = " " ;
                            arrRow1[2][0] = " " ;
                            arrRow1[2][1] = " " ;
                            arrRow1[2][2] = " " ;

                        }

                    }else if (arrRow1[0][0].equalsIgnoreCase("o") &&  arrRow1[1][1].equalsIgnoreCase("o") && arrRow1[2][2].equalsIgnoreCase("o")) {
                        loses++;
                        if ( (round==3 && nRound == 3 && ( wins<=loses )) || round==1 ) {
                            System.out.println(" game finished result : You "+wins+" Computer "+loses + " Draws " + draws );
                            System.out.println("        |     |      " );
                            System.out.println("     "+arrRow1[0][0]+"  |  "+arrRow1[0][1]+"  |  "+arrRow1[0][2]+"   " );
                            System.out.println(" --------------------- " );
                            System.out.println("     "+arrRow1[1][0]+"  |  "+arrRow1[1][1]+"  |  "+arrRow1[1][2]+"   " );
                            System.out.println(" --------------------- " );
                            System.out.println("     "+arrRow1[2][0]+"  |  "+arrRow1[2][1]+"  |  "+arrRow1[2][2]+"   " );
                            System.out.println("        |     |      " );
                            lose=true;
                        }else {
                            System.out.println("        |     |      " );
                            System.out.println("     "+arrRow1[0][0]+"  |  "+arrRow1[0][1]+"  |  "+arrRow1[0][2]+"   " );
                            System.out.println(" --------------------- " );
                            System.out.println("     "+arrRow1[1][0]+"  |  "+arrRow1[1][1]+"  |  "+arrRow1[1][2]+"   " );
                            System.out.println(" --------------------- " );
                            System.out.println("     "+arrRow1[2][0]+"  |  "+arrRow1[2][1]+"  |  "+arrRow1[2][2]+"   " );
                            System.out.println("        |     |      " );
                            System.out.println(" Hardluck round "+nRound+" finish You "+wins+" Computer "+loses);
                            nRound++;
                            arrRow1[0][0] = " " ;
                            arrRow1[0][1] = " " ;
                            arrRow1[0][2] = " " ;
                            arrRow1[1][0] = " " ;
                            arrRow1[1][1] = " " ;
                            arrRow1[1][2] = " " ;
                            arrRow1[2][0] = " " ;
                            arrRow1[2][1] = " " ;
                            arrRow1[2][2] = " " ;

                        }

                    }else if (arrRow1[0][2].equalsIgnoreCase("o") &&  arrRow1[1][1].equalsIgnoreCase("o") && arrRow1[2][0].equalsIgnoreCase("o")) {
                        loses++;
                        if ( (round==3 && nRound == 3 && ( wins<=loses )) || round==1 ) {
                            System.out.println(" game finished result : You "+wins+" Computer "+loses + " Draws " + draws);
                            System.out.println("        |     |      " );
                            System.out.println("     "+arrRow1[0][0]+"  |  "+arrRow1[0][1]+"  |  "+arrRow1[0][2]+"   " );
                            System.out.println(" --------------------- " );
                            System.out.println("     "+arrRow1[1][0]+"  |  "+arrRow1[1][1]+"  |  "+arrRow1[1][2]+"   " );
                            System.out.println(" --------------------- " );
                            System.out.println("     "+arrRow1[2][0]+"  |  "+arrRow1[2][1]+"  |  "+arrRow1[2][2]+"   " );
                            System.out.println("        |     |      " );
                            lose=true;
                        }else {
                            System.out.println("        |     |      " );
                            System.out.println("     "+arrRow1[0][0]+"  |  "+arrRow1[0][1]+"  |  "+arrRow1[0][2]+"   " );
                            System.out.println(" --------------------- " );
                            System.out.println("     "+arrRow1[1][0]+"  |  "+arrRow1[1][1]+"  |  "+arrRow1[1][2]+"   " );
                            System.out.println(" --------------------- " );
                            System.out.println("     "+arrRow1[2][0]+"  |  "+arrRow1[2][1]+"  |  "+arrRow1[2][2]+"   " );
                            System.out.println("        |     |      " );
                            System.out.println(" Hardluck round "+nRound+" finish You "+wins+" Computer "+loses);
                            nRound++;
                            arrRow1[0][0] = " " ;
                            arrRow1[0][1] = " " ;
                            arrRow1[0][2] = " " ;
                            arrRow1[1][0] = " " ;
                            arrRow1[1][1] = " " ;
                            arrRow1[1][2] = " " ;
                            arrRow1[2][0] = " " ;
                            arrRow1[2][1] = " " ;
                            arrRow1[2][2] = " " ;

                        }

                    }else if(!arrRow1[0][0].equals(" ") &&  !arrRow1[0][1].equals(" ") && !arrRow1[0][2].equals(" ")
                            && !arrRow1[1][0].equals(" ") &&  !arrRow1[1][1].equals(" ") && !arrRow1[1][2].equals(" ")
                            && !arrRow1[2][0].equals(" ") &&  !arrRow1[2][1].equals(" ") && !arrRow1[2][2].equals(" ")
                    ){



                        if ( round==3 && nRound == 3  ) {
                            System.out.println("  game finished result is drow : You "+wins+" Computer "+loses+ " Draws " + draws);
                            System.out.println("        |     |      " );
                            System.out.println("     "+arrRow1[0][0]+"  |  "+arrRow1[0][1]+"  |  "+arrRow1[0][2]+"   " );
                            System.out.println(" --------------------- " );
                            System.out.println("     "+arrRow1[1][0]+"  |  "+arrRow1[1][1]+"  |  "+arrRow1[1][2]+"   " );
                            System.out.println(" --------------------- " );
                            System.out.println("     "+arrRow1[2][0]+"  |  "+arrRow1[2][1]+"  |  "+arrRow1[2][2]+"   " );
                            System.out.println("        |     |      " );
                        }
                        else if (round==1) {
                            System.out.println(" the result is draw ");
                            draw=true;
                        }else {
                            System.out.println(" round "+nRound+" finish , the result is draw ! ");
                            draws++;
                            nRound++;
                            arrRow1[0][0] = " " ;
                            arrRow1[0][1] = " " ;
                            arrRow1[0][2] = " " ;
                            arrRow1[1][0] = " " ;
                            arrRow1[1][1] = " " ;
                            arrRow1[1][2] = " " ;
                            arrRow1[2][0] = " " ;
                            arrRow1[2][1] = " " ;
                            arrRow1[2][2] = " " ;

                        }

                    }
                }
            }

            if (wins>loses) {
                System.out.println("Congratulations the winner is You :) !!! ");
            }else if(loses>wins) {
                System.out.println("Hardluck the winner is Computer :( !!! ");
            }else if(loses==wins && loses==draws && wins==draws ){
                System.out.println("the winner is nobody , the result is draw !!! ");
            }
        }catch (InputMismatchException e) {
            System.out.println("please enter number !!");
        }

    }
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.println(" Welcome to tic tac toe game do want to play 1 round or 3 round ? ");

        try {

            int round = input.nextInt() ;

            if (round != 1 && round != 3) {
                System.out.println(" Please enter 1 or 3 only ! ");
            }
            else {
                System.out.println(" Please Enter position you want to place your move (from 1-9)");


                System.out.println("        |     |      " );
                System.out.println("     1  |  2  |  3   " );
                System.out.println(" --------------------- " );
                System.out.println("     4  |  5  |  6   " );
                System.out.println(" --------------------- " );
                System.out.println("     7  |  8  |  9   " );
                System.out.println("        |     |      " );


                tictactoe(round);
            }
        }catch (InputMismatchException e) {
            System.out.println("please enter number !!");
        }





    }

}
