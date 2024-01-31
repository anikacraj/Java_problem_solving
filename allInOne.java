class Area3d{
    int height,width,depth;
    
    Area3d(int h, int w, int d){
        height=h;
        width=w;
        depth=d;
    }
    int volume(){
        return height*width*depth;
    }
}
class Weight extends Area3d{
    int wpu;
    Weight(int h, int w, int d, int wp){
        super(h,w,d);
        wpu=wp;
    }
    int total_weight(){
        return volume()*wpu;
    }
}

class Area2d extends Area3d{
    Area2d(int h,int w, int d){
        super ( h, w, d);
    }
    
    int volume(){
        return height*width;
    }
}


class allInOne{
    public static void main(String[] args){  
        
        //calling the Area3d class
        Area3d ob= new Area3d (2,3,4);
        System.out.println(""+ob.volume());
        
        
        
        //calling the Weight sub class of Area3d class
        Weight ob1= new Weight (2,3,4,10);
        System.out.println(""+ob1.volume()); // printing from its super class's method.
        System.out.println(""+ob1.total_weight()); // printing from its own method
        
        

        
        
        // Dynamin method dispatch for method overriding
         Area3d obmain; // Defining Area3d class
         Area2d ob2= new Area2d (2,3,4);
         
         obmain= ob2; // "sub class's method with same name and return type as its superclass" is getting assigned to the defined super class.
        System.out.println("" +ob2.volume());
        
        
        
    }
}
