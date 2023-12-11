import java.util.LinkedList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Library book = new Library("Три товарища", "Эрих Мария Ремарк", 1);
        Library book2 = new Library("Старик и море", "Эрнест Хемингуэй", 2);
        Library book3 = new Library("Гарри Поттер и философский камень", "Джоан Роулинг", 3);
        Library book4 = new Library("Властелин колец", "Джон Рональд Руэл Толкин", 4);
        Library book5 = new Library("Зелёная миля", "Стивен Кинг", 5);
        Library book6 = new Library("Крёстный отец", "Марио Пьюзо", 6);
        Library book7 = new Library("Песнь льда и огня", "Джордж Мартин", 7);
        Library book8 = new Library("Маленький принц", "Антуан де Сент-Экзюпери", 8);

        LinkedList<Library> lib = new LinkedList<>();
        LinkedList<Library> storage = new LinkedList<>();
        lib.add(book);
        lib.add(book2);
        lib.add(book3);
        lib.add(book4);
        lib.add(book5);
        lib.add(book6);
        lib.add(book7);
        lib.add(book8);
        Scanner scanner = new Scanner(System.in);


        int answer = 0;
        while (answer != 7) {
            System.out.println("Выберите действие:");
            System.out.println("1 - Выдача книг ");
            System.out.println("2 - Добавить новую книгу ");
            System.out.println("3 - Возврат книги");
            System.out.println("4 - Список полученных книг");
            System.out.println("5 - Поиск книги");
            System.out.println("6 - Выход");
            answer = scanner.nextInt();
            switch (answer) {
                case 1:
                    System.out.println("Доступные к чтению: ");
                    for (Library lib1 : lib) {
                        System.out.println(lib1);
                    }
                    System.out.println("Выберите книгу (id), или введите 0 чтобы вернутся в меню");
                    int select = scanner.nextInt();
                    boolean bookFound = false;

                    for (Library lib1 : lib) {
                        if (lib1.getId() == select) {
                            storage.add(lib1);
                            lib.remove(lib1);
                            System.out.println("Книга успешно получена");
                            System.out.println("______________________________");
                            bookFound = true;
                            break;
                        }
                    }

                    if (!bookFound && select != 0) {
                        System.out.println("Неверное id книги");
                    }
                    break;
                case 2:
                    scanner.nextLine();
                    System.out.println("Введите название книги ");
                    String name = scanner.nextLine();
                    System.out.println("Введите автора книги");
                    String nameOfAuthor = scanner.nextLine();
                    System.out.println("ведите ID книги");
                    int id = scanner.nextInt();
                    Library newBook = new Library(name, nameOfAuthor, id);
                    lib.add(newBook);
                    System.out.println(id + " " + name + " " + nameOfAuthor + " книга добавлена. ");
                    System.out.println("______________________________________");
                    break;
                case 3:
                    System.out.println("Введите id книги которую вы брали");
                    int idBook = scanner.nextInt();
                    boolean bookId = false;
                    for (int i = 0; i < storage.size(); i++) {
                        Library bookReturn = storage.get(i);
                        if (bookReturn.getId() == idBook) {
                            lib.add(bookReturn);
                            storage.remove(i);
                            System.out.println("Вы успешно возвратили книгу");
                            System.out.println("______________________________");
                            bookId = true;
                            break;
                        }
                    }
                    if (!bookId) {
                        System.out.println("Неверное id книги");
                    }
                    break;
                case 4:
                    if (storage.isEmpty()) {
                        System.out.println("Вы ничего не брали");
                        System.out.println("______________________________");
                    } else {
                        System.out.println("Вы брали: ");
                        for (Library lib2 : storage) {
                            System.out.println(lib2);
                        }
                        System.out.println("______________________________________");
                    }
                    break;
                case 5:
                    scanner.nextLine();
                    System.out.println("Введите название книги для поиска: ");
                    String search = scanner.nextLine();
                    boolean found = false;

                    for (Library bookSearch : lib) {
                        if (bookSearch.getName().toLowerCase().contains(search.toLowerCase())) {
                            System.out.println("Книга найдена: " + bookSearch);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Книга не найдена");
                    }
                    break;
                case 6:
                    System.out.println("Выполняется выход...");
                    System.exit(0);
                default:
                    System.out.println("Ошибка,повторите попытку");
                    break;
            }
        }
    }
}
