class Num<T extends Number>{
    T [] n;
    Num(int n){
        this.n=n;
    }
    double avg(){
        double sum=0;
        for(int i=0;i<n.length; i++){
            sum=sum+n[i].doubleValue();
            return sum/n.length;
        }
    }
}

public class AvgOfGEn {
  public static void main(String[] args) {
    Integer I [] ={2,1,4,2};
    Num<Integer> ob=new Num<Integer>(I);
    System.out.println(ob.avg());
  }  
}
