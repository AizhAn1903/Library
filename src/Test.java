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
            System.out.println("1 - Просмотр доступных книг ");
            System.out.println("2 - Выдача книги");
            System.out.println("3 - Добавить новую книгу ");
            System.out.println("4 - Возврат книги");
            System.out.println("5 - Список выданных книг");
            System.out.println("6 - Поиск книги");
            System.out.println("7 - Выход");
            answer = scanner.nextInt();
            switch (answer) {
                case 1:
                    System.out.println("Доступные к чтению: ");
                    for (Library lib1 : lib) {
                        System.out.println(lib1);
                    }
                    break;
                case 2:


                    System.out.println("Выберите книгу (id)");
                    int select = scanner.nextInt();
                    for (Library lib1 : lib) {
                        if (lib1.getId() == select) {
                            storage.add(lib1);
                            lib.remove(lib1);
                            System.out.println("Книга успешно выдана");

                            System.out.println("_________________________");


                        } else {
                            System.out.println("Нет такой книги");
                        }
                        break;
                    }



                    break;
                case 3:
                    scanner.nextLine();
                    System.out.println("Введите название книги ");
                    String name = scanner.nextLine();
                    System.out.println("Введите автора книги");
                    String nameOfAuthor = scanner.nextLine();
                    System.out.println("ведите ID книги");
                    int id = scanner.nextInt();
                    Library newBook = new Library(name, nameOfAuthor, id);
                    lib.add(newBook);
                    System.out.println(name + id + " Книга добавлена. ");
                    System.out.println("______________________________");
                    break;
                case 4:
                    System.out.println("Введите id книги которую вернули");
                    int idBook = scanner.nextInt();
                    for (int i = 0; i < storage.size(); i++) {
                        Library bookReturn = storage.get(i);
                        if (bookReturn.getId() == idBook) {
                            lib.add(bookReturn);
                            storage.remove(i);
                            System.out.println("Книга успешна возвращена");
                            break;
                        } else {
                            System.out.println("Нет такой книги");
                        }
                    }
                    System.out.println("нет такой книги");
                    break;
                case 5:
                    if (storage.isEmpty()) {
                        System.out.println("Нет выданых книг");
                        System.out.println("______________________________");
                    } else {
                        System.out.println("Выданые книги: ");
                        for (Library lib2 : storage) {
                            System.out.println(lib2);
                        }
                        System.out.println("______________________________________");
                    }
                    break;
                case 6:
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
                case 7:
                    System.out.println("Выполняется выход...");
                    break;
                default:
                    System.out.println("Ошибка,повторите попытку");
                    break;
            }
        }
    }

}
