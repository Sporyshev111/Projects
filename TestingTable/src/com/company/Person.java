package com.company;

public class Person {
    class Person{
        static int id;
        String fName;
        String lName;
        int age;

        public Person(){
        }

        public Person(int id, String fName, String lName, int age) {
            init(id, fName, lName, age);
        }

        public void init(int id, String fName, String lName, int age) {
            this.id = id;
            this.fName = fName;
            this.lName = lName;
            this.age   = age;
        }

        @Override
        public String toString() {
            return "Person [id=" + id +
                    ", fName=" + fName +
                    ", lName=" + lName +
                    ", age=" + age + "]";
        }


        public static int getid() {
            return id;
        }

        public String getLname() {
            return lName;
        }

        public String getfName() {
            return fName;
        }

        public int getAge() {
            return age;
        }
    }
}
