import java.util.Scanner;

class Gameer{
    String array[][]= new String[3][3];
    Gameer(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
               array[i][j]="-";
            }
            
        }
    }
    
    public void currnt(){
        
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
    public String check(){
        if(array[0][0] == "o" && array[0][1]=="o" && array[0][2]=="o"){
            System.out.print("O won");
            return "o";
        }
        if(array[1][0] == "o" && array[1][1]=="o" && array[1][2]=="o"){
            System.out.print("O won");
            return "o";
        }
        if(array[2][0] == "o" && array[2][1]=="o" && array[2][2]=="o"){
            System.out.print("O won");
            return "o";
        }
        if(array[0][0] == "o" && array[1][0]=="o" && array[2][0]=="o"){
            System.out.print("O won");
            return "o";
        }
        if(array[1][0] == "o" && array[1][1]=="o" && array[2][1]=="o"){
            System.out.print("O won");
            return "o";
        }
        if(array[0][2] == "o" && array[1][2]=="o" && array[2][2]=="o"){
            System.out.print("O won");
            return "o";
        }
        if(array[0][0] == "o" && array[1][1]=="o" && array[2][2]=="o"){
            System.out.print("O won");
            return "o";
        }
        if(array[0][2] == "o" && array[1][1]=="o" && array[2][1]=="o"){
            System.out.print("O won");
            return "o";
        }

        //x
        if(array[0][0] == "x" && array[0][1]=="x" && array[0][2]=="x"){
            System.out.print("x won");
            return "x";
        }
        if(array[1][0] == "x" && array[1][1]=="x" && array[1][2]=="x"){
            System.out.print("x won");
            return "x";
        }
        if(array[2][0] == "x" && array[2][1]=="x" && array[2][2]=="x"){
            System.out.print("x won");
            return "x";
        }
        if(array[0][0] == "x" && array[1][0]=="x" && array[2][0]=="x"){
            System.out.print("x won");
            return "x";
        }
        if(array[1][0] == "x" && array[1][1]=="x" && array[2][1]=="x"){
            System.out.print("x won");
            return "x";
        }
        if(array[0][2] == "x" && array[1][2]=="x" && array[2][2]=="x"){
            System.out.print("x won");
            return "x";
        }
        if(array[0][0] == "x" && array[1][1]=="x" && array[2][2]=="x"){
            System.out.print("x won");
            return "o";
        }
        if(array[0][2] == "x" && array[1][1]=="x" && array[2][1]=="x"){
            System.out.print("x won");
            return "x";
        }
        return "no";
    }
    
}
public class game {
    public static void main(String a[]){
        Gameer z= new Gameer();
        
        Scanner scan= new Scanner(System.in);
        for(int i=0;i<9;i++){
            if(i%2==0){
                System.out.print("X turn\n");
                System.out.print("enter for value : ");
                int aa= scan.nextInt();
               

                if(aa==1){
                    if(z.array[0][0]!="-"){
                        System.out.print("already taken");
                        aa= scan.nextInt();
                    }
                    z.array[0][0]="x";
                }
                if(aa==2){
                    if(z.array[0][1]!="-"){
                        System.out.print("already taken");
                        aa= scan.nextInt();
                    }
                    
                    z.array[0][1]="x";
                }
                if(aa==3){
                    if(z.array[0][2]!="-"){
                        System.out.print("already taken");
                        aa= scan.nextInt();
                    }
                   
                    z.array[0][2]="x";
                }
                if(aa==4){
                    if(z.array[1][0]!="-"){
                        System.out.print("already taken");
                        aa= scan.nextInt();
                    }
                    
                    z.array[1][0]="x";
                }
                if(aa==5){
                    if(z.array[1][1]!="-"){
                        System.out.print("already taken");
                        aa= scan.nextInt();
                    }
                   
                    z.array[1][1]="x";
                }
                if(aa==6){
                    if(z.array[1][2]!="-"){
                        System.out.print("already taken");
                        aa= scan.nextInt();
                    }
                 
                    z.array[1][2]="x";
                }
                if(aa==8){

                    if(z.array[2][1]!="-"){
                        System.out.print("already taken");
                        aa= scan.nextInt();
                    }
                   
                    z.array[2][1]="x";
                }
                if(aa==7){
                    if(z.array[2][0]!="-"){
                        System.out.print("already taken");
                        aa= scan.nextInt();
                    }
                    
                    z.array[2][0]="x";
                }
                if(aa==9){
                    if(z.array[2][2]!="-"){
                        System.out.print("already taken");
                        aa= scan.nextInt();
                    }
                   
                    z.array[2][2]="x";
                }
               
                
                z.currnt();
                if(z.check()=="x"){
                    System.out.print(z.check());
                    break;
                }
            }
            else{
                System.out.print("0 turn\n");
                System.out.print("enter for value : ");
                int aa= scan.nextInt();
                
                if(aa==1){
                    if(z.array[0][0]!="-"){
                        System.out.print("already taken");
                        aa= scan.nextInt();
                    }
                    
                    z.array[0][0]="o";
                }
                if(aa==2){
                    if(z.array[0][1]!="-"){
                        System.out.print("already taken");
                        aa= scan.nextInt();
                    }
                   
                    z.array[0][1]="o";
                }
                if(aa==3){
                    if(z.array[0][2]!="-"){
                        System.out.print("already taken");
                        aa= scan.nextInt();
                    }
                   
                    z.array[0][2]="o";
                }
                if(aa==4){
                    if(z.array[1][0]!="-"){
                        System.out.print("already taken");
                        aa= scan.nextInt();
                    }
                    
                    z.array[1][0]="o";
                }
                if(aa==5){
                    if(z.array[1][1]!="-"){
                        System.out.print("already taken");
                        aa= scan.nextInt();
                    }
                
                    z.array[1][1]="o";
                }
                if(aa==6){
                    if(z.array[1][2]!="-"){
                        System.out.print("already taken");
                        aa= scan.nextInt();
                    }
              
                    z.array[1][2]="o";
                }
                if(aa==8){
                    if(z.array[2][1]!="-"){
                        System.out.print("already taken");
                        aa= scan.nextInt();
                    }
                    
                    z.array[2][1]="o";
                }
                if(aa==7){
                    if(z.array[2][0]!="-"){
                        System.out.print("already taken");
                        aa= scan.nextInt();
                    }
                  
                    z.array[2][0]="o";
                }
                if(aa==9){
                    if(z.array[2][2]!="-"){
                        System.out.print("already taken");
                        aa= scan.nextInt();
                    }
                    
                    z.array[2][2]="o";
                }
               


                
                
                
               
                z.currnt();
                if(z.check()=="o"){
                    System.out.print(z.check());
                    break;
            }
            
        }
    }
}
}
