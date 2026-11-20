//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    class Book {
        String title;
        String author;
        String[] book;
        int pages;
        float price;
    }
    Book book1 = new Book();
    book1.title = "어서와 JAVA는 처음이지?";
    book1.author = "천인국";
    book1.pages = 230;
    book1.price = 23000.0f;

    Book book2 = new Book();
    book1.title = "쉽게 배우는 자료구조";
    book1.author = "윤병로";
    book1.pages = 330;
    book1.price = 32000.0f;


    System.out.printf(" %s\n\t저자 : %s\n\t페이지 수 : %d 쪽\n\t가격 : %,.0f 원\n\n",
            book1.title, book1.author, book1.book, book1.price);
    System.out.printf(" %s\n\t저자 : %s\n\t페이지 수 : %d 쪽\n\t가격 : %,.0f 원\n\n",
            book2.title, book2.author, book2.book, book2.price);
}
