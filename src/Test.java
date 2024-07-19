import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args){
        List<Book> list = new ArrayList<>();

        Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
        Book b2=new Book(102,"Data Communications and Networking","Forouzan","Mc Graw Hill",4);

        list.add(b1);
        list.add(b2);

        for(Book b:list){
            System.out.println(b.id+" "+ b.name);
        }

    }
}
