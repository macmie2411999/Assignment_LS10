package com.example.assignment_ls10.service;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

public interface  FileSystemStorageServiceImp {
    public void init();
    public boolean saveFile(MultipartFile file);
    public Resource loadFile(String fileName);

}
