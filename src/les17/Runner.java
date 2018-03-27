package les17;


import java.io.*;



/**
 * Created by java on 27.03.2018.
 */
public class Runner {
    public static File workDir;
    public static File errorDir;
    public static File doneDir;

    public static File file1;
    public static File file2;
    public static File file3;

    public static void main(String[] args) throws IOException {
        createDir();
        checkdir();
        t2();
        t3();
    }

    public static void moveFile(File from, File to) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(from);
            os = new FileOutputStream(new File(to,from.getName()));
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        } finally {
            is.close();
            os.close();
            if(from.delete()){
                System.out.println(" файл был удален");
            }else System.out.println("Файл не был найден");
        }
    }

    /*Написать программу которая создает 3 пустых папки.Их имена: "work", "done", "error".*/
    public static void createDir(){
        // создаем объект File для каталога
        workDir = new File("D://_aJavaBestTeam//project//untitled3//work");
        boolean created = workDir.mkdir();
        if(created)
            System.out.println("Каталог успешно создан");
        errorDir = new File("D://_aJavaBestTeam//project//untitled3//error");
        created = errorDir.mkdir();
        if(created)
            System.out.println("Каталог успешно создан");
        doneDir = new File("D://_aJavaBestTeam//project//untitled3//done");
        created = doneDir.mkdir();
        if(created)
            System.out.println("Каталог успешно создан");
        // создаем объекты для файлов, которые находятся в каталоге

    }

    /*Сделать проверку - если в папке "done" или "erro" есть какие то файлы перенести их в "work".
    Остальные две должны остаться пустыми.*/
    public static void checkdir() throws IOException {
        if(errorDir.isDirectory())
        {
            // получаем все вложенные объекты в каталоге
            for(File item : errorDir.listFiles()){

                moveFile(item, workDir);
            }
        }
        if(doneDir.isDirectory())
        {
            // получаем все вложенные объекты в каталоге
            for(File item : doneDir.listFiles()){

                moveFile(item, workDir);
            }
        }
    }

    /*Написать программку которая создает 3 текстовые файла в папке "work" .
    Каждый из которых содержит строку стихотворения.
    При чем, стихотворение берем из интернета любое и записываем в константу.
    После чего работаем с этой константой и пишем 1-ю строку в первый файл, вторую во второй и  т.д.*/
    public static void t2() throws IOException {
        file1 = new File(workDir,"text1.txt");
        file2 = new File(workDir,"text2.txt");
        file3 = new File(workDir,"text3.txt");

        String text1 = "I like you well, O trusty dagger mine,\n" +
                "My comrade wrought of cool Damascus steel!\n" +
                "Forged were you by the Georgian with revenge in the mind,\n" +
                "By the Circassian free - for war were you made keen.";
        String text2 = "Forever you, the unwashed Russia!\n" +
                "The land of slaves, the land of lords:\n" +
                "And you, the blue-uniformed ushers,\n" +
                "And people who worship them as gods.";
        String text3 = "Innoon'sheat,inadaleofDagestan";

        file1.createNewFile();
        file2.createNewFile();
        file3.createNewFile();

        createFile2(file1,text1);
        createFile2(file2,text2);
        createFile2(file3,text3);


    }

    public static void createFile2(File file, String str){
        try(FileOutputStream fos=new FileOutputStream(file))
        {
            // перевод строки в байты
            byte[] buffer = str.getBytes();

            fos.write(buffer, 0, buffer.length);
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
        checkFile3(file1);
        checkFile3(file2);
        checkFile3(file3);
    }



    public static void checkFile3(File file){
        try(FileInputStream fin=new FileInputStream(file))
        {
            int i = -1;
            boolean hasSpase = false;
            while((i=fin.read())!=-1){
                if((char)i == ' ') {
                    moveFile(file,doneDir);
                    hasSpase = true;
                    break;
                }
            }
            if (!hasSpase) {
                moveFile(file,errorDir);
            }
            fin.close();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}
