package com.javarush.task.task19.task1903;

/* 
Адаптация нескольких интерфейсов
*/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static Map<String, String> countries = new HashMap<>();

    static {
        countries.put("UA", "Ukraine");
        countries.put("RU", "Russia");
        countries.put("CA", "Canada");
    }

    public static void main(String[] args) {

    }

    public static class IncomeDataAdapter implements Customer, Contact {
        private final IncomeData incomeData;

        public IncomeDataAdapter(IncomeData incomeData) {
            this.incomeData = incomeData;
        }


        @Override
        public String getCompanyName() {
            return incomeData.getCompany();
        }

        @Override
        public String getCountryName() {
            return countries.get(incomeData.getCountryCode());
        }

        @Override
        public String getName() {
            return incomeData.getContactLastName() + ", " + incomeData.getContactFirstName();
        }

        @Override
        public String getPhoneNumber() {
            String numbersPhoneNumber = incomeData.getPhoneNumber() + "";
            int countryPhoneCode = incomeData.getCountryPhoneCode();
            StringBuilder stringBuilder = new StringBuilder("+" + countryPhoneCode + "(");
            for (int i = numbersPhoneNumber.length(); i <= 10; i++) {
                stringBuilder.append(0);
            }
            stringBuilder.append(numbersPhoneNumber);
            return stringBuilder.toString();
        }
    }


    public static interface IncomeData {
        String getCountryCode();        //For example: UA

        String getCompany();            //For example: JavaRush Ltd.

        String getContactFirstName();   //For example: Ivan

        String getContactLastName();    //For example: Ivanov

        int getCountryPhoneCode();      //For example: 38

        int getPhoneNumber();           //For example: 501234567

    }

    public static interface Customer {
        String getCompanyName();        //For example: JavaRush Ltd.

        String getCountryName();        //For example: Ukraine
    }

    public static interface Contact {
        String getName();               //For example: Ivanov, Ivan

        String getPhoneNumber();        //For example: +38(050)123-45-67
    }
}