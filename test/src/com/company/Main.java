package com.company;
import java.util.Date;
import java.util.Scanner;
import java.lang.Math;
public class Main {


    public static void main(String[] args) {
Log log = new Log();


        }
    public static class Log{
String operation;

        Date datatime;
String [] name;

        public String getOperation() {
            return operation;
        }

        public Date getDatatime() {
            return datatime;
        }

        public String[] getName() {
            return name;
        }

        public void setOperation(String operation) {
            this.operation = operation;
        }

        public void setDatatime(Date datatime) {
            this.datatime = datatime;
        }

        public void setName(String[] name) {
            this.name = name;
        }

        public Log(String operation, Date datatime, String[] name) {
            this.operation = operation;
            this.datatime = datatime;
            this.name = name;
        }


    }

    public enum Operations
    {
        ADD, DELETE, UPDATE
    }
    }

