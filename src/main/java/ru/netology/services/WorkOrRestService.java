package ru.netology.services;

public class WorkOrRestService {
    public int calculate(int income, int expenses, int threshold) {

        int money = 0; //сколько денег на счете
        int count = 0; //количество месяцев отдыха

        for (int i = 0; i < 12; i++) {
            if (money >= threshold) {
                money = money - expenses;
                money = money / 3;
                count++;
            } else {
                money = money + income - expenses;
            }
        }
        return count;
    }
}
