package OOP.task_6;

public class Program {

    /**
     * TODO: Переработать структуру приложения Order, приложение должно соответствовать
     *  принципу SRP.
     * @param args
     */
    public static void main(String[] args) {

        InputfromConsole input = new InputfromConsole();
        input.inputFromConsole();

        SaveToJson saveToJson = new SaveToJson(input.getOrder());
        saveToJson.saveToJson();

        System.out.println("Информация по заказу успешно сохранена в файл.");

    }

}
