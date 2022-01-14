package com.company;
import java.util.Scanner;
import java.util.Random;
import java.lang.String;

public class IndTask1 {
    private String KeyWord=new String();//Это ключевое слово для Плефера
    private String Key=new String();
    private char matrix_arr[][]= new char[5][5];
    public void setKey(String k){

        // Эта ф-я будет брать ключевое слово от пользователя
        // Далее она убирает повторяющиеся буквы из ключа
        // После добавит их в приватный KeyWord для генерации матрицы

        String K_adjust=new String();
        boolean flag = false;

        K_adjust = K_adjust + k.charAt(0);

        for(int i=1; i<k.length();i++){

            for(int j=0;j<K_adjust.length(); j++){

                if(k.charAt(i)==K_adjust.charAt(j))
                {
                    flag = true;
                }
            }

            if(flag == false){
                K_adjust = K_adjust + k.charAt(i);
            }
            flag = false;
        }

        KeyWord=K_adjust;
        //присваиваем полю нашу отформатированную строку
    }

    public void KeyGen()
    {
        // Эта ф-я настраивает алфавитные буквы и добавляет
        // KeyWord перед ними и далее вызывает функцию с матрицой

        boolean flag=true;
        char current;

        Key=KeyWord;

        for ( int i=0 ; i<26 ; i++){

            current=(char)(i+97);

            if(current=='j')
                continue;

            for(int j=0 ; j< KeyWord.length() ; j++ ){

                if (current == KeyWord.charAt(j)){

                    flag=false;
                    break;
                }
            }

            if(flag)
                Key=Key+current;

            flag=true;
        }

        System.out.println(Key);
        matrix ();

    }

    private void matrix ()
    {
        // это метод который генерирует алфавитную матрицу с ключевым словом
        int counter=0;

        for (int i=0 ; i<5 ;i++){

            for (int j=0 ; j<5 ; j++){

                matrix_arr[i][j]=Key.charAt(counter);
                System.out.printf("%s ",matrix_arr[i][j]+"\t");

                counter++;
            }

            System.out.println("\n");
        }
    }

    private String format(String old_text)
    {
        // Эта ф-я настраивает текст для шифрования
        // меняет 'j' на 'i' и добавляет 'x' чар
        // между повторяющимися буквами (по методу Плейфера)

        int i = 0;
        int j = 0;
        int len = 0;
        String text = new String();
        len = old_text.length();

        //System.out.println(old_text);
      // замена j-тых на i-тые
        for (int tmp = 0; tmp < len; tmp++)
        {
            if (old_text.charAt(tmp) == 'j')
            {
                text = text + 'i';
            }
            else
                text = text+old_text.charAt(tmp);
        }

        len = text.length();
      // добавление x для повторяющихся букв
        for (i = 0; i < len-1; i = i + 2){ // пробегаем по половине длинны строки

            if (text.charAt(i+1) == text.charAt(i)){ //if char = предыдущему char

                text = text.substring(0, i+1) + 'x' + text.substring(i+1);
            }else{ //неповторяющиеся идут дальше
            }
        }
        return text;
    }

    private String [] Divid2Pairs (String new_string)
    {
        String Original = format(new_string);

        int size= Original.length();

        if(size%2!=0){
            size++;
            Original = Original+'x';
        }

        String x[]= new String[size/2];

        int counter=0;

        for ( int i=0 ; i<size/2 ;i++){
            x[i]=Original.substring(counter, counter+2);
            System.out.println(x[i]);
            counter=counter+2;
        }

        return x;
    }

    public int[] GetDiminsions(char letter){

        int []key=new int[2];

        if ( letter == 'j')
            letter='i';

        for (int i=0 ; i<5 ;i++)
        {
            for (int j=0 ; j<5 ; j++){

                if(matrix_arr[i][j] == letter){

                    key[0]=i;
                    key[1]=j;
                    break;
                }
            }

        }

        return key;
    }

    public String Encript(String Source)
    {
        System.out.println("Encription Start");

        String src_arr[]=Divid2Pairs(Source);

        String Code=new String();

        char one;
        char two;

        int part1[]=new int[2];
        int part2[]=new int[2];

        //начинаем пара за прарой
        for (int i=0 ; i< src_arr.length ;i++ ){
            one = src_arr[i].charAt(0);//первый чар
            two = src_arr[i].charAt(1);//второй чар

            part1 = GetDiminsions(one);//получаем позицию первого чара
            part2 = GetDiminsions(two);//получаем позицию второго чара

            //проверяем на частные случаи
            if(part1[0]==part2[0]){//тот же ряд

                if (part1[1]<4)
                    part1[1]++;
                else
                    part1[1]=0;

                if(part2[1]<4)
                    part2[1]++;
                else
                    part2[1]=0;

            }

            else if (part1[1]==part2[1]) // таже колонка
            {
                if (part1[0]<4)
                    part1[0]++;
                else
                    part1[0]=0;

                if(part2[0]<4)
                    part2[0]++;
                else
                    part2[0]=0;
            }
            else
            {
                int temp=part1[1];
                part1[1]=part2[1];
                part2[1]=temp;
            }

            Code= Code + matrix_arr[part1[0]][part1[1]] + matrix_arr[part2[0]][part2[1]];
        }
        System.out.println(Code);
        return Code;
    }

