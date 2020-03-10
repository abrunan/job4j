package ru.job4j.condition;

/**
 * Class DummyBot
 * Practicing conditional operators.
 *
 * @author abrunan
 * @version 1
 * @since 20.03.2019
 */

public class DummyBot {

    /**
     * Answers to questions
     *
     * @param question Your question
     * @return An answer to your questions
     */
    public String answer(String question) {
        String ans = "Это ставит меня в тупик. Задайте другой вопрос.";
        if ("Привет, Бот.".equals(question)) {
            ans = "Привет, умник.";
        } else if ("Пока.".equals(question)) {
            ans = "До скорой встречи.";
        }
        return ans;
    }
}
