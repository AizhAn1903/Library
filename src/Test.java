import java.util.LinkedList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Library book = new Library("Три товарища", "Эрих Мария Ремарк", true, 1);
        Library book2 = new Library("Старик и море", "Эрнест Хемингуэй", true, 2);
        Library book3 = new Library("Гарри Поттер и философский камень", "Джоан Роулинг", true, 3);
        Library book4 = new Library("Властелин колец", "Джон Рональд Руэл Толкин", true, 4);

        LinkedList<Library> lib = new LinkedList<>();
        LinkedList<Library> storage = new LinkedList<>();
        lib.add(book);
        lib.add(book2);
        lib.add(book3);
        lib.add(book4);

        Scanner sc = new Scanner(System.in);
        System.out.println("**********Библиотека******************");
        System.out.println("***1.Просмотр доступных книг**********");
        System.out.println("***2.Полученные книги*****************");
        System.out.println("***3.Возврат книги********************");
        System.out.println("***4.Выход****************************");
        while (true) {
            System.out.println("Выберите действие");
            int code = sc.nextInt();
            sc.nextLine();
            switch (code) {
                case 1:
                    System.out.println("Доступные к чтению: ");
                    for (Library lib1 : lib) {
                        System.out.println(lib1);
                    }
                    System.out.println("Выберите книгу");
                    int select = sc.nextInt();
                    for (Library lib1 : lib) {
                        if (lib1.getId() == select) {
                            storage.add(lib1);
                            lib.remove(lib1);
                            System.out.println("Книга успешно получена");
                            break;
                        }
                    }
                    break;
                case 2:
                    if (storage.isEmpty()) {
                        System.out.println("Вы ничего не брали");
                    } else {
                        System.out.println("Вы брали: ");
                        for (Library lib2 : storage) {
                            System.out.println(lib2);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Введите id книги которую вы брали");
                    int idBook = sc.nextInt();
                    for (int i = 0; i < storage.size(); i++) {
                        Library bookReturn = storage.get(i);
                        if (bookReturn.getId() == idBook) {
                            lib.add(bookReturn);
                            storage.remove(i);
                            System.out.println("Вы успешно возвратили книгу");
                            break;
                        }
                    }
                    break;
                case 4:
                    System.out.println("Выполняется выход...");
                    System.exit(0);
                default:
                    System.out.println("Не корректный ввод,повторите попытку");
            }
        }
    }
}