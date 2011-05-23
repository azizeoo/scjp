package chap3;
import java.util.Date;

class Dao { }
class Article extends Dao{
	Article(Date date, int quantity, double amount){ }
	public static int getAllArticles(){ return 2; }
	public static Double getAmount(){ return getAllArticles() * 10; }
}

class Controller {
	int addArticle(){
		Integer now = 123456;
		//java.util.Date.Date(long date)
		Date date = new Date(now);
		return this.save(new Article(date,Article.getAllArticles(),Article.getAmount()));
	}
	int save(Article art){ return 1;}
}

public class TestClass3 {
	public static void main(String... args){
		System.out.println("This article is saved : " + new Controller().addArticle());
	}
	// What is the result ?
	// A - Error Compilation into Article
	//
	// B - Error Compilation into Controller
 	//
	// C - An exception is thrown at runtime
	//
	// E - This article is saved : 1
	//
	// F - The ouput is not predictable
}