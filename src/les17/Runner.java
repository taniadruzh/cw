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
    public static void main(String[] args) throws IOException {
        createDir();
        checkdir();
    }

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
                } finally {
                    is.close();
                    os.close();
                }
            }
        }
    }
}
