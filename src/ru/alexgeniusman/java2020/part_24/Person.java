package ru.alexgeniusman.java2020.part_24;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Person {
    private String name;
    private String middle_name;
    private String lastname;
    public Adress adress = new Adress();

    public Person(String name, String middle_name, String lastname) {
        this.name = name;
        this.middle_name = middle_name;
        this.lastname = lastname;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getmiddle_name() {
        return middle_name;
    }

    public void setmiddle_name(String middle_name) {
        this.middle_name = middle_name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", middle_name='" + middle_name + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }

    public String getfio() {
        String fio = " ";
        if ((name != null) && (middle_name != null) && (lastname != null)) {
            fio = fio + name + " " + middle_name + " " + lastname;
            System.out.println(fio);
            return fio;
        } else {
            System.out.println("Недостаточно данных");
            return "Недостаточно данных";
        }


    }

    public class Adress {
        private String country;
        private String region;
        private String city;
        private String street;
        private String house;
        private String structure;
        private String flat;

        public Adress() {

        }

    }

    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();
        person1.setName("Иван");
        person1.setmiddle_name("Иванов");
        person1.setLastname("Иванович");
        person1.getfio();
        System.out.println("Введите адрес1");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] str_arr = str.split(",");
        person1.adress.country = str_arr[0];
        person1.adress.region = str_arr[1];
        person1.adress.city = str_arr[2];
        person1.adress.street = str_arr[3];
        person1.adress.house = str_arr[4];
        person1.adress.structure = str_arr[5];
        person1.adress.flat = str_arr[6];
        for (int i = 0; i < str_arr.length; i++) {
            System.out.println(str_arr[i]);
        }

        System.out.println("Введите адрес2");
        String str2 = in.nextLine();
        String[] str_arr2 = str2.split(",");
        person2.adress.country = str_arr2[0];
        person2.adress.region = str_arr2[1];
        person2.adress.city = str_arr2[2];
        person2.adress.street = str_arr2[3];
        person2.adress.house = str_arr2[4];
        person2.adress.structure = str_arr2[5];
        person2.adress.flat = str_arr2[6];
        for (int i = 0; i < str_arr2.length; i++) {
            System.out.println(str_arr2[i]);
        }

        System.out.println("Введите адрес3");
        String str3 = in.nextLine();
        StringTokenizer st = new StringTokenizer(str3, ",.;");
        int j = 0;
        while (st.hasMoreTokens()) {
            if (j == 0) person3.adress.country = st.nextToken();
            if (j == 1) person3.adress.region = st.nextToken();
            if (j == 2) person3.adress.city = st.nextToken();
            if (j == 3) person3.adress.street = st.nextToken();
            if (j == 4) person3.adress.house = st.nextToken();
            if (j == 5) person3.adress.structure = st.nextToken();
            if (j == 6) person3.adress.flat = st.nextToken();
            j++;
        }


        System.out.println("Введите адрес4");
        String str4 = in.nextLine();
        StringTokenizer st4 = new StringTokenizer(str3, ",.;");
        int jj = 0;
        while (st.hasMoreTokens()) {
            if (jj == 0) person4.adress.country = st4.nextToken();
            if (jj == 1) person4.adress.region = st4.nextToken();
            if (jj == 2) person4.adress.city = st4.nextToken();
            if (jj == 3) person4.adress.street = st4.nextToken();
            if (jj == 4) person4.adress.house = st4.nextToken();
            if (jj == 5) person4.adress.structure = st4.nextToken();
            if (jj == 6) person4.adress.flat = st4.nextToken();
            jj++;
        }


    }
}
