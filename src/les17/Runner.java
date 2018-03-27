package les17;


import org.omg.CORBA.Environment;

import java.io.*;



/**
 * Created by java on 27.03.2018.
 */
public class Runner {
    public static File dir1;
    public static File dir2;
    public static File dir3;

    public static File file1;
    public static File file2;
    public static File file3;

    public static void main(String[] args) throws IOException {
        createDir();
        checkdir();
        t2();
        t3();
    }

    /*Написать программу которая создает 3 пустых папки.Их имена: "work", "done", "error".*/
    public static void createDir(){
        // создаем объект File для каталога
        dir1 = new File("D://_aJavaBestTeam//project//untitled3//work");
        boolean created = dir1.mkdir();
        if(created)
            System.out.println("Каталог успешно создан");
        dir2 = new File("D://_aJavaBestTeam//project//untitled3//error");
        created = dir2.mkdir();
        if(created)
            System.out.println("Каталог успешно создан");
        dir3 = new File("D://_aJavaBestTeam//project//untitled3//done");
        created = dir3.mkdir();
        if(created)
            System.out.println("Каталог успешно создан");
        // создаем объекты для файлов, которые находятся в каталоге
//        File file1 = new File("C://SomeDir", "Hello.txt");
//        File file2 = new File(dir1, "Hello2.txt");
    }

    /*Сделать проверку - если в папке "done" или "erro" есть какие то файлы перенести их в "work".
    Остальные две должны остаться пустыми.*/
    public static void checkdir() throws IOException {
        if(dir2.isDirectory())
        {
            // получаем все вложенные объекты в каталоге
            for(File item : dir2.listFiles()){

                InputStream is = null;
                OutputStream os = null;
                try {
                    is = new FileInputStream(item);
                    os = new FileOutputStream(new File(dir1,item.getName()));
                    byte[] buffer = new byte[1024];
                    int length;
                    while ((length = is.read(buffer)) > 0) {
                        os.write(buffer, 0, length);
                    }
                } finally {
                    is.close();
                    os.close();
                    if(item.delete()){
                        System.out.println(" файл был удален");
                    }else System.out.println("Файл не был найден");
                }
            }
        }
        if(dir3.isDirectory())
        {
            // получаем все вложенные объекты в каталоге
            for(File item : dir3.listFiles()){

                InputStream is = null;
                OutputStream os = null;
                try {
                    is = new FileInputStream(item);
                    os = new FileOutputStream(new File(dir1,item.getName()));
                    byte[] buffer = new byte[1024];
                    int length;
                    while ((length = is.read(buffer)) > 0) {
                        os.write(buffer, 0, length);
                    }
                    item.delete();
                } finally {
                    is.close();
                    os.close();
                    if(item.delete()){
                        System.out.println(" файл был удален");
                    }else System.out.println("Файл не был найден");
                }
            }
        }
    }

    /*Написать программку которая создает 3 текстовые файла в папке "work" .
    Каждый из которых содержит строку стихотворения.
    При чем, стихотворение берем из интернета любое и записываем в константу.
    После чего работаем с этой константой и пишем 1-ю строку в первый файл, вторую во второй и  т.д.*/
    public static void t2() throws IOException {
        file1 = new File(dir1,"text1.txt");
        file2 = new File(dir1,"text2.txt");
        file3 = new File(dir1,"text3.txt");

        String text1 = "I like you well, O trusty dagger mine,\n" +
                "My comrade wrought of cool Damascus steel!\n" +
                "Forged were you by the Georgian with revenge in the mind,\n" +
                "By the Circassian free - for war were you made keen.";
        String text2 = "Forever you, the unwashed Russia!\n" +
                "The land of slaves, the land of lords:\n" +
                "And you, the blue-uniformed ushers,\n" +
                "And people who worship them as gods.";
        String text3 = "In noon's heat, in a dale of Dagestan\n" +
                "With lead inside my breast, stirless I lay;\n" +
                "The deep wound still smoked on; my blood\n" +
                "Kept trickling drop by drop away.";

        file1.createNewFile();
        file2.createNewFile();
        file3.createNewFile();

        try(FileOutputStream fos=new FileOutputStream(file1))
        {
            // перевод строки в байты
            byte[] buffer = text1.getBytes();

            fos.write(buffer, 0, buffer.length);
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
        try(FileOutputStream fos=new FileOutputStream(file2))
        {
            // перевод строки в байты
            byte[] buffer = text2.getBytes();

            fos.write(buffer, 0, buffer.length);
            fos.close();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
        try(FileOutputStream fos=new FileOutputStream(file3))
        {
            // перевод строки в байты
            byte[] buffer = text3.getBytes();

            fos.write(buffer, 0, buffer.length);
            fos.close();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }

    /*Далее написать программу, которая будет считывать информацию из файлов,
    и если в одном из них в строке нет ни одного пробела переносим этот файл в папку "error".
    В противоположном случае в "done".
    Для этого на предыдущем этапе в один из файлов записать строку без пробелов.*/
    public static void t3(){

    }
}
