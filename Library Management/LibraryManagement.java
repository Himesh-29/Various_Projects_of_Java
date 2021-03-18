import java.util.Scanner;

class Library{
    private String [] books=new String[10];
    private int length_of_books=10;
    private int index;
    


    //Constructor
    public Library(){
        books[0]="Java for all";
        books[1]="C++ for all";
        books[2]="C for all";
        books[3]="Python for all";
        books[4]="Javascript for all";
        index=5;
    }



    //Methods
    public void addBook(String S){
        if(index!=length_of_books-1){
            books[index] = S;
            setIndex(getIndex()+1);
            System.out.println("Book: "+"\""+S+"\""+" succesfully added");
        }
        else{
            System.out.println("We have reached our maximum capacity. No more books can be added!!");
        }
    }

    public void issueBook(String S){
        int flag=0,index_of_book=0;
        if(index!=0){
            for (int i = 0; i < books.length; ++i) {
                if (books[i].equalsIgnoreCase(S)) {
                    flag = 1;
                    index_of_book = i;
                    break;
                }
                if(i>=index-1) break;
            }
            if (flag == 1) {
                setIndex(getIndex()-1);
                for (int i = index_of_book; i < books.length; ++i) {
                    books[i] = books[i + 1];
                    if (books[i] == null)
                        break;
                }
                System.out.println("Book: " + "\"" + S + "\"" + " succesfully issued");
            }
            else if(flag==0){
                System.out.println("The library does not have the book: "+"\""+S+"\" which you are demanding!");
            }
        }
        else{
            System.out.println("The library is empty! Return the previously borrowed books!");
        }
    }

    public void viewAvailableBooks(){
        for(int i=0;i<getIndex();++i){
            if(i==getIndex()-1) System.out.println(books[i]);
            else System.out.print(books[i]+", ");
        }
    }



    // Getters
    public int getIndex(){
        return index;
    }



    //Setters
    private void setIndex(int x){
        index=x;
    }
}

public class LibraryManagement {
    public static void main(String[] args){

        // You have to implement a library using Java Class "Library"
        // Methods: addBook, issueBook, returnBook, showAvailableBooks
        // Properties: Array to store the available books,
        // Array to store the issued books

        Library lb=new Library();
        Scanner sc=new Scanner(System.in);
        Scanner sc_str=new Scanner(System.in);

        int input=0;
        
        do{
            System.out.print("\n\nWELCOME TO THE LIBRARY!\n1.View the books available\n2.Issue a book\n3.Add a book\nEnter any other number to exit\n\nPick your choice: ");
            input=sc.nextInt();
            switch(input){
                case 1: {
                    System.out.print("\nAvailable books: ");
                    lb.viewAvailableBooks();
                    break;
                }
                case 2: {
                    System.out.print("Enter the book to be issued: ");
                    String book="";
                    book=sc_str.nextLine();
                    lb.issueBook(book);
                    break;
                }
                case 3: {
                    System.out.print("Enter the book to be added: ");
                    String book = sc_str.nextLine();
                    lb.addBook(book);
                    break;
                }
                default: System.out.println("Good Bye!!"); System.exit(0);
            }
            
        }while(input==1||input==2||input==3);

    sc.close();
    sc_str.close();
    
    }
}