    public String Decript (String Code){
        System.out.println("Decription Start");

        String Original=new String();

        String src_arr[]=Divid2Pairs(Code);

        char one;
        char two;

        int part1[]=new int[2];
        int part2[]=new int[2];


        //начинаем пара за парой
        for (int i=0 ; i< src_arr.length ;i++ ){
            one = src_arr[i].charAt(0);//первый чар
            two = src_arr[i].charAt(1);//второй чар

            part1 = GetDiminsions(one);//позиция первого чара
            part2 = GetDiminsions(two);//позиция второго чара

            //проверяем на чатные случаи
            if(part1[0]==part2[0]){//тот же ряд

                if (part1[1]>0)
                    part1[1]--;
                else
                    part1[1]=4;

                if(part2[1]>0)
                    part2[1]--;
                else
                    part2[1]=4;
            }

            else if (part1[1]==part2[1]) //та же колонка
            {
                if (part1[0]>0)
                    part1[0]--;
                else
                    part1[0]=4;

                if(part2[0]>0)
                    part2[0]--;
                else
                    part2[0]=4;
            }
            else
            {
                int temp=part1[1];
                part1[1]=part2[1];
                part2[1]=temp;
            }


            Original =Original + matrix_arr[part1[0]][part1[1]] + matrix_arr[part2[0]][part2[1]];
        }

        System.out.println(Original);
        return Original;
    }

    private static int[] getKeyArray(String keyStr) {
        //Транформация строкового ключа в массив чаров
        //метод chars() который представляет числа от 0 до 65535 используем для первода чара в инт
        // метод .map позволяет преобразововать один элемент в другой (на выходе) Java Stream Api

        return keyStr.chars().map(ch -> ch - '0').toArray();
    }

    private static String crypt(String text, String key) {
        //Шифрование строки
        return shiftWithKey(text, key, true);
    }

    private static String decrypt(String text, String key) {
        //Дешифрование строки
        return shiftWithKey(text, key, false);
    }

    private static String shiftWithKey(String text, String key, boolean forward) {
        //Создаем массив ключа и присваиваем ему значение ключа из чаров
        int[] keyArray = getKeyArray(key);
// Создаем массив чаров для записи зашифрованного сообщения
        char[] result = new char[text.length()];
        //Преобразовываем такст который ввел пользователь в массив чаров
        char[] textChars = text.toCharArray();
        // Тернарный оператор или условный оператор (?:) Решает какое значение должно быть присвоено переменной Boolean
        int sign = forward ? 1 : -1;

        for (int i = 0; i < textChars.length; i++) {
            //каждое i-тое значение массива чаров result вызывает метод в который мы передаем наш массив который получили после ввода пользователем
            // и преобразовали его в массив чаров.
            // Второй параметр это переменная sign которая либо 1 либо -1 в зависимости от пременной Boolean forward умножается на символ из ключа с индексом остатка при делении i на длинну массива ключа
                result[i] = shiftChar(textChars[i], sign * keyArray[i % keyArray.length]);
        }
        return String.valueOf(result);
    }
    private static char shiftChar(char c, int i) {
        // проверяем и если нужно преобразовыаем чар с
        if (c < 'A' || c > 'z') {
            return c;
        }
        c = (char) (c + i);
        if (c < 'A') {
            c = (char) (c + 'z' - 'A' + 1);
        }
        if (c > 'z') {
            c = (char) (c - 'z' + 'A' - 1);
        }
        return c;
    }
    public static void Gronsveld(String text, String key) {
        String crypted = crypt(text, key);
        System.out.println("Cripted message: "+crypted);
        String decrypted = decrypt(crypted, key);
        System.out.println("Decripted message: "+decrypted);
    }
    public static void Verman(String text)
    {    //Шифр Вернама
        Random random = new Random();
        char[] Text = text.toCharArray();
        int[] Key = new int[Text.length];
        char[] Result = new char[Text.length];
        for (int i = 0; i < Text.length; i++)
        {
            Key[i] = random.nextInt();
            //"^" (побитовое логическое или)
            // Бинарный оператор XOR копирует бит, если он установлен в одном операнде, но не в обоих.
            Result[i] = (char) (Text[i] ^ Key[i]);

        }
        System.out.println("Text: " + String.valueOf(Text));
        //System.out.println("Text: " + Text);

        System.out.println("Result: " + String.valueOf(Result));
//        System.out.println("Result: " + Result);
        char[] achDecrypt = new char[Text.length];
        for (int i = 0; i < Text.length; i++) {
            achDecrypt[i] = (char) (Result[i] ^ Key[i]);
        }

        System.out.println("Decrypt: " + String.valueOf(achDecrypt));
    }
    public static void main(String[] args) {
        //Воариант 5
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input text: ");
        String text = scanner.nextLine();
        System.out.println("Input variant: ");
        int variant = Integer.parseInt(scanner.nextLine());
        switch (variant)
        {
            case 1: {
                Verman(text);
                break;
            }
            case 2: {
                System.out.println("Input key: ");
                String key = scanner.nextLine();
                Gronsveld(text, key);
                break;
            }
            case 3: {
                // я создал поля в классе не static поэтому мне нужен экземпляр класса что б их вызвать
                playfair x =new playfair();
                //Экземпляр класса playfair

                Scanner sc = new Scanner(System.in);

                System.out.println("Enter a lower case keyword:");
                String keyword = sc.next();
                // и для вызова ставим перед методом (объект).(название метода)
                x.setKey(keyword);
                x.KeyGen();

                System.out.println("To Encrypt enter 1 \nTo Decript enter 2\nTesting both enter anything else:");
                int choosen_value = sc.nextInt();

                if(choosen_value==1)
                {

                    String key_input = text;
                    String Encripted= x.Encript(key_input);
                }else if(choosen_value==2){
                    System.out.println("Enter a lower case word to decrypt:");
                    String decripted = sc.next();

                    x.Decript(decripted);
                }else{
                    System.out.println("Enter a lower case word to encrypt & decrypt:");
                    String key_input = sc.next();

                    String Encripted= x.Encript(key_input);
                    x.Decript(Encripted);
                }
                break;
            }
            default:
                System.out.println("Incorrect optiont inputed!");
        }

    }
}



