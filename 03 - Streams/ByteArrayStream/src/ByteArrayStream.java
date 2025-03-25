import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ByteArrayStream {
    public static void copyFile(String src, String dest) {
        try (
            FileInputStream fis = new FileInputStream(src);
            ByteArrayOutputStream bos = new ByteArrayOutputStream()
        ){
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1){
                bos.write(buffer, 0, bytesRead);
            }

            byte[] bytes = bos.toByteArray();

            try (
                FileOutputStream fos = new FileOutputStream(dest);
                ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
            ) {
                while ((bytesRead = bis.read(buffer)) != -1){
                    fos.write(buffer, 0, bytesRead);
                }
                System.out.println("File copied");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
