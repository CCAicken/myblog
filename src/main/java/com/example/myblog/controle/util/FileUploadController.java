package com.example.myblog.controle.util;

import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 * @description: TODO
 * @author: lgd
 * @create: 2020-01-14 16:51
 */

@Controller
@RequestMapping("/file")
public class FileUploadController {
    @PostMapping(value = "/uploadfile")
    public @ResponseBody Map<String,Object> demo(@RequestParam(value = "editormd-image-file", required = false) MultipartFile file, HttpServletRequest request) {
        Map<String,Object> resultMap = new HashMap<String,Object>();
        //保存
        try {
            File imageFolder= new File(request.getServletContext().getRealPath("img/upload"));
            File targetFile = new File(imageFolder,file.getOriginalFilename());
            if(!targetFile.getParentFile().exists())
                targetFile.getParentFile().mkdirs();
            file.transferTo(targetFile);
            resultMap.put("success", 1);
            resultMap.put("message", "上传成功！");
            resultMap.put("url","http://localhost:8080/img/upload/"+file.getOriginalFilename());
        } catch (Exception e) {
            resultMap.put("success", 0);
            resultMap.put("message", "上传失败！");
            e.printStackTrace();
        }
        System.out.println(resultMap.get("success"));
        return resultMap;
    }
}

