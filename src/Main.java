import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        LinkedList<String> list2 = new LinkedList<>();



        int answer = 0;
        while (answer != 7) {
            System.out.println("Выберите действие:");
            System.out.println("1 - Добавить новую книгу ");
            System.out.println("2 - Выдача книги");
            System.out.println("3 - Возврат книги");
            System.out.println("4 - Список книг в библиотеке");
            System.out.println("5 - Список ввыданых книг");
            System.out.println("6 - Поиск книги");
            System.out.println("7 - Выход");
            Scanner scanner = new Scanner(System.in);
            answer = scanner.nextInt();
            switch (answer) {
                case 1:

                    scanner.nextLine();
                    System.out.println("Введите название книги ");
                    String name = scanner.nextLine();
                    System.out.println("ведите ID книги");
                    int id = scanner.nextInt();
                    String con = name.concat( "\n" + "ID книги: " + id);
                    System.out.println("Название книги: " + name + " " + "\n" + "ID книги: " + id + "\n" + "\n" + "Книга добавлена. " + "\n");
                    list.add(con);

                    break;
                case 2:

                    scanner.nextLine();
                    System.out.println("Введите название книги ");
                    String name1 = scanner.nextLine();
                    System.out.println("ведите ID книги");
                    int id1 = scanner.nextInt();
                    String con1 = name1.concat( "\n" + "ID книги: " + "\n" + id1);
                    System.out.println(name1 + " " + id1 + " Книга выдана. " + "\n");

                    list.remove(con1);
                    list2.add(con1);
                    break;
                case 3:

                    scanner.nextLine();
                    System.out.println("Введите название книги ");
                    String name2 = scanner.nextLine();
                    System.out.println("ведите ID книги");
                    int id2 = scanner.nextInt();
                    String con2 = name2.concat( "\n" + "ID книги: " + id2);
                    System.out.println("Название книги: " + name2 + "\n" + "ID книги: "
                            + id2 + "\n" + "Возврат книги успешно произведен. " + "\n");

                    list2.remove(con2);
                    list.add(con2);

                    break;
                case 4:
                    if (list.isEmpty()) {
                        System.out.println("Вы пока не добавили книги" + "\n");
                    } else {
                        System.out.println("Список книг в библиотеке:" + "\n");
                        for (String s : list) {
                            System.out.println("Название книги: " + s + "\n");
                        }
                    }
                    break;
                case 5:
                    if (list2.isEmpty()) {
                        System.out.println("Нет выданых книг");
                    } else {
                        System.out.println("Список выданых книг:" + "\n");
                        for (String s : list2) {
                            System.out.println("Название книги: " + s + "\n");
                        }
                    }
                    break;
                case 6:
                    scanner.nextLine();
                    System.out.println("Введите название книги для поиска: ");
                    String search = scanner.nextLine();
                    System.out.println("Введите ID книги для поиска: ");
                    int search2 = scanner.nextInt();
                    boolean found = false;

                    for (String book : list) {
                        if (book.toLowerCase().contains(search.toLowerCase())) {
                            System.out.println("Книга найдена: " + book + "\n");
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Книга не найдена." + "\n");
                    }
                    break;
                case 7:
                    System.out.println("Вы вышли.");
                    break;
                default:
                    System.out.println("Ошибка.");
                    break;







            }
        }
    }
}