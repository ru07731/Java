import java.util.*;
abstract class Book{
	
	String title;
	abstract void setTitle(String s);
	String getTitle(){
		return title;
	}
}
class MyBook extends Book {
    @Override
    void setTitle(String s) {
        title = s;
    }
}

public class AbstrClass{
	
	public static void main(String []args){
		System.out.println("Enter name of the novel:");
		Scanner sc=new Scanner(System.in);
		String title=sc.nextLine();
		MyBook new_novel=new MyBook();
		new_novel.setTitle(title);
		System.out.println("The title is: "+new_novel.getTitle());
      	sc.close();
		
	}
}