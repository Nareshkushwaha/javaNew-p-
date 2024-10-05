class CopyCon{  
    int id;  
    String name;  
    //constructor to initialize integer and string  
    CopyCon(int i,String n){  
    id = i;  
    name = n;  
    }  
    //constructor to initialize another object  
    CopyCon(CopyCon s){  
    id = s.id;  
    name =s.name;  
    }  
    void display(){System.out.println(id+" "+name);}  
   
    public static void main(String args[]){  
    CopyCon s1 = new CopyCon(111,"Karan");  
    CopyCon s2 = new CopyCon(s1);  
    s1.display();  
    s2.display();  
   }  
}