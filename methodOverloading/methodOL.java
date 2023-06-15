package methodOverloading;

public class methodOL {
    public int x;
    public String y;
    methodOL(){
        System.out.println("this");
    }
    methodOL(int x , int y){
        System.out.println(x+y);

    }

   /* public void sum(int x){
        System.out.println("not input");
    }
    public void sum(int x , String y){//this
        int add= x;
        System.out.println("2nd method"+" "+add+y);
        }*/

    public static void main(String[] args) {
        methodOL s = new methodOL(5,6);


    }
}
