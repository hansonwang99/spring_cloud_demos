package cn.codesheep.eureka_client_fileupload;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

@RestController
public class UploadController {

    @PostMapping(value = "/uploadFile", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public String handleFileUpload( @RequestPart(value = "file") MultipartFile file) {

        String filename=file.getOriginalFilename();

        if( file.getSize()>0 ) {
            try {
                SaveFileFromInputStream( file.getInputStream(), filename );
            } catch (IOException e) {
                System.out.println(e.getMessage());
                return null;
            }
        }

        return filename;
    }

    private void SaveFileFromInputStream(InputStream stream, String filename) throws IOException
    {
        FileOutputStream fs=new FileOutputStream("/Users/wangshuai/"+ filename);
        byte[] buffer =new byte[1024*1024];
        int bytesum = 0;
        int byteread = 0;
        while ((byteread=stream.read(buffer))!=-1)
        {
            bytesum += byteread;
            fs.write(buffer,0,byteread);
            fs.flush();
        }
        fs.close();
        stream.close();
    }

}


