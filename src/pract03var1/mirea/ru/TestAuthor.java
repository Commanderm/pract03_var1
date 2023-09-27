package pract03var1.mirea.ru;

public class TestAuthor {
    public static void main(String[] args) {
        Author author_m = new Author("Волков Михаил Юрьевич", "volkov_m@mirea.ru", 'М');
        Author author_f = new Author("Братусь Надежда Валерьевна","bratus@mirea.ru",'Ж');
        System.out.println(author_m.getName());
        System.out.println(author_f.getName());
        System.out.println(author_m.getEmail());
        System.out.println(author_f.getEmail());
        System.out.println(author_m.getGender());
        System.out.println(author_f.getGender());

        author_m.setEmail("commanderm@yandex.ru");
        System.out.println(author_m);
    }
}
