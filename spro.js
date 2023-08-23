let a;
function fun(){


    if(a==1){

    
    let menu = document.getElementById("menu-mobile").style.display="block"
    menu="";


    menu+=`
            <div style="background-color:red; width=100%";>
            <br>
           

            <div style="color:yellow; text-align:center; move-down:50px;">Menu</div>
            <br>
            <div style="color:yellow; text-align:center">Products</div>
            <br>
            <div style="color:yellow; text-align:center">Contact</div>
            <br>
            <div style="color:yellow; text-align:center">About Us</div>
            <br>
            
            
            
            </div>

    
            `
            document.getElementById("menu-mobile").innerHTML= menu;
            return a=0;
    }
else{

    let menu = document.getElementById("menu-mobile").style.display="none"
    return a=1;



}


    


}