package Abstractioin;

interface Libraryitem{
    //methods
    public String getTitle();
    public String getAuthor();
    public int getYear();
    public boolean Available();
}

class Example implements Libraryitem{

    @Override
    public String getTitle() {
        return "Atomic Habit";
    }

    @Override
    public String getAuthor() {
        return "James Clear";
    }

    @Override
    public int getYear() {
        return 2018;
    }

    @Override
    public boolean Available() {
        return true;
    }

}


public class LibraryManagementSystem {
    public static void main(String[]args){
        Example example=new Example();
        System.out.println("The book title is :"+example.getTitle());
        System.out.println("The author of the book is : "+example.getAuthor());
        System.out.println("The release date of the book is: "+example.getYear());
        System.out.println("The book is currently avaiable :"+example.Available());
    }
}
