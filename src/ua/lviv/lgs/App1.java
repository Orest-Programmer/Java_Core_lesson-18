package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.List;

public class App1 {
    public static void main(String[] args) {
        List<Integer> listInt = new ArrayList<>();
        addList(listInt); // Тут викликали метод який додає до ліста стрінгові значення та вказуємо ліст<Integer> при виклиці
        System.out.println(listInt);
//        Надіюсь я правильно зрозумів завдання
    }
    public static void addList(List l){
        l.add("a");
        l.add("b");
        l.add("c");
    }
}
