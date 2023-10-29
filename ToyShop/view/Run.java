package ToyShop.view;


import ToyShop.controller.BuyerCSVHandler;
import ToyShop.controller.ToyCSVHandler;

import static ToyShop.controller.ToyCSVHandler.addRandomPrizeToAwardedFileAndDeleteAwardedPrize;
import static ToyShop.controller.ToyCSVHandler.addRandomToyToPrizeFile;

public class Run {
    //D:\JavaTask\ToyShop\db\toys.csv
    final String FILE_NAME_TOYS = "ToyShop/db/toys.csv";
    final String FILE_NAME_BUYERS = "ToyShop/db/buyers.csv";
    final String PRIZE_TOY = "ToyShop/db/PrizeToyList.csv";
    final String AWARDED_TOY = "ToyShop/db/AwardedToyFromByuers.csv";

    public void run() {
        int numberOfMenu;
        do {
            ViewMenu.pageHeadMenuView();
            numberOfMenu = InputNumberValidator.choice();
            switch (numberOfMenu) {
                case 1:
                    runToys();
                    break;
                case 2:
                    runBuyers();
                    break;
                case 3:
                    runDrawingToys();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("\n\tНекорректный ввод. Попробуйте еще раз.");
            }
        } while (numberOfMenu != 4);
    }


    public void runToys() {
        int numberOfMenu;
        do {
            ViewMenu.pageToyView();
            numberOfMenu = InputNumberValidator.choice();
            switch (numberOfMenu) {
                case 1:
                    System.out.println(ToyCSVHandler.readFromFile(FILE_NAME_TOYS));
                    break;
                case 2:
                    ToyCSVHandler.addNewToy();
                    break;
                case 3:
                    System.out.println(ToyCSVHandler.readFromFile(FILE_NAME_TOYS));
                    System.out.println("\n\tВведите № игрушки для изменения веса игрушки: ");
                    int idToy = InputNumberValidator.choice();
                    ToyCSVHandler.updateToyDropFrequencyById(FILE_NAME_TOYS, idToy);
                    break;
                case 4:
                    System.out.println(ToyCSVHandler.readFromFile(FILE_NAME_TOYS));
                    System.out.println("\n\tВведите № игрушки для удаления: ");
                    ToyCSVHandler.removeToy(FILE_NAME_TOYS, InputNumberValidator.choice());
                    break;
                case 5:
                    break;
                default:
                    System.out.println("\n\tНекорректный ввод. Попробуйте еще раз.");
            }
        } while (numberOfMenu != 5);
    }

    public void runBuyers() {
        int numberOfMenu;
        do {
            ViewMenu.pageBuyersView();
            numberOfMenu = InputNumberValidator.choice();
            switch (numberOfMenu) {
                case 1:
                    System.out.println(BuyerCSVHandler.readFromFile(FILE_NAME_BUYERS));
                    break;
                case 2:
                    BuyerCSVHandler.addNewBuyer();
                    System.out.println("\n\tНовый покупатель добавлен!");
                    break;
                case 3:
                    System.out.println(BuyerCSVHandler.readFromFile(FILE_NAME_BUYERS));
                    System.out.println("\n\tВведите № покупателя для его удаления: ");
                    int num = InputNumberValidator.choice();
                    BuyerCSVHandler.removeBuyer(FILE_NAME_BUYERS, num);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("\n\tНекорректный ввод. Попробуйте еще раз.");
            }
        } while (numberOfMenu != 4);
    }

    public void runDrawingToys() {
        int numberOfMenu;
        do {
            ViewMenu.pageToysDrawingView();
            numberOfMenu = InputNumberValidator.choice();
            switch (numberOfMenu) {
                case 1:
                    System.out.println("\n\tСписок призовых игрушек.");
                    System.out.println(ToyCSVHandler.readPrizeFile(PRIZE_TOY));
                    break;
                case 2:
                    System.out.println("\n\tСписок разыгранных игрушек.");
                    System.out.println(ToyCSVHandler.readPrizeFile(AWARDED_TOY));
                    break;
                case 3:
                    addRandomToyToPrizeFile(FILE_NAME_TOYS, PRIZE_TOY);
                    System.out.println("\n\tСписок призовых игрушек.");
                    System.out.println(ToyCSVHandler.readPrizeFile(PRIZE_TOY));
                    break;
                case 4:
                    addRandomPrizeToAwardedFileAndDeleteAwardedPrize(PRIZE_TOY, AWARDED_TOY);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("\n\tНекорректный ввод. Попробуйте еще раз.");
            }
        } while (numberOfMenu != 5);
    }
}
