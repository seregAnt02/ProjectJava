package ToyShop.controller;

import ToyShop.model.Buyer;
import ToyShop.view.InputNumberValidator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static ToyShop.controller.ToyCSVHandler.CSV_SEPARATOR;

public class BuyerCSVHandler {
    private static final String DELIMITER = ",";
    private static final String FILE_NAME_BUYERS = "ToyShop/db/buyers.csv";
    static List<Buyer> buyers = new ArrayList<>();


    public static void addNewBuyer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя покупателя: ");
        String nameBuyer = scanner.nextLine();
        System.out.println("Введите фамилию покупателя: ");
        String surnameBuyer = scanner.nextLine();
        System.out.println("Введите номера чека: ");
        int check = InputNumberValidator.choice();
        System.out.println("Введите номера телефона: ");
        int phoneNumber = InputNumberValidator.choice();
        buyers.add(new Buyer(getBuyerId(), nameBuyer, surnameBuyer, check, phoneNumber));
        BuyerCSVHandler.writeToBuyersFile(FILE_NAME_BUYERS, buyers);
    }

    private static int getBuyerId() {
        return startId(FILE_NAME_BUYERS);
    }

    static int startId(String fileNameBuyers) {
        int maxId = 0;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileNameBuyers));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(",");
                int id = Integer.parseInt(values[0].replaceAll("\"", ""));
                if (id > maxId) {
                    maxId = id;
                }
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return maxId + 1;
    }

    public static void writeToBuyersFile(String fileName, List<Buyer> buyers) {
        try (FileWriter writer = new FileWriter(fileName, true)) {
            appendLineBuyers(buyers, writer, DELIMITER);
        } catch (IOException e) {
            System.err.println("Ошибка чтения из файла: " + e.getMessage());
        }
    }

    private static void appendLineBuyers(List<Buyer> buyers, FileWriter writer, String delimiter) throws IOException {
        for (Buyer buyer : buyers) {
            writer.append(String.valueOf(buyer.getId()));
            writer.append(delimiter);
            writer.append(buyer.getName());
            writer.append(delimiter);
            writer.append(buyer.getSurname());
            writer.append(delimiter);
            writer.append(String.valueOf(buyer.getCheckNumber()));
            writer.append(delimiter);
            writer.append(String.valueOf(buyer.getPhoneNumber()));
            writer.append("\n");
        }
    }

    public static List<Buyer> readFromFile(String fileName) {
        List<Buyer> buyers = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] fields = line.split(DELIMITER);
                int id = Integer.parseInt(fields[0].strip());
                String name = fields[1].strip();
                String surname = fields[2].strip();
                int checkNumber = Integer.parseInt(fields[3].strip());
                int phoneNumber = Integer.parseInt(fields[4].strip());
                buyers.add(new Buyer(id, name, surname, checkNumber, phoneNumber));
            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения из файла: " + e.getMessage());
        }
        return buyers;
    }


    public static void removeBuyer(String fileName, int id) {
        List<Buyer> buyerList = readFromFile(fileName);
        boolean isBuyerFound = false;

        for (Buyer buyer : buyerList) {
            if (buyer.getId() == id) {
                buyerList.remove(buyer);
                System.out.println("Покупатель удален!");
                isBuyerFound = true;
                break;
            }
        }

        if (!isBuyerFound) {
            System.out.println("Нет покупателя с таким номером!");
        }

        overwriteFileBuyers(fileName, buyerList);
    }

    public static void overwriteFileBuyers(String fileName, List<Buyer> buyers) {
        try (FileWriter writer = new FileWriter(fileName)) {

            appendToFileLineBuyer(buyers, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void appendToFileLineBuyer(List<Buyer> buyers, FileWriter writer) throws IOException {
        appendLineBuyers(buyers, writer, CSV_SEPARATOR);

        writer.flush();
    }
}
