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
                    String id = scanner.nextLine();
                    String con = name.concat( "- id:" + id);
                    System.out.println(name + id + " Книга добавлена. ");
                    list.add(con);

                    break;
                case 2:

                    scanner.nextLine();
                    System.out.println("Введите название книги ");
                    String name1 = scanner.nextLine();
                    System.out.println("ведите ID книги");
                    String id1 = scanner.nextLine();
                    String con1 = name1.concat( "- id:" + id1);
                    System.out.println(name1 + id1 + " Книга добавлена. ");

                    list.remove(con1);
                    list2.add(con1);
                    break;
                case 3:

                    scanner.nextLine();
                    System.out.println("Введите название книги ");
                    String name2 = scanner.nextLine();
                    System.out.println("ведите ID книги");
                    String id2 = scanner.nextLine();
                    String con2 = name2.concat( "- id:" + id2);
                    System.out.println(name2 + id2 + " Книга добавлена. ");

                    list2.remove(con2);
                    list.add(con2);

                    System.out.println(list);
                    break;
                case 4:
                    if (list.isEmpty()) {
                        System.out.println("Вы пока не добавили книги");
                    } else {
                        System.out.println(" Список книг в библиотеке");
                        for (String s : list) {
                            System.out.println(s);
                        }
                    }
                    break;
                case 5:
                    if (list2.isEmpty()) {
                        System.out.println("Нет выданых книг");
                    } else {
                        System.out.println(" Список выданых книг");
                        for (String s : list2) {
                            System.out.println(s);
                        }
                    }
                    break;
                case 6:
                    scanner.nextLine();
                    System.out.println("Введите название книги для поиска: ");
                    String search = scanner.nextLine();
                    boolean found = false;

                    for (String book : list) {
                        if (book.toLowerCase().contains(search.toLowerCase())) {
                            System.out.println("Книга найдена: " + book);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Книга не найдена");
                    }
                    break;
                case 7:
                    System.out.println("Вы вышли");
                    break;
                default:
                    System.out.println("Ошибка");
                    break;







            }
        }
    }
}