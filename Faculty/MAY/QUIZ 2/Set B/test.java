package QUIZ2;
//problem 2
class ObjectReturn {

    int a;

    ObjectReturn(){
    	
    }
    
    public ObjectReturn(int a) {
        this.a = a;
    }

    public ObjectReturn incrByTen() {
        ObjectReturn temp = new ObjectReturn();
        temp.a += 10;
		return temp;
        
    }

}

public class test {

    public static void main(String[] args) {
        ObjectReturn ob1 = new ObjectReturn(2);
        ObjectReturn ob2;
        
        ob2 = ob1.incrByTen();
        
        System.out.println("ob1.a: " + ob1.a);
        System.out.println("ob2.a: " + ob2.a);

    }

